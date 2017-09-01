package daily;

public class sort {
	public static void selectSort(int [] a){
		int flag=0,temp;
		for(int i=0;i<a.length;i++){
			temp = a[i];
			flag = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<temp){
					temp = a[j];
					flag = j;
				}
			}
			a[flag] = a[i];
			a[i] = temp;
		}
	}
	public void main(String[]args){
		int[]a = {5,4,9,8,7,6,0,1,3,2};
		sop(a);
		selectSort(a);
		sop(a);
	}
	public static void sop(int[]a){
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
