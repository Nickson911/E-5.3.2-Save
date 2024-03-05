import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameProgress game1 = new GameProgress(100, 1, 5, 100);
        GameProgress game2 = new GameProgress(150, 2, 7, 160);
        GameProgress game3 = new GameProgress(200, 3, 10, 200);
        Serializable.saveGame("D://Games//savegames//game1.dat", game1);
        Serializable.saveGame("D://Games//savegames//game2.dat", game2);
        Serializable.saveGame("D://Games//savegames//game3.dat", game3);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("D://Games//savegames//game1.dat");
        arrayList.add("D://Games//savegames//game2.dat");
        arrayList.add("D://Games//savegames//game3.dat");
        Zip.zipFiles("D://Games//savegames//zip.zip", arrayList);
        File game1Dat = new File("D://Games//savegames//game1.dat");
        File game2Dat = new File("D://Games//savegames//game2.dat");
        File game3Dat = new File("D://Games//savegames//game3.dat");
        if (game1Dat.delete()) System.out.println("Файл \"game1.dat\" удален");
        if (game2Dat.delete()) System.out.println("Файл \"game2.dat\" удален");
        if (game3Dat.delete()) System.out.println("Файл \"game3.dat\" удален");
    }
}