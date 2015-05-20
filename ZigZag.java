package dynamicProgramming;

public class ZigZag {

	public int calc(int[] arr){
			
		if(arr == null)
			return 0;
		else{
			
			int n = arr.length;
			int[] sign = new int[n];
			int[] dp = new int[n];
			
			for(int i = 0; i<dp.length; i++){
				dp[i] = 1;
			}
			
			for(int i = 1; i< dp.length; i++){
				for(int j = 0; j< i ; j++){
					if(sign[j] == 0 || (sign[j] < 0 && arr[i]- arr[j] > 0)||(sign[j] > 0 && arr[i] - arr[j] < 0)){
						dp[i] = dp[j] + 1;
						sign[i] = arr[i] - arr[j];
					}
				}
			}
			return dp[dp.length - 1];
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		ZigZag zz = new ZigZag();
		
		int[] test = {396, 549, 22, 819, 611, 972, 730, 638, 978, 342, 514, 752,
				871, 911, 172,  542, 482, 974, 210, 474, 66, 387, 1, 872, 799,
				262, 567, 113, 578, 308, 813, 515, 716, 434, 101, 632, 450,
				74, 254, 1000, 780, 633, 496, 513, 772, 925, 746};
		
		System.out.println("length fot the longest zigzag sequence is: "+ zz.calc(test));

	}

}
