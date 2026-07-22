interface Car {
    void startEngine(); //abstract method
    void fuelType(); //abstract method
}

class Toyota implements Car {
    public void startEngine() {
        System.out.println("Toyota uses the engine");
    }

    public void fuelType() {
        System.out.println("Toyota uses fuel as deisel");
    }
}

public class Interface
{
	public static void main(String[] args) {
		Toyota t=new Toyota();
		t.startEngine();
		t.fuelType();
	}
}