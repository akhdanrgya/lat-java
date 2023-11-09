package com.lat;

// player

class Player {
    String name;
    double health;
    int level;
    
    // object member

    Weapon weapon;
    Armor armor;


    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " " + "attacking " + opponent.name + " with power " + attackPower);

        opponent.defance(attackPower);
    }

    void defance(double attackPower) {
        System.out.println(this.name + " " + "get damage " + attackPower);

        // akan mengambil demage
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " get damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// senjata

class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("weapon : " + this.name + "," + " " + "power : " + this.attackPower);
    }
}

// armor

class Armor {
    double defencePower;
    String name;

    Armor(String name,double defencePower){
        this.name = name;
        this.defencePower= defencePower;
    }

    void display(){
        System.out.println("armor : " + this.name + "," + " " + "defence : " + this.defencePower);
    }
}


public class Main {
    
    public static void main (String[] args){

        // membuat object player

        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("adan", 100);

        // membuat object weapon

        Weapon pedang = new Weapon("pedang",55);
        Weapon pistol = new Weapon("pistol", 100);

        // membuat object armor

        Armor bajuBesi = new Armor("besi",10);
        Armor bajuBerlian = new Armor("berlian", 50);

        // player 1

        player1.equipWeapon(pedang);
        
        player1.equipArmor(bajuBesi);

        player1.display();

        // player 2

        player2.equipWeapon(pistol);
        player2.equipArmor(bajuBerlian);

        player2.display();

        System.out.println("\n PERTEMPURAN");
        player1.attack(player2);
        player2.display();

        System.out.println("\n Episode -1");
        player2.attack(player1);
        player1.display();

        System.out.println("\n Episode -2");
        player1.attack(player2);
        player2.display();
    }
}
