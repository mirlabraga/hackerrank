/**
 * 
 */
package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author michucre https://www.hackerrank.com/challenges/java-stack
 *
 */

public class JavaStackProblem {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			Stack<Character> stack = new Stack<Character>();
			char[] charArray = input.toCharArray();
			for (char currentChar : charArray) {
				stack.push(currentChar);
			}

			System.out.println(verificarSeBalaceada(stack));
		}
	}

	private static boolean verificarSeBalaceada(Stack<Character> stack) {
		int sizeStack = stack.size();
		while (!stack.isEmpty()) {
			Character pop = stack.pop();
			if (!pop.equals(stack.get(sizeStack - 2))) {
				return false;
			}
		}
		
		return true;
	}

}
