abstract class Car{
    String color;
    int speed;
    Car(String color,int speed){
        this.color=color;
        this.speed=speed;
    }
    abstract void startEngine();
    abstract void fuelType();
    void show(){
        System.out.println("Show the car details");
    }
}
class Bmw extends Car{
    Bmw(String color,int speed){
        super(color,speed);
    }
    void startEngine(){
        System.out.println("Bmw starts the Engine");
    }
    void fuelType(){
        System.out.println("Bmw uses fuel as petrol");
    }
}
public class Abstract
{
	public static void main(String[] args) {
		Bmw b=new Bmw("Black",300);
		b.startEngine();
		b.fuelType();
		b.show();
		System.out.println("Color of car : " + b.color);
		System.out.println("Speed of car : " + b.speed);
	    
	}
}