package Class02;

public class Code01_swap {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

    }

    public static void main(String[] args) {

//
//        int a = 17;
//        int b = 13;
//        System.out.println(a);
//        System.out.println(b);
//
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.println(a);
//        System.out.println(b);
//

        int[] arr = {3, 1, 100};
        int i = 0;
        int j = 0;

//        arr[i] = arr[i] ^ arr[j];
//        arr[j] = arr[i] ^ arr[j];
//        arr[i] = arr[i] ^ arr[j];
//
//        System.out.println(arr[i] + " ," + arr[j]);
//
//        System.out.println(arr[0]);
//        System.out.println(arr[2]);

        swap(arr, 0, 0);
        System.out.println(arr[0]);
        System.out.println(arr[2]);


    }
}
