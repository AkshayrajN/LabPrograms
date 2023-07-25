package labPrg;

import java.util.Scanner;

public class sumOfArr {
public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n=sc.nextInt();
		int[] Arr=new int[n];
		int arr2[][]=new int[n][n];
		int sum = 0;
		System.out.println("Enter the array element of size: "+n);
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
			sum=sum+Arr[i];
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The sum of 1D array elements is "+ sum);
		sum=0;
		System.out.println("Enter the array element of size: "+ n +"x"+n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
				sum=sum+arr2[i][j];
			}
		}
//		sc.close();
		
		System.out.println("The sum of 2D array "+ sum);
		
		
		
	}
	
}
