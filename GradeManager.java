package yourstruly.OOPPractice;

public class GradeManager{
    
    private String[] subjects;
    private String studentName, studentID, letterGrade, remarks;
    private int[] grades;
    private int average, count = 0;
    
    GradeManager(String student, String studentID, String[] subjects, int[] grades){
        this.studentName = student;
        this.studentID = studentID;
        this.subjects = subjects;
        this.grades = grades;
    }
    
    public int computeAverage(){
        int sumOfGrades = 0;
        for(int i = 0 ; i < grades.length; i++)
            sumOfGrades += grades[i];
        return average = sumOfGrades / grades.length;
    }
        
    
    public String computeLetterGrade(){
        computeAverage();
        if(average >= 90 && average <= 100)
            letterGrade = "A";
        else if(average >= 80 && average <= 89)
            letterGrade = "B";
        else if(average >= 70 && average <= 79)
            letterGrade = "C";
        else if(average >= 60 && average <= 69)
            letterGrade = "D";
        else if(average < 60)
            letterGrade = "F";
        else
            letterGrade = "Error";
        return letterGrade;
    }
    
    public String computeRemarks(){
        computeAverage();
        if(average >= 60 && average <= 100)
            remarks = "Passed";
        else if(average >= 0 && average <= 59)
            remarks = "Failed";
        else
            remarks = "Error";
        return remarks;
    }
    
    public String getName(){
        return studentName;
    }
    
    public void displayStudentProfile(){
        computeAverage(); computeLetterGrade(); computeRemarks();
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + letterGrade);
        System.out.println("Remarks: " + remarks);
    }    
}
