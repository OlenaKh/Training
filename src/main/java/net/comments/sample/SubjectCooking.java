package net.comments.sample;

public class SubjectCooking implements Subject {

    private final String name;

    public SubjectCooking() {
        this.name = "bake cake";
    }

    public String subjectName() {
        return name;
    }
}
