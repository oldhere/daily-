package practise;

public class sort {
	//—°‘Ò≈≈–Ú
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
	//≤Â»Î≈≈–Ú
	public static void insertSort(int [] a){
		int temp;
		for(int i=1;i<a.length;i++){
			temp = a[i];
			int j=i;
		//	if(a[j-1]>temp){
			while(j >= 1 && a[j-1]>temp){
				a[j]=a[j-1];
				j--;
			}
			a[j] = temp;
		}
		//	}
	}
	//√∞≈›≈≈–Ú
	public static void BubbleSort(int[]a){
		for(int i=a.length;i>0;i--){
			for(int j=1;j<i;j++){
				if(a[j-1]>a[j]){
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	//πÈ≤¢≈≈–Úpublic static void Merge()
	//øÏÀŸ≈≈–Ú
	public static void quickSort(int[]a,int low,int high){
		int index,i,j;
		if(low>=high)
			return;
		i=low;
		j=high;
		index = a[i];
		while(i<j){
			while(i<j && index<=a[j])
				j--;
			if(index>a[j])
				a[i++] = a[j];
			while(i<j &&index >= a[i])
				i++;
			if(index <a[i])
				a[j--] = a[i];
		}
		a[i] = index;
		quickSort(a,low,i-1);
		quickSort(a,i+1,high);		
	}
	public static void main(String[]args){
		int[]a = {5,4,9,6,8,7,6,0,1,3,2};
		sop(a);
		//selectSort(a);
		//insertSort(a);
		//BubbleSort(a);
		quickSort(a,0,a.length-1);
		sop(a);
	}
	public static void sop(int[]a){
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
