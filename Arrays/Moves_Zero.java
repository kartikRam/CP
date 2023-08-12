package Arrays;

public class Moves_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,0,3,4,5,0,1,3,0};
		int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        for(int i=ptr;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
	}

}
