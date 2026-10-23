package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: " );
        int option = Integer.parseInt(input.nextLine());
        
        String name;
        String breed;
        String fur;
        String ability;

        switch (option) {
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                name = input.nextLine();
                System.out.print("Ras: ");
                breed = input.nextLine();
                System.out.print("Warna bulu: ");
                fur = input.nextLine();
                Cat cat = new Cat(fur, name, breed);

                cat.displayCatDetail();
                return;

            case 2:
                System.out.print("Nama hewan peliharaan: ");
                name = input.nextLine();
                System.out.print("Ras: ");
                breed = input.nextLine();
                System.out.print("Warna bulu: ");
                fur = input.nextLine();
                System.out.print("Kemampuan: ");
                ability = input.nextLine();
                Dog dog = new Dog(fur, ability, name, breed);

                dog.displayDogDetail();
                return;

            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
