package Java_Programs_100;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,3,5,7,9,11,13,15};
        int target = 15;
        int a = binarysearch(arr,target);
        System.out.println("the element "+target+" is found in array at index "+a);
    }
    public static int binarysearch(int []arr,int target){
        int left = arr[0];
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
