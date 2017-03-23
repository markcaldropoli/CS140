package lab09green;

public class Tester {
      public static void main(String[] args) {
            int[] test1 = null;
            int[] test2 = {};
            int[] test3 = {5, 2, -3, 0, -4, 3};
            System.out.println(new Parent(test2).average());
            System.out.println(new Parent (test3).average());
            System.out.println(new Child(test3, test1).average());
            System.out.println(new Child (test1, test3).average());
            System.out.println(new Parent (test3).min());
            System.out.println(new Child (test1, test2).min());
            System.out.println(new Child (test1, test3).min());
            
            System.out.println();
            
            for(int i = 21; i < 25; i++) {
                System.out.println(new Question3(i));
          }
      }
}
