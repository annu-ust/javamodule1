package strings;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s=new String("16-11-477/6/A/3 Hyderabad 500036");
  int len=s.length();
  char ch;
  int count=0;
  int flag=0;
  int ws=0;
  int sy=0;
  for(int i=0;i<len;i++) {
	ch=s.charAt(i);
	if( Character.isDigit(ch)==true) {
		count++;
	}
	else if(Character.isLetter(ch)==true) {
		flag++;
	}
	else if(Character.isWhitespace(ch)==true) {
		ws++;
	}
	else {
		sy++;
	}
  }
  System.out.println("number of digit "+count);
  System.out.println("number of letters "+flag);
  System.out.println("number of whitespace "+ws);
  System.out.println("number ofsymbols "+sy);
	}

}
