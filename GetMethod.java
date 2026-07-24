class Test1 extends Thread {
    public void run() {
        System.out.println("Test1 Thread name = " + Thread.currentThread().getName());
        Thread.currentThread().setName("NTR");
        System.out.println("New Thread name = " + Thread.currentThread().getName());
        
    }
}

public class SetMethod {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
    }
}