import java.util.Scanner;

class Notenmaus {

    private double[] noten = new double[4];

    public void getNoten() {
        Scanner tastatur = new Scanner(System.in);

        for(int i = 0; i < noten.length; i++) {

            System.out.println("Input " + String.valueOf(i + 1) + ". grade:");

            noten[i] = tastatur.nextDouble();
        }
    }

    public void printNoten() {

        for(int i = 0; i < noten.length; i++) {
            System.out.println(String.valueOf(i + 1) + ". grade:" + noten[i]);
        }

    }

    public void calculatedAverage() {

        int sum = 0;

        for(int i = 0; i < noten.length; i++) {
            sum += noten[i];
        }

        double result = sum / noten.length;

        if (result < 2.0) {
            System.out.println("AWESOME!!!");
        }

        System.out.println("Your average grade is: " + String.valueOf(result));

    }

}