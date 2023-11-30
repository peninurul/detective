/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 59
 */
class Character {
    // Kelas Dasar Character
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hai, nama saya " + name);
    }

    // Polimorfisme: Metode ini dapat dioverride oleh kelas anak
    public void performAction() {
        System.out.println("Melakukan aksi umum.");
    }
}

// Kelas Anak Detective sebagai turunan dari Character
class Detective extends Character {
    private String specialSkill;

    public Detective(String name, String specialSkill) {
        super(name);
        this.specialSkill = specialSkill;
    }

    // Override metode introduce dari kelas Character
    @Override
    public void introduce() {
        System.out.println("Hai, saya detektif. Nama saya " + name + ". Keahlian khusus saya: " + specialSkill);
    }

    // Override metode performAction untuk menunjukkan polimorfisme
    @Override
    public void performAction() {
        System.out.println("Menyelesaikan kasus.");
    }
}

// Kelas Anak Villain sebagai turunan dari Character
class Villain extends Character {
    private String evilPlan;

    public Villain(String name, String evilPlan) {
        super(name);
        this.evilPlan = evilPlan;
    }

    // Override metode introduce dari kelas Character
    @Override
    public void introduce() {
        System.out.println("Haha! Saya seorang penjahat. Nama saya " + name + ". Rencana jahat saya: " + evilPlan);
    }

    // Override metode performAction untuk menunjukkan polimorfisme
    @Override
    public void performAction() {
        System.out.println("Melakukan kejahatan.");
    }
}

// Kelas Main untuk menjalankan program
public class Lat59_Detective {
    public static void main(String[] args) {
        // Polimorfisme: Objek Detective dan Villain dapat disimpan dalam array Character
        Character[] characters = new Character[2];
        characters[0] = new Detective("Conan Edogawa", "Memecahkan kasus");
        characters[1] = new Villain("Kaito Kid", "Mencuri barang berharga");

        // Memanggil metode introduce dan performAction sesuai polimorfisme
        for (Character character : characters) {
            character.introduce();
            character.performAction();
            System.out.println(); // Spasi antara karakter
        }
    }
}