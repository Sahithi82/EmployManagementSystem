class SumOfEvenNumbers {
    public static void main(String[] args) {

        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        System.out.println("Even numbers are:");

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println(values[i]);
                sum += values[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}