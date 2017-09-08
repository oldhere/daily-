package daily;

import java.util.Scanner;

public class jingdong {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length()/2,flag=0,temp=0;
		if(n==0){System.out.println(0);return;}
		for(int i=0;i<s.length();i++){
			if(i<n){
				if(s.charAt(i) == '(')
					flag++;
				else if(s.charAt(i) == ')'){
					flag--;
					n++;
					if(flag != 0) temp++;
				}
			}else if(i == n)
				break;
		}
		n=(int) (flag*(Math.pow(2, temp)));
		for(int i=1;i<flag;i++)
			n *= i;
		System.out.println(n);
	}

}
