package com.ref;


class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\njudul\t: " + this.judul);
        System.out.println("penulis\t: " + this.penulis);
    }
}




public class Main {
    public static void main (String[] args){
        Buku buku1 = new Buku("UTBK", "AKHDAN");

        buku1.display();
        
        // menampilkan address
        String addresBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addresBuku1);

        // asignment object
        Buku buku2 = buku1; 
    }

}
