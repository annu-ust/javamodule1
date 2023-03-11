package strings;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
    System.out.println(str.length());
    System.out.println(str);
    
    
    str="welcome";
    bytes=str.getBytes();
    for(byte b:bytes) {
    	System.out.println(b);
        }
    
    char chars[]= {'U','S','T',' '};
     str=new String(chars);
     System.out.println(str);
     
     str.getChars(0, chars.length-1, chars, 0);
     for(char c:chars) {
    	 System.out.println(c);
    	 }
     
     
     String string=new String("she sells sea shells. in sea shore ");
     int len=string.length();
     int count=0;
     for(int i=0;i<len;i++) {
    	 if(string.charAt(i)=='s') {
    		 count++;
    	 }
     }
     System.out.println(count);
     
        String words[]= string.split(" ");
        System.out.println(words.length);
        
        for(String word:words) {
        	System.out.println(word);
        }
        String st=new String("annu.mathew@ust.com");
       int pos1= st.indexOf('c');
       int pos2=st.indexOf('m');
       System.out.println(st.substring(pos1, pos2));
	}

}
