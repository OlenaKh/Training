package net.comments.sample;

/*
the objec represents a student who is learning not very well
 */
public class BadStudent implements Student {
    private final String name;

    /*
    allows creating {@link BadStudent}'s object with a given name
    @param name a name of the student
     */
    public BadStudent(String name) {
        this.name = name;
    }

    /*
    allows to sleep during a learning process
     */
    public void learn(Subject subject) {
        System.out.println(this.name + " is sleeping on " + subject.subjectName());
    }

    /**
     * Give a name of the student.
     */
    public String name() {
        return this.name;
    }
}
