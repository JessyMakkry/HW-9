public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] costOne = {15000, 11000, 23000, 9000, 14000};
        int total = 0;
        for (int element : costOne) {
            total = total + element;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println("Task 2");
        int[] costTwo = {23756, 13456, 17880, 9500, 30303};
        int min = costTwo[0];
        int max = costTwo[0];
        for (int element : costTwo) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты на неделю составили " + min + " рублей. Максимальная сумма за неделю составила " + max + " рублей");
        System.out.println("Task 3");
        int[] costThree = {9780, 10050, 21012, 38650, 17071};
        float middle = 0f;
        for (int element : costThree) {
            middle = middle + element;
        }
        middle = middle / 5f;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
        System.out.println("Task 4");
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        int track = reverseFullName.length;
        for (int i = track-1; i>0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(reverseFullName[0]);
    }
}