package yourstruly.OOPPractice;

import java.util.*;

public class Classroom{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String[] subjects = {"Science", "Math", "Programming"};
        
        System.out.println("- - - - - - - - For Input - - - - - - - -\n");
        
        System.out.print("Enter number of students: ");
            int studentSize = input.nextInt();
            input.nextLine();
            GradeManager[] student = new GradeManager[studentSize];
            
        System.out.println("");
        
        for(int i = 0 ; i < student.length; i++){
            System.out.print("Enter student no." + (i + 1) + "'s name: ");
                String studentName = input.nextLine();
                
            System.out.print("Enter " + studentName + "'s ID: ");
                String studentID = input.nextLine();
            
            int[] grades = new int[subjects.length];
            System.out.println("Enter " + studentName + "'s grades: ");
                for(int j = 0; j < grades.length; j++){
                    System.out.print(subjects[j] + ": ");
                        grades[j] = input.nextInt();
                }
                
            input.nextLine();    
            student[i] = new GradeManager(studentName, studentID, subjects, grades);
            
            if(i < student.length - 1)
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - -\n");
        }
        
        System.out.println("\n- - - - - - Student Profile/s - - - - - -\n");
        
        for(int i = 0; i < student.length; i++){
            student[i].displayStudentProfile();
            System.out.println("");
        }
        
        System.out.println("- - - - - - - - Analytics - - - - - - - -\n");
        
        int maxAve = 0;
        String maxAveName = "";
        for(int i = 0; i < student.length; i++){
            int average = student[i].computeAverage();
            if(average > maxAve){
                maxAve = average;
                maxAveName = student[i].getName();
            }
        } System.out.print("Highest average: " + maxAveName + " -> " + maxAve);
    
    }
}
