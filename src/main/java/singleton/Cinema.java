package singleton;

public class Cinema {
	private String name;
	
	private static Cinema instance;
	
	//1 method of ensuring thrad safety is to eagerly instantiate the instance
	//private static Cinema instance = new Cinema("cinema");
	
	private Cinema(String name){
		this.name = name;
	}
	
	//1 method of ensuring thread safety is to synchronise the method but this has a performance hit
	//public static synchronized Cinema getInstance(String name){ 
	public static Cinema getInstance(String name){
		if(instance == null){
			instance = new Cinema(name);
		}
		return instance;
	}
	
	//1 method of ensuring thread safety is to do the below
	/*private static volatile Cinema instance;
	public static Cinema getInstance2(String name){
		if(instance == null){
			synchronized(Cinema.class){
				if(instance == null){
					instance = new Cinema(name);
				}
			}
		}
		return instance;
	}*/
	
	public String getName(){
		return name;
	}
	
}
