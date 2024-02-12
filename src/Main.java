public class Main {
    public static void main(String[] args) {
        // TODO: 12.02.2024
        //  Создайте класс Student с полями (name, age,
        //group), в main  методе создайте 5 обЬектов
        //класса Student , дайте значение полям, группа
        //может быть только "Java"  или "Js"  все 5
        //студентов должны быть в массиве. Теперь
        //посчитайте сколько студентов из "Java" и "Js"
        //А теперь посчитайте и выведите среднее
        //арифметическое значение возврастов всех

        Student student1 = new Student();
        student1.name = "Kuba";
        student1.age = 17;
        student1.group = "Java";
        System.out.println(student1.name + "\n" + student1.age + "\n" + student1.group);

        System.out.println(" ");

        Student student2 = new Student();
        student2.name = "Eldiyar";
        student2.age = 17;
        student2.group = "Java";
        System.out.println(student2.name + "\n" + student2.age + "\n" + student2.group);

        System.out.println(" ");

        Student student3 = new Student();
        student3.name = "Yzzat";
        student3.age = 16;
        student3.group = "JS";
        System.out.println(student3.name + "\n" + student3.age + "\n" + student3.group);

        System.out.println(" ");
        Student student4 = new Student();
        student4.name = "Ularbek";
        student4.age = 14;
        student4.group = "Java";
        System.out.println(student4.name + "\n" + student4.age + "\n" + student4.group);

        System.out.println(" ");
        Student student5 = new Student();
        student5.name = "Musa";
        student5.age = 20;
        student5.group = "Java";
        System.out.println(student5.name + "\n" + student5.age + "\n" + student5.group);




        Student[] students = {student1, student2, student3, student4, student5};
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < students.length; i++) {

            if (students[i].group.equalsIgnoreCase("Java")) {
                count++;

            } else {
                count2++;
            }



        }
        System.out.println("Java" + count);
        System.out.println("JS" + count2);
    }
}