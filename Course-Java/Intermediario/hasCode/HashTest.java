package hasCode;

public class HashTest {

	public static void main(String[] args) {
		Hash userName1 = new Hash();
		Hash userName2 = new Hash();
		
		userName1.setName("Maria");
		userName2.setName("Maria");
		
		System.out.println(userName1.equals(userName2));
		
		System.out.println(userName1.hashCode());
		System.out.println(userName2.hashCode());
		
		
	}
}
