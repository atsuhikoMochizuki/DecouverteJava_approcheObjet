package fr.diginamic.fichier;

import mochizukiTools.Utils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CreerFichier {
    public static final String BACKUP_FILE_PATH = "./recensement_backup.csv";

    public static void run() throws Exception {
        Utils.msgTitle("Exercice 2 : Création d'un fichier");

        Path pathCible = Paths.get(BACKUP_FILE_PATH);
        Utils.msgInfo("Copie des 100 premières lignes du fichier...");
        List<String> srcBuffer = LectureFichier.run();
        List<String> linesToInsert = new ArrayList<>();


        ListIterator<String> iter = srcBuffer.listIterator();
        int nbrLines = 0;
        while (iter.hasNext()) {
            String lineToInsert = iter.next();

            if (nbrLines <= 100) {
                if (nbrLines != 0) {
                    String str = "ligne n° " + nbrLines + " " + lineToInsert;
                    linesToInsert.add(str);
                }
                nbrLines++;
            } else break;
        }
        Files.write(pathCible, linesToInsert);

        Utils.msgDebug("Verification : lecture du nouveau fichier...");
        Path pathFile = Paths.get(BACKUP_FILE_PATH);
        Utils.msgInfo("Récupération...");
        List<String> linesInFile = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        Iterator<String> lineInFile = linesInFile.iterator();
        while (lineInFile.hasNext()) System.out.println(lineInFile.next());
        Utils.msgResult("Copie effectuée");
    }
}