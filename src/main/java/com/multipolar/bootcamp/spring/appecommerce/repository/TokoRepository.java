package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.xml.soap.Text;

public interface TokoRepository extends CrudRepository<Toko, String> {
    @Modifying
    @Query("update Toko set nama = ?2, alamat = ?3, owner = ?4 where id = ?1")
    int updateToko(String id, String nama, Text alamat, String owner);
}
