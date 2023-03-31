package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
public class RemoveEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(4);
		list.add(2);
		
		list.add(5);
		Iterator itr=list.iterator();
		{
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		int i;
		/*for(Integer l : list)
		{
			if(l%2==0)
			{
				list.remove(l);
			}
		}*/
		
		 for(i=0;i<list.size();i++)
		 { if((list.get(i))%2==0) 
		 {
		  System.out.println("............."+list.get(i));
		  list.remove(i);
		  
		 } }
		 
		System.out.println(list);
		
		
	


	
	}
}
