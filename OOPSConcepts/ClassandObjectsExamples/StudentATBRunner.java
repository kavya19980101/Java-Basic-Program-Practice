package OOPSConcepts.ClassandObjectsExamples;

public class StudentATBRunner {
    public static void main(String[] args) {
        ClassObjectDemoStudentATB student1 = new ClassObjectDemoStudentATB();
        student1.name="Kavya";

        ClassObjectDemoStudentATB student2=new ClassObjectDemoStudentATB();
        student2.name="Apoorva";
        ClassObjectDemoStudentATB student3=student1;

        //Understanding Object storage in JVM Heap Memory and Results
        System.out.println(student3==student1); //True
        System.out.println(student1==student2);//False
        System.out.println(student3==student2); //False
        System.out.println(student3.equals(student1)); //True
        System.out.println(student3.equals(student2));//False
        System.out.println(student3.equals(student2));//False
    }
}
