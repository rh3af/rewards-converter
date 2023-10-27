

public class RewardValue {
    private Double cashValue;
    private int miles;

    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return miles;
    }

    // Conversion from cash to miles
    public int convertCashToMiles() {
        return (int) (cashValue / 0.0035);
    }

    // Conversion from miles to cash
    public Double convertMilesToCash() {
        return miles * 0.0035;
    }
}
