package com.tms.ecommerceManager.Controller;

import java.util.List;

import javax.swing.Spring;

import org.aspectj.apache.bcel.classfile.Code;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.ecommerceManager.Model.Articoli;
import com.tms.ecommerceManager.Repository.ArticoliRepository;

@RestController
@RequestMapping("/Articoli")
public class ArticoliController {

    private static final Logger logger = LoggerFactory.getLogger(ArticoliController.class);

    @Autowired
    private ArticoliRepository articoliRepository;
    
    @ResponseBody
    @PutMapping("/AddArticoloVendita")
    public String AddArticoloVendita(@RequestBody CodiceMexal codicemexal) {

        
        //logger.info(articoliRepository.findAll().get(0).toString());
        //return articoliRepository.findAll();
        return ("ciao "+codicemexal);
    }

    public class CodiceMexal{
        private String codiceMexal;}

    
}
