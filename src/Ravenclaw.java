public class Ravenclaw extends Hogwarts {
    int smart;
    int wise;
    int witty;
    int creativity;

    public Ravenclaw(int magicPower, int toTransgress, String fullName, int smart, int wise, int witty, int creativity) {
        super(magicPower, toTransgress, fullName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity =creativity;

    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Интеллект: " +smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + witty);
        System.out.println("Творчество: " + creativity);
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreativity();
        int total2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreativity();

        if (total1 > total2) {
            System.out.println("Студент Когтеврана "+student1.fullName +" с баллами " + total1 + " лучше чем студент "+student2.fullName +" с баллами " + total2);
        } else if (total1 < total2) {
            System.out.println("Студент Когтеврана "+student2.fullName + " с баллами " + total2 + " лучше чем студент "+student1.fullName + " с баллами " + total1);
        }else {
            System.out.println("Студенты Когтеврана  "+student1.fullName +" и "+student2.fullName +" одинаково хороши");
        }


    }
}
