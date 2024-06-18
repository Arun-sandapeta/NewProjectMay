package immutable;

public class Payment {
    private String fromAcc;
    private String toAcc;
    private int amount;
    private long mobileNumber;

    public Payment(String fromAcc,String toAcc,int amount){
        this.fromAcc=fromAcc;
        this.toAcc=toAcc;
        this.amount=amount;

    }
    public Payment(long mobileNumber,int amount,String toAcc){
        this.mobileNumber=mobileNumber;
        this.amount=amount;

    }

    public String getFromAcc() {
        return fromAcc;
    }

    public String getToAcc() {
        return toAcc;
    }
    public int getAmount() {
        return amount;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
}
