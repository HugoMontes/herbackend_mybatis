/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Medico;
import com.cofar.hermes.kardex.service.MedicoService;

import java.io.IOException;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author aduran
 */
@RestController
@RequestMapping("/kardex/medico")
public class MedicoController {

    private static final Log LOGGER = LogFactory.getLog(MedicoController.class);
    @Autowired
    private MedicoService medicoService;

    @Autowired
    ResourceLoader resourceLoader;

    @GetMapping("/listar")
    public List<Medico> listar() {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listar();
    }
    @PostMapping("/listar")
    public List<Medico> listarTodo(@RequestBody @Valid Medico medico) {
        LOGGER.info("METHOD: listarTodo()");
        return medicoService.listarPorParametros(medico);

    }

    @GetMapping("/esplin")
    public List<Medico> listarEspLin() {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listarEspLin();
    }
    @GetMapping("/lughortra")
    public List<Medico> listarHorarioTrabajo() {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listarlugarHorarioTrabajo();
    }



    @PostMapping("/obtener")
    public Medico obtener(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD obtenerMedico :");

        System.out.println(" idMedico :" + medico.getIdMedico());
        return medicoService.obtener(medico.getIdMedico());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD Adicionar Medico");
        return medicoService.registrar(medico);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return medicoService.actualizar(medico);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return medicoService.eliminar(medico);
    }

    @GetMapping("/listarP")
    public List<Medico> listarP(Pageable pageable) {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listarP(pageable).getContent();
    }

    @GetMapping("/reporte")
    public ModelAndView doRpt(HttpServletRequest request, HttpServletResponse response) throws JRException, IOException {
        List<Medico> lst = medicoService.listar();

        //Para que se Pueda visualizar Previo a Descargar
        HashMap params = new HashMap();
        InputStream jasperStream = this.getClass().getResourceAsStream("/reportes/kardex/medico/Medico_lista.jasper");
        System.out.println(" PATH : " + jasperStream.toString());

        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
        byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, params, new JRBeanCollectionDataSource(lst));
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "inline; filename=helloWorldReport.pdf");
        response.addHeader("Content-Type", "application/pdf");
        response.getOutputStream().write(bytes);

        //Para que se pueda descargar
        /*
        HashMap params = new HashMap();
        InputStream jasperStream = this.getClass().getResourceAsStream("/reportes/kardex/medico/Medico_lista.jasper");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JRBeanCollectionDataSource(lst));
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "inline; filename=helloWorldReport.pdf");
        final OutputStream outStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
         */


        return null;
    }

}
