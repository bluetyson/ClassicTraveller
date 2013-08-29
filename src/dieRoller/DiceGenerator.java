package dieRoller;

//
//  DiceGenerator.java
//  CthuluCharGen
//
//  Created by Mark Knights on 29/04/07.
//  Copyright 2007 One Stage Before. All rights reserved.
//

import java.util.Random;

public class DiceGenerator {
	Random generator;
	/**
	 * @param numRolls
	 * @param numDice
	 * @param numSides
	 * @return int[]
	 * 
	 * Used to create a bulk number of similar dice rolls at once.  Method 
	 * returns an array of length numRolls which is made up of totals of the 
	 * numDice of numSides rolls generated by a Random generator.
	 */
	public int[] rollDice(int numRolls, int numDice, int numSides){
		int[] resultArray = new int[numRolls];
		int result;
		generator = new Random();
				
		for (int j = 0; j < numRolls; j++) {
			result = 0;
			for (int i = 0; i < numDice; i++) {
				result = result + (Math.abs(generator.nextInt()) % numSides + 1);
			}
			resultArray[j] = result;
		}
		
		return resultArray;
	}
	
	/**
	 * @param numRolls
	 * @param numDice
	 * @param numSides
	 * @param modifier
	 * @return int[]
	 * 
	 * Used to create a bulk number of similar dice rolls at once that are
	 * modified by adding the parameter modifier.  Method returns an array
	 * of length numRolls which is made up of totals of the numDice of 
	 * numSides rolls generated by a Random generator.
	 */
	public int[] rollDiceWithModifier(int numRolls, int numDice, int numSides, int modifier){
		int[] resultArray = new int[numRolls];
		int result;
		generator = new Random();
				
		for (int j = 0; j < numRolls; j++) {
			result = 0;
			for (int i = 0; i < numDice; i++) {
				result = result + (Math.abs(generator.nextInt()) % numSides + 1);
			}
			resultArray[j] = result + modifier;
		}
		
		return resultArray;
	}
	
	/**
	 * @param numDice
	 * @param numSides
	 * @return int
	 * 
	 * Returns the result of one dice roll only.  The dice that are rolled 
	 * have the same number of sides as numsides and the number of dice 
	 * rolled is the same as numDice.
	 */
	public int rollDice(int numDice, int numSides){
		int result = 0;
		generator = new Random();
				
		for (int i = 0; i < numDice; i++) {
			result = result + (Math.abs(generator.nextInt()) % numSides + 1);
		}
		
		return result;
	}
	
	/**
	 * @param numDice
	 * @param numSides
	 * @param modifier
	 * @return int
	 * 
	 * Returns the result of one dice roll only modified by the value of the
	 * modifier paramenter.  The dice that are rolledhave the same number of
	 * sides as numsides and the number of dice rolled is the same as numDice.
	 */
	public int rollDiceWithModifier(int numDice, int numSides, int modifier){
		int result = 0;
		generator = new Random();
				
		for (int i = 0; i < numDice; i++) {
			result = result + (Math.abs(generator.nextInt()) % numSides + 1);
		}
		
		return result + modifier;
	}
	
}
