package AT_CLASS.HW.Own_Practics;

import java.util.Scanner;

public class MusicPlaylistSelector {

    public void showMood(){
        System.out.println("1. Happy");
        System.out.println("2. Chill");
        System.out.println("3. Energetic");
    }
    public void moods(String mood){
        switch (mood){
            case "Happy":
                System.out.println("Feel-Good Vibes");
                break;
            case "Chill":
                System.out.println("Relax and Unwind");
                break;
            case "Energetic":
                System.out.println("High Energy Beats");
                break;
            default:
                System.out.println("no option available");
        }
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your mood: ");
        String mood = scanner.nextLine();
        this.moods(mood);
    }

    public static void main(String[] args) {
        MusicPlaylistSelector music = new MusicPlaylistSelector();
        music.showMood();
        music.takeInput();
    }
}
