package day07_interfaces_and_abstraction.interfaces;
public class Main {

    public static void main(String[] args) {

        Engineer engineer1 = new ComputerEngineer(false, false);

        engineer1.checkMilitaryStatus();
        engineer1.checkCriminalRecord();
        System.out.println(engineer1.graduationAverage(3.07));

        String[] experience1 = {"Vestel", "Havelsan", "Turksat"};
        engineer1.workExperience(experience1);


        MechanicalEngineer engineer2 = new MechanicalEngineer(true, false);

        String[] experience2 = {};
        String[] references = {"Mustafa Murat Coskun", "Serhat Say"};

        engineer2.checkMilitaryStatus();
        engineer2.checkCriminalRecord();
        System.out.println(engineer2.graduationAverage(2.31));
        engineer2.workExperience(experience2);
        engineer2.getReferences(references);
        engineer2.work();
    }
}