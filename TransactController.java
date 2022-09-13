package com.enterprise.SizingPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.SizingPortal.model.Transact;
import com.enterprise.SizingPortal.service.TransactService;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: Document me!
 *
 * @author shaik.mohammedyasin
 *
 */

@RestController
@RequestMapping("/Sizing")
@Slf4j
 
public class TransactController {
    

@Autowired
private TransactService transactService;

    
    @GetMapping("/GetTransact")
    @ResponseBody
    public  List<Transact> getTransactDetails( ) {
     //   log.info("Inside get all transact method of TransactController");
        return transactService.getTransactDetails();
    }

    @GetMapping("/GetTransact/{formId}")
    @ResponseBody
    public  Transact getTransactDetailsByFormId(@PathVariable("formId") Long formId ) {
     //   log.info("Inside get all transact method of TransactController");
        return transactService.getTransactDetailsByFormId(formId);
    }
    
    @PostMapping("/SaveTransact")
    public Transact saveTransact(@RequestBody Transact transact) {
    //    log.info("Inside saveTransact method of TransactController");
        return  transactService.saveTransact(transact);
    }


}
