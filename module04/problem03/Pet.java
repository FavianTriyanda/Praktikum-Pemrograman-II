package module04.problem03;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama Hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.breed);

    }
}
