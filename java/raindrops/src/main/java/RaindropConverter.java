class RaindropConverter {

    String convert(int number) {
        if ((0 != number % 3) && (0 != number % 5) && (0 != number % 7)) {
            return String.valueOf(number);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (0 == number % 3) {
            stringBuilder.append("Pling");
        }
        if (0 == number % 5) {
            stringBuilder.append("Plang");
        }
        if (0 == number % 7) {
            stringBuilder.append("Plong");
        }
        return  stringBuilder.toString();
    }

}
