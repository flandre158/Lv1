package Students;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private List<Student> Students;

    public Class() {
        this.Students = new ArrayList<Student>();
    }

    public Class(String name) {
        this();
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public String toString() {
        return "班级:" + this.name;
    }
}