package yourstruly.OOPPractice;

public class GradeManager{
    
    private String[] students,studentID, subjects, letterGrade, remarks;
    private int[][] grades;
    private int[] average;
    
    public GradeManager(String[] std, String[] stdID, String[] sbs, int[][] grd){
        this.students = std;
        this.studentID = stdID;
        this.subjects = sbs;
        this.grades = grd;
        average = new int[students.length];
        letterGrade = new String[students.length];
        remarks = new String[students.length];
    }
    
    public int[] computeAverage(){
        for(int x = 0; x < grades.length; x++){
            int sum = 0;
            for(int y = 0; y < grades[x].length; y++){
                sum += grades[x][y];
            } 
            average[x] = sum / subjects.length;
        }
        return average;
    }
    
    public String[] computeLetterGrade(){
        for(int x = 0; x < letterGrade.length; x++){
            if(average[x] >= 90 && average[x] <= 100)
                letterGrade[x] = "A";
            else if(average[x] >= 80 && average[x] <= 89)
                letterGrade[x] = "B";
            else if(average[x] >= 70 && average[x] <= 79)
                letterGrade[x] = "C";
            else if(average[x] >= 60 && average[x] <= 69)
                letterGrade[x] = "D";
            else if(average[x] < 60)
                letterGrade[x] = "F";
            else
                System.out.print("Error");
        }        
        return letterGrade;
    }
    
    public String[] computeRemarks(){
        for(int i = 0; i < remarks.length; i++){
            if(average[i] >= 60 && average[i] <= 100)
                remarks[i] = "Passed";
            else if(average[i] >= 0 &&average[i] < 60)
                remarks[i] = "Failed";
            else
                System.out.print("Error");
        }
        return remarks;
    }
    
    public void displayStudentInfo(int[] ave, String[] letterGrd, String[] rem){
        
        for(int i = 0; i < students.length; i++){
            System.out.println("Student No." + (i + 1));
            System.out.println("Student name: " + students[i]);
            System.out.println("Student ID: " + studentID[i]);
            System.out.println("Student average: " + ave[i]);
            System.out.println("Letter grade: " + letterGrd[i]);
            System.out.println("Remarks: " + rem[i] + "\n");
        }
    }
    
    public void displayAnalytics(String[] std, int[] ave){
        String highestStudent = "";
        int highestGrade = 0;
        for(int i = 0; i < ave.length; i++){
            if(ave[i] > highestGrade){
                highestGrade = ave[i];
                highestStudent = std[i];
            }
        }
        
        System.out.println("Highest average: " + highestStudent + " -> " + highestGrade);
    }
}
