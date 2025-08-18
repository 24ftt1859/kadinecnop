public class PrintTable  {
    public static void main(String []args)  {
        System.out.printf("%-3s %-4s %-4s%n", "a", "a^2", "a^3");
        
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%-3s %-4s %-4s%n", a, a*a, a*a*a);
        }
    }
}