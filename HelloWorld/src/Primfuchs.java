class Primfuchs {

    public boolean isPrime(int num) {

        if (num >= 10000) {
            System.out.println("The Number is too big" + String.valueOf(num));
            return false;
        }

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}