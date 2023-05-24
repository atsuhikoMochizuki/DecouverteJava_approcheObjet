import fr.diginamic.banque.TestBanque;
import fr.diginamic.banque.entites.TestOperation;
import fr.diginamic.entites.TestPersonne;

import fr.diginamic.listes.TestVille;
import fr.diginamic.listes.TestVille.*;
import fr.diginamic.utils.TestMethodeStatic;
import mochizukiTools.Params;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Params.welcomePrompt();
        TestPersonne.run();
        TestMethodeStatic.run();
        TestBanque.run();
        TestOperation.run();
        TestVille.run();

    }
}