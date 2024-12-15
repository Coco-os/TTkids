import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Video {
    private List<Challenge> challenges;

    private String title;
    private String description;
    private final File file;

    public Video(String title, String description, File file) {
        this.challenges = new ArrayList<Challenge>();
        this.title = title;
        this.description = description;
        this.file = file;
    }

    public List<Challenge> getChallenges() {
        return this.challenges;
    }

    public Challenge getChallenge(int id) {
        return this.challenges.get(id);
    }

    public void addChallenge(Challenge challenge) {
        this.challenges.add(challenge);
    }

    public void deleteChallenge(int id) {
        this.challenges.remove(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getFile() {
        return file;
    }
    
}
