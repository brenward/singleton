package singleton;

public class main {

	public static void main(String[] args) {
		Cinema cinema1 = Cinema.getInstance("cinema1");
		Cinema cinema2 = Cinema.getInstance("cinema2");
		
		System.out.println(cinema1.getName());
		System.out.println(cinema2.getName());

	}

}
