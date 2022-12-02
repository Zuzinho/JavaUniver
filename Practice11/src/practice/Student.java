package practice;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    private Date birthday;
    private DateFormat dateFormat;

    public Student(String name, String surname, Date birthday, String format) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        dateFormat = new SimpleDateFormat(format);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("User name - %1$s %2$s, birthday - %3$s",name,surname,dateFormat.format(birthday.getTime()));
    }

    public static void main(String[] args) {
        Student student = new Student("Nik","Potter",new Date(),"dd.MM.yyyy");
        System.out.println(student);
    }
}
