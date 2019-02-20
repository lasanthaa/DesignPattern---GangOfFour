package singleton;

public class Singleton {

	private static Singleton instance;
	
	//private constructor
	private Singleton(){};
	
	//this implementation will break in multi-threaded applications. Af many thread can create instance objects in "if condition"	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		
		return instance;
		
	}
/*
	//for multi-threaded case 
	
		public static synchronized Singleton getInstance() {
			if(instance==null) {
			instance = new Singleton();
		}
		
		return instance;
		}
	
	// To avoid this extra overhead every time in above way , double checked locking principle is used.

	public static Singleton getInstance() {
		 synchronized (ThreadSafeSingleton.class) {
			if(instance==null) {
			instance = new Singleton();
			}
			
			return instance;
		}
	}*/

//	@Override
//	public String toString() {
//		return "Singleton [getClass()=" + getClass() + ", hashCode()=" + hashCode();
//	}
//	
	
	

}
