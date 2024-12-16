package ORG.ULPGC.HPI;

import java.util.ArrayList;
import java.util.List;

public class Parent implements User{

    private List<Kid> kids;
    private Chanel account;
    private List<Chanel> chanels;
    private List<Membership> membership;
    private String nick;
    private String email;

    public Parent(String nick, String email) {
        this.nick = nick;
        this.email = email;
        this.kids = new ArrayList<Kid>();
        this.account = null;
        this.chanels = new ArrayList<Chanel>();
        this.membership = new ArrayList<Chanel>();

    }

    public void createAccount() {
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

    public void assignKid(Kid kid){
        this.kids.add(kid);
    }

    private void reportVideo(){
        System.out.println(this.chanels.getChanel(name).getVideo().getName()+" is reported");
    }

    private void forbidVideo(){
        System.out.println(this.chanels.getChanel(name).getVideo().getName()+" is forbidden");
    }

    @Override
    public void watchVideo() {
        System.out.println(getNick()+" is watching "+this.chanels.getChanel(name).getVideo().getName());
    }

    @Override
    public void commentVideo() {
        System.out.println(getNick()+" is commenting "+this.chanels.getChanel(name).getVideo().getName());
    }

    @Override
    public void likeVideo() {
        System.out.println(getNick()+" is liking "+this.chanels.getChanel(name).getVideo().getName());
    }

    public Chanel getAccount() {
        return this.account;
    }

}
