package net.comments.sample;

public class SubjectJava implements Subject {

    private final String name;

    public SubjectJava() {
        this.name = "use GIT";
    }


    public String subjectName() {
        return name;
    }
}
