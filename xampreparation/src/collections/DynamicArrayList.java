package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println();
     int A[]= {1,4,5,9,3};
     int query[]= {2,6};
     int p=query[0];
     int q=query[1];
     List<Integer> list2 = new ArrayList<Integer>();
     for(int text:A) {
        list2.add(text);
     }
     System.out.println(list2);
         
	
    list2.add(p,q);
    for(int i=0;i<list2.size();i++) {
    	System.out.print(list2.get(i));
    }
    int Aa[]= {1,9,2,4};
    int qquery[]= {4};
    int pp=qquery[0];
    List<Integer> list1 = new ArrayList<Integer>();
    for(int text:Aa) {
       list1.add(text);
    }
    System.out.println("--------------------------");
    System.out.println(list1);
    for(int i=0;i<list1.size();i++) {
    	if(list1.contains(pp)) {
    		System.out.println(list1.indexOf(pp));
    		break;
    	}
    	else
    	{
    		System.out.println("-1");
    	}
    }
        
}}
