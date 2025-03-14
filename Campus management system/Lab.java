/*public class lab {
    String name;
    Person Incharge;
    int[] num;
lab() {
    this.name = "Computer Lab"; 
    Incharge = new Person("Hash", 1234); 
    num = new int[50]; 

    for (int i = 0; i < num.length; i++) {
        num[i] = i + 1; 
    }
}

// Display function to print the details
void display() {
    System.out.println("Lab Name: " + name);
    System.out.println("Incharge Name: " + Incharge.name);
    System.out.println("Incharge ID: " + Incharge.id);
    System.out.println("PC number:");
    for (int i = 0; i < 50; i++) {
        System.out.println("Number at index " + i + ": " + num[i]);
    }
}
}*/
class Lab {
    String name;
    Person incharge;
    int[] num;

    Lab() {
        this.name = "Computer Lab";
        incharge = new Person("Hash", 1234);
        num = new int[50];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
    }

    void display() {
        System.out.println("Lab Name: " + name);
        System.out.println("Incharge Name: " + incharge.name);
        System.out.println("Incharge ID: " + incharge.id);
        for (int i = 0; i < num.length; i++) {
            System.out.println("PC number: " + num[i]);
        }
    }
}

