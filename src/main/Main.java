package main;

import entities.Employe;
import services.SocieteArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben Ali", "Sami", "Informatique", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Amira", "Finance", 1);
        Employe e3 = new Employe(4, "Mansour", "Youssef", "Informatique", 1);
        Employe e4 = new Employe(2, "Gharbi", "Ali", "Ressources Humaines", 3);
        Employe e5 = new Employe(5, "Jaziri", "Meriem", "Informatique", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom Ben Ali: "
                + societe.rechercherEmploye("Ben Ali"));

        Employe recherche = new Employe(4, "Inconnu", "Test", "Autre", 9);
        System.out.println("Recherche par objet (ID 4): "
                + societe.rechercherEmploye(recherche));

        System.out.println("\n=== Tri naturel par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri departement, grade, nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Recherche departement Informatique ===");
        List<Employe> resultat = societe.rechercherParDepartement("Informatique");
        for (Employe e : resultat) System.out.println(e);

        System.out.println("\n=== Suppression de l'employe ID 2 ===");
        societe.supprimerEmploye(e4);
        societe.displayEmploye();
    }
}
