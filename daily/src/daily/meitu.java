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
          
        for(int i=0;i<b.length;i++){//����b�����е�ÿһ�����飬�ӵ�һ����ʼ�ֱ���a�е�ֵ�Ƚ�  
            int nowstartIndex = i;  
            int nowendIndex = i;  
            int tempb = i;///����������ͬʱ��b�±굱ǰֵ�����ֱ��ʹ��i++���������һ���ַ���ʼ�ı�������  
            int nowlen = 0;  
            boolean flag = false;  
            for(int j=0; j<a.length && tempb < b.length; j++){//��ʱֵ���ܳ���b����  
                if(b[tempb] == a[j]){  
                    nowendIndex = tempb;  
                    nowlen = nowendIndex - nowstartIndex;  
                    tempb++;  
                    flag = true;  
                }else{  
                    if(flag == true){//���֮ǰ����ͬ��������һ������ͬ���ַ�������Ĳ����ٱȽ�  
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
