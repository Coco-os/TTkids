package ORG.ULPGC.HPI;

import java.util.ArrayList;
import java.util.List;

public class Kid implements User{

    //private final Parent parent;
    private String nick;
    private String email;
    private Chanel account;
    private List<Chanel> chanels;

    public Kid(String nick, String email, Chanel account) {
        this.nick = nick;
        this.email = email;
        this.account = account;
        this.chanels = new ArrayList<Chanel>();
    }

    /*public Parent getParent() {
        return parent;
    }*/

    public String getNick() {
        return this.nick;
    }

    public void setName(String name) {
        this.nick = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public void watchVideo() {
        System.out.println(getNick() + " is watching "+this.chanels.getChanel(name).getVideo());
    }

    @Override
    public  void commentVideo() {
        System.out.println(getNick() + " is commenting "+this.chanels.getChanel(name).getVideo());
    }

    @Override
    public  void likeVideo() {
        System.out.println(getNick() + " is liking "+this.chanels.getChanel(name).getVideo());
    }

    public Chanel getAccount() {
        return this.account;
    }

}
