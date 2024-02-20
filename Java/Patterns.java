public class Patterns {
    public static void main(String[] args) {

        System.out.println(" Solid Rectangle ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Hollow Rectangle ");
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= 5; j++) {
                // cell -> (i,j)
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Solid Rectangle ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Half Pyramid ");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Inverted Half Pyramid ");
        for (int i = 1; i <= 4; i++) {
            // inner loop -> space print
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("   ");
            }

            // inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Inverted Half Pyramid (rotated by 180 deg) ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Half Pyramid with Numbers ");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

    System.out.println(" Inverted Half Pyramid with Numbers ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" Floyd's Triangle ");
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        System.out.println(" 0-1 Triangle ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if( (i+j) % 2 == 0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

    }
}
