package edunova;

public class Negiranje {
	public static void main(String[] args) {
		System.out.println("Prvi test");
		System.out.println("Test broj 2");
		String message = "     3. Test";
		System.out.println(message.trim().replace("3", "4"));
		System.out.println(message.trim());
		System.out.println(message.trim().toLowerCase().replace("3", "6"));
		System.out.println(message.trim().replace("3", "5"));
		System.out.println(message.trim().replace("3", "7"));
		System.out.println(message.trim().replace("3", "8"));
		System.out.println("10. \"test\"");
		// Jedan backslash se koristi kada zelim nesto staviti pod " a da funkcionira i ne izbacuje error, znaci ovak \" \"
		// Dva backslasha se koriste kada bih recimo stavi putanju do c:\Windows\... znaci ovako je tocno c:\\Windows\\... jer kad se stave 2 backslasha kod ce valjati
		// Moze se i umjesto 2 backslasha koristiti backslash n, \n, to ce printati novu liniju u putanji
		System.out.println(message.trim().replace("3", "11"));
	}

}
