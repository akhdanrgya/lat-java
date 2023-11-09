package com.cons;


// class tanpa constructor / class polos
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan constructor 
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor 
    // Mahasiswa() {
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }

}

public class Main {
    
    public static void main (String[] args) throws Exception{

        // class constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "123", "ilkomp");
        Mahasiswa mahasiswa2 = new Mahasiswa("adan", "456", "soshum");

        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa2.nama);


        // class polos = 

        // Polos objectPolos = new Polos();
        // objectPolos.dataString= "polos";
        // objectPolos.dataInteger= 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

    }
}
