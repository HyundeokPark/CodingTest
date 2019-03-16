package Line_Intern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int square = 0;

		int min = 0;
	
		square = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=square; i++) {
			for(int j=1; j<=square; j++) {
				if(i*j == square) {
					//System.out.println("I : " + i + " J : " + j );
					if(i==1) {
						min = Math.abs(i-j);
						//System.out.println("ÃÖÃÊ °ª : " + min);
					}
					else if(min > Math.abs(i-j)) {
						min = Math.abs(i-j);
						//System.out.println("min : " + min);
					}
				}
			}
		}
		System.out.println(min);
		
		
	}

}
