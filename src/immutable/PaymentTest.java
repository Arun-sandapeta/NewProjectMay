package immutable;

public class PaymentTest {
    public static void main(String[] args){
//        Payment payment = new Payment();
        Payment payment1 = new Payment("A123","1234",2000);

//        System.out.println(payment.getAmount());
//        System.out.println(payment.getMobileNumber());
        System.out.println(payment1.getFromAcc());
        System.out.println(payment1.getAmount());
        ;
    }
}
