/**
 *   Setup: The code is setup to take integer input from the user. The input will be
 *   added to an ArrayList called "values" until the user enters -1.
 * 
 *   Your task:
 *   After the numbers have been collected, write code that will:
 *   1. Read an integer value from the user
 *   2. Create a new ArrayList that contains all the numbers from "values" that are
 *      are greater than the value collected in #1
 *   3. Print the contents of the new ArrayList with each number being on its own line
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();


        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            values.add(input);
        }
        System.out.println("");
        //Write your code below here



    }
}
