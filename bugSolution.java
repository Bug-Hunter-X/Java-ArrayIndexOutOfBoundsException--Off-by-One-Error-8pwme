public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        //System.out.println(arr[5]); //Removed to avoid out of bound exception.
        for(int j=0; j< arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}