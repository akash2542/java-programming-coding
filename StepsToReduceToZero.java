public class StepsToReduceToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;
        
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2; // Divide by 2 if even
            } else {
                num -= 1; // Subtract 1 if odd
            }
            steps++;
        }
        
        return steps;
    }
    
    public static void main(String[] args) {
        int num = 14; // Change this to any integer you want
        System.out.println("Number of steps to reduce " + num + " to zero: " + numberOfSteps(num));
    }
}
