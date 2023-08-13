package Arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15};
		int target=17;
		  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
            int s=target-nums[i];
            if(hm.containsKey(s)){
                System.out.println(hm.get(s)+" "+i);
                
                break;
            }else{
                hm.put(nums[i],i);
            }
        }
	}

}
