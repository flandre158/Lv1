package Students;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private Class aClass;
    private int studentNumber;
    private String sex;

    public Student(String name, int age, Class aClass, int studentNumber, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setaClass(aClass);
        this.setStudentNumber(studentNumber);
        this.setSex(sex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int compareTo(Student student) {
        if (this.studentNumber > student.studentNumber) {
            return 1;
        } else if (this.studentNumber < student.studentNumber) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "姓名:" + this.name + " 年龄:" + this.age + " " + this.aClass + " 学号:" + this.studentNumber + " 性别:" + this.sex;
    }
}
