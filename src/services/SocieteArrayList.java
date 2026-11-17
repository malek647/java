package services;

import entities.Employe;
import interfaces.IGestion;
import interfaces.IRechercheAvancee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        if (e != null) employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (nom == null) return false;
        for (Employe e : employes) {
            if (e.getNom() != null && e.getNom().equalsIgnoreCase(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) System.out.println(e);
    }

    // Tri naturel par ID croissant
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri par departement, puis grade, puis nom (ordre croissant)
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comp =
            Comparator.comparing(Employe::getNomDepartement,
                    Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER))
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom,
                    Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        employes.sort(comp);
    }

    @Override
    public List<Employe> rechercherParDepartement(String departement) {
        List<Employe> resultat = new ArrayList<>();
        if (departement == null) return resultat;
        for (Employe e : employes) {
            if (e.getNomDepartement() != null
                    && e.getNomDepartement().equalsIgnoreCase(departement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
