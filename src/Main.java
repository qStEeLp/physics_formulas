import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа Формулы школьной физики");
        System.out.println("Доступно ?? формул. 10 Тем. Введите номер темы: \n"  +
                "1 - Кинематика\n " +
        "2 - Динамика\n " +
        "3 - Законы сохранения\n " +
         "4 - Статика\n " +
        "5 - Тепловые явления\n " +
        "6 - Элетростатика\n " +
        "7 - Ток\n " +
        "8 - Магнитные явления\n " +
        "9 - Колебания и волны\n " +
        "10 - Оптика\n ");
        int zapros = in.nextInt();
        if (zapros == 1) {
            System.out.println("Вы выбрали Раздел: Кинематика");
            System.out.println("Выбери формулу: \n" +
                    "1 - " +
                    "2 - " +
                    "3 - " +
                    "4 - " +
                    "5 - " +
                    "6 - " +
                    "7 - " +
                    "8 - " +
                    "9 - " +
                    "10 - ");
            int formula = in.nextInt();



        }
    }
}