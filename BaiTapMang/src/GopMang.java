import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Mảng 1
        System.out.println("Nhập số độ dài của mảng 1 : ");
        int size1 = Integer.parseInt(sc.nextLine());
        int [] mang1= new int[size1];
        for (int i = 0; i < mang1.length; i++) {
            System.out.printf("Nhập vào phần tử của mảng : ",(i+1));
            mang1[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Phần tử của mảng 1 là  : ");
        for (int i = 0; i < mang1.length; i++) {
            System.out.printf("%d\t", mang1[i]);
        }
        System.out.println(" ");
        //Mảng 2
        System.out.println("Nhập số độ dài của mảng 2 : ");
        int size2 = Integer.parseInt(sc.nextLine());
        int [] mang2= new int[size2];
        for (int i = 0; i < mang2.length; i++) {
            System.out.printf("Nhập vào phần tử của mảng 2 : ",(i+1));
            mang2[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Phần tử của mảng 2 là : ");
        for (int i = 0; i < mang2.length; i++) {
            System.out.printf("%d\t", mang2[i]);
        }System.out.println(" ");
        //Mảng 3
        System.out.println(" Sau khi gộp mảng 3 là :");
        int size3 = size1 + size2;
        int [] mang3= new int[size3];
        System.arraycopy(mang1,0,mang3,0,size1);
        System.arraycopy(mang2,0,mang3,size1,size2);
        System.out.println("Phần tử của mảng 3 là : ");
        System.out.println(Arrays.toString(mang3));
        }
}
