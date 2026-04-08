public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * *To create a new student by initializing
     * Fees for every student is $30 000.
     * Fees paid initially is 0.
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade  grade of the student
     */

    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade =grade;
        
    }

    //Not going to alter student's name, Student's id
/**
 * Used to upgrade the student's grade.
 * @param grade new grade of the student.
 * 
 */
    public void setGrade(int grade){
        this.grade = grade;
    }
/**
 * keep adding to to feespaid = 10,000+5000+15000
 * Add the fees to the fees paid
 * The scholl is going receive the funds.
 * 
 * @param fees the fees that the student pays.
 */
  public void updateFeesPaid(int fees){

    feesPaid += feesPaid;

  }

  public String getName(){
    return name;

 }
 public int getGrade(){
    return grade;
 } 
public int getFeesPaid(){
    return feesPaid;

}   
public int getFeesTotal(){
    return feesTotal;
} 




}
