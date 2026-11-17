PROSITE 8 - Gestion des employes Java

Structure:
src/entities/Employe.java
src/interfaces/IGestion.java
src/interfaces/IRechercheAvancee.java
src/services/SocieteArrayList.java
src/main/Main.java

Fonctionnalites:
- Employe: constructeurs, getters/setters, toString, Comparable par ID.
- IGestion<T>: interface generique de gestion.
- SocieteArrayList: stockage dans ArrayList<Employe>.
- Comparator: tri par departement, puis grade, puis nom.
- IRechercheAvancee<T>: recherche par departement.
- Main: tests des ajouts, recherches, tris et suppression.

Compilation (depuis le dossier prosite_8):
javac -encoding UTF-8 -d out src/entities/*.java src/interfaces/*.java src/services/*.java src/main/*.java

Execution:
java -cp out main.Main

Les tris sont croissants. equals() compare les employes par ID.
