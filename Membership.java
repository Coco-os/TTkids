import java.time.LocalDate;

public class Membership {
    private User user;
    private Canal canal;
    private final LocalDate beginningDate;
    private double subscriptionPrice;
    private LocalDate expirationDate;
    private Payment payment;

    public Membership(User user, Canal canal, LocalDate beginningDate, LocalDate expirationDate,
                               double subscriptionPrice, String paymentMethod, double paymentAmount, LocalDate paymentDate) {
        this.beginningDate = beginningDate;
        this.canal = canal;
        this.expirationDate = expirationDate;
        this.payment = new Payment(paymentAmount, paymentDate, paymentMethod);
        this.subscriptionPrice = subscriptionPrice;
        this.user = user;
    }

    public LocalDate getBeginningDate() {
        return beginningDate;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

