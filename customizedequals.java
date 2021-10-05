public class customizedequals {
    public static void main(String[] args) {
        student s1 = new student("durga ", 101); //creating s1 object
        student s2 = new student("ravi ", 102);  //creating s2 objet
       student s3 = new student("durga ", 101);  // creating s3 object
        student s4 = s1;                         //s1 and s4 are same object
       System.out.println(s1.equals(s2));        // s2 calling equalsmethod on s1
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        //System.out.println(s1.equals());
    }
}
class student {
    String name;                      //student object were created
    int rollno;
    student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public boolean equals(Object  obj) {       //were equals(s2)  on s1
        String name1 = name;
        int rollno1 = rollno;
        System.out.println(name);
        System.out.println(name1);
        student s = (student)obj;              //typecasting s2 object as student type
        String name2 = s.name;
        System.out.println(s.name);
        int rollno2 = s.rollno;
        if (name1.equals(s.name) && rollno1 == rollno) {      //content comparison on string
            return true;
        } else {
            return false;
        }
    }
}

