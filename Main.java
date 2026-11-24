public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "Ressources humaines", 10);
        Departement d3 = new Departement(3, "Finance", 15);
        Departement d4 = new Departement(1, "Informatique", 30);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4); // Doublon selon equals() : non ajouté

        System.out.println("=== Tous les départements ===");
        gestion.afficherDepartements();

        System.out.println("\\nRecherche Informatique : "
                + gestion.rechercherDepartement("Informatique"));

        System.out.println("\\n=== Tri par ID ===");
        gestion.trierDepartementsParId();

        System.out.println("\\n=== Tri par nom puis nombre d'employés ===");
        gestion.trierDepartementsParNomEtNombreEmployes();

        System.out.println("\\nRecherche de d1 : "
                + gestion.rechercherDepartement(d1));

        gestion.supprimerDepartement(d2);
        System.out.println("\\n=== Après suppression ===");
        gestion.afficherDepartements();
    }
}
