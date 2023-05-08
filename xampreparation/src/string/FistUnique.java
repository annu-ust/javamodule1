package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FistUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="leetcode";
     ArrayList<Character> list=new ArrayList<>();//keeping insertion order
     HashSet<Character>set=new HashSet<>();//keeping only unique elements
     for(int i=0;i<str.length();i++) {
    	 char ch=str.charAt(i);
    	 
    	 if(!set.contains(str.charAt(i)))
    	 {  set.add(ch);
    		list.add(ch); 
    		 
    	 }
    	 else {
    		 list.remove(Character.valueOf(ch));
    	 }
     }
    System.out.println(set);
    System.out.println(list);
     if(!list.isEmpty()) {
//    	 char cha=list.get(0);
    	 System.out.println(str.indexOf(list.get(0)));
     }
	}
}
