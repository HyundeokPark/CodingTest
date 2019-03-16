package Line_Intern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int buildNum =0;
		int[] building;
		int max = 0 , maxIndx = 0 ,scndMax =0, scndMaxIndx = 0;
		
		
		buildNum = Integer.parseInt(br.readLine());
		building = new int[buildNum];
		
		for(int i=0; i<buildNum; i++) {
			building[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<buildNum; i++) {
			if(max < building[i]) {
				max = building[i];
				maxIndx = i; 
			}
		}
		
		for(int i=0; i<buildNum; i++) {
			if(scndMax < building[i] && max != building[i]) {
				scndMax = building[i];
				scndMaxIndx = i;
			}
		}
		
		bw.write(Integer.toString(Math.abs(maxIndx - scndMaxIndx)));
		bw.flush();
	}

}
