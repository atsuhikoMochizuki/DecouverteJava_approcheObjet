package fr.diginamic.fichier;

import mochizukiTools.Utils;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static final String RECENSEMENT_CSV_FILE_PATH = "./recensement.csv";

    public static List<String> run() throws Exception {
        Utils.msgTitle("Lecture du fichier recensement.csv");

        Path pathFile = Paths.get(RECENSEMENT_CSV_FILE_PATH);
        Utils.msgInfo("Récupération...");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//        Iterator<String> iter = lines.iterator();
//        while(iter.hasNext())
//            System.out.println(iter.next());
        Utils.msgInfo("Nota : nous éviterons la lecture intempestive de ce fichier très volumineux");
        return lines;
    }
}
