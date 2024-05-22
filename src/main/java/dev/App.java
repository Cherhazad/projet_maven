package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            String titre = ResourceBundle.getBundle("application").getString("titre");
            String asciiArt = FigletFont.convertOneLine(titre);
            System.out.println(asciiArt);

            // affichage de l'environnement
            String environnement = ResourceBundle.getBundle("application").getString(
                    "environnement");
            System.out.println("Environnement : " + environnement);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Bravo, je suis la meilleure ! :)");
    }

}
