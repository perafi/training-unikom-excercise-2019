package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.DetailTransaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/detailtransaksi")
public class DetailTransaksiApi {

    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @GetMapping("/list")
    public Iterable<DetailTransaksi> findAll() {
        return detailTransaksiRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailTransaksi> findById(@PathVariable String id) {
        Optional<DetailTransaksi> detailTransaksiOptional = detailTransaksiRepository.findById(id);
        if (detailTransaksiOptional.isPresent()){
            return ResponseEntity.ok(detailTransaksiOptional.get());
        }else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailTransaksi> deleteById(@PathVariable("id") String id) {
        Optional<DetailTransaksi> detailTransaksiOptional = detailTransaksiRepository.findById(id);
        if (detailTransaksiOptional.isPresent()){
            detailTransaksiRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else return ResponseEntity.noContent().build();
    }

}
