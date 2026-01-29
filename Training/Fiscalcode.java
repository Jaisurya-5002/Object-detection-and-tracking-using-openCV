import java.util.Scanner;
public class Fiscalcode {
    static final String[] months = {"", "A", "B", "C", "D", "E", "H", "L", "M", "P", "R", "S", "T"};
    public static String fiscalCode(String name, String surName, String gender, String dob) {
        StringBuilder code = new StringBuilder();
        code.append(getSurnameCode(surName.toUpperCase()));
        code.append(getNameCode(name.toUpperCase()));
        code.append(getDOBCode(dob, gender.toUpperCase()));
        return code.toString();
    }
    private static String getSurnameCode(String surname) {
        String consonants = "";
        String vowels = "";
        for (char ch : surname.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) vowels += ch;
            else if (Character.isLetter(ch)) consonants += ch;
        }
        String result = consonants + vowels;
        while (result.length() < 3) result += "X";
        return result.substring(0, 3);
    }
    private static String getNameCode(String name) {
        String consonants = "";
        String vowels = "";
        for (char ch : name.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) vowels += ch;
            else if (Character.isLetter(ch)) consonants += ch;
        }
        if (consonants.length() >= 4) {
            return "" + consonants.charAt(0) + consonants.charAt(2) + consonants.charAt(3);
        }
        String result = consonants + vowels;
        while (result.length() < 3) result += "X";
        return result.substring(0, 3);
    }
    private static String getDOBCode(String dob, String gender) {
        String[] parts = dob.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        String year = parts[2];
        String yy = year.substring(year.length() - 2);
        String mm = months[month];
        if (gender.equals("F")) day += 40;
        String dd = (day < 10) ? "0" + day : String.valueOf(day);
        return yy + mm + dd;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Surname: ");
        String surname = sc.nextLine();
        System.out.print("Gender : ");
        String gender = sc.nextLine();
        System.out.print("dob: ");
        String dob = sc.nextLine();
        String code = fiscalCode(name, surname, gender, dob);
        System.out.println("Fiscal Code: " + code);
    }
}
