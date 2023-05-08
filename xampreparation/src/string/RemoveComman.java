package string;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveComman {
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
	     
	    System.out.println(list);
	     
	}
}
