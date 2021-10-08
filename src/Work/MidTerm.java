package Work;
import java.util.*;

    public class MidTerm {
        //დაბეჭდეთ “Hello World” 10-ჯერ ციკლის გამოყენებით.

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++)
                System.out.println("Hello, World!");


            //DAVALEBA2
            //System.out.println(firstClass(5, 3));
            ////        System.out.println(firstClass(2, 2));
            ////        System.out.println(firstClass(14

            //cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"} ციკლის
            //გამოყენებით დაბეჭდეთ მოცემული მასივის თითოეული ელემენტი.

            String[] citiArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};
            for (int i = 0; i < citiArray.length; i++) {
                System.out.println(citiArray[i]);
            }

            //myArray = {0, 7, 7, 2, 7, 3, 5} იპოვეთ მოცემული მასივის მოდა

            int[] myArray = {0, 7, 7, 2, 7, 3, 5};
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            int max = 1;
            int max_value = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (h.get(myArray[i]) != null) {
                    int current = h.get(myArray[i]);
                    current++;
                    h.put(myArray[i], current);
                    if (current > max) {
                        max = current;
                        max_value = myArray[i];
                    }
                } else
                    h.put(myArray[i], 1);
            }
            System.out.println(max_value);
    }
}
//// DAVALEBA 2
//                static boolean firstClass(int x, int y){
//                if (x == y) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
