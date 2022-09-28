import java.util.Scanner;

public class DeleteIndexArray {
    public static void main(String[] args) {
        int [] value = {10,4,6,7,8,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số :");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Các phần tử còn lại trong mảng là : ");
        for ( int i = 0; i <= value.length-1; i++){
            if( x == value[i]){
                i=i+1;
//                value[i]=value[i+1];
            }
            System.out.print( value[i] + " , ");
        }

    }
}
