import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscription> memberships;
    private List<User> subscribers;
    private List<User> owners;
    private List<Video> videos;

    private String channelName;
    private String description;
    private final LocalDate startDate;
    private String category; // tambien se puede hacer un enumeration

    public Channel(String channelName, String description, LocalDate startDate, String category) {
        this.channelName = channelName;
        this.description = description;
        this.startDate = startDate;
        this.category = category;
        this.memberships = new ArrayList<Suscription>();
        this.subscribers = new ArrayList<User>();
        this.owners = new ArrayList<User>();
        this.videos = new ArrayList<Video>();
    }



    public List<Subscription> getSubscriptions() {
        return this.memberships;
    }

    public Subscription getSubscription(int id) {
        return this.memberships.get(id); // SE ACCEDERIA CON ID ?
    }

    public void addSubscription(Subscription subscription) {
        this.memberships.add(subscription);
    }

    public void deleteSubscription(int id) {
        this.memberships.remove(id); // CON ID ?
    }





    public List<Video> getVideos() {
        return this.videos;
    }

    public Video getVideo(int id) {
        return this.videos.get(id); // SE ACCEDERIA CON ID ?
    }

    public void addVideo( // atributos de Video ) {
        Video video = //;
        this.videos.add(video);
    }

    public void deleteVideo(int id) {
        this.videos.remove(id); // CON ID ?
    }



    public List<User> getSubscriptions() {
        return this.subscribers;
    }

    public Subscription getSubscription(int id) {
        return this.subscribers.get(id); // SE ACCEDERIA CON ID ?
    }

    public void addSubscription(Subscription subscription) {
        this.subscribers.add(subscription);
    }

    public void deleteSubscription(int id) {
        this.subscribers.remove(id); // CON ID ?
    }



    public List<User> getSubscriptions() {
        return this.owners;
    }

    public Subscription getSubscription(int id) {
        return this.owners.get(id); // SE ACCEDERIA CON ID ?
    }

    public void addSubscription(Subscription subscription) {
        this.owners.add(subscription);
    }

    public void deleteSubscription(int id) {
        this.owners.remove(id); // CON ID ?
    }





    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

