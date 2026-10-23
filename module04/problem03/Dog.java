package module04.problem03;

public class Dog extends Pet{
    private String fur;
    private String ability;

    public Dog(String fur,String ability, String name, String breed) {
        super(name , breed);
        this.fur = fur;
        this.ability = ability;
    }

    public void displayDogDetail() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.fur);
        System.out.println("Memiliki kemampuan: " + this.ability);
    }

}
