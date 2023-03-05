public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task1");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Task2");
        int arr[] = generateRandomArray();
        int min = 9999999;
        int max = 0;
        for (int i = 0; i < 30; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей. Максимальная сумма трат за месяц составила " + max + " рублей");
    }
}