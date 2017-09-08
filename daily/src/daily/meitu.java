package daily;
import java.util.*;
public class meitu{
    public static void main(String[]args){
        Scanner s =  new Scanner(System.in);  
        String str1 = s.next();  
        String str2 = s.next();  
          
        char a[] = str1.toCharArray();  
        char b[] = str2.toCharArray();  
          
        int maxlen = 0;       
        int startIndex=0;  
        int endIndex = 0;  
          
        for(int i=0;i<b.length;i++){//对于b数组中的每一个数组，从第一个开始分别与a中的值比较  
            int nowstartIndex = i;  
            int nowendIndex = i;  
            int tempb = i;///定义序列相同时，b下标当前值，如果直接使用i++，会造成下一个字符开始的遍历错误  
            int nowlen = 0;  
            boolean flag = false;  
            for(int j=0; j<a.length && tempb < b.length; j++){//临时值不能超过b长度  
                if(b[tempb] == a[j]){  
                    nowendIndex = tempb;  
                    nowlen = nowendIndex - nowstartIndex;  
                    tempb++;  
                    flag = true;  
                }else{  
                    if(flag == true){//如果之前的相同，再遇到一个不相同的字符，后面的不用再比较  
                        break;  
                    }//if  
                }//else  
            }//for  
            if(nowlen > maxlen){  
                maxlen = nowlen;  
                startIndex = nowstartIndex;  
                endIndex = nowendIndex;  
            }  
        }//for  
            System.out.print(endIndex-startIndex);  
    }
} 
