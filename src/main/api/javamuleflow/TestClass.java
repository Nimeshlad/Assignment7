package javamuleflow;

public class TestClass {
	
	public String reverse(String name){
		
		
		StringBuffer sb = new StringBuffer(name);
		sb.reverse().toString();
		return "Return String Is: " +sb;
		
	}

}
