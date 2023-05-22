package mochizukiTools;

public class Params {
    /*Informations App*/
    public static final String APP_ASCII_LOGO = """
             _____    __                                _              _    __      __    \s
            |  __ \\  /_/                               | |            | |  /\\ \\    / /\\   \s
            | |  | | ___  ___ ___  _   ___   _____ _ __| |_ ___       | | /  \\ \\  / /  \\  \s
            | |  | |/ _ \\/ __/ _ \\| | | \\ \\ / / _ | '__| __/ _ \\  _   | |/ /\\ \\ \\/ / /\\ \\ \s
            | |__| |  __| (_| (_) | |_| |\\ V |  __| |  | ||  __/ | |__| / ____ \\  / ____ \\\s
            |_____/ \\___|\\___\\___/ \\__,_| \\_/ \\___|_|   \\__\\___|  \\____/_/    \\_\\/_/    \\_\\""";
    public static final String APP_TITLE = "Approche Objet";
    public static final String APP_DESCRIPTION = """
            Découverte du langage Java sous l'angle de la programmation orientée objet,
            au travers 9 séances de Travaux Pratiques:
            
                1 : CREER ET UTILISER DES CLASSES
                2 : INSTANCIATION ET CONSTRUCTEURS
                3 : INSTANCES ET METHODES
                4 : UTILISATION DE METHODES STATIC EXISTANTES
                5 : METTRE EN PLACE LES REGLES DE L’ENCAPSULATION
                6 : METHODE REDEFINIE ET HERITAGE
                7 : HERITAGE ET CONSTRUCTEURS
                8 : HERITAGE ET ABSTRACTION
                9 : INTERFACES
            """;
    public static final String APP_AUTHOR = "Atsuhiko Mochizuki";
    public static final int APP_MAJOR_VERSION = 1;
    public static final int APP_MINOR_VERSION = 0;
    public static final int APP_REVISION_VERSION = 0;
    public static final String DATE = "22/05/2023";
    public static final String APP_REPO = "https://github.com/atsuhikoMochizuki/DecouverteJave-approcheImperative.git";


    public static void welcomePrompt() {
        Utils.clearConsole();
        System.out.println(Utils.Colors.ANSI_BLUE + APP_ASCII_LOGO + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_GREEN + APP_TITLE.toUpperCase() + " v" + APP_MAJOR_VERSION + "." + APP_MINOR_VERSION + "." + APP_REVISION_VERSION + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_PURPLE + "By " + APP_AUTHOR + " - " + DATE + Utils.Colors.ANSI_RESET);
        System.out.println(Utils.Colors.ANSI_BLUE + "Repository : " + APP_REPO + Utils.Colors.ANSI_RESET);
        System.out.println("\n" + APP_DESCRIPTION);
        System.out.println("========================================================================================");
    }
}
