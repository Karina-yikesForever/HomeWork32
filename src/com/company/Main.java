package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
FileWriter fileWriter1=new FileWriter("Song.txt");
FileReader fileReader=new FileReader("File.txt");
Scanner sc=new Scanner(fileReader);
    }
}


class Song {
    String name;
    String singer;
    String genre;
    String lyrics;

    public Song(String name, String singer, String genre, String lyrics) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.lyrics = lyrics;
    }
    
}
