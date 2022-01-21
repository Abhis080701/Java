package abhishek;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1St: " + Math.random());
		System.out.println("2St: " + Math.random());
		System.out.println("3St: " + Math.random());
		System.out.println("4St: " + Math.random());
		System.out.println("5St: " + Math.random());
		Random random = new Random();
		int x = random.nextInt(30);
		int y = random.nextInt(30);
		int z = random.nextInt(30);
	System.out.println(x+" "+y+" "+z);

	

	}

}
