class Fibonaccifrosch {

    public long[] fibonacci() {
        long[] fibonacciNumbers = new long[50];
        long prevNum = 0;
        long curNum = 1;

        for(int i = 0; i < 50; i++) {
            fibonacciNumbers[i] = prevNum + curNum;
            prevNum = curNum;
            curNum = fibonacciNumbers[i];
        }

        return fibonacciNumbers;
    }

}