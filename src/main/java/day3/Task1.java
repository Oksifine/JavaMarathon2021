package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для того чтобы узнать страну введите город(чтобы закончить введите Stop):");
        String country;
        while (true) {
            String city = scanner.next();
            if (city.equals("Stop")) {
                break;
            } else {
                switch (city) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        country = "Россия";
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        country = "Англия";
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        country = "Германия";
                        break;
                    default:
                        country = "Неизвестная страна";
                        break;
                }
                System.out.println(country);

            }
        }
    }
}
