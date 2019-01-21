create table pelanggan
(
    id varchar(64) not null primary key,
    nama varchar(100) not null,
    alamat text
) engine = InnoDB;

insert into pelanggan (id, nama, alamat) values
('001', 'Asep', 'Bogor'),
('002', 'Ujang', 'Bandung');