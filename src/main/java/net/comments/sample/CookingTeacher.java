package net.comments.sample;

public class CookingTeacher implements Teacher {

    private final String name;

    public CookingTeacher(String name) {
        this.name = name;
    }

    public void teach(Subject subject) {
        System.out.println(this.name + " teach " + subject.subjectName());
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return name;
    }
}
