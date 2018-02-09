package net.comments.sample;

public class TrainingRoom implements Room {

    private final String number;
    private final int size;

    //  public TrainingRoom(String number, int size){
    //      this.number = number;
    //     this.size = 10;
    //  }

    //public void accept(Person person) {

    //     System.out.println(person.name() + " went into the room" + this.number);
    // }

    public void accept(Person person) {

        System.out.println(person.name() + " went into the room");
    }
}
