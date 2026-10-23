package module04.problem03;

public class Cat extends Pet {
    private String fur;

    public Cat(String fur, String name, String breed) {
        super(name , breed);
        this.fur = fur;
    }

    public void displayCatDetail() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.fur);
    }
}
