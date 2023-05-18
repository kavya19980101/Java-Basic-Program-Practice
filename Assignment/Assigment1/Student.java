package Assignment.Assigment1;

import Assignment.Assigment1.ATB;

public class Student {
    private String name;
    private int id;
    private ATB atb;

    Student(String name, int id, ATB atb)
    {
        this.id=id;
        this.name=name;
        this.atb=atb;
    }


        public String toString(ATB atb) {
            return "Student{" +
                    "name='" + name + '\'' +
                     "," +atb.toString() +
                    '}';
        }
}
