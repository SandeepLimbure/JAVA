package Java_Programs_100;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,7,4,9,3,8,5,12,11};
        int target = 3;
        int a = linearsearch(arr,target);
        System.out.println("the element "+target+" is found in array at index "+a);
    }
    public static int linearsearch(int []arr,int target){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
