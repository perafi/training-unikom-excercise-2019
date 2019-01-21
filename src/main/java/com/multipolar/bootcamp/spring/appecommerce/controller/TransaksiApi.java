package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiApi {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @GetMapping("/list")
    public Iterable<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaksi> findById(@PathVariable String id) {
        Optional<Transaksi> transaksiOptional = transaksiRepository.findById(id);
        if (transaksiOptional.isPresent()){
            return ResponseEntity.ok(transaksiOptional.get());
        }else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Transaksi> deleteById(@PathVariable("id") String id) {
        Optional<Transaksi> transaksiOptional = transaksiRepository.findById(id);
        if (transaksiOptional.isPresent()){
            transaksiRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else return ResponseEntity.noContent().build();
    }

}
