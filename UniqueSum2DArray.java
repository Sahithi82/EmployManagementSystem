class UniqueSum2DArray {
    public static void main(String[] args) {

        int a[][] = {
            {10, 15},
            {6, 4, 32},
            {9, 9}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                int count = 0;

                for (int k = 0; k < a.length; k++) {
                    for (int l = 0; l < a[k].length; l++) {
                        if (a[i][j] == a[k][l]) {
                            count++;
                        }
                    }
                }

                if (count == 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Sum of unique elements = " + sum);
    }
}