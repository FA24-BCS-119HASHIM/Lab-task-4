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

