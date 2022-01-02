import java.util.Arrays;

public class Select {


    /**
     * 每次都从n-1个元素中找到最小的元素依次放到i索引处
     * @param nums
     */
    public static void sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){//最后一个元素nums.length-1肯定是有序的，不用排序
            int minIndex=i;//假设当前元素为这次排序的最小值
            int min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(min>nums[j])
                {
                    min=nums[j];//当前循环中的最小值，重置min
                    minIndex=j;//最小值的下标，重置minIndex
                }
            }
            if(minIndex!=i){
//                最小值不是当前值，才做交换
                nums[minIndex]=nums[i];
                nums[i]=min;
            }
            System.out.println("第"+(i+1)+"次排序");
            System.out.println(Arrays.toString(nums));
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,-1,4,6,10};
        sort(nums);
    }
}
