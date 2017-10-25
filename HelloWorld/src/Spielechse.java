class Spielechse extends Tier {

    public int rollDice(int min, int max) {
        double random = Math.random() * (max-min) + min;
        return (int) Math.round(random);
    }

}