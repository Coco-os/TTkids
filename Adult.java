

import java.util.ArrayList;
import java.util.List;

public class Adult implements User{

    private List<Kid> kids;
    private Channel account;
    private List<Channel> subscriptions;
    private List<Membership> memberships;
    private String nick;
    private String email;

    public Adult(String nick, String email) {
        this.nick = nick;
        this.email = email;
        this.kids = new ArrayList<Kid>();
        this.account = null;
        this.subscriptions = new ArrayList<Channel>();
        this.memberships = new ArrayList<Membership>();

    }

    public void createAccount(Channel account) {
        this.account = account;
    }

    public String getNick() {
        return this.nick;
    }

    public String getEmail() {
        return this.email;
    }


    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Kid> getKids() {
        return this.kids;
    }

    public void assignKid(Kid kid){
        this.kids.add(kid);
    }

    public void addMembership(Membership membership){
        this.memberships.add(membership);
    }

    private void reportVideo(){
        //System.out.println(this.subscriptions.getChannel().getVideo().getName()+" is reported");
    }

    private void forbidVideo(){
        //System.out.println(this.chanels.getChanel(name).getVideo().getName()+" is forbidden");
    }

    @Override
    public void watchVideo() {
        //System.out.println(getNick()+" is watching "+this.chanels.getChanel(name).getVideo().getName());
    }

    @Override
    public void commentVideo() {
        //System.out.println(getNick()+" is commenting "+this.chanels.getChanel(name).getVideo().getName());
    }

    @Override
    public void likeVideo() {
        //System.out.println(getNick()+" is liking "+this.chanels.getChanel(name).getVideo().getName());
    }

    public Channel getAccount() {
        return this.account;
    }

}
