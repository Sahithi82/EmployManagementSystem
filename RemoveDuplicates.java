class RemoveDuplicates {
    public static void main(String[] args) {

        int[] b = {3, 6, 6, 6, 12, 12, 67};

        int[] temp = new int[b.length];

        int j = 0;

        for (int i = 0; i < b.length - 1; i++) {

            if (b[i] != b[i + 1]) {
                temp[j] = b[i];
                j++;
            }
        }

        temp[j] = b[b.length - 1];

        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}