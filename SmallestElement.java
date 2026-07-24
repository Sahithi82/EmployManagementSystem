class SmallestElement {
    public static void main(String[] args) {

        int elements[] = {18, 45, 9, 62, 2, 38, 81};

        int smallest = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < smallest) {
                smallest = elements[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}