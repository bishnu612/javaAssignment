package Encapsulation;

public class OutputStudent {

    public static void main(String[] args) {
        Student student = new Student(123,"bishnu");
        //student.setId(548);
       // student.setName("java");
        System.out.println("Student name is :" + student.getName() + " Student id is :" + student.getId());
    }
}
