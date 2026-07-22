class Animal{
    void sound(){
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound meow");
    }
}
public class Polymethodoverriding
{
	public static void main(String[] args) {
	    Dog d=new Dog();
	    d.sound();
	    Cat c=new Cat();
	    c.sound();
	}
}