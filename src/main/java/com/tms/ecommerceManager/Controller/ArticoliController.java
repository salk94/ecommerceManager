package com.tms.ecommerceManager.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.ecommerceManager.Model.Articoli;
import com.tms.ecommerceManager.Repository.ArticoliRepository;

@RestController
@RequestMapping("/test")
public class ArticoliController {

    private static final Logger logger = LoggerFactory.getLogger(ArticoliController.class);

    @Autowired
    private ArticoliRepository articoliRepository;

    @GetMapping("/Articoli")
    public List<Articoli> getAllArticoli() {
        logger.info(articoliRepository.findAll().get(0).toString());
        return articoliRepository.findAll();
    }
    
}
