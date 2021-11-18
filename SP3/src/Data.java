import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Data {
    Scanner scan = new Scanner(System.in);

    public void saveTeamData(){
        System.out.println("What is your team name?");                                              //Ind i team (og lav en toString metode)
        String teamName = scan.nextLine();
        System.out.println("Name on player 1?");
        String player1 = scan.nextLine();
        System.out.println("Name on player 2?");
        String player2 = scan.nextLine();

        try{
            Writer write = new FileWriter("src/Teams.txt");                                 //hent to string metode og send data til DBConnector
            write.append(teamName + "," + player1 + "," + player2 + "\n");
            write.close();
            System.out.println("Your team is now registered under the name " + teamName
                                +". Good luck " + player1 + " and " + player2 + ".");
        }catch (IOException e){
            System.out.println("Couldn't find file");
        }
    }

    public String[] readData(int number){
        String[] team = new String[0];

        try{
            String line = Files.readAllLines(Paths.get("src/Teams.txt")).get(number); //Lav til en a-la tostring metode som modtager fra DBConnector
            String str = line;
            team = str.split(",");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return team;
    }

    public void CreateTournamentData(){
        System.out.println("What should the name of the tournament be?");
        String tournamentName = scan.nextLine();
        Tournament tournament = new Tournament(tournamentName);
        Integer[] teams = tournament.createTournamentStrucktur(8);                                         //sæt ind i tournament

        try {
            File myObj = new File("src/Tournaments/" + tournamentName + ".txt");                               //Opret ny tabel i SQL via DBConnector
            myObj.createNewFile();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        try {
            Writer write = new FileWriter("src/Tournaments/" + tournamentName + ".txt");                        //Skriv i den nye tabel via DBConnector
            for (int i = 0; i < teams.length; i +=2) {
               String[] str = readData(teams[i]);
               write.append(str[0] + "," + str[1] + "," + str[2] + ",0\n");
               str = readData(teams[i+1]);
               write.append(str[0] + "," + str[1] + "," + str[2] + ",0\n");
            }
            write.close();
        }catch (IOException e){
            System.out.println("Tried to write in the document");
            e.printStackTrace();
        }
    }

    public void NextMatch() {
        File[] listOfFiles = lookInTournamentFolder();

        System.out.println("Which tournament match would you like to start?");                           //Sæt inc i match
        int num = scan.nextInt();
        try{
            Tournament tournament = new Tournament(listOfFiles[num-1].getName());
            boolean matchDone = false;
            int i = 0;
            while(!matchDone){
                List<String> file = Files.readAllLines(Paths.get("src/Tournaments/"+listOfFiles[num-1].getName())); //træk data og send til match
                String str;
                String[] team1 = new String[0];
                String[] team2 = new String[0];
                if(i < file.size()){
                    str = file.get(i);
                    team1 = str.split(",");
                    str = file.get(i+1);
                    team2 = str.split(",");
                }

                if(i == file.size()){
                    int j = 0;
                    if(file.size() == 12){j+=8;}
                    for (;j < file.size(); j++) {
                        String[] team = file.get(j).split(",");
                        if(team[3].equals("10")){
                            file.add(file.size(),team[0] + "," + team[1] + "," +team[2] + ",0");            //Tournament
                        }

                    }
                    Writer write = new FileWriter("src/Tournaments/"+listOfFiles[num-1].getName());
                    for (int k = 0; k < file.size(); k++) {                                                         //Tournament til DBConnecter
                        write.append(file.get(k) + "\n");
                    }
                    write.close();
                }
                else if(team1[3].equals("0") && team2[3].equals("0")){
                    tournament.addMatch(team1,team2);
                    Integer[] goals = tournament.getLastMatchGoals();
                    file.remove(i);
                    file.add(i,team1[0] + "," + team1[1] + "," +team1[2] + "," + goals[0]);
                    file.remove(i+1);
                    file.add(i+1,team2[0] + "," + team2[1] + "," +team2[2] + "," + goals[1]);
                    Writer write = new FileWriter("src/Tournaments/"+listOfFiles[num-1].getName());         //toString metode sendes fra tournament til DBConnector
                    for (int j = 0; j < file.size(); j++) {
                        write.append(file.get(j) + "\n");
                    }
                    write.close();
                    matchDone = true;
                }

                else i += 2;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public File[] lookInTournamentFolder(){
        File folder = new File("src/Tournaments/");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            System.out.println(i+1 + " " + listOfFiles[i].getName());                                           //DBConnector
        }
        return listOfFiles;
    }

    public void printTournamentStatus(){
        File[] listOfFiles = lookInTournamentFolder();
        System.out.println("Which tournament would you like to look at?");
        int num = scan.nextInt();
        List<String> file = null;
        try{
            file = Files.readAllLines(Paths.get("src/Tournaments/"+listOfFiles[num-1].getName()));         //Hent data fra DBConnector
        }catch (IOException e){
            System.out.println("Something went wrong");
        }

        for (int i = 0; i < file.size(); i+=2) {
            String str;
            String[] team1 = new String[0];
            String[] team2 = new String[0];
            str = file.get(i);
            team1 = str.split(",");
            str = file.get(i+1);
            team2 = str.split(",");
            System.out.println("Team: " + team1[0] +" : " + team1[3] +
                                "\nVS.\n" +
                                "Team: " + team2[0] + " : " + team2[3] + "\n\n");

        }
    }
}
