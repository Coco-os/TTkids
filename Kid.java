

import java.util.ArrayList;
import java.util.List;

public class Kid implements User{

    //private final Parent parent;
    private String nick;
    private String email;
    private Channel account;
    private List<Channel> channels;

    public Kid(String nick, String email) {
        this.nick = nick;
        this.email = email;
        this.account = null;
        this.channels = new ArrayList<Channel>();
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



    @Override
    public void watchVideo() {
        //System.out.println(getNick() + " is watching "+this.channels.getChannel().getVideo());
    }

    @Override
    public  void commentVideo() {
        //System.out.println(getNick() + " is commenting "+this.channels.getChanel().getVideo());
    }

    @Override
    public  void likeVideo() {
        //System.out.println(getNick() + " is liking "+this.channels.getChanel().getVideo());
    }



}
