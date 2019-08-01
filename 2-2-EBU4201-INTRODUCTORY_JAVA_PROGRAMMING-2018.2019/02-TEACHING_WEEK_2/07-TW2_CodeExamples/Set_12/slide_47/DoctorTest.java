import java.util.*;

public class DoctorTest {

  public static void main(String[] args) {
    ArrayList<Doctor> dlist = new ArrayList<Doctor>();
    dlist.add(new Doctor());
    dlist.add(new Surgeon());
    dlist.add(new FamilyDoctor());
    dlist.add(new Surgeon());

    for (Doctor d : dlist) {
      d.treatPatient();
      d.giveAdvice();
    }
  }
} 
