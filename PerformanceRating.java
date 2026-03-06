public class PerformanceRating{
  private String employeeName;
  private int totalHours;
  private int totalPoints;
  private float rating;

  public PerformanceRating(String name, int hours, int points){
    setData(name, hours, points);
    calculateRating();
  }

  private void setData(String name, int hours, int points){
        employeeName = name;
        totalHours = hours;
        totalPoints = points;
    }

  private void calculateRating(){
    if(totalHours == 0){
      rating = 0;
    }
    else{
    rating = (float) totalPoints/totalHours;
    }
  }

  public String getEmployeeName(){
    return employeeName;
  }

  public int getTotalHours(){
    return totalHours;
  }

  public int getTotalPoints(){
    return totalPoints;
  }

  public double getRating(){
    return rating;
  }

  public String toString(){
    return "Employee Name: " + employeeName + "\nTotal Hours: " + totalHours + "\nTotal Points: " + totalPoints + "\nRating: " + rating;
  }
}
