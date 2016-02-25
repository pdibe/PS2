package base;

public class Test {

	public static void main(String[] args) {
		MyInteger bob=new MyInteger(17);
		System.out.println(bob.isOdd());
		System.out.println(bob.isEven());
		System.out.println(bob.isPrime());
		System.out.println(bob.isOdd(16));
		System.out.println(bob.isEven(16));
		System.out.println(bob.isPrime(16));
		MyInteger steve=new MyInteger(17);
		System.out.println(bob.isOdd(steve));
		System.out.println(bob.isPrime(steve));
		System.out.println(bob.isEven(steve));
		System.out.println(bob.equals(17));
		System.out.println(bob.equals(steve));
	}

}
