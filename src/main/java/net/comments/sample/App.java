package net.comments.sample;

/**
 * the main class to run app(code)
 */
public class App {
    public static void main(String[] args) {
        Subject java = new SubjectJava();
        Subject cooking = new SubjectCooking();

        Student lena = new AttentiveStudent("Lena");
        go(lena, java);
        Student alex = new BadStudent("Alex");
        go(alex, cooking);
        Teacher dima = new JavaTeacher("Dima");
        teach(dima, java);
        Teacher ector = new CookingTeacher("Ector");
        teach(ector, cooking);

        Room trainingroom = new TrainingRoom();
        meet(alex, trainingroom);

    }

    private static void go(Student someone, Subject subject) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.learn(subject);
    }

    private static void teach(Teacher someone, Subject subject) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.teach(subject);
    }

    private static void meet(Person someone, Room room) {
        System.out.println("There is a training room.");
        room.accept(someone);
    }
}
