package lesson3.task;

import java.io.Serializable;

//Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
//Обеспечьте поддержку сериализации для этого класса.
//Создайте объект класса Student и инициализируйте его данными.
//Сериализуйте этот объект в файл.
//Десериализуйте объект обратно в программу из файла.
//Выведите все поля объекта, включая GPA, и ответьте на вопрос,
//почему значение GPA не было сохранено/восстановлено.
//
//2. * Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документы).
public class Student implements Serializable {


    private int age;
    private String name;
    private transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getGPA() {
        return GPA;
    }
}
