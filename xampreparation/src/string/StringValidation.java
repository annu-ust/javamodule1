package string;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(]";
		if(str.contains("(") && str.contains(")")) 
		{
			System.out.println("valid");
		}

	}

}
