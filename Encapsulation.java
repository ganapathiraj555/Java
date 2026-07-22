class Atm{
    private double balance; //private data
    Atm(double balance){
    this.balance=balance;
    }
    public void setmethod(double balance){
        this.balance=balance;
    }
    public double getmethod(){
        return balance;
    }
}
public class Encapsulation
{
	public static void main(String[] args) {
	    Atm a=new Atm(1000);
	    System.out.println(a.getmethod());
	    a.setmethod(5000);
	    System.out.println(a.getmethod());
	}
}