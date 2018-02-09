package net.comments.sample;

/**
 * the main class to run app(code)
 */
public class App {
    public static void main(String[] args) {
        Student lena = new AttentiveStudent("Lena");
        go(lena);
        Student alex = new BadStudent("Alex");
        go(alex);
        Teacher dima = new JavaTeacher("Dima");
        teach(dima);
        Room trainingroom = new TrainingRoom();
        meet(alex, trainingroom);

    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.learn();
    }

    private static void teach(Teacher someone) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.teach();
    }

    private static void meet(Person someone, Room room) {
        System.out.println("There is a training room.");
        room.accept(someone);
    }
}
