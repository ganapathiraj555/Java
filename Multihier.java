//Multi level inheritance
class Grandparent {
    String house;
    String bike;
    Grandparent(String house, String bike) {
        this.house = house;
        this.bike = bike;
    }
    void work() {
        System.out.println("He is studying");
    }
}
class Parent extends Grandparent {
    String name;
    int age;
    Parent(String name, int age, String house, String bike) {
        super(house, bike);
        this.name = name;
        this.age = age;
    }
}
class Son extends Parent {
    String college;
    int year;
    Son(String name, int age, String house, String bike) {
        super(name, age, house, bike);
        this.college = "Achariya college of engineering Technology";
        this.year = 2026;
    }
}
class Grandchild extends Grandparent {
    String color;
    String watch;
    Grandchild(String color, String watch) {
        super(color, watch);
        this.color="Blue";
        this.watch="Rolex";
    }
}
public class Multihier {
    public static void main(String[] args) {
        Son s = new Son("Bob", 32, "flat", "Royal Enfield");
        System.out.println("Parent name: " + s.name);
        System.out.println("Paren age: " + s.age);
        System.out.println("Grandparent house: " + s.house);
        System.out.println("Grandparent bike: " + s.bike);
        System.out.println("Son's college: " + s.college);
        System.out.println("Son's year: " + s.year);
        s.work();
        System.out.println();
        Grandchild gc =new Grandchild("color","watch");
        System.out.println("Grandchild's color: " + gc.color);
        System.out.println("Grandchild's watch: " + gc.watch);
        s.work();
    }
}