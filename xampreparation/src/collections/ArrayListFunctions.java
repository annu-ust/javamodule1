package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
			Scanner sc = new Scanner(System.in);
					int t=sc.nextInt();
			while(t>0) {
				ArrayList<Integer> a = new ArrayList<>();
				int q=sc.nextInt();
				while(q>0) {
					char c=sc.next().charAt(0);
					
					if(c=='a') {
						int x=sc.nextInt();
						a.add(x);
						
					}
					if(c=='b') {
						a.sort(null);;
					}
					if(c=='c') {
						Collections.sort(a);
					}
					if(c=='d') {
						
						System.out.println(a.size());
					}
					if(c=='e') {
						System.out.println(a);
					}
	        if(c=='f') {
						Collections.sort(a,Collections.reverseOrder());
					}
				}
				q--;
			}
			t--;
		System.out.println();

		

	}

}
