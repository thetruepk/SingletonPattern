
public class main {
	public static void main(String [] ars){
		//Testing two variables that refer to the same memory address
		singletonPattern singleton = null;
		System.out.println(singleton.getInstance());
		singletonPattern singleton1 = null;
		System.out.println(singleton1.getInstance());
	}
}
