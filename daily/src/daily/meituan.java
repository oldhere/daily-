package daily;
import java.util.*;
public class meituan {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = 0;
		int res = 0;
        int []p = new int[n];
        for(int i=0;i<n;i++) {
            int a = in.nextInt();
                p[i] = a;
                m += a;
        }
        int k = in.nextInt();
        for(int i=0;i<n;i++){
        	if(n-1<res)
        		break;
        	int sum=i!=0?m-p[i-1]:m;     	
        	for(int j=n-1;j>=i;j--){
        		if(j-i+1 < res)
        			break;
        		sum= j!=n-1?sum-p[j+1]:sum;
        		if(sum%k == 0 && res<j-i+1){
        			res = j-i+1;
        		}
        	}
        }
        System.out.println(res);
        
        
	}

}
