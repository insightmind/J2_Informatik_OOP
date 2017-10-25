import java.util.Scanner;

@SuppressWarnings("SameParameterValue")
class Direktor {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Direktor direktor = new Direktor();
//        direktor.makeCalculations();
        direktor.papageiTasks();
//        direktor.rollDice(1, 6);
//        direktor.isEven();
//        direktor.isPrime();
//        direktor.reverse();
//        direktor.fibonacci();
//        direktor.summonTwoParrots();
//        direktor.grades();
       // direktor.tunier(2);

    }

    public Direktor() {
        System.out.println("HALLO IHR RANZIGEN ZUSCHAUER, I BIMS 1 DIREKTOR!!!");
    }

    private void makeCalculations() {
        System.out.println(calculateDebt(200000, 0.03, 800, 1));
        System.out.println(calculateDebt(200000, 0.03, 800, 10));
        System.out.println(noMoreDebt(200000, 0.03, 800));
    }

    private void papageiTasks() {
        Papagei pa = new Papagei();
        pa.sing();
        pa.nameMehrmalsSagen("Dummes Kind");
        System.out.println("Wen soll der Papagei begruessen?");
        pa.nameMehrmalsSagen(input.nextLine());

    }


    private void rollDice(int min, int max) {
        Spielechse echse = new Spielechse();
        double result = echse.rollDice(min, max);
        System.out.println("Rolling dice: " + result);
    }

    private void isEven() {
        GeradeMaus maus = new GeradeMaus();
        System.out.println("Is the number even?");
        int number = input.nextInt();
        String result = maus.isEven(number) ? "even" : "not even";
        System.out.println("The Number is " + result);
    }

    private void isPrime() {
        Primfuchs fuchs = new Primfuchs();
        System.out.println("Is the number a prime number:");
        int number = input.nextInt();
        String result = fuchs.isPrime(number) ? "is a PrimeNumber" : "is not a PrimeNumber";
        System.out.println("The Number " + result);
    }

    private void reverse() {
        Rueckwaertssager versager = new Rueckwaertssager();
        System.out.println("Reverse a word:");
        Scanner in = new Scanner(System.in);
        String result = versager.reverse(in.nextLine());
        System.out.println("The reversed word is " + result);
    }

    private void fibonacci() {
        Fibonaccifrosch frosch = new Fibonaccifrosch();
        long[] fibonacciNumbers = frosch.fibonacci();
        for(int i = 0; i < fibonacciNumbers.length - 2; i++) {
            System.out.println(fibonacciNumbers[i]);
        }
    }

    private void grades() {
        Notenmaus maus = new Notenmaus();
        maus.getNoten();
        maus.printNoten();
        maus.calculatedAverage();
    }

    private void summonTwoParrots() {

        Papagei first = new Papagei();
        first.namenBeibringen("Adolf");

        Papagei second = new Papagei();
        second.namenBeibringen("Bdolf");

        first.nameSagen();
        second.nameSagen();

    }

    private void tunier(int rounds) {
        Tuniermaus maus = new Tuniermaus();
        for (int i = 0; i < rounds; i++) {
            System.out.println((i+1) + ". round finished.");
            maus.update();
        }
        maus.sortTeams();
        maus.print();
        maus.getBestTeam();
    }

    private static double calculateDebt(double credit, double zinssatz, double payment, int years) {

        double result = credit;
        for (int i = 0; i < years; i++) {
            result *= 1 + zinssatz;
            result -= 12 * payment;
        }

        return result;

    }

    private static int noMoreDebt(double credit, double zinssatz, double payment) {

        int i = 0;
        double result = credit;

        while (result > 0) {
            result = calculateDebt(result, zinssatz, payment, 1);
            i++;
        }
        return i;

    }

}