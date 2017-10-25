class Rueckwaertssager {

    public String reverse(String word) {

        String result = new String();

        for(int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }

        return result;

    }

}
