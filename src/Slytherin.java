public class Slytherin extends Hogwarts {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(int magicPower, int toTransgress, String fullName, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower){
        super(magicPower, toTransgress,fullName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int total1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
        int total2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();

        if (total1 > total2) {
            System.out.println("Студент Слизерина "+student1.fullName +" с баллами " + total1 + " лучше чем студент "+student2.fullName +" с баллами " + total2);
        } else if (total1 < total2) {
            System.out.println("Студент Слизерина "+student2.fullName + " с баллами " + total2 + " лучше чем студент "+student1.fullName + " с баллами " + total1);
        } else {
            System.out.println("Студенты Слизерина  "+student1.fullName +" и "+student2.fullName +" одинаково хороши");
        }
    }
}
