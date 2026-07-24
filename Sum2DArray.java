class Sum2DArray {
    public static void main(String[] args) {

        int a[][] = {
            {10, 15},
            {6, 4, 32},
            {9, 9}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of 2-D Array = " + sum);
    }
}