package hello.com;

import java.util.Scanner;

public class Lec_81_Handling_Specific_Exception_Handling {
    public static void main(String[] args) {
        float [] marks = new float[3];
        marks[0] = 7;
        marks[1] = 27;
        marks[2] = 37;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is" + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some Arithmetic exception occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
