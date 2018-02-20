package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TeacherTest {

    private final OutputStream outContent = new ByteArrayOutputStream();

    @BeforeTest
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkName() {
        MatcherAssert.assertThat(new JavaTeacher("Dima").name(), Matchers.is("Dima"));

        /* The line above is equivalent to the following code:
        Trainer trainer = new Trainer("ffff");
        String name = trainer.name();
        MatcherAssert.assertThat(name, Matchers.is("ffff"));
        */
    }

    @Test
    public void checkTeachOut() {
        Teacher teacher = new JavaTeacher("Dima");
        teacher.teach(new SubjectJava());
        assertEquals("Dima teach how to use GIT\r\n", outContent.toString());
    }
}
