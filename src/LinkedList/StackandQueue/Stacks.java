package LinkedList.StackandQueue;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> str = new Stack<>();

        str.push("Halo");
        str.push("namaku");
        str.push("Waguri");

        System.out.println(str.toString());
        System.out.println(str.get(2));

        str.pop();

        System.out.println(str.toString());
        // Note that "Waguri" is the string that popped out because it's the last object that going in to the stack.
        // Note : Stack is a LIFO data structure (Last In, First Out)
    }
}
