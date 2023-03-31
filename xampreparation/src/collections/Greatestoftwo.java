package collections;
import java.util.*;
public class Greatestoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(2);
		list.add(4);
		Iterator itr=list.iterator();
		{
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		Collections.sort(list);//sorting array list
		int sec_great=list.get(list.size()-2);
		System.out.println("second largest number:"+sec_great);
		
		

	}

}
