
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	//other useful method here
	public String getDescription() {
		return "I'm Classic Singleton";
	}
}
