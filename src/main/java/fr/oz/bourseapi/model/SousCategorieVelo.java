package fr.oz.bourseapi.model;

import java.util.List;

public enum SousCategorieVelo {
    VELO(List.of("ROUTE", "VTT", "VILLE", "ELECTRIQUE", "ENFANT", "DIVERS")), VETEMENT(List.of("Homme", "Femme", "Enfant")), ACCESSOIRE(List.of("roue", "divers"));

    public List<String> getType() {
        return type;
    }

    private final List<String> type;

    SousCategorieVelo(List<String> type) {
        this.type = type;
    }
}
