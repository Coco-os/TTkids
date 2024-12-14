import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


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
                LocalDate.of(2025,1,6), 10, "PayPal", 10, LocalDate.of(2025,1,1));

    }
}
