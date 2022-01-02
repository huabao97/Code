public class HeapSort {
    public static void main(String[] args) {
        int[] arr={4,6,8,9,2};
        headSort(arr);
    }
    public static void headSort(int[] arr){

        int temp=0;
        //无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for(int i=arr.length/2-1;i>=0;i++){
            adjustheap(arr,i, arr.length);
        }
        /*将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端;
        重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换
步骤，直到整个序列有序。*/
        for(int j= arr.length-1;j>0;j--){
            temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            adjustheap(arr,0,j);
        }
    }

    /**
     * 将一个数组调整成一个大顶堆
     * @param arr 待调整的数组
     * @param i 非叶子节点在数组中的索引
     * @param length 多少个元素要调整，逐渐减少
     */
    public static void adjustheap(int[] arr,int i,int length){
        int temp=arr[i];//取出当前元素值，保存起来
       //k是i节点的左子节点
        for(int k=2*i+1;k<length;k=2*k+1){
            //左子节点小于右子节点
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;//k指向右子节点
            }
            //右子节点大于父节点
            if(arr[k]>temp){
                arr[i]=arr[k];//大的值给当前节点
                i=k;//i指向k，继续循环
            }else{
                break;
            }
        }
        //for循环结束后将i为父节点的树的最大值放在最顶
        arr[i]=temp;//将temp值调整交换元素的位置
    }
}
