package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String id = input.nextLine();
                    boolean idExist = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId().equals(id)) {
                            idExist = true;
                            System.out.println("NIM telah terdaftar");
                            break;
                        }
                    }

                    if (idExist == false) {
                        Student student = new Student(name, id);
                        students.add(student);
                        System.out.println("Mahasiswa " + name + " ditambahkan");
                    }

                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String deleteId = input.nextLine();
                    boolean idFound = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId().equals(deleteId)) {
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + deleteId + " dihapus.");
                            idFound = true;
                            break;
                        }
                    }

                    if (idFound == false) {
                        System.out.println("NIM tidak ditemukan");
                    }

                    break;

                case 3:
                    System.out.print("Masukkan NIM dari Mahasiswa yang ingin dicari: ");
                    String searchId = input.nextLine();
                    boolean isIdFound = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId().equals(searchId)) {
                            System.out.println("NIM: " + searchId + " Nama: " + students.get(i).getName());
                            isIdFound = true;
                            break;
                        }
                    }

                    if (isIdFound == false) {
                         System.out.println("Mahasiswa dengan NIM " + searchId + " tidak ditemukan");
                    }

                    break;

                case 4:
                    for (int i = 0; i < students.size(); i++) {
                       System.out.println("NIM: " + students.get(i).getId() + ", Nama: " + students.get(i).getName());
                    }

                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}