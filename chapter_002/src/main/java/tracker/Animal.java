package tracker;

public class Animal {
    private String name;
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
