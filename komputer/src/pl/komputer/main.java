package pl.komputer;

import pl.komputer.drive.Drive;
import pl.komputer.drive.HDDDrive;
import pl.komputer.file.File;
import pl.komputer.file.imagefile.GIFImageFile;
import pl.komputer.file.imagefile.JPGImageFile;
import pl.komputer.file.musicfile.MP3MusicFile;

public class main {
    public static void main(String[] args){
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFile();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

        MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 200, "Kiss", "I was made to loving you", 90);
        System.out.println(mp3MusicFile.getName());

    }
}
