public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3() {
        System.out.println("Task1");
        int arr[] = generateRandomArray();
        float sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + arr[i];
        }
        float mid = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей.");
    }
}