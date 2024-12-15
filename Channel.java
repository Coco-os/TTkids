import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Membership> memberships;
    private List<User> subscribers;
    private User owner;
    private List<Video> videos;

    private String channelName;
    private String description;
    private final LocalDate startDate;
    private CategoryType category;

    public Channel(String channelName, String description, LocalDate startDate, CategoryType category, Adult parent) {
        this.channelName = channelName;
        this.description = description;
        this.startDate = startDate;
        this.category = category;
        this.memberships = new ArrayList<Membership>();
        this.subscribers = new ArrayList<User>();
        this.owner = parent;
        this.videos = new ArrayList<Video>();
    }



    public List<Membership> getMemberships() {
        return this.memberships;
    }

    public Membership getMembership(int id) {
        return this.memberships.get(id);
    }

    public void addMembership(Membership subscription) {
        this.memberships.add(subscription);
    }

    public void deleteMembership(int id) {
        this.memberships.remove(id);
    }



    public List<Video> getVideos() {
        return this.videos;
    }

    public Video getVideo(int id) {
        return this.videos.get(id);
    }

    public void addVideo(String title, String description, File file) {
        Video video = new Video(title, description, file);
        this.videos.add(video);
}

public void deleteVideo(int id) {
    this.videos.remove(id);
}



public List<User> getSubscriptions() {
    return this.subscribers;
}

public User getSubscriber(int id) {
    return this.subscribers.get(id);
}

public void addSubscriber(User subscriber) {
    this.subscribers.add(subscriber);
}

public void deleteSubscriber(int id) {
    this.subscribers.remove(id);
}


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
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

public CategoryType getCategory() {
    return category;
}

public void setCategory(CategoryType category) {
    this.category = category;
}
}

