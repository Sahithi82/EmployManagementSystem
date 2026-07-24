class Test1{
     void sum(){
    System.out.println("Apple");
}
}
class Test2 extends Test1{
      void sum(){
       super.sum();
     System.out.println("Banana");
}
}
class MethodOverRiding{
public static void main(String[]args){
     Test2 t2=new Test2();
     t2.sum();
}
}