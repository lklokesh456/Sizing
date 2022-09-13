package com.enterprise.SizingPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.SizingPortal.dao.TransactRepository;
import com.enterprise.SizingPortal.model.Transact;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: Document me!
 *
 * @author shaik.mohammedyasin
 *
 */


@Service
@Slf4j

public class TransactService {
    
    @Autowired
    private TransactRepository transactRepository;

    public List<Transact> getTransactDetails() {
        //  log.info("Inside get all Transact details of TransactService");
        List<Transact> trans=  transactRepository.findAll();
        return trans;
    }
        public Transact getTransactDetailsByFormId(Long formId) {
            //  log.info("Inside get all Transact details of TransactService");
            return    transactRepository.findByFormId(formId);
             
      }
    
    public Transact saveTransact(Transact transact) {
        //  log.info("Inside saveTransact of transactService");
          return transactRepository.save(transact);
      }
      
}
