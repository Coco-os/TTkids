import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TikTokApp {

    private List<Adult> parents;
    private List<Kid> children;


    public TikTokApp() {
        this.parents = new ArrayList<Adult>();
        this.children = new ArrayList<Kid>();
    }

    public void addAdult(String name, String email) {
        Adult parent = new Adult(name, email);
        this.parents.add(parent);
        System.out.println("\n---> Added adult " + name + " with email " + email);
    }

    public void addKid(String name, String email) {
        Kid kid = new Kid(name, email);
        this.children.add(kid);
        System.out.println("\n---> Added child " + name + " with email " + email);
    }


    public void linkKid(int idParent, int idChild) {
        this.parents.get(idParent).assignKid(this.children.get(idChild));
        System.out.println("\n---> Linked child " + this.children.get(idChild).getNick() + " to parent " + this.parents.get(idParent).getNick());
    }

    public void createChannel(String channelName, String description, LocalDate startDate, CategoryType category, int ownerId){
        Channel channel = new Channel(channelName, description, startDate, category, this.parents.get(ownerId));
        this.parents.get(ownerId).createAccount(channel);
        System.out.println("\n---> Created channel " + channelName + " with " + this.parents.get(ownerId).getNick());
    }

    public void createVideo(String videoName, String description, File file, int ownerId){
        this.parents.get(ownerId).getAccount().addVideo(videoName,description,file);
        System.out.println("\n---> Created video \"" + videoName + "\" // " + this.parents.get(ownerId).getAccount().getChannelName());
    }

    public void insertChallenge(String question, String answer, Difficulty difficulty, int channelId, int videoId){
        Challenge challenge = new Challenge(question, answer, difficulty);
        this.parents.get(1).getAccount().getVideo(0).addChallenge(challenge);
        System.out.println("---> Inserted challenge \"" + challenge.getQuestion() + "\" to video \"" + this.parents.get(1).getAccount().getVideo(0).getTitle() + "\"");
    }

    public void subscribe(int channelId, int parentId, int childId){
        this.parents.get(channelId).getAccount().addSubscriber(this.parents.get(parentId).getKids().get(childId));
        System.out.println("\n---> " + this.parents.get(parentId).getKids().get(childId).getNick()+ " has subscribed to: " + this.parents.get(channelId).getAccount().getChannelName());
    }

    public void faceChallenge(int channelId, int videoId, int challengeId, int parentId, int childId){
        Scanner scanner = new Scanner(System.in);
        String answer = this.parents.get(channelId).getAccount().getVideo(videoId).getChallenges().get(challengeId).getAnswer();
        System.out.println("\n---> Answer the following question: "+this.parents.get(channelId).getAccount().getVideo(videoId).getChallenges().get(challengeId).getQuestion());
        String givenAnswer = scanner.nextLine();
        if (answer.equals(givenAnswer)){
            System.out.println("Right! Congratulations! You have successfully faced the challenge!");
        }
        else{
            System.out.println("Wrong. Keep on trying!");
        }
    }

    public void forbidChannel(int channelId, int parentId, int childId){
        this.parents.get(channelId).getAccount().getSubscriptions().remove(childId);
        System.out.println("\n---> "+this.parents.get(parentId).getKids().get(childId).getNick()+ " is not allowed to view content from " + this.parents.get(channelId).getAccount().getChannelName());
    }

    public void subscribePremium(int userId, int channelId, LocalDate beginningDate, LocalDate expirationDate,
                                 double subscriptionPrice, String paymentMethod, double paymentAmount, LocalDate paymentDate){
        Membership membership = new Membership(this.parents.get(userId), this.parents.get(channelId).getAccount(), beginningDate, expirationDate, subscriptionPrice, paymentMethod, paymentAmount, paymentDate);
        this.parents.get(channelId).getAccount().addMembership(membership);
        this.parents.get(userId).addMembership(membership);
        System.out.println("\n---> "+this.parents.get(userId).getNick()+" is now a member of \""+this.parents.get(channelId).getAccount().getChannelName()+"\"");
    }


    public Adult getParent(int id) {
        return this.parents.get(id);
    }

    public Kid getChild(int id) {
        return this.children.get(id);

    }
}
