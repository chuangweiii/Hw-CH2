package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sp14 {
	
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請輸入整數");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++) {
			System.out.println("第" +i+ "次的處理");
			if(i == res)
				break;
		}
	}
}
