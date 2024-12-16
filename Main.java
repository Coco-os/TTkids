import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        TikTokApp tiktokapp = new TikTokApp();
        Scanner scanner = new Scanner(System.in);

        // create a parent account

        tiktokapp.addAdult("Pepega","pepega@gmail.com");

        // create a child account

        tiktokapp.addKid("Pepegita","pepegita@gmail.com");

        // link child with parent

        tiktokapp.linkKid(0,0);

        // create another adult

        tiktokapp.addAdult("Luismi","luismi@gmail.com");

        // create a channel for that other adult

        tiktokapp.createChannel("AEDV","Stuff", LocalDate.now(), CategoryType.Mathematics,1);

        // create a video and insert a challenge into the video

        tiktokapp.createVideo("ARIMA features w/ Luismi","Mathematical explanation of ARIMA", new File("ulpgc.mp4"),1);
        tiktokapp.insertChallenge("What's the seasonality of the model seen in the video?","3 months",Difficulty.Easy,1,0);

        // the parent subscribes the child to the channel and the child watches a video

        tiktokapp.subscribe(1,0,0);
        tiktokapp.getParent(0).getKids().get(0).watchVideo(tiktokapp.getParent(1).getAccount().getVideo(0));

        // the child faces a challenge

        tiktokapp.faceChallenge(1,0,0,0,0);

        // the parent forbids the channel

        tiktokapp.forbidChannel(1,0,0);


        // a premium subscription is created for a channel and a user

        tiktokapp.subscribePremium(0, 1, LocalDate.of(2025,1,1),
                LocalDate.of(2025,1,6), 10, "PayPal", 10, LocalDate.of(2025,1,1));

    }
}
