public class Patterns {

    public static void main(String[] args) {
        int n = 11;
        printIneuron(n);
        System.out.println();
        wap2(n);
        System.out.println();
        wap3(n);
        System.out.println();
        wap4(n);
        System.out.println();
        wap5(n);


    }

    private static void printIneuron(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j <= (n - 1)) || (i == n - 1 && j <= (n - 1)) || (j == (n - 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.print("   ");
            {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == (n - 1) || i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.print("   ");

            {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.print("   ");

            {
                for (int j = 0; j < n; j++) {
                    if ((j == 0 && i < (n - 1)) || (j == (n - 1) && i < (n - 1)) || (i == n - 1 && j < n - 1 && j > 0)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.print("   ");

            {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || ((i - j) == 0 && i > (n - 1) / 2) || (i == 0 && j < (n - 1))
                            || (i == (n - 1) / 2 && j < (n - 1)) || (j == (n - 1) && i > 0 && i < (n - 1) / 2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.print("   ");


            {
                for (int j = 0; j < n; j++) {
                    if ((i==0 && j>0 && j<n-1) || ((i==n-1 && j>0 && j<n-1)) ||
                            (j==0 && i>0 && i<n-1)|| (j==n-1 && i>0 && i<n-1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.print("   ");
            {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == (n - 1) || i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                  System.out.println();
            }

        }



    }


//    2. Write a program to print
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4

    public static void wap2(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }

    //3. WAP to print

    public static void wap3(int n) {
        n=11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if( (i+j<=(n-1)/2) || (j-i>=(n-1)/2 ) || j==0|| j==(n-1)||i==(n-1) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

    }

    //4. WAP to print
    public static void wap4(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if((j==0 && i>=(n-1)/2) ||(i-j)>=(n-1)/2 ||
                        (j==(n-1) && i>=(n-1)/2 || (i+j)>=(n-1)+(n-1)/2)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

    }

 //5. WAP to print
    public static void wap5(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if((i+j<=(n-1)/2) ||(i-j)>=(n-1)/2){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

    }




}