class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String str = "1 2 3 4 5";
    char temp ;
    //Reverse without extra char array.
    char[] arr = str.toCharArray();
    int len = arr.length-1;
    for(int i=0;i<arr.length/2 ;i++){
      temp = arr[i];
      arr[i]=arr[len];
      arr[len] = temp;
      len--;
       System.out.println(arr);
    }
    System.out.println(arr);

  }
}