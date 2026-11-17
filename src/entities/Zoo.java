package entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    private String name;
    private String city;
    private int nbrCages;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.nbrAnimals = 0;
        this.nbrAquaticAnimals = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Prosit 7: exceptions personnalisees
    public void addAnimal(Animal animal)
            throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException();
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal ajoute avec succes !");
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Number of animals: " + nbrAnimals);
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public boolean compareZoo(Zoo z) {
        return this.nbrAnimals > z.nbrAnimals;
    }

    // Prosit 6: gestion des animaux aquatiques
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("Aquatic array is full!");
        }
    }

    public void displayAquaticAnimals() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > max) {
                    max = penguin.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public int countDolphins() {
        int count = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                count++;
            }
        }
        return count;
    }

    public int countPenguins() {
        int count = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}
