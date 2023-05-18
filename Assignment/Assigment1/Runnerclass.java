package Assignment.Assigment1;

public class Runnerclass {
    public static void main(String[] args) {

        ATB[] A=new ATB[5];
   A[0]=new ATB(01,"Automation course");

   Student[] S=new Student[5];
   S[0]=new Student("Kavya",101, A[0]);
   S[1]=new Student("Apoorva",102, A[0]);
   S[2]=new Student("Sushmitha",103, A[0]);
   S[3]=new Student("Varalaksmi",104, A[0]);
   S[4]=new Student("Harish",105, A[0]);

for(int i=0; i<S.length ;i++)
{

        System.out.println(S[i].toString(A[0]));

}
        A[1]=new ATB(02,"Automation course");
        Student[] S1=new Student[5];
        S1[0]=new Student("Kavya",101, A[0]);
        S1[1]=new Student("Apoorva",102, A[0]);
        S1[2]=new Student("Sushmitha",103, A[0]);
        S1[3]=new Student("Varalaksmi",104, A[0]);
        S1[4]=new Student("Harish",105, A[0]);
        for(int j=0; j<S1.length ;j++)
        {

            System.out.println(S1[j].toString(A[1]));

        }
    }

}
