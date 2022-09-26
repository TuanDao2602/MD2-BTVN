import java.util.Scanner;

public class chuyenDoiTienTE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số USD cần đổi");
         int usd = scanner.nextInt();
         int rate =23000;
         int tienViet =   usd*rate;
        System.out.println(" số tiền quy đổi ra là "+ tienViet);
    }
}
