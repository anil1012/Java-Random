package com.itcuties.java;

import java.util.Random;

/**
 * Generating random objects with Java.
 * 
 * @author itcuties
 *
 */
public class RandomExample {

	public static void main(String[] args) {
		// Create the Random object
		Random random = new Random();
		
		// Get a random BOOLEAN value
		System.out.println("Random boolean: " + random.nextBoolean());
		
		// Get a random INT value
		System.out.println("Random int: " + random.nextInt());
		System.out.println("Random positive int: " + Math.abs(random.nextInt()));
		// Get a random BOOLEAN value from the set of [0,1,2,3,4]
		System.out.println("Random int in range [0,4]: " + random.nextInt(5));
		
		// Get a random LONG value
		System.out.println("Random long: " + random.nextLong());
		System.out.println("Random positive long: " + Math.abs(random.nextLong()));
		
		// Get random floating point values FLOAT and DOUBLE
		System.out.println("Random float:" + random.nextFloat());
		System.out.println("Random positive float:" + Math.abs(random.nextFloat()));
		System.out.println("Random double:" + random.nextDouble());
		System.out.println("Random positive double:" + Math.abs(random.nextDouble()));
		
		// Get a random BYTE array value
		byte[] randomBytes = new byte[16];
		// Write random bytes to an array
		random.nextBytes(randomBytes);	
		System.out.print("Random bytes: " );
		for (byte b: randomBytes) {
			System.out.print(b + "| ");
		}
		System.out.println();
		
		// Use the same seed value for each of the 10 Random objects
		long seedValue = 1;
		for (int i=0; i < 10; i++) {
			Random seedRandom = new Random(seedValue);
			System.out.println(seedRandom + ": " + seedRandom.nextDouble());
		}
		
	}
	
}
