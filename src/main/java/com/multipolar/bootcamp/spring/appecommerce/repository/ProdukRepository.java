package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.xml.soap.Text;
import java.sql.Timestamp;

public interface ProdukRepository extends CrudRepository<Produk, String> {
    @Modifying
    @Query("update Toko set nama = ?2, harga = ?3, tanggal_tambah = ?4, toko_id = ?5 where id = ?1")
    int updateToko(String id, String nama, Integer harga, Timestamp tanggalTambah, String toko);
}
