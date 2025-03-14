/*public class Department {
    String name;
    Person Inch;
    int[] depart;
    Computer pc=new Computer(10234,"i-2345","108 GB","64-bit");
Department(String name,Person Inch,int[] num){
        this.name=name;
        Inch=new Person("Shahid", 10234);
        depart = new int[10]; 
        for (int i = 0; i<depart.length; i++) {
            depart[i] = i + 1; 
        }
}
void display(){
        pc.display();
        for (int i = 0; i<depart.length; i++) {
            System.out.println("Number at index " + i + ": " + depart[i]);
        }
}
}*/
class Department {
    String name;
    Person inch;
    int[] depart;
    Computer pc;

    Department(String name, Person inch, int[] num) {
        this.name = name;
        this.inch = inch;
        depart = new int[10];
        pc = new Computer(10234, "i-2345", "108 GB", "64-bit");
        for (int i = 0; i < depart.length; i++) {
            depart[i] = i + 1;
        }
    }

    void display() {
        System.out.println("Number of Departments: " + depart.length);
        System.out.println("Department Name: " + name);
        System.out.println("Incharge Name: " + inch.name);
        System.out.println("Incharge ID: " + inch.id);
        for (int i = 0; i < depart.length; i++) {
            System.out.println("Department number: " + depart[i]);
        }
        pc.display();
    }
}