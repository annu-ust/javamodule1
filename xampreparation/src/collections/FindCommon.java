package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class FindCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(2);
		list.add(4);
		//Iterator itr=list.iterator();
		//{
			//while(itr.hasNext()) {
				//System.out.println(itr.next());
			//}
		//}
		System.out.println(list);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		list2.add(9);
		list2.add(4);
		list2.add(2);
		list2.add(5);
		//for(int i:list2) {
			//System.out.println(i);
		//}
		System.out.println(list2);
		System.out.println("common elents:");
		//for(int j:list) {
			//System.out.println(list.contains(list2.get(j)));//check whether it contains the elements
		//}
		list.retainAll(list2);//to get common elements
		System.out.println(list);

	


	}

}
