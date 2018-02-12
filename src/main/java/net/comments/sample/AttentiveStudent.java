package net.comments.sample;

public class AttentiveStudent implements Student {

    /*
    The object represents a student who is learning very well
     */
    private final String name;

    /*
    allows creating {@link AttentiveStudent}'s object with a given name
    @param name a name of the student
     */
    public AttentiveStudent(String name) {
        this.name = name;
    }

    public void learn(Subject subject) {
        System.out.println(this.name + "Is Listening to " + subject.subjectName());
    }

    /*
    Give a name of the student
     */
    public String name() {
        return this.name;
    }
}
