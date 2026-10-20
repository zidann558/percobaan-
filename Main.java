package main;

class Pegawai {
    protected String nama;
    public double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Manajer extends Pegawai {
    public String departemen;

    public void IsiData(String n, String d) {
        nama = n; 
        departemen = d;
    }
}

public class Main {
    public static void main(String[] args) {
        Manajer m = new Manajer();

        m.IsiData("Budi", "Multimedia");
        m.gaji = 8000000;

        System.out.println("Nama: " + m.getNama());
        System.out.println("Gaji: " + m.gaji);
        System.out.println("Departemen: " + m.departemen);
    }
}