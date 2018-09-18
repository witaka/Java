/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class homework1 {

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        double number1;
        double number2;

        String str="33+";

        while (str.hasMoreElements()) {
            str.nextElement();
            stack.push((Double) str.nextElement());

            for (int i = 0; i < x.length(); i++) {

                switch (x.charAt(i)) {
                case '+':
                    number1 = stack.pop();
                    number2 = stack.pop();
                    System.out.println(number1 + number2);
                    break;
                case '-':
                    number1 = stack.pop();
                    number2 = stack.pop();
                    System.out.println(number1 - number2);
                    break;
                case '/':
                    number1 = stack.pop();
                    number2 = stack.pop();
                    System.out.println(number1 / number2);
                    break;
                case '*':
                    number1 = stack.pop();
                    number2 = stack.pop();
                    System.out.println(number1 * number2);
                    break;
                }

            }
            System.out.println(stack.pop());
        }
    }

}
