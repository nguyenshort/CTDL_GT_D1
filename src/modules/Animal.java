package modules;

public record Animal(int id, String name, int inhabitant, int weight) {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getInhabitant() {
        return inhabitant;
    }

    public int getWeight() {
        return weight;
    }
}
