import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 số gồm 3 chữ số");
        int num = scanner.nextInt();
        int hangTram = num /100;
        int hangChuc = (num %100)/10;
        int hangDonVi = (num%10);
        String chuoiIn = "";

        switch (hangTram){
            case 1:
                chuoiIn = ("một trăm");
                break;
            case 2:
                chuoiIn = ("hai trăm");
                break;
            case 3:
                chuoiIn = ("ba trăm");
                break;
            case 4:
                chuoiIn = ("Bốn trăm");
                break;
            case 5:
                chuoiIn = ("Năm trăm");
                break;
            case 6:
                chuoiIn = ("Sáu trăm");
                break;
            case 7:
                chuoiIn = ("Bảy trăm");
                break;
            case 8:
                chuoiIn = ("Tám trăm");
                break;
            case 9:
                chuoiIn = ("Chín trăm");
                break;


        }switch (hangChuc){
//            case 0:
//                System.out.println("Linh");
//                break;
            case 1:
                chuoiIn += (" mười");
                break;
            case 2:
                chuoiIn += (" hai mươi");
                break;
            case 3:
                chuoiIn += (" ba mươi");
                break;
            case 4:
                chuoiIn += (" bốn mươi");
                break;
            case 5:
                chuoiIn += (" năm mươi");
                break;
            case 6:
                chuoiIn += (" sáu mươi");
                break;
            case 7:
                chuoiIn += (" bảy mươi");
                break;
            case 8:
                chuoiIn += (" tám mươi");
                break;
            case 9:
                chuoiIn += (" chín mươi");
                break;

        }switch (hangDonVi){
            case 1:
                chuoiIn += (" một  đơn vị");
                break;
            case 2:
                chuoiIn += (" hai đơn vị ");
                break;
            case 3:
                chuoiIn += (" ba đơn vị");
                break;
            case 4:
                chuoiIn += (" bốn đơn vị");
                break;
            case 5:
                chuoiIn += (" năm đơn vị");
                break;
            case 6:
                chuoiIn += (" sáu đơn vị");
                break;
            case 7:
                chuoiIn += (" bảy đơn vị");
                break;
            case 8:
                chuoiIn += (" tám đơn vị");
                break;
            case 9:
                chuoiIn += (" chín đơn vị");
                break;
        }
        System.out.println("số bạn nhập đọc là :  " + chuoiIn );

    }
}
