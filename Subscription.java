import java.time.LocalDate;

public class Subscription {
    private User user;
    private Canal canal;
    private final LocalDate beginningDate;

    public Subscription(User user, Canal canal, LocalDate beginningDate) {
        this.user = user;
        this.canal = canal;
        this.beginningDate = beginningDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public int getBeginningDate() {
        return beginningDate;
    }
}

