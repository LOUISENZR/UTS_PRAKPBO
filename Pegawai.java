
public class Pegawai {
 private String noIndukPegawai;
 private String nama;
 public int gaji = 100000;

 public void setNoIndukPegawai(String noIndukPegawai){
    this.noIndukPegawai = noIndukPegawai;
 }
 public void setNama(String nama){
    this.nama = nama;
 }
 public String getNoIndukPegawai(){
    return noIndukPegawai;
 }
 public String getNama(){
    return nama;
 }
 public void tampilDataPokokPegawai(){
    System.out.println("No Induk : "+getNoIndukPegawai());
    System.out.println("Nama : "+getNama());
    System.out.println("Gaji : "+ gaji);
 }
    
}