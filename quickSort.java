import java.util.Arrays;

public class quickSort {


    public static void main(String[] args) {
        int[] arr={1,2,4,6,87,9,5,3,2};
        quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }


    /**
     *while找左大右小值， if判断是否符合左小右大，交换，if判断左右指针与中间值大小，并移动
     * @param nums
     * @param left
     * @param right
     */
    public static void quicksort(int[] nums,int left,int right){
        int l=left;
        int r=right;
        int mid=nums[(left+right)/2];
        int temp=0;//临时变量，作为交换时使用
        //while 循环的目的是让比mid 值小放到左边
        //比mid 值大放到右边
        while(l<r){
            //在pivot 的左边一直找,找到大于等于pivot 值,才退出
            while (nums[l]<mid){
                l++;
            }
            //在pivot 的右边一直找,找到小于等于pivot 值,才退出
            while(nums[r]>mid){
                r--;
            }
            //如果l >= r 说明pivot 的左右两的值，已经按照左边全部是
            // 小于等于pivot 值，右边全部是大于等于pivot 值
            if(l>=r){
                break;
            }
            //交换
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        //如果交换完后，发现这个arr[l] == pivot 值相等r--， 前移
        if(nums[l] == mid) {
            r -= 1;
        }
//如果交换完后，发现这个arr[r] == pivot 值相等l++， 后移
        if(nums[r] == mid) {
            l += 1;
        }
        // 如果l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r) {
            quicksort(nums, left, r);
        }
//向右递归
        if(right > l) {
            quicksort(nums, l, right);
        }
    }
}
