import java.util.Scanner;

public class PushToArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số thêm vào mảng :");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí index ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.print("Các phần tử mới trong mảng là : ");
        int [] newA = new int[arr.length+1];
        for( int i=0; i<arr.length; i++){
            if(i<index) {
                newA[i] = arr[i];
            } else if (i==index) {
                newA[i]=x;
            }else {
                newA[i]=arr[i-1];
            }
        }
        for (int i = 0; i < newA.length; i++) {
            System.out.print(newA[i] + " ,");
        }
    }
}

