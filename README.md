A Java program made by me. I only asked ChatGPT for an OOP problem and I think I got it not as bad as I thought 
it would be since I'm still a 1st year at Information Technology with no idea of OOP, just main and methods as of now.

| | | | | - 2 / 13 / 26 - | | | | |

| | - So what does my program do? - | |

The class was composed of three main functions:
  - To ask for Student name, ID, Subjects, and Grade for each subjects.
  - To compute Average, Letter Grade, and Remarks.
  - And lastly, to display the corresponding letter grade from each student.
Additionally, I added Analytics at the end of the student profile/s to display who gets which, but as of Feb 13, 2026,
I only got to make who got the highest average. I wanted to do more such as who got the highest in each subject, but
exhaustion got ahead of me haha, but I'll keep on improving my first program to publish on github.

| | - How does the class GradeManager works? - | |
 
This is how I gravely misunderstood the concept of OOP(as for ChatGPT), since I used 2D arrays to store data from each student
and their grades on each subject. I still don't get it, but I think you store informations using multiple objects in the main? 
I'm still yet to learn the basics of OOP. I thought it's just main and methods like I'm used to, but I was wrong, but alas,
here's how the class works:
  - First, the declaration of an objects immediate asks for names of students, their IDs, the subjects, and finally, the student's
  grades on each subjects that was made using a 2D array.
  - Once the four parameters were met, an object can now be made using the class and was welcomed to use the following methods:
      1. computeAverage() - basically computes the average of the student by summing the row in the 2D array and dividing it
         by the .length of the subject. The return was an int[] so that the average could be saved by the same index as the student name.
      2. computeLetterGrade() - the method operates same as above that returns an array to store the letter grade on the same
         index as the student name. The letter grade was computed using if conditions, if the condition was met, a corresponding
         letter grade was declared in the index before restarting the loop for another index.
      3. computeRemarks()  - the methods operates the same as above, but the difference is that if a condition was met, the index
         will be declared either a "Passed" or "Failed".
      4. displayStudentInfo() - this method however, takes a parameter of average, letter grade, and remarks. I know this method
         doesn't necessarily needed a parameter, but I felt like I was depending too much on the constructor rather than the
         Scanner which only has System.in as a parameter. I wanted to give the user a freedom to use what method they want
         with the limit only being the parameter on the constructor. Even I don't know why I wanted this class to be this
         way haha.
      5. displayAnalytics() - now, this method's parameter works under the same reason as above, with the parameters being only
         the student names, and average. This is because the method was still unfinished and can only compute for who had the highest
         average by replacing the variable that holds the students's average with someone who have a higher value.

That's just how my first uploaded program on github works. I decided to start uploading, even if it's so messy, so that I could document
my progress in my programming career as some who's still 1st year College in the course of Information Techonology who aims either to be
a networking major, or a web dev one. I wanted to use my time to sharpen my skills, at the same, document it in this website. Who knows?
Maybe one day a job recruiter stumbled on my page while I'm job seeking. Haha, too delusional.

| | | | | | | | | | - README and program made by yours truly - | | | | | | | | | |
