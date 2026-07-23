class Raju{
    void respond(String name){
        System.out.println("Mom calls : " + name);
    }
    void respond(String name,int rollno){
        System.out.println("Teacher calls name : " + name);
        System.out.println("Teacher calls rollno : " + rollno);
    }
    void respond(String name,int age,int marks){
        System.out.println("Frnd calls : " + name);
        System.out.println("Frnd calls : " + age);
        System.out.println("Frnd calls : " + marks);
    }
}
public class Polymethodoverload
{
	public static void main(String[] args) {
		Raju r=new Raju();
		r.respond("Ram");
		r.respond("Ram",1234);
		r.respond("Ram",98,99);
	}
}
