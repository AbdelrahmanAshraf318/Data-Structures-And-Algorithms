public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Test push
        System.out.println("Pushing elements...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Expected order (top -> bottom): 30, 20, 10

        // Test pop
        System.out.println("Popping elements...");
        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10

        // Test pop on empty stack (should throw exception)
        try
        {
            stack.pop();
        }
        catch (RuntimeException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test stack with String
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Java");
        stringStack.push("Spring");
        stringStack.push("Boot");

        System.out.println(stringStack.pop()); // Boot
        System.out.println(stringStack.pop()); // Spring
        System.out.println(stringStack.pop()); // Java
    }
}
