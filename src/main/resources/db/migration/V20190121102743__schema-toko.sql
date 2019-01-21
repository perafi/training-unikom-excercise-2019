create table toko
(
    id varchar(64) not null primary key,
    nama varchar(100) not null,
    alamat text not null,
    owner varchar(100) not null
) engine = InnoDB;

insert into toko (id, nama, alamat, owner) values
('001', 'Daun Teh', 'Bandung', 'Perdana'),
('002', 'Ina Shop', 'Jakarta', 'Gina');
