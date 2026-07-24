class Test {

    void sum() {
        String str1 = "orange is a fruit";
        System.out.println("Original string = " + str1);

        String str2 = str1.replace("orange", "lemon");
        System.out.println("New string = " + str2);
    }

    void sum(int a) {
        System.out.println("A = " + a);
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();

        t.sum();      
        t.sum(10);    
    }
}