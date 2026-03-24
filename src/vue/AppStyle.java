package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * Thème visuel "Neige et Soleil" - palette cohérente pour l'application
 */
public class AppStyle {

    // Couleurs principales - Neige (bleus glacés)
    public static final Color SNOW_WHITE = new Color(248, 252, 255);
    public static final Color ICE_BLUE = new Color(225, 238, 248);
    public static final Color FROST_BLUE = new Color(176, 212, 227);
    public static final Color SKY_BLUE = new Color(91, 155, 213);
    public static final Color DEEP_BLUE = new Color(52, 73, 94);

    // Couleurs d'accent - Soleil (oranges dorés)
    public static final Color SUN_GOLD = new Color(245, 166, 35);
    public static final Color SUN_ORANGE = new Color(255, 179, 71);
    public static final Color WARM_WHITE = new Color(255, 250, 240);

    // Couleurs fonctionnelles
    public static final Color SUCCESS_GREEN = new Color(39, 174, 96);
    public static final Color DANGER_RED = new Color(231, 76, 60);
    public static final Color WARNING_AMBER = new Color(241, 196, 15);
    public static final Color TEXT_PRIMARY = new Color(44, 62, 80);
    public static final Color TEXT_SECONDARY = new Color(127, 140, 141);

    // Polices
    public static final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 22);
    public static final Font FONT_SUBTITLE = new Font("Segoe UI", Font.PLAIN, 16);
    public static final Font FONT_LABEL = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_BUTTON = new Font("Segoe UI", Font.BOLD, 12);
    public static final Font FONT_INPUT = new Font("Segoe UI", Font.PLAIN, 13);

    // Bordures
    public static final Border PANEL_BORDER = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(FROST_BLUE, 1),
            new EmptyBorder(15, 15, 15, 15)
    );

    public static final Border INPUT_BORDER = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(FROST_BLUE, 1),
            new EmptyBorder(4, 10, 4, 10)
    );

    public static final Border CARD_BORDER = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 220, 235), 1),
            new EmptyBorder(20, 20, 20, 20)
    );

    public static Insets buttonInsets() {
        return new Insets(10, 20, 10, 20);
    }
}
