package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {
    @Autowired
    private TransaksiRepository transactionRepository;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    public Iterable<Transaksi> findAll() {
        return transactionRepository.findAll();
    }

    public Optional<Transaksi> findById(String id) {
        return this.transactionRepository.findById(id);
    }

}
