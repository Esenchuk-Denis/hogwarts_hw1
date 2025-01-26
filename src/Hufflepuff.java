public class Hufflepuff extends Hogwarts {
    int hardWorking;
    int loyal;
    int honest;

    public Hufflepuff(int magicPower, int toTransgress, String fullName, int hardWorking,int loyal,int honest) {
        super(magicPower, toTransgress, fullName);
        this.hardWorking = hardWorking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Трудолюбие: " + hardWorking);
        System.out.println("Верность: " + loyal);
        System.out.println("Честность: " + honest);
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.getHardWorking() + student1.getLoyal() + student1.getHonest();
        int total2 = student2.getHardWorking() + student2.getLoyal() + student2.getHonest();
        if (total1 > total2) {
            System.out.println("Студент Пуффендуя "+student1.fullName +" с баллами " + total1 + " лучше чем студент "+student2.fullName +" с баллами " + total2);
        } else if (total1 < total2) {
            System.out.println("Студент Пуффендуя "+student2.fullName +" с баллами " + total2 + " лучше чем студент "+student1.fullName +" с баллами " + total1);
        } else {
            System.out.println("Студенты Пуффендуя "+student1.fullName +" и "+student2.fullName +" одинаково хороши");
        }
    }
}
