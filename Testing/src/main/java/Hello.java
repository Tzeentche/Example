public class Hello {

    public static void main(String[] args) {

        int a, b, c;

        int n = 3;

            for (a = 100000; a < 1000000; a++) {

                for (b = 100000; b < 1000000; b++) {

                    for (c = 100000; c < 1000000; c++) {

                        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {

                            System.out.println("A * N= " + Math.pow(a, n) + "; B * N= " + Math.pow(b, n) + "; C * N= " + Math.pow(c, n));
                            System.out.println("A= " + a + "; B= " + b + "; C= " + c);
                            System.out.println("N= " + n);
                        }
                    }
                }
            }

        System.out.println("Hello World");

    }

}
