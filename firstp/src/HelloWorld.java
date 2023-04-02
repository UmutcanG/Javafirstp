import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println(20+20+20);
        System.out.println("".isEmpty());
        System.out.println("    s      ".trim());
        int number1 = 22;
        int number2 = 31;
        int sonuc = number2 + number1;
        System.out.println(sonuc + " :toplam");
        int[] list1 = new int[3];
        list1[0] = 1;
        list1[1] = 33;
        list1[2] = 22;
        System.out.println(Arrays.toString(list1));
        System.out.println(list1.length);
        System.out.println("--------------------------------------");
        int[] numbers = {1,4,5,8,9};
        System.out.println(Arrays.toString(numbers));
        numbers[2] = 6;
        Arrays.fill(numbers, 3);
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------------");
        System.out.println(15600/250000);
        String[] names = {"umut", "mahmut", "dsajsdad","ddsa","dsa","fdsfdsf","dsgsgfssg"};

        for (int i=0; i < names.length; i++ ) {
            System.out.println(names[i]);
        }
        System.out.println("-------------------");
        //fizzbuzz 3 bölünenler fizz 5e bölünenler buzz ikisine de bölünürse fizzbuzz
        int a = 50;
        for (int i=0; i<=a; i++) {
            if (i %3 ==0 && i%5==0){
                System.out.println(i+"=fizzbuzz");
            } else if (i%3==0) {
                System.out.println(i+"=fizz");
            } else if (i%5==0) {
                System.out.println(i+"=buzz");
            }else {
                System.out.println(i);
            }
        }
        double hesap = add(1300, 250000);
        System.out.println(hesap);
        }
    private static double add(double rent, double price) {
        double result = ((rent * 12) / price) * 100;
        return result;
    }
    }

