import java.util.Arrays;

public class XiEr {
    public static void main(String[] args) {
        int[] arr={8,9,1,7,5,6,4,0};
        xiEr(arr);
    }

    /**
     * 交换式的希尔排序
     * @param nums
     */
    public static void xiEr(int[] nums){
        int temp=0;
        int count=0;
//        循环缩小增量遍历
        for(int gap=nums.length/2; gap>0;gap/=2){
//            确定划分为几组
            for(int i=gap;i<nums.length;i++){
//                遍历依据gap步长而确定的数组
                for(int j=i-gap;j>=0;j-=gap){
//                    当前元素大于加上步长后的元素，就交换
                    if(nums[j]>nums[j+gap]){
                        temp=nums[j];
                        nums[j]=nums[j+gap];
                        nums[j+gap]=temp;
                    }
                }
            }
            System.out.println("遍历次数=="+(count++)+",排序后："+ Arrays.toString(nums));
        }
    }
    /**
     * 移位式的希尔排序
     */
    public void Xier2(int[] nums){
        for(int gap=nums.length/2;gap>0;gap/=2){
            for(int i=gap;i<nums.length;i++){
                int j=i;
                int temp=nums[j];
                if(nums[j]<nums[j-gap]){
//不是每次比较都交换，不是插入的位置先移动，只要找到插入的位置才要交换
                    while(j-gap>=0&&temp<nums[j-gap]){
//                        移动
                        nums[j]=nums[j-gap];
                        j-=gap;
                    }
//                    退出while后，就给temn找到插入的位置
                    nums[j]=temp;
                }
            }
        }
    }

    /**
     * 确定有几组for(int gap=nums.length/2;gap>0;gap/=2){
     *依据组长确定具体的数组元素 for(int i=gap;i<nums.length;i++){
     * 在每个组里遍历元素 for(int j=i-gap;j>=0;j-=gap){
     * @param nums
     */
    public static  void Xier3(int[] nums){
        int temp=0;
        //缩小增量幅度为2，每次减少两组,
        for(int gap=nums.length/2;gap>0;gap/=2){
            //依据组长确定具体的数组元素
            for(int i=gap;i<nums.length;i++){
                //在每个组里遍历元素
                for(int j=i-gap;j>=0;j-=gap){
                    if(nums[j]>nums[j+gap]){
                        temp=nums[j];
                        nums[j]=nums[j+gap];
                        nums[j+gap]=temp;
                    }
                }
            }
        }
    }





}
