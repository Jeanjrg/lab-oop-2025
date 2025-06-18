package TypeRacer;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> rareStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    // Bisa diganti sesuai keinginan masing-masing
    private String[] wordsToTypeList = {
            "Di Bikini Bottom ada Spongebob Squarepants, dia memang keren suka main drumband",
            "Dia jadi koki masaknya krabby patty, menjalani hari hidup bersama Garry",
            "Ayo sama-sama sebutkan nama-nama makhluk dalam sana di Bikini Bottom jaya",
            "Namun ada juga namanya Patrick Star, walau dia cetar tapi hidupnya liar",
            "Tinggal dalam batu tapi suka membantu, sayang hanya satu otaknya itu buntu"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    // Buat method addResult yang mana digunakan untuk menambahkan typer yang
    // telah selesai (mengetik semua kata), ke dalam list race standing.
    public void addResult(Result result) {
        rareStanding.add(result);
    }

    public ArrayList<Result> getTypeRaceTable() {
        return rareStanding;
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO (5)
        // Tampilkan klasemen akhir dari kompetisi, dengan format
        // {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        for (int i = 0; i < rareStanding.size()/2; i++) {
            Result result = rareStanding.get(i);
            System.out.println((i + 1) + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
        }
    }

    public void startRace() {
        // Jalankan kompetisi untuk tiap kontestan
        for (Typer typer : rareContestant) {
            typer.start();
        }
    }

    // TODO (7)
    // selama semua peserta belum selesai maka tampilkan typing progress-nya setiap
    // 2 detik, dengan format:
    // Typing Progress ...
    // ===================
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    public void displayTypingProgressPeriodically() throws InterruptedException {
        while (true) {
            System.out.println("\nTyping Progress ...");
            System.out.println("===================");

            boolean allFinished = true;
            for (Typer typer : rareContestant) {
                String progress = typer.getBotName() + " => " + typer.getWordsTyped();
                if (!progress.contains("(Selesai)")) {
                    allFinished = false;
                    System.out.println(progress);
                } else {
                    System.out.println(progress);
                }
            }
            if (allFinished) {
                break;
            }


            Thread.sleep(2000);
        }
    }
    public void displayRaceStandingPeriodically() throws InterruptedException {

        // TODO (8)
        // Setelah semua typer selesai, tampilkan race standing setelah semua typer
        // selesai
        displayTypingProgressPeriodically();
        for (Typer typer : rareContestant) {
            Result result = new Result(typer.getBotName(), (int) typer.getWpm());
            addResult(result);
        }
        System.out.println("\nSemua kontestan telah selesai mengetik!");
        printRaceStanding();
    }
}