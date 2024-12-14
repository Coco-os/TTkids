import java.time.LocalDate;

public class Payment {
    private String paymentMethod;
    private final double paymentAmount;
    private final LocalDate paymentDate;

    public Payment(double paymentAmount, LocalDate paymentDate, String paymentMethod) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
