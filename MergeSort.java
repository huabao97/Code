public class MergeSort {
    public static void main(String[] args) {

    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            //向左右递归
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            //合并
            merge(arr,left,mid,right,temp);
        }
    }

    public static  void merge(int[] nums,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;// 指向temp 数组的当前索引


        //先把左右两边(有序)的数据按照规则填充到temp 数组
        // 直到左右两边的有序序列，有一边处理完毕为止
        while(i<=mid&&j<=right){
            //如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
            // 即将左边的当前元素，填充到temp 数组
            // 然后t++, i++
            if(nums[i]<=nums[j]){
                temp[t]=nums[i];
                t++;
                i++;
            }else{//反之,将右边有序序列的当前元素，填充到temp 数组
                temp[t]=nums[i];
                t++;
                j++;
            }
        }
        while(i<=mid){
            temp[t]=nums[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t]=nums[j];
            t++;
            j++;
        }
        //合并
        //将temp 数组的元素拷贝到arr
        t=0;
        int templeft=left;
        while(templeft<=right){
            nums[templeft]=temp[t];
            t++;
            templeft++;
        }
    }
}
