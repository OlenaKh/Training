package net.comments.sample;

public class JavaTeacher implements Teacher {

    private final String name;

    public JavaTeacher(String name) {

        this.name = name;
    }

    public void teach(Subject subject) {

        System.out.println(this.name + " teach how to " + subject.subjectName());
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return name;
    }
}
