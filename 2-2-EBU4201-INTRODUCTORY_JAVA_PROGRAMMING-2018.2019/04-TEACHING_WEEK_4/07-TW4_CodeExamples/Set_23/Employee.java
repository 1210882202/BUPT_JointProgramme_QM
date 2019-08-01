public class Employee implements Comparable<Employee> {
  int empID;
  String eName;
  double eSalary;
  static int i;
  
  public Employee() {
    empID = i++;
    eName = "unknown";
    eSalary = 0.0;
  }
  public Employee(String name, double sal) {
    empID = i++;
    eName = name;
    eSalary = sal;
  }
  public String toString() {
    return "EmpID  = " + empID + "\n" + "Ename  = " + eName + "\n" +
           "Salary = " + eSalary;
  }
  public int compareTo(Employee o1) {
    if (this.eSalary == o1.eSalary)
      return 0;
    else if (this.eSalary > o1.eSalary)
      return 1;
    else return -1;
  }
}