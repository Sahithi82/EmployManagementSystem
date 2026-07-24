class Test1 extends Thread {
    public void run() {
        String s1 = "orange is fruit and orange is colour";
        System.out.println("Original String = " + s1);

        String s2 = s1.replace("orange", "lemon");
        System.out.println("Replaced String = " + s2);
    }
}

class Test2 extends Thread {
    public void run() {
        StringBuffer str = new StringBuffer("Sahithi chowdary");
        System.out.println("Original String = " + str);

        str.insert(8, "NTR ");
        System.out.println("Modified String = " + str);
    }
}

public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        t1.start();
        t2.start();
    }
}