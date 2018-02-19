package net.comments.sample;

public class TrainingRoom implements Room {
    private final String number;
    private final Person persons[];

    public TrainingRoom(String number) {
        this.number = number;
        persons = new Person[1000];
    }

    public TrainingRoom(String number, int size) {
        this.number = number;
        persons = new Person[size];
    }

    public void accept(Person person) {
        for (int i = 0; i < this.persons.length; i++) {
            if (this.persons[i] == null) {
                this.persons[i] = person;
                System.out.println(this.persons[i] + " went into the room #" + this.number);
                return;
            }
        }
        System.out.println("There is no place in the room for " + person.name());

    }
}
