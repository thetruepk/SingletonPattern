
public class singletonPattern {
	//create the instance to be used
	private static singletonPattern instance = null;
	//set the constructor to private so the getInstace method will be forced to be used
	private singletonPattern(){}
	
	//check to see if instance exist, if so this returns the instance. 
	//If no instance exist one is created
	public static synchronized  singletonPattern getInstance(){
		if(instance == null){
			instance = new singletonPattern();
		}
		return instance;
	}
}
