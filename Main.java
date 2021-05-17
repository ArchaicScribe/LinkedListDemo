import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
   LinkedList<Integer> numbers = new LinkedList<>();
   numbers.add(10);
   numbers.add(12);
   numbers.add(45);
   numbers.add(87);
   numbers.add(99);

   for(int i = 0; i < numbers.size(); i++){
     System.out.println(numbers.get(i) + " ");
   }
  }

}