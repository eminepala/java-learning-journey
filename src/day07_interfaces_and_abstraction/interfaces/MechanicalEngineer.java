package day07_interfaces_and_abstraction.interfaces;
public class MechanicalEngineer implements Engineer, Workable {

    private boolean militaryCompleted;
    private boolean criminalRecord;

    public MechanicalEngineer(boolean militaryCompleted, boolean criminalRecord) {
        this.militaryCompleted = militaryCompleted;
        this.criminalRecord = criminalRecord;
    }

    @Override
    public void work() {
        System.out.println("Mechanical Engineer is working...");
    }

    @Override
    public void checkMilitaryStatus() {

        if (militaryCompleted) {
            System.out.println("Military service completed.");
        } else {
            System.out.println("Military service not completed yet.");
        }
    }

    @Override
    public String graduationAverage(double gpa) {
        return "My GPA: " + gpa;
    }

    @Override
    public void checkCriminalRecord() {

        if (criminalRecord) {
            System.out.println("I have a criminal record.");
        } else {
            System.out.println("I do not have any criminal record.");
        }
    }

    @Override
    public void workExperience(String[] companies) {

        if (companies.length == 0) {
            System.out.println("No work experience.");
        } else {
            System.out.println("Worked as a Mechanical Engineer at:");
            for (String company : companies) {
                System.out.println(company);
            }
        }
    }

    public void getReferences(String[] references) {

        if (references.length == 0) {
            System.out.println("No references available.");
        } else {
            System.out.println("My references:");
            for (String reference : references) {
                System.out.println(reference);
            }
        }
    }
}