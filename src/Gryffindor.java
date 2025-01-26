public class Gryffindor extends Hogwarts {
    int nobility;

    int honor;
    int bravery;
   public Gryffindor(int magicPower, int toTransgress, String fullName,int nobility,int honor,int bravery) {
       super(magicPower, toTransgress, fullName);
       this.bravery = bravery;
       this.honor = honor;
       this.nobility = nobility;
   }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
@Override
    public void printDescription() {
       super.printDescription();
    System.out.println("Благородство: " + nobility);
    System.out.println("Честь: " + honor);
    System.out.println("Храбрость: " + bravery);
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int total2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (total1 > total2) {
            System.out.println("Студент Гриффиндора "+student1.fullName + " с баллами " + total1 + " лучше чем студент "+student2.fullName + " с баллами " + total2);
        } else if (total1 < total2) {
            System.out.println("Студент Гриффиндора "+student2.fullName + " с баллами " + total2 + " лучше чем студент "+student1.fullName + " с баллами " + total1);
        } else {
            System.out.println("Студенты Гриффиндора "+student1.fullName+" и "+student2.fullName+" одинаково хороши");
        }
    }

}
