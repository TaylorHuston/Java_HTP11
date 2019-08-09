package Chap5;
// Represents an auto policy

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    //Constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return this.makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public boolean isNoFaultState() {
        boolean noFaulState;
            switch (getState()) {
                case "MA": case "NJ": case "NY": case "PA":
                    noFaulState = true;
                    break;
                default:
                    noFaulState = false;
                    break;
            }

        return noFaulState;
    }
}
