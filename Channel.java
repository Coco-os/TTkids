import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscription> subscriptions;
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
        this.subscriptions = new ArrayList<Suscription>();
        this.videos = new ArrayList<Video>();
    }



    public List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }

    public Subscription getSubscription(int id) {
        return this.subscriptions.get(id); // SE ACCEDERIA CON ID ?
    }

    public void addSubscription(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    public void deleteSubscription(int id) {
        this.subscriptions.remove(id); // CON ID ?
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
