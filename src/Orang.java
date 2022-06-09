public class Orang {
    private String nama;
    private String alamat;

    public Orang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat() {
        return " Tinggal di " + alamat;
    }

    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }

    public void siapaKamu () {
        System.out.println("Saya Seorang");
    }

    @Override
    public String toString() {
        return nama + " Tinggal di " + alamat;
    }
}
