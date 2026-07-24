class CommonElements {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {9,2,3,1,10,11,12,13};
System.out.println("common elements: ");
for(int i=0;i<a.length;i++){
for(int j=0;j<b.length;j++){
if(a[i]==b[j]){
  System.out.println(a[i] + " ");
}
}
}
}
}