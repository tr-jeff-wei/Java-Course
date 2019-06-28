package lectures;

import java.util.Arrays;

public class P_Utility_sort {

    public static void main(String[] args) {
        sort_array();
        sort_arry_obj();
    }


    public static void sort_array() {

        int[] test = new int[]{2, 5, 3, 6, 9, 1};

        // 由小到大排
        Arrays.sort(test);

        System.out.println(Arrays.toString(test));
        // [1, 2, 3, 5, 6, 9]

        String[] names = new String[]{
                "cat", "Jack", "Ada", "Joe", "human", "Ava", "Brown", "Byrne"
        };

        // 英文字會照：大小寫 -> 字母序
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        // [Ada, Ava, Brown, Byrne, Jack, Joe, cat, human]
    }


    public static void sort_arry_obj(){

        Student[] students = new Student[4] ;
        students[0] = new Student("Joe" , 60 , 85 ) ;
        students[1] = new Student("Mary" , 70 , 73 ) ;
        students[2] = new Student("Frank" , 90 , 60 ) ;
        students[3] = new Student("Annie" , 80 , 90 ) ;

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }
}


class Student implements Comparable<Student>{
    String name ;
    int java ;
    int math ;

    public Student(String name, int java, int math) {
        this.name = name;
        this.java = java;
        this.math = math;
    }

    @Override
    public int compareTo(Student other) {
        return this.math - other.math ;
    }

    @Override
    public String toString() {
        return name+" m:"+math+"  j:"+java ;
    }
}
