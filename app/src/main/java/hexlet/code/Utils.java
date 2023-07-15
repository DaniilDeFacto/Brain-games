package hexlet.code;

public class Utils {
    public static int generateNumber(int lowerLimit, int upperLimit) {
        return (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
    }
}
