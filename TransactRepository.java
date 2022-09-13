package com.enterprise.SizingPortal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.SizingPortal.model.Transact;

/**
 * TODO: Document me!
 *
 * @author shaik.mohammedyasin
 *
 */
@Repository
public interface TransactRepository extends JpaRepository<Transact, Long> {

    List<Transact> findAll();
    
    Transact findByFormId(Long formId);
    
}
