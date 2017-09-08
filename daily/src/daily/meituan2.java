package daily;
import java.util.*;
public class meituan2{
	public static void main(String[]args)
    {  
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int m = a ^ b;  
        int num = 0;  
        while(m>0)  
        {  
            m &= (m-1);  
            num++;  
        }  
        System.out.println(num);  
    }
}
