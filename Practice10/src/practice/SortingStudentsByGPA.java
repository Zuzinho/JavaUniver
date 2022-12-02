package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator {

    ArrayList<Student> iDNumber;

    public void setArray(int len){
        iDNumber = new ArrayList<>(len);
        Random random = new Random();
        for(int i = 0;i<len;i++){
            int randomNumber = 1;
            iDNumber.add(new Student("Student" + randomNumber,"Student" + randomNumber,"prog",3,"inbo",randomNumber));
        }
    }

    public void outArray(){
        for (Student student : iDNumber) System.out.println(student);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getGPA() - ((Student)o2).getGPA();
    }

    private int partition(ArrayList<Student> arr, int begin, int end) {
        Student pivot = arr.get(end);
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (compare(arr.get(j), pivot) < 0) {
                i++;
                Student swapTemp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,swapTemp);
            }
        }

        Student swapTemp = arr.get(i + 1);
        arr.set(i+1,arr.get(end));
        arr.set(end,swapTemp);

        return i + 1;
    }

    public void qSort(ArrayList<Student> arr, int begin, int end) {
        if (begin < end) {
            int partitions = partition(arr, begin, end);

            qSort(arr, begin, partitions - 1);
            qSort(arr, partitions + 1, end);
        }
    }

    public void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (compare(l.get(i),r.get(j)) < 0) a.set(k++,l.get(i++));
            else a.set(k++,r.get(j++));
        }
        while (i < left)  a.set(k++,l.get(i++));
        while (j < right) a.set(k++,r.get(j++));
    }

    public void mergeSort(ArrayList<Student> a) {
        if (a.size() < 2) return;
        int mid = a.size() / 2;
        ArrayList<Student> l = new ArrayList<>(mid);
        ArrayList<Student> r = new ArrayList<>(a.size() - mid);

        for (int i = 0; i < mid; i++) l.add(a.get(i));
        for (int i = mid; i < a.size(); i++) r.add(a.get(i));

        mergeSort(l);
        mergeSort(r);

        merge(a, l, r, mid, a.size() - mid);
    }

    public void exOne() {
        setArray(4);

        System.out.println("Unsorted array: ");
        outArray();

        for (int i = 0; i < iDNumber.size(); i++) {
            Student st = iDNumber.get(i);
            int j = i - 1;
            for (; (j >= 0) && (compare(st,iDNumber.get(j)) < 0); j--)
                iDNumber.set(j + 1,iDNumber.get(j));
            iDNumber.set(j + 1,st);
        }

        System.out.println("\nSorted array: ");
        outArray();
    }

    public void exTwo() {
        setArray(4);

        System.out.println("Unsorted array: ");
        outArray();

        qSort(iDNumber, 0, iDNumber.size() - 1);

        System.out.println("\nSorted array: ");
        outArray();
    }

    public void exThree() {
        Student[] students1 = new Student[]{
                new Student("Nik10","Nik10","prog",3,"inbo",10),
                new Student("Nik9","Nik9","prog",3,"inbo",9),
                new Student("Nik5","Nik5","prog",3,"inbo",5),
                new Student("Nik4","Nik4","prog",3,"inbo",4),
        };
        Student[] students2 = new Student[]{
                new Student("Nik3","Nik3","prog",3,"inbo",3),
                new Student("Nik7","Nik7","prog",3,"inbo",7),
                new Student("Nik1","Nik1","prog",3,"inbo",1),
                new Student("Nik2","Nik2","prog",3,"inbo",2),
        };
        iDNumber = new ArrayList<>();
        iDNumber.addAll(Arrays.asList(students1));
        iDNumber.addAll(Arrays.asList(students2));
        mergeSort(iDNumber);
        System.out.println("Sorted array: ");
        outArray();
    }

    public Student find(String surname,String name) throws StudentNotFoundException {
        for(Student student: iDNumber){
            if(student.getSurname().equals(surname)){
                if(student.getName().equals(name)){
                    return student;
                }
            }
        }
        throw new StudentNotFoundException(String.format("Student %1$s %2$s not found",surname,name));
    }

}
