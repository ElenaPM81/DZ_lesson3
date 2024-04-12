package lesson3.task;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Иванов", 20, 4.5);
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getGPA());
        System.out.println();

        final String FILE_BIN = "student.bin";


        try (FileOutputStream fileOut = new FileOutputStream(FILE_BIN);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);

            System.out.println("Объект Student сериализован в файл student.bin.");
        }


        try (FileInputStream fileIn = new FileInputStream("student.bin");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {

            student = (Student) in.readObject();
            System.out.println("Объект Student десериализован из файла student.bin.");

        }

        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getGPA());
    }

}

// значение GPA не было сохранено, так как transient - это модификатор, указываемый перед полем класса для обозначения того, что данное поле не должно быть сериализованно( например информация приватна.

