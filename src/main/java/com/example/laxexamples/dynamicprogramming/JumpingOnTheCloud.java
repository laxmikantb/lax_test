package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

/*
 * Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes jumps while the second takes .

Function Description

Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.

jumpingOnClouds has the following parameter(s):

c: an array of binary integers
Input Format

The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

Constraints

Output Format

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Explanation 0: 
Emma must avoid  and . She can win the game with a minimum of  jumps:
 */
public class JumpingOnTheCloud {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfClouds =  in.nextInt();
		int[] clouds = new int[noOfClouds];
		for (int i=0; i < noOfClouds; i++) {
			clouds[i] = in.nextInt();	
		}
		
		int jumps =0;
		
		int i =0;
		while (i < noOfClouds-3) // last jump might be 2 clouds or 1 cloud only
		{
			i += (clouds[i+2] == 0? 2 : 1); // jump directly 2 clouds if 2nd is normal cloud
			jumps++;
		}
		jumps++;
	}

}
