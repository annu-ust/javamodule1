package opsday23.overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math=new Math();
		int result= math.add(10, 20);//30
		System.out.println(result);
        result=math.add(10, 20, 30);
        System.out.println(result);
         double result2=math.add(15.0, 20.0);//35
        System.out.println(result2);
        result2=math.add(22, 10.5, 5);
        System.out.println(result2);
        
	}

}
