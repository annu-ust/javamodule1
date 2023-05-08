package classworks;
import java.util.*;
public class OddEven {
	public static void check(int[] arr,int even[],int odd[]) {
		
		System.out.println("even array:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			 even[i]=arr[i];
			 System.out.println(even[i]);
			}
		}
		System.out.println("odd array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			 odd[i]=arr[i];
			 System.out.println(odd[i]);
			}
			
		}
		
		
	}
	public static void mergearray(int odd[],int even[],int oddeven[]) {
		for(int i=0;i<5;i++) {
			oddeven[i]=even[i];
		}
		for(int i=0;i<5;i++) {
			oddeven[i]=odd[i];
		}
		for(int i=0;i<5;i++) {
			System.out.println(oddeven[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner( System.in);
		
		int arr[]= {1,2,3,4,5};
		int oddeven[]=new int[5];
		int[]even=new int[arr.length];
		int[]odd=new int[arr.length];
		
		check(arr,even,odd);
		mergearray(odd,even,oddeven);

	}

}
