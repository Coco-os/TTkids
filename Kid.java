

import java.util.ArrayList;
import java.util.List;

public class Kid implements User{

    //private final Parent parent;
    private String nick;
    private String email;
    private Channel account;
    private List<Channel> subscriptions;

    public Kid(String nick, String email) {
        this.nick = nick;
        this.email = email;
        this.account = null;
        this.subscriptions = new ArrayList<Channel>();
    }

    /*public Parent getParent() {
        return parent;
    }*/

    public String getNick() {
        return this.nick;
    }

    public void setNick(String name) {
        this.nick = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Channel getAccount() {
        return account;
    }

    public void setAccount(Channel account) {
        this.account = account;
    }

    public List<Channel> getSubscriptions() {
        return this.subscriptions;
    }

    public void addSubscription(Channel subscription) {
        this.subscriptions.add(subscription);
    }

    @Override
    public void watchVideo(Video video){
        System.out.println("\n---> Child "+this.getNick()+" is watching "+video.getTitle());
    }

}
