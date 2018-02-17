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

        Room smallRoom = new TrainingRoom("2305", 6);
        Room bigRoom = new TrainingRoom("2413");
        //meet(alex, trainingroom);

        Person group1[] = new Person[8];
        group1[0] = dima;
        for (int i = 1; i < group1.length; i++) {
            group1[i] = new AttentiveStudent("JavaStudent " + i);
            System.out.println(group1[i].name() + " assigned to group 1");
        }

        Person group2[] = new Person[20];
        group2[0] = ector;
        for (int i = 1; i < group2.length; i++) {
            group2[i] = new AttentiveStudent("CookStudent " + i);
            System.out.println(group2[i].name() + " assigned to group 2");
        }

        meet(group1, smallRoom);
        meet(group2, bigRoom);

    }

    private static void go(Student someone, Subject subject) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.learn(subject);
    }

    private static void teach(Teacher someone, Subject subject) {
        System.out.println(String.format("There is %s in the room", someone.name()));
        someone.teach(subject);
    }

    private static void meet(Person[] group, Room room) {
        for (int i = 0; i < group.length; i++) {
            room.accept(group[i]);
        }
    }
}
