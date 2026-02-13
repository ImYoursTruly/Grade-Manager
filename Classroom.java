package yourstruly.OOPPractice;

import java.util.*; // 13:30 (14:34-15:45) - 17:15

public class Classroom{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("- - - - - - - - For Input - - - - - - - -\n");
        
        System.out.print("Enter number of students: ");
            int studentSize = input.nextInt();
            input.nextLine();
            
        String[] students = new String[studentSize];
        String[] studentID = new String[studentSize];
        String[] subjects = {"Science", "Math", "Programming"};
        int[][] grades = new int[studentSize][3];
            
        System.out.println("");
        
        System.out.println("Enter the name/s of " + studentSize + " student/s:");
            for(int i = 0; i < students.length; i++){
                System.out.print("Enter student No." + (i + 1) + "'s name: ");
                    students[i] = input.nextLine();
            }
            
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - -\n");
        
        System.out.println("Enter the ID/s of " + studentSize + " student/s:");
            for(int i = 0; i < studentID.length; i++){
                System.out.print("Enter " + students[i] + "'s ID: ");
                    studentID[i] = input.nextLine();
            }
            
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - -\n");
        
        System.out.println("Enter the grade/s of " + studentSize + " student/s: ");
            for(int x = 0; x < grades.length; x++){
                System.out.println("For " + students[x] + "'s grades:");
                for(int y = 0; y < grades[x].length; y++){
                    System.out.print(subjects[y] + ": ");
                    grades[x][y] = input.nextInt();
                }
                System.out.println("");
            }
            input.nextLine();
            
        GradeManager GM = new GradeManager(students, studentID, subjects, grades);
        int[] average = GM.computeAverage();
        String[] letterGrade = GM.computeLetterGrade();
        String[] remarks = GM.computeRemarks();
        
        System.out.println("- - - - - - Student Profile/s - - - - - -\n");
        
        GM.displayStudentInfo(average, letterGrade, remarks);
        
        System.out.println("- - - - - - - - Analytics - - - - - - - -\n");
        
        GM.displayAnalytics(students, average);
        
        System.exit(0);
    }
}
