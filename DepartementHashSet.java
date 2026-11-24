import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement() != null
                    && d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparingInt(Departement::getId));
        liste.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);

        Comparator<Departement> comparateur =
                Comparator.comparing(Departement::getNomDepartement,
                                     Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))
                          .thenComparingInt(Departement::getNombreEmployes);

        liste.sort(comparateur);
        liste.forEach(System.out::println);
    }
}
