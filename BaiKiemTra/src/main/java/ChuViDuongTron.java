import java.util.Scanner;
class ChuViDuongTron {
    public static void main(String[] args) {
        double r;
        final double PI = 3.14519;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ban Kinh Duong Tron :");
        r = scanner.nextDouble();
        double C = r*2*PI;
        System.out.println("Chu Vi Duong Tron La: "+C);       
    }
}