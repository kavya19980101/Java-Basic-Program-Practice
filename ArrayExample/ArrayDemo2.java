package ArrayExample;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++){
            //arr[5]=60; It will throw run time error as ArrayOutOfBoundException becuase the size of arr is 5 where index starts from 0 to 4 can be allocated if we try to allocate 5 or above will throw this exception
            System.out.println(arr[i]);
    }
        int arr1[]={1,2,3};
        System.out.println(arr1[0]);
    }
}
