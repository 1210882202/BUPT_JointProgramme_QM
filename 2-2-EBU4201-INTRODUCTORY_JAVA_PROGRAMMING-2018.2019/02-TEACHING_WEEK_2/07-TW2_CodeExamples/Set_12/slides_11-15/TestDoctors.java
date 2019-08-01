public class TestDoctors {

  public static void main(String[] args) {
    System.out.println("Printing Doctor's data:");
    Doctor d = new Doctor();
    d.treatPatient();
    d.worksAtHospital = false;
    System.out.println("d.worksAtHospital = " + d.worksAtHospital);

    System.out.println("\nPrinting FamilyDoctor's data:");
    FamilyDoctor fd = new FamilyDoctor();
    fd.treatPatient();
    fd.giveAdvice();
    fd.makesHouseCalls = true;
    System.out.println("fd.worksAtHospital = " + fd.worksAtHospital);
    System.out.println("fd.makesHouseCalls = " + fd.makesHouseCalls);

    System.out.println("\nPrinting Surgeon's data:");
    Surgeon s = new Surgeon();
    s.treatPatient();
    s.makeIncision();
    System.out.println("s.worksAtHospital = " + s.worksAtHospital);
  }
} 
