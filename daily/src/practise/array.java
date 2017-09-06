package practise;

public class array {
	//动态规划最大子数组之和
	public static int max(int n, int m){
		return m>n?m:n;
	}
	public static int maxSubArray(int[]arr){
		int end=arr[0],all=arr[0];
		for(int i=1;i<arr.length;i++){
			end = max(end+arr[i],arr[i]);
			all = max(end,all);
		}
		return all;
	}

	public static void main(String[]args){
		int[]a = {1,-2,4,8,-4,7,-1,-5};
		System.out.println(maxSubArray(a));
	}
}
