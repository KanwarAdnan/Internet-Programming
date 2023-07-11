class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public method to access the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

 
}

public class Main
{
	public static void main(String[] args) {
	    Singleton singleton = Singleton.getInstance();
	    System.out.println("Created Singelton");
  }
}
  
