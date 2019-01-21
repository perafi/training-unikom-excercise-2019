# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
	Hibenate adalah sebuah tools yang digunakan untuk mengimplementasikan konsep ORM
	Konsep ORM merupakan pemetaan dari objek ke dalam bentuk relational
	Hibernate bukan hanya melakukan pemetaan data tetapi juga menyediakan fasilitas
	untuk melakukan query data dan pengambilan data
	Hibernate memiliki fitur HQL - Hibernate Query Language
	
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
	Berguna untuk menandai bahwa kelas tersebut adalah sebuah kelas entity/entitas
	
    - ```@Table```
    Untuk menentukan nama table di dalam database
	
	- ```@Column```
    Untuk membuat kolom dari property tersebut dan memberikan nilai unique, length dan nullable
	
	- ```@OneToOne```
	Relasi antar table dari satu ke banyak
	
    - ```@ManyToOne```
    Relasi antar table dari banyak ke satu
	
	- ```@OneToMany```
	Digunakan pada saat satu object mengacu ke banyak objek lain
	mis: sebuah purchase order dapat terdiri dari beberapa order line
	Order adalah sisi ONE dan order line adalah sisi MANY
	
    - ```@JoinColumn```
    
	- ```@JoinTable```
	
    - ```@GeneratedValue```
	Untuk menjalankan fungsi generated property
	
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
	Dependency Injection atau DI adalah sebuah design pattern yang memungkinkan kita
	untuk menulis kode yang lebih baik, dimana DI menitikberatkan pada penulisan kode
	yang loosely coupled, highly modular dimana ketergantungan antar class tidaklah 
	tinggi, sehingga kita dapat mengubah sebuah class tanpa diliputi rasa khawatir
	class tersebut membuat break class-class lain yang bergantung pada class yang kita
	rubah tadi.
	DI adalah proses memasukan/ inject sebuah class ke dalam class lain, tapi tidak hanya
	terbatas pada constructor saja melainkan bisa juga di-inject langsung ke method
	yang dimiliki oleh class tersebut.
	
4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?


5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    - ```@Autowired```
    - ```@Bean```
    - ```@Component```
    - ```@Repository```
    - ```@Service```
    - ```@Controller```
    - ```@RestController```
    - ```@RequestMapping```
    - ```@GetMapping```
    - ```@PostMapping```
    - ```@PutMapping```
    - ```@DeleteMapping```

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
