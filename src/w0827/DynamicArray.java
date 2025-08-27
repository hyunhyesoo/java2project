package w0827;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] dArray = {{1,2,10,20}, {3,4,5}, {6,7,8,9,10}};

        for (int i = 0; i < dArray.length; i++) {
           for (int j = 0; j < dArray[i].length; j++) {
               System.out.printf(dArray[i][j] + "\t");
           }
           System.out.println();
        }


//        int[][] arr = new int[3][];
//        arr[0] = new int[2]; // 0행: 열 2개
//        arr[1] = new int[3]; // 1행: 열 3개
//        arr[2] = new int[2]; // 2행: 열 2개
//
//        int value = 1; // 기본 증가값
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == 0 && j == 0) {
//                    arr[i][j] = 0; // 0행 0열만 0으로
//                } else {
//                    arr[i][j] = value++;
//                }
//            }
//        }
//
//        // 출력
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
