package entities;

public class Employe implements Comparable<Employe> {
    private int id;
    private String nom, prenom, nomDepartement;
    private int grade;

    public Employe() {}

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNomDepartement() { return nomDepartement; }
    public int getGrade() { return grade; }

    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement; }
    public void setGrade(int grade) { this.grade = grade; }

    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.id, autre.id);
    }

    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + nom + "', prenom='" + prenom
                + "', nomDepartement='" + nomDepartement + "', grade=" + grade + "}";
    }

    // Egalite basee sur l'identifiant
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe autre = (Employe) obj;
        return id == autre.id;
    }

    @Override
    public int hashCode() { return Integer.hashCode(id); }
}
