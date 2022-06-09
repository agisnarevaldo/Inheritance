public class Mahasiswa extends Orang {
    private String npm;
    private double ipk;
    
    public Mahasiswa (String nama, String alamat, String npm, double ipk) {
        super(nama, alamat);
        this.npm = npm;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }
    public String getNpm() {
        return npm;
    }
    public void setNpm(String npm) {
        this.npm = npm;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }

    @Override
    public String toString() {
        return "Mahasiswa{\n" +
                "Nama : " + getNama() + "\n" +
                getAlamat() + "\n" +
                " npm : " + npm + 
                " ipk : " + ipk + '}';
    }
}
