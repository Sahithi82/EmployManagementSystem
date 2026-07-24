class SumOfUniqueBoxElements {
    public static void main(String[] args) {

        int arr[][][] = {
            {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
            }
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int sum = 0;

                for (int k = 0; k < arr[i][j].length; k++) {
                    sum += arr[i][j][k];
                }

                System.out.println("Sum of Row " + (j + 1) + " = " + sum);
            }
        }
    }
}