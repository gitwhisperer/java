class Main2 {
  public static void main(String[] args) {
    Double n1 = 10.0, n2 = 4.5, n3 = 50.3, largest;
    if (n1 >= n2) {
      if (n1 >= n3) {
        largest = n1;
      } else {
        largest = n3;
      }
    } else {
      if (n2 >= n3) {
        largest = n2;
      } else {
        largest = n3;
      }
    }
    System.out.println("Largest Number: " + largest);
  }
}