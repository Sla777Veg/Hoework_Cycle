public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задание 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //Задание4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задание 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
        //Задание6
        for (int i = 7; i <= 2096; i = i + 7) {
            System.out.println(i);
        }
        //Задание7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задание8
        int accumulation1 = 29000;
        int total1 = 0;
        for (int i=0; i<=12; i++) {
            total1 = total1 + accumulation1;
            System.out.println(total1);
        }
        //Задание9
        int accumulation2 = 29000;
        int total2 = 0;
        for (int i=0; i<=12; i++) {
            total2 = total2+total2/100;
            total2 = total2 + accumulation2;
            System.out.println("Месяц " +i+" Итого "+total2);
        }
        System.out.println(total2);
    }
}