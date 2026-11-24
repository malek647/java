PROSIT 9 - GESTION DES DEPARTEMENTS

Contenu :
- Departement.java : classe, constructeurs, getters/setters, equals(), hashCode(), toString()
- IDepartement.java : interface générique demandée dans le sujet
- DepartementHashSet.java : implémentation avec HashSet<Departement>
- Main.java : petit programme de test

Compilation et exécution :
1. Ouvrir un terminal dans ce dossier.
2. Compiler : javac *.java
3. Exécuter : java Main

Remarque :
Le sujet demande equals() selon id et nomDepartement.
hashCode() utilise exactement les mêmes attributs, ce qui est nécessaire
pour que HashSet détecte correctement les doublons.

Les méthodes de tri copient le HashSet dans une ArrayList pour pouvoir
trier les départements sans changer la collection de stockage.
