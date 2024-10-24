public class PemegangSaham extends Manajer {
    public int devide;
    public int jumlahSaham;

    public PemegangSaham(String noInduk, String nama, int gaji, 
    int tunjangan, int devide, int jumlahSaham) {
        super(noInduk, nama, gaji, tunjangan);
        this.devide = devide;
        this.jumlahSaham = jumlahSaham;
    }

    public void tampilDataPemegangSaham() {
        super.tampilDataManajer();  
        System.out.println("Devide : " + devide);
        System.out.println("Jumlah Saham : " + jumlahSaham);
        System.out.println("Total Gaji : " + (super.gaji + super.getTunjanganJabatan() + devide));
    }
}
