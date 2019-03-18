public class JavaStarPattern {
 
    public static void main(String[] args) {
        int number = 8;
 
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
 
            if (i != number - 1) {
                System.out.print(" ");
            } else {
                System.out.print(" *");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
}