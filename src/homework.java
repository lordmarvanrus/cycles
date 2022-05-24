public class homework {

    public static void main (String [] args) {

        // 1 задание
        System.out.println("1 задание");
        int i = 0;
        while (i < 10) {
            i ++;
            System.out.print(i + " ");
        }
        i = 10;
        System.out.println();
        for (; i >= 1; i --) {
            System.out.print(i + " ");
        }
        // 2 задание
        System.out.println("2 задание");
        int friday = 6;
        for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        // 3 задание
        System.out.println("3 задание");
        int yearBefore = 1822;
        int yearAfter = 2222;
        for (int j = 0; j < 2122; j = j + 79) {
            if (j >= yearBefore && j <= yearAfter) {
                System.out.println(j);
            }
        }
        // 4 задание
        System.out.println("4 задание");
        System.out.println();
        for (int h = 1; h <= 30; h++) {
            if (h % 3 == 0 && h % 5 != 0) {
                System.out.println(h + " ping");
            }
            if (h % 5 == 0 && h % 3 != 0) {
                System.out.println(h + " pong");
            }
            if (h % 3 == 0 && h % 5 == 0){
                System.out.println(h + " ping pong");
            }
        }
        // 5 задание
        System.out.println();
        System.out.println("5 задание");
        int numberFirst = 0;
        int numberSecond = 1;
        int numberThird = 0;
        System.out.print(numberFirst);
        System.out.print(" " + numberSecond);
        for (int f = 1; f < 9; f++) {
            numberThird = numberFirst + numberSecond;
            numberFirst = numberSecond;
            numberSecond = numberThird;
            System.out.print(" " + numberThird);
        }
    }
}
