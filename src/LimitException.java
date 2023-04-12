public class LimitException extends Exception {

    private double remainingAmount;

    LimitException(String message) {
        super(message);
        this.remainingAmount = this.remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}