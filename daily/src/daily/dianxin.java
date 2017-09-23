package daily;

import java.util.Scanner;

public class dianxin {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine().trim();
		String[]a = s.split(" ");
		int [] ar = new int[a.length];
		for(int i=0;i<a.length;i++){
			ar[i] = Integer.parseInt(a[i]);
		}
		
		int min=Integer.MAX_VALUE,second=min;
		for(int i :ar){
			if(i< min){
				second=min;
				min=i;
			}else if(i<second){
				second=i;
			}
		}
		System.out.println(second);
	}

}
