public class Main {
    public static void main(String[] args) {
        Mahasiswa udin = new Mahasiswa("Agisna Revaldo", " Puspahiang", "43200921", 3.15);
        System.out.println(udin);
        udin.siapaKamu();

        System.out.println();
        Orang orangbiasa = new Orang("Otong", "Tasik");
        System.out.println(orangbiasa);
        orangbiasa.siapaKamu();
    }
}
