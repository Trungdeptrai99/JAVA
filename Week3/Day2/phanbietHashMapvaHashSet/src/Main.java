import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Trung Đẹp Trai",21, "HP");
        Student student2 = new Student("Trung Tốt Bụng",21, "HP");
        Student student3 = new Student("An Ám Ảnh",21, "HP");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}

