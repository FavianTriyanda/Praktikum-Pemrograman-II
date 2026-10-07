package module02.problem03;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
//      Terdapat syntax error pada baris ini karena tidak ada titik koma
//      e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
//      Terdapat logic error di sini karena nilai dari age tidak diisi
//
        e.age = 17;

        System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age);
    }
}