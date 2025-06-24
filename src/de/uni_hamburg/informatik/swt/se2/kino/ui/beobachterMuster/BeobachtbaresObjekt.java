package de.uni_hamburg.informatik.swt.se2.kino.ui.beobachterMuster;

import de.uni_hamburg.informatik.swt.se2.kino.ui.kasse.KassenController;

import java.util.HashSet;
import java.util.Set;

/**
 * abstrakte klassse BeobachtbaresObjekt ist die abstrakte klasse für die beobachtabren controller
 * @author wir jiggos
 * @version SoSe 2025
 */
public abstract class BeobachtbaresObjekt {
    Set<KassenController> _beobachter;

    /**
     * Erstellt ein BeobachtbaresObjekt mit Beobachter
     */
    public BeobachtbaresObjekt() {
        _beobachter = new HashSet<KassenController>();
    }

    /**
     * Meldet eine Aenderung
     */
    public void meldeAenderung() {
        for (KassenController beobachter: _beobachter) {
            beobachter.beachteAenderung(this);
        }
    };

    /**
     * Fuegt einen Beobachter hinzu
     *
     * @param beobachter der Beobachter der Hinzugefuegt wird
     *
     * @require beobachter != null
     */
    public void fuegeBeobachterHinzu(KassenController beobachter) {
        assert beobachter != null: "Vorbedingung verletzt: Beobachter darf nicht null sein";

        _beobachter.add(beobachter);
    }

    /**
     * Entfernt einen Beobachter
     *
     * @param beobachter der Beobachter der Hinzugefuegt wird
     *
     * @require beobachter != null
     */
    public void entferneBeobachter(KassenController beobachter) {
        assert beobachter != null: "Vorbedingung verletzt: Beobachter darf nicht null sein";

        _beobachter.remove(beobachter);
    }
}
