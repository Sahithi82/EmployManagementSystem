class SleepMethod{
     public static void main(String[]args){
         String str="SAM";
     for(int i=0;i<str.length;i++){
         Thread.sleep(10);

System.out.print(str.charAt(i));
}
}
}