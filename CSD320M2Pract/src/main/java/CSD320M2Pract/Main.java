/*
 * This is just a practice routine for Java programming in Section 2 of Cohort
 */
package CSD320M2Pract;

/**
 *
 * @author wit0011153
 */
public class Main {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z); //Print the value of x + y
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        sum2 += 5;
        int sum3 = sum2 / sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
