package singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1);
		
		//output will be with same hashcode
		//singleton.Singleton@15db9742
		//singleton.Singleton@15db9742

		
	}

}
