package inheritance;

public class SingleInheritance extends University {
    public SingleInheritance(String name) {
        super(name);
    }

    public static void main(String[] args) {
        SingleInheritance singleInheritance = new SingleInheritance("Jahangir Nagar University");
        System.out.println(singleInheritance.name);
        singleInheritance.access();

    }
}
