package module02.problem03;

public class Employee {
    public String name;
//  pada baris ini terapat error di tipe data origin yang harusnya memakai String karena lebih dari satu karakter
//    public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

//   Pada beberap baris ini terdapat error, yang pertama tidak ada parameter untuk setRole, lalu kedua variabel yang akan menggantikan nilai role tidak sesuai dengan parameter
//   public void setRole() {
//       this.role = r;
//    }
    public void setRole(String role) {
        this.role = role;
    }
}