package de.uni_hamburg.informatik.swt.se2.kino.ui.beobachterMuster;

/**
 * interface Beobachter ist das Interface für KassenController und implementiert die Methode beachteAenderung, welche von meldeAenderung aufgerufen wird
 * @author wir jiggos
 * @version SoSe 2025
 */
public interface Beobachter
{
/**
 * Wird aufgerufen, wenn eine Aenderung vorgenommen wird
 * @param controller eines der Controller
 */
    void beachteAenderung(Object controller);
}
