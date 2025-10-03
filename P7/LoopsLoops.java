// LoopsLoops.java
public class LoopsLoops {
    public static void main(String[] args) {
        // 1) while loop 1 to 20
        System.out.println("Below is generated using while loop:");
        int i = 1;
        while (i <= 20) {
            System.out.print(i);
            if (i < 20) System.out.print(" ");
            i++;
        }
        System.out.println("\n");

        // 2) do-while loop 50 down to 35
        System.out.println("Below is generated using dowhile loop:");
        int j = 50;
        do {
            System.out.print(j);
            if (j > 35) System.out.print(" ");
            j--;
        } while (j >= 35);
        System.out.println("\n");

        // 3) for loop for a to z using char
        System.out.println("Below is generated using for loop:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
            if (c < 'z') System.out.print(" ");
        }
        System.out.println();
    }
}
