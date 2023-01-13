package Fundamentals.ObjectAndClassesExercise.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        int index = findIndex(name);

        if (index != -1) {
            return true;
        }
        return false;
    }

    private int findIndex(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream().filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder(" The grooming salon has the following clients:" + System.lineSeparator());

        for (Pet pet : data) {
            builder.append(pet.getName().toString());
            builder.append(" ");
            builder.append(pet.getOwner().toString());
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }
}

