package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> allSet = new TreeSet<Student>();
        Class class1 = new Class("型月1班");
        Student s1 = new Student("Saber", 16, class1, 2018214154, "女");
        Student s2 = new Student("Lancer", 26, class1, 2018214185, "男");
        Student s3 = new Student("AliceKuonji", 17, class1, 2018214152, "女");
        Student s4 = new Student("MagicGunner", 17, class1, 2018214163, "女");
        Student s5 = new Student("Sizuki", 17, class1, 2018214172, "男");
        Student s6 = new Student("Ryougi", 38, class1, 2018214160, "女");
        System.out.println("普通迭代");
        class1.getStudents().add(s1);
        class1.getStudents().add(s2);
        class1.getStudents().add(s3);
        class1.getStudents().add(s4);
        class1.getStudents().add(s5);
        class1.getStudents().add(s6);
        class1.getStudents().remove(5);
        Iterator<Student> iterator = class1.getStudents().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        allSet.add(s1);
        allSet.add(s2);
        allSet.add(s3);
        allSet.add(s4);
        allSet.add(s5);
        List<Student> allList = new ArrayList<Student>();
        allList.addAll(allSet);
        ListIterator<Student> listIterator = allList.listIterator();
        System.out.println("升序迭代");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("降序迭代");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
