package Assignment;



public class Assingment5 {

	public static void main(String[] args) {
		//reversed string
		String str="Pranita Suradkar";
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is:"+rev);
		
		
	}

	

}
