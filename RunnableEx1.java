class Test implements Runnable{
      public void run(){
int a=10,b=20,c;
c=a*b;
System.out.println("a*b = " +c);
}
}
class RunnableEx1{
      public static void main(String[]args){
           Test t=new Test();
           Thread th=new Thread(t);
           th.start();
}
}