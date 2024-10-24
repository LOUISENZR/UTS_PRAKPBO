public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String noInduk, String nama, int gaji, int tunjangan) {
        setNoIndukPegawai(noInduk);
        setNama(nama);
        this.tunjangan = tunjangan;
    }

    public void setTunjanganJabatan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    public int getTunjanganJabatan(){
        return tunjangan;
    }
    public void tampilDataManajer(){
        super.tampilDataPokokPegawai();
        System.out.println("Tunjangan : "+getTunjanganJabatan());
        System.out.println("Total Gaji : "+ (getTunjanganJabatan()+ super.gaji) );
    }
}
