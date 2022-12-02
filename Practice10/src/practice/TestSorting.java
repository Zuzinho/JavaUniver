package practice;

public class TestSorting {
    public static void main(String[] args) throws StudentNotFoundException {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        /*sortingStudentsByGPA.exOne();
        sortingStudentsByGPA.exTwo();
        sortingStudentsByGPA.exThree();*/
        sortingStudentsByGPA.setArray(10);
        System.out.println(sortingStudentsByGPA.iDNumber);
        Student student = sortingStudentsByGPA.find("Student0","Student1");
        System.out.println("Success");
    }
}
