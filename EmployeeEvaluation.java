import java.util.Scanner;

public class EmployeeEvaluation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        String g1, g2;
        int hrs1, hrs2;

        System.out.print("Please enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter the grade for task 1 (Excellent/Good/Average/Poor): ");
        g1 = input.nextLine();
        System.out.print("Enter the working hours for task 1: ");
        hrs1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter the grade for task 2 (Excellent/Good/Average/Poor): ");
        g2 = input.nextLine();
        System.out.print("Enter the working hours for task 2: ");
        hrs2 = input.nextInt();

        int point1 = getGradePoint(g1);
        int point2 = getGradePoint(g2);

        int totalHours = hrs1+hrs2;
        int totalPoints = (point1*hrs1)+(point2*hrs2);

        PerformanceRating emp = new PerformanceRating(name, totalHours, totalPoints);

        System.out.println("\nRESULTS ARE AS BELOW");
        System.out.println(emp.toString());
        input.close();
    }

    public static int getGradePoint(String grade){
        int point = 0;
        grade = grade.toLowerCase();

        if(grade.equals("excellent")){
            point = 5;
        } 
        else if(grade.equals("good")){
            point = 4;
        } 
        else if(grade.equals("average")){
            point = 3;
        } 
        else if(grade.equals("poor")){
            point = 2;
        } 
        else{
            point = 0;
        }
        return point;
    }
}

