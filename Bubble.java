import java.util.Arrays;

public class Bubble {

    public static void sort(int[] nums){
        int temp = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            System.out.println("第"+(j+1)+"次排序结果");
            for(int item:nums){
                System.out.printf("%d,",item);
            }
            System.out.println("\n");
        }
    }
    public static void sortSecond(int[] nums){
        int temp = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    flag = true;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序");
            System.out.println(Arrays.toString(nums));
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,1,-1,5,0,2};
        sort(nums);
        sortSecond(nums);
    }
}
