import java.io.FileInputStream;
import java.io.IOException;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] count = new int[26];
		String paragragh = "";
		int j = 0;
		int k = 0;
		
		try (FileInputStream fis = new FileInputStream("/Users/macbookpro/Desktop/securityText.txt"))
		{
		      char current;
		      while (fis.available() > 0) {
		        current = (char) fis.read();
		        
		        for(int i = 0; i < alpha.length; i++) {
		        	if(current == Character.toUpperCase(alpha[i])) {
		        		count[i] = count[i] + 1;
		        		j = i + 9;
		        		
		        		if(j > 25) {
		        			k = j - 26;
		        			
		        			System.out.print(alpha[k]);
		        			j = 0;
		        			k = 0;
		        			
		        		} 
		        		else if(j < 25) {
		        			System.out.print(alpha[j]);
		        			j = 0;
		        		}
		        		
		
		        		
		        		//i = i + 1;
		        		//System.out.print(current+ "," +i +"\n");		
		        	}

		        	
		        }
	        	if(current == ' '){
	        		System.out.print(" ");
	        	}
		        
		      }
		      
//		      for(int j = 0; j < count.length; j++) {
//		    	  System.out.print(alpha[j] +" - " + count[j] + "\n");
//		      }
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}