package inheritance;

public class University {
    public String name = "Jahangir Nagar University";

    public University(String name) {
        this.name = name;

    }

    public void print() {
        System.out.println("University's name is : " + name);
    }

    public void access() {
        System.out.println("There are in total 250 employees.");
        System.out.println("Each employee's salary is above 30,000 BDT.");
    }

    public static void main(String[] args) {
        University university = new University("Jahangir Nagar University");
        university.print();
    }

}
