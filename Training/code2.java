import java.util.Scanner;
public class code2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String num = number.replaceAll("[\\s\\-./()]", "");

        if (!num.matches("\\d+")) {
            System.out.println(0);
            return;
        }
        if (num.length() == 10 || (num.length() == 11 && num.startsWith("1"))) {
            if (number.matches("^(\\+?1[\\s./-]?)?(\\(\\d{3}\\)|\\d{3})[\\s./-]?\\d{3}[\\s./-]?\\d{4}$")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
