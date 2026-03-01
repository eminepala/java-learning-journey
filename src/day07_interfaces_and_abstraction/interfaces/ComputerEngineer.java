package day07_interfaces_and_abstraction.interfaces;
public class ComputerEngineer implements Engineer {

    private boolean militaryCompleted;
    private boolean criminalRecord;

    public ComputerEngineer(boolean militaryCompleted, boolean criminalRecord) {
        this.militaryCompleted = militaryCompleted;
        this.criminalRecord = criminalRecord;
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

        System.out.println("Worked as a Computer Engineer at:");

        if (companies.length == 0) {
            System.out.println("No work experience.");
        } else {
            for (String company : companies) {
                System.out.println(company);
            }
        }
    }
}