import java.time.LocalDate;

public class PremiumSubscription extends Subscription{
    private double subscriptionPrice;
    private LocalDate expirationDate;
    private Payment payment;
    public PremiumSubscription(User user, Canal canal, LocalDate beginningDate, LocalDate expirationDate,
                               double subscriptionPrice, String paymentMethod, double paymentAmount, LocalDate paymentDate) {
        super(user, canal, beginningDate);
        this.expirationDate = expirationDate;
        this.subscriptionPrice = subscriptionPrice;
        this.payment = new Payment(paymentAmount, paymentDate, paymentMethod);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(int subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(double paymentAmount, LocalDate paymentDate, String paymentMethod) {
        this.payment = new Payment(paymentAmount, paymentDate, paymentMethod);
    }
}

