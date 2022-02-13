/**
 * PRACTICE)0
 * 
*/

package CSD320M5Assign;

/**
 *
 * @author wit0011153
 */
public class pract0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String [] cars = {"Batmobile", "Rambler", "Monza", "Fairlane"};
        for (String i : cars) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
            if (x == 4){
                continue;                
            }
            System.out.println(x);
            x++;
        }
    }
}
