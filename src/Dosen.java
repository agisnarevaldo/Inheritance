public class Dosen {
    private String nip;
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    private String gaji;
    
    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public Dosen(String nip, String gaji) {
        this.nip = nip;
        this.gaji = gaji;
    }

}
