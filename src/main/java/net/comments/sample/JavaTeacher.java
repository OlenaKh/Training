package net.comments.sample;

public class JavaTeacher implements Teacher {

    private final String name;

    public JavaTeacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(this.name + " explains Polymorphism");
    }

    public String name() {
        return this.name;
    }
}
