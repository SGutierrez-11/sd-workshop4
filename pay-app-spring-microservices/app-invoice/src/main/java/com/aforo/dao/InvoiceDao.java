package com.aforo.dao;

import com.aforo.model.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {

    @Query("select i from Invoice i order by i.idInvoice")
    List<Invoice> findAllInvoices();

    @Query("select i from Invoice i where i.idInvoice = ?1")
    Invoice findInvoiceById(int id);
}
