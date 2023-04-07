package misc;

import java.util.Scanner;

public class main_misc {

	public static void main(String[] args) {
	
		
	//n is the size of v
	//m is the size of q
	//int[]v vector to be modified	
		
	/*int [][] q = {{2,6,8},{3,5,7},{1,8,1},{5,9,15}};
	System.out.println(max_value(q,10));*/
	
	System.out.println("Size of v:");
	Scanner s1 = new Scanner(System.in);
	int n = s1.nextInt();

	System.out.println("Size of q:");
	Scanner s2 = new Scanner(System.in);
	int m = s2.nextInt();
	
	
	
	int[][] q = new int[m][3];
	
	String s =  "";
	for(int i = 0;i < m;i++) {
		System.out.print("a:");
		Scanner a = new Scanner(System.in);
		q[i][0] = a.nextInt();
		
		System.out.print("b:");
		Scanner b = new Scanner(System.in);
		q[i][1] = b.nextInt();
		
		System.out.print("k:");
		Scanner k = new Scanner(System.in);
		q[i][2] = k.nextInt();
	}
	
	System.out.println(max_value(q,n));
	
		
	}
	private static int max_value(int[][] q,int n) {
		//q string of queries
		//size of v
		
		int [][]v = new int[n][2];//array of intervals to be completed
		
		
		//I want to now if some interval is going to close or open,if opens now i sum his value,if closes i subtract his value
		//for the next indexes
		for(int i = 0;i < q.length;i++){
			v[(q[i][0]-1)][0] += q[i][2];
			v[(q[i][1])-1][1] -= q[i][2];
		}
		
		//I will traverse v,when an interval open you sum his value,when a interval close you subtract
		//If overlaps(in the same point an interval open  and closes) you sum first,because the intervals are closed so
		//only for values after that index that the interval does not count anymore
		int curr = 0;
		int max = 0;
		for(int i = 0;i < v.length;i++) {
			//
			curr += v[i][0];//positive number
			if(curr >= max) {
				max = curr;
			}
			curr += v[i][1];//negative number
		}
		return max;
	}
	
	
	}
	
	
	
	

	


	
	

	
		
	
	


	

	
	

