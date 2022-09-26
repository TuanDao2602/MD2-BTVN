import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 số gồm 3 chữ số");
        int num = scanner.nextInt();
        int hangTram = num /100;
        int hangChuc = (num %100)/10;
        int hangDonVi = (num%10);

        switch (hangTram){
            case 1:
                System.out.println("một trăm");
                break;
            case 2:
                System.out.println("hai trăm");
                break;
            case 3:
                System.out.println("ba trăm");
                break;
            case 4:
                System.out.println("Bốn trăm");
                break;
            case 5:
                System.out.println("Năm trăm");
                break;
            case 6:
                System.out.println("Sáu trăm");
                break;
            case 7:
                System.out.println("Bảy trăm");
                break;
            case 8:
                System.out.println("Tám trăm");
                break;
            case 9:
                System.out.println("Chín trăm");
                break;


        }switch (hangChuc){
            case 0:
                System.out.println("Linh");
                break;
            case 1:
                System.out.println("mười");
                break;
            case 2:
                System.out.println("hai mươi");
                break;
            case 3:
                System.out.println("ba mươi");
                break;
            case 4:
                System.out.println("bốn mươi");
                break;
            case 5:
                System.out.println("năm mươi");
                break;
            case 6:
                System.out.println("sáu mươi");
                break;
            case 7:
                System.out.println("bảy mươi");
                break;
            case 8:
                System.out.println("tám mươi");
                break;
            case 9:
                System.out.println("chín mươi");
                break;

        }switch (hangDonVi){
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;
        }
        System.out.println("số bạn nhập đọc là : " );

    }
}
