package com.tms.ecommerceManager.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tms.ecommerceManager.Model.Articoli;

public interface ArticoliRepository extends CrudRepository<Articoli, Long> {


  List<Articoli> findAll();

  Articoli findById(long id);
}