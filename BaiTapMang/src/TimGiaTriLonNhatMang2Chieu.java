import java.util.Scanner;
public class TimGiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        int dong,cot;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng : ");
        dong =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột : ");
        cot = Integer.parseInt(sc.nextLine());
        int [][] A = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]:");
                A[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập vào là :");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max=A [0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if( max < A[i][j]){
                    max=A[i][j];
                }
            }
            System.out.println("Giá Trị Max là :" + max);
            System.out.println("\n");
        }
    }
}
