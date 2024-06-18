package immutable.construction;

public class OrderSummery {

    private Order order;

    private double serviceCharges;

    public OrderSummery(Order order){
        this(order,10);
    }
    public OrderSummery(Order order,double serviceChargePercentage){
        this.order=order;
        double serviceCharges =(order.getAmount()*serviceChargePercentage)/100;
        this.serviceCharges=serviceCharges;
    }

    public Order getOrder() {
        return order;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }
}
