package net.comments.sample;

public class SubjectCooking implements Subject {

    private final String name;

    public SubjectCooking() {
        this.name = "Cooking";
    }

    public String subjectName() {
        return this.name;
    }
}
