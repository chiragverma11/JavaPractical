public class TransverseArray {
    //there are two ways to transverse an array
    public static void main(String[] args) {
        int[] arr={1,2,4,8,16,28};
        //#1 transverse using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //#2 Transverse using for each loop
        System.out.print("\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
