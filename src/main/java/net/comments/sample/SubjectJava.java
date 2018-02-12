package net.comments.sample;

public class SubjectJava implements Subject {

    private final String name;

    public SubjectJava() {
        this.name = "Java";
    }

    public String subjectName() {
        return this.name;
    }
}
