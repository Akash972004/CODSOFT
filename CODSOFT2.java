import java.util.Scanner;
public class CODSOFT2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student in each subject(0-100):");
        int[] marks=new  int[4];
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
        int Totalmarks=sum;
        
        float Averagepercentage=sum/marks.length;
        
        char grade; if (Averagepercentage >= 90) 
        { 
            grade = 'A'; 
        } 
        else if (Averagepercentage >= 80) 
        { 
            grade = 'B'; 
        } 
        else if (Averagepercentage >= 70) 
        { 
            grade = 'C'; 
        } 
        else if (Averagepercentage >= 60) 
        { 
            grade = 'D'; 
        } 
        else { 
            grade = 'F';
        }
        System.out.println("TOTAL MARKS:\n"+Totalmarks);
        System.out.println("AVERAGE PERCENTAGE\n"+Averagepercentage);
        System.out.println("GRADE\n"+grade);
        sc.close();
    }
}
