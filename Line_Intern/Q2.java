package Line_Intern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2 {
	
	   public static boolean isNumber(String str){
	        boolean result = false;
	         
	         
	        try{
	            Integer.parseInt(str) ;
	            result = true ;
	        }catch(Exception e){}
	            
	        return result ;
	   }


	   
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String unarrnaged ="";
		String[] modifier;
		String[] elementNum  ;
		String[] element;
		String[] element2;
		int count=0;
		char low;
		int index = 0;
		unarrnaged = br.readLine();
		modifier = unarrnaged.split("");
		for(int i=0; i<modifier.length; i++) {
			if(isNumber(modifier[i])) {
				index = i;
				break;
			}
		}
		//System.out.println("index : " + index);
		elementNum = new String[modifier.length-index];
		element = new String[index];
		
		System.arraycopy(modifier, index, elementNum, 0, modifier.length-index);
		System.arraycopy(modifier, 0, element, 0, index);
		element2= new String[element.length];
		
		for(int i=0; i<element.length; i++) {
			 low = element[i].charAt(0);
			if(low>='a' && low <='z') {
				element[i-1] = element[i-1] + element[i];
				count++;
			}

		}
		for(int i=0; i<count; i++) {
			System.out.println(element[i]);
		}
		
		System.out.println("element °¹¼ö : " + element.length);
		System.out.println("element2 °¹¼ö : " + element2.length);
		System.out.println("elementNum °¹¼ö : " + elementNum.length);
		
		
		for(int i=0; i<element2.length; i++) {
			if(element2.length != elementNum.length) {
				System.out.println("error");
				break;
			}
			else {
				if(1 == Integer.parseInt(elementNum[i])) {
					System.out.print(element[i]);
				}
				else {
					System.out.print(element[i]);
					System.out.print(elementNum[i]);
				}
			}
			
			
		}
		
		
	}

}
