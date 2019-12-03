package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
           FileWriter fileWriter = new FileWriter("File.txt");
           fileWriter.write("Name: Change"+"\n");
           fileWriter.write("Singer: RM&Wale"+"\n");
           fileWriter.write("Genre: R&B and pop"+"\n");
           fileWriter.write("Lyrics:Oh, tell me that dark could never win the light\n" +
                   "Oh, tell me that wrong could never win the right\n" +
                   "Baby, tell me that we gon' someday stop the fight\n" +
                   "And tell me that every, everything gon' be alright\n" +
                   "Oh tell me who’s stupid, baby, is it me or them?\n" +
                   "Just tell me who’s insane, baby, is it me or them?\n" +
                   "In this crazy world after patience, could we get the pearl?\n" +
                   "But this world, which teaches me, preaches me how to curl\n" +
                   "Oh, fuck the school\n" +
                   "All we got is mad teachers and some visible classes\n" +
                   "Divided spaces, and forever-lastin' stresses\n" +
                   "Everybody’s mad\n" +
                   "Kill people with fingers on Twitter\n" +
                   "More than a gun, more than a knife\n" +
                   "The tip of your tongue just glitter");
           FileWriter fileWriter1 = new FileWriter("Song.txt");

           FileReader fileReader = new FileReader("File.txt");
           fileWriter.write("\n");


           Scanner sc = new Scanner(fileReader);

           fileWriter.close();
           fileWriter1.close();

    }

}


class Song {
    String name;
    String singer;
    String genre;
    String lyrics;
}
