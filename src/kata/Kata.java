package kata;

import javax.swing.JOptionPane;

/**
 *
 * @author Alfred Johnson II
 */
public class Kata {

    public static void main(String[] args) {
        
        //get # from user
        String userNum = JOptionPane.showInputDialog("Enter a number: ");
        
        int numOne = Integer.parseInt(userNum);
        
        String one = displayFooBar(numOne);
        JOptionPane.showMessageDialog(null, one);
    }

    public static String displayFooBar(int numOne){
        
        String a = "";
        if (numOne % 15 == 0){
            a = "FooBar";
        }else if (numOne % 5 == 0){
            a = "Bar";
        }else if (numOne % 3 == 0){
            a = "Foo";
        }else {
            a = "The number is " + numOne;
        }
        return a;
    }
}
