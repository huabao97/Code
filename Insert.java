import java.util.Arrays;

public class Insert {

    public static void sort1(int[] nums){
        //待插入的值和索引
        int insertVal=0;
        int insertIndex=0;
        for(int i=1;i<nums.length;i++){
            insertVal=nums[i];//待插入的值
            insertIndex=i-1;//排序好的索引
            while(insertIndex>=0&&insertVal<nums[insertIndex]){
                nums[insertIndex+1]=nums[insertIndex];//因为已经存储了待插入的值，所以不需要担心会覆盖
                insertIndex--;//找到合适插入的位置
            }
            if(insertIndex+1!=i){
                nums[insertIndex+1]=insertVal;//--的时候减到了合适插入位置的前面一个位置
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,4,3,5,7};
        sort1(arr);
        System.out.print(Arrays.toString(arr));
    }
}
