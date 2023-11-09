package com.dasar;


// membuat class

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double ipk;
    int umur;
}

public class Main {
    
    public static void main (String[] args) {

        // instansi / membuat object

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "123123123";
        mahasiswa1.jurusan = "teknik komputer";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.umur = 18;
        
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);
    }

}
