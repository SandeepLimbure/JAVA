package Java_Programs_100;

public class Armstrong {
    public static void main(String[] args) {
       boolean a = armstrong(371);
       System.out.println(a);
       boolean b = armstrong(153);
       System.out.println(b);
       boolean c = armstrong(123);
       System.out.println(c);
    }
    public static boolean armstrong(int num) {
        int sum = 0;
        String str = Integer.toString(num);
        String[] arr = str.split("");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0;i< intArr.length;i++){
             sum += (int) Math.pow(intArr[i], intArr.length );
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
