//:object/HelloDate.java
import java.util.*;

/** The First Thinking in Java Example program.
 * DisPlays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate{
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.print("Hello,it's ");
        System.out.println(new Date());
    }
}/* Output: (55% match)
Hello,it's Wed Mar 20 01:25:55 CST 2019
*///:~
