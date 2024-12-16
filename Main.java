import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


<<<<<<< HEAD
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
=======
        TikTokApp tta = new TikTokApp();
        Scanner scanner = new Scanner(System.in);

        // crear una cuenta de padre

        tta.addAdult("Pepega","pepega@gmail.com");

        // crear una cuenta de niño

        tta.addKid("Pepegita","pepegita@gmail.com");

        // enlazar niño con padre

        tta.linkKid(0,0);

        // crear otro adulto

        tta.addAdult("Luismi","luismi@gmail.com");

        // crear canal para ese otro adulto

        tta.createChannel("AEDV","Stuff", LocalDate.now(), CategoryType.Mathematics,1);

        // crear un video e insertar un reto al video

        tta.createVideo("ARIMA features w/ Luismi","Mathematical explanation of ARIMA", new File("ulpgc.mp4"),1);
        tta.insertChallenge("What's the seasonality of the model seen in the video?","3 months",Difficulty.Easy,1,0);

        // el padre suscribe al niño al canal

        tta.subscribe(1,0,0);

        // el niño hace un reto

        tta.faceChallenge(1,0,0,0,0);

        // el padre prohibe el canal

        tta.forbidChannel(1,0,0);


        // se crea una subs premium para una cuenta y un usuario

        tta.subscribePremium(0, 1, LocalDate.of(2025,1,1),
>>>>>>> c81f6ec442b1c71232a0c378588a3cef290c062a
                LocalDate.of(2025,1,6), 10, "PayPal", 10, LocalDate.of(2025,1,1));

    }
}
