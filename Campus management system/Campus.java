class Campus {
    String directName;
    Department depart;
    Address address;

    Campus(String directName) {
        this.directName = directName;
        depart = new Department("CS Department", new Person("Shahid", 10234), new int[10]);
        address = new Address("Lahore", "Pakistan");
    }
    void display() {
        System.out.println("Director Name: " + directName);
        depart.display();
        address.display();
    }
}

