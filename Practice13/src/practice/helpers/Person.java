package practice.helpers;

public class Person {
    private String firstName;
    private String secondName;
    private String thirdName;

    public Person(String firstName) {
        this.firstName = firstName;
        secondName = "";
        thirdName = "";
    }

    public Person(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public CharSequence getFullNameStr(){
        return firstName + ' ' + secondName + ' ' + thirdName;
    }

    public CharSequence getFullNameStrBuffer(){
        return new StringBuffer().append(firstName).append(' ').append(secondName).append(' ').append(thirdName);
    }

    public CharSequence getFullNameStrBuilder(){
        return new StringBuilder().append(firstName).append(' ').append(secondName).append(' ').append(thirdName);
    }
}
