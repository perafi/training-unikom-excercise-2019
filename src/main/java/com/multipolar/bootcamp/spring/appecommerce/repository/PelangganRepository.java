package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PelangganRepository extends CrudRepository<Pelanggan, String> {

    @Modifying
    @Query("update Pelanggan set nama = ?2, alamat = ?3 where id = ?1")
    int updatePelanggan(String id, String nama, String alamat);
}
