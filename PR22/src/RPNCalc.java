import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class RPNCalc {
    private static boolean numdetect(String s) {
        return s.matches("^-?\\d+\\.?\\d+$") || s.matches("^-?\\d$");
    }

    private static boolean vrbdetect(String s) {
        if (s.length() != 1) {
            return false;
        }
        char c = s.charAt(0);
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static double optsgn(double x, double y, String opt) throws IncorrectOperationException, ArithmeticException {
        switch (opt) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y == 0) {
                    throw new ArithmeticException("ERR: Division by zero");
                }
                return x / y;
            default:
                throw new IncorrectOperationException();
        }
    }

    public static void main(String[] args) {
        System.out.println("Calc ready");
        System.out.println("Enter numbers in registers x y z, then enter operations");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] parsed = input.split("\\s+");
        Stack<Double> stack = new Stack<>();
        try {
            for (String proc : parsed) {
                if (numdetect(proc)) {
                    stack.push(Double.parseDouble(proc));
                } else if (vrbdetect(proc)) {
                    double b = stack.pop();
                    double a = stack.pop();
                    double res = optsgn(a, b, proc);
                    stack.push(res);
                } else {
                    throw new IncorrectOperationException();
                }
            }
            double RR = stack.pop();
            if (!stack.isEmpty()) {
                System.out.println("ERR: Not enough operations: + - * /");
            } else {
                System.out.println(RR);
            }
        } catch (IncorrectOperationException | ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (EmptyStackException e) {
            System.out.println("ERR: stack");
            System.exit(0);
        }
    }
}