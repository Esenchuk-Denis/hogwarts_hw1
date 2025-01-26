import java.util.Objects;

public class Hogwarts {
    int magicPower;
    int toTransgress;
    String fullName;



    public Hogwarts(int magicPower, int toTransgress, String fullName) {
        this.magicPower = magicPower;
        this.toTransgress = toTransgress;
        this.fullName = fullName;


    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getToTransgress() {
        return toTransgress;
    }

    public void setToTransgress(int toTransgress) {
        this.toTransgress = toTransgress;
    }

    public void printDescription() {
        System.out.println("Сила магии: " + getMagicPower());
        System.out.println("Дальность трансгрессии: " + getToTransgress());
    }

    public static void compareStudentsByMagic(Hogwarts student1, Hogwarts student2) {
        int magicPower1 = student1.getMagicPower();
        int toTransgress1 = student1.getToTransgress();
        int magicPower2 = student2.getMagicPower();
        int toTransgress2 = student2.getToTransgress();

        int student1Total = magicPower1 + toTransgress1;
        int student2Total = magicPower2 + toTransgress2;

        if (student1Total > student1Total) {
            System.out.println("Студент "+student1.getFullName()+" с силой магии " + magicPower1 + " и трансгрессией " + toTransgress1 + " сильнее чем студент "+student2.getFullName()+" с силой магии " + magicPower2 + " и трансгрессией " + toTransgress2);
        } else if (student1Total < student2Total) {
            System.out.println("Студент "+student1.getFullName()+" с силой магии " + magicPower2 + " и трансгрессией " + toTransgress2 + " сильнее чем студент "+student2.getFullName()+" с силой магии " + magicPower1 + " и трансгрессией " + toTransgress1);
        }else {
            System.out.println("Сила магии и трансгрессии двух студентов равны");
        }
    }

}
