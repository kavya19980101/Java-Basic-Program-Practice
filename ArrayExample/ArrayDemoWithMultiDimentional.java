package ArrayExample;

public class ArrayDemoWithMultiDimentional {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //rows and column
        //123
        //456
        //789
        System.out.println(arr[0][0]);

        int[][] arr1= new int[3][3];
        int rows=arr1.length;
        System.out.println("the size of the arr1 row is "+rows);
        int r1size=arr1[0].length;
        System.out.println(r1size);
        int r2size=arr1[1].length;
        System.out.println(r2size);
        int r3size=arr1[0].length;
        System.out.println(r3size);
        for(int i=0;i<rows;i++) {
            System.out.println(arr1[i][i]);
        }

    }
}
