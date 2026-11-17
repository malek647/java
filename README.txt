PROSIT 7 - Zoo Management (Java)
================================

Structure:
- src/entities : classes Animal, Zoo, Aquatic, Terrestrial, Dolphin,
  Penguin et les deux exceptions personnalisees.
- src/main : classe ZooManagement contenant main().

Pour compiler depuis le dossier prosite_7:

    javac -d out src/entities/*.java src/main/*.java

Pour executer:

    java -cp out main.ZooManagement

Points du Prosit 7:
1. addAnimal() retourne void.
2. ZooFullException est levee si le nombre de cages est atteint.
3. InvalidAgeException est levee si l'age de l'animal est negatif.
4. main() intercepte les exceptions et affiche le nombre d'animaux
   apres chaque tentative d'ajout.
5. Le zoo de test a une capacite de 3 cages.

Note:
Le constructeur Animal accepte un age negatif afin que la validation
demandee soit effectuee dans addAnimal(), comme indique dans le Prosit 7.
