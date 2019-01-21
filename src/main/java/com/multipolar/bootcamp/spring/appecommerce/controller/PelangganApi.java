package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganApi {

    @Autowired
    private PelangganRepository pelangganRepository;

    @PostMapping("/")
    public ResponseEntity<Pelanggan> save(@RequestBody Pelanggan pelanggan) {
        pelanggan = pelangganRepository.save(pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

    @GetMapping("/list")
    public Iterable<Pelanggan> findAll() {
        return pelangganRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(@PathVariable String id) {
        Optional<Pelanggan> pelangganOptional = pelangganRepository.findById(id);
        if (pelangganOptional.isPresent()){
            return ResponseEntity.ok(pelangganOptional.get());
        }else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pelanggan> deleteById(@PathVariable("id") String id) {
        Optional<Pelanggan> pelangganOptional = pelangganRepository.findById(id);
        if (pelangganOptional.isPresent()){
            pelangganRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else return ResponseEntity.noContent().build();
    }

}
