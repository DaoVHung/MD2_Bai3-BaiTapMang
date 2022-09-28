import java.util.Scanner;

public class DemSoKyTu {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,5,3,4,5,6,7,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số kiểm vào mảng :");
        int x = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if(x==arr[i]){
                count ++;
            }
        }System.out.println("Số lần số xuất hiện trong mảng là : " + count + "  ");
    }
}
