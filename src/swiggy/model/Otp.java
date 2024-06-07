package swiggy.model;

import java.util.Date;

public class Otp {
    public String otpNumber;
    public Date creationTime;
    public Date endTime;

    @Override
    public String toString() {
        return "Otp{" +
                "otpNumber=" + otpNumber +
                ", creationTime=" + creationTime +
                ", endTime=" + endTime +
                '}';
    }
}
