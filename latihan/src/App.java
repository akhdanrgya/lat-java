class Player {

    String nama;
    int nyawa;

    //etc

    Senjata senjata;

    public Player(String nama, int nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }

    void display(){

        if(nyawa <= 0){
            System.out.println(nama + " sudah mati");
        } else {
            System.out.println("Nama  : " + nama);
            System.out.println("Nyawa : " + nyawa);
        }
    }

    void pakeSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    void serang(Player musuh){
        int attackDamage = this.senjata.attackDamage;

        System.out.println(this.nama + " Menyerang " + musuh.nama + " Dengan damage " + attackDamage);

        musuh.bertahan(attackDamage);

    }

    void bertahan(int attackDamage){
        System.out.println(this.nama + " Dapat damage " + attackDamage);

        this.nyawa -= attackDamage;
    }

}

class Senjata {
    String nama;
    int attackDamage;


    public Senjata (String nama, int attackDamage) {
        this.nama = nama;
        this.attackDamage = attackDamage;
    }

}

public class App {
    public static void main(String[] args) {
        Player adan = new Player("adan", 100);
        Senjata pedang = new Senjata("Pedang", 10);


        Player rico = new Player("rico", 100);
        Senjata tongkat = new Senjata("Tongkat", 5);

        adan.display();
        adan.pakeSenjata(pedang);
        rico.pakeSenjata(tongkat);

        adan.serang(rico);
        rico.display();

        rico.serang(adan);
        adan.display();

    }
}
