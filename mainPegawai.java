public class mainPegawai {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p.setNama("Drogba");
        p.setNoIndukPegawai("001");
        p.gaji = 100000;
        Programmer pg = new Programmer();
        pg.setNoIndukPegawai("002");
        pg.setNama("Programmer");
        pg.gaji = 1500000;
        pg.setBonus(500000);
        Manajer m = new Manajer("003", "Manajer", 2000000, 450000);
        PemegangSaham ps = new PemegangSaham("001", "Drogba", 10000, 50000,
         1000, 10);
        ps.tampilDataPemegangSaham();

    }
}
