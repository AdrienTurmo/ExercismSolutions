import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> digits = new ArrayList<>();
        int numberToCheckCopy = numberToCheck;
        while (numberToCheckCopy != 0) {
            digits.add(numberToCheckCopy % 10);
            numberToCheckCopy = numberToCheckCopy/10;
        }
        Double value = digits
                .stream()
                .map(a -> Math.pow(a, digits.size()))
                .reduce((a, b) -> a + b).get();
        return value == numberToCheck;
    }

}
