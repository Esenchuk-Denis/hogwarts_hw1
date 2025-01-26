import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();

        Gryffindor harry = new Gryffindor(random.nextInt(101), random.nextInt(101), " Гарри Поттер ", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor germiona = new Gryffindor(random.nextInt(101), random.nextInt(101), " Гермиона Грейнджер ", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor ron = new Gryffindor(random.nextInt(101), random.nextInt(101), " Рон Уизли ", random.nextInt(101), random.nextInt(101), random.nextInt(101));

        //Захария Смит, Седрик Диггори, Джастин Финч-Флетчли
        Hufflepuff sedrik = new Hufflepuff(random.nextInt(101), random.nextInt(101), " Седрик Диггори ", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff zaharia = new Hufflepuff(random.nextInt(101), random.nextInt(101), " Захария Смит ", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff justin = new Hufflepuff(random.nextInt(101), random.nextInt(101), " Джастин Финч-Флетчли ", random.nextInt(101), random.nextInt(101), random.nextInt(101));

       // Чжоу Чанг, Падма Патил и Маркус Белби
        Ravenclaw chzou = new Ravenclaw(random.nextInt(101), random.nextInt(101), " Чжоу Чанг ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Ravenclaw padma = new Ravenclaw(random.nextInt(101), random.nextInt(101), " Падма Патил ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Ravenclaw markus = new Ravenclaw(random.nextInt(101), random.nextInt(101), " Маркус Белби ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));

       // Драко Малфой, Грэхэм Монтегю, Грегори Гойл
        Slytherin drako = new Slytherin(random.nextInt(101), random.nextInt(101), " Драко Малфой ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );
        Slytherin graham = new Slytherin(random.nextInt(101), random.nextInt(101), " Грэхэм Монтегю ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );
        Slytherin gregory = new Slytherin(random.nextInt(101), random.nextInt(101), " Грегори Гойл ", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );


        System.out.println("Описание Гарри Поттера: ");
        harry.printDescription();
        System.out.println(" ");
        System.out.println("Описание Седрика Диггори: ");
        sedrik.printDescription();
        System.out.println(" ");
        System.out.println("Описание Чжоу Чанг: ");
        harry.printDescription();
        System.out.println(" ");
        System.out.println("Описание Драко Малфоя: ");
        harry.printDescription();
        System.out.println(" ");

        System.out.println("Сравнение студентов Гриффиндора:");
        Gryffindor.compareStudents(harry, germiona);
        System.out.println(" ");
        System.out.println("Сравнение студентов Пуффендуя:");
        Hufflepuff.compareStudents(sedrik, zaharia);
        System.out.println(" ");
        System.out.println("Сравнение студентов Когтеврана:");
        Ravenclaw.compareStudents(chzou, padma);
        System.out.println(" ");
        System.out.println("Сравнение студентов Слизерина:");
        Slytherin.compareStudents(drako, gregory);
        System.out.println(" ");

        System.out.println("Сравнение студентов Хогвартса");
        Hogwarts.compareStudentsByMagic(harry, drako);

    }



}