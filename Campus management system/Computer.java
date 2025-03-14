/*public class Computer {
    int id;
    String version;
    String Ram;
    String Disksize;
    lab Lab=new lab();

    Computer(int id,String version,String Ram,String Disksize){
        this.id=id;
        this.version=version;
        this.Ram=Ram;
        this.Disksize=Disksize;
}
    void display(){
        Lab.display();


        System.out.println("Id :"+id);
        System.out.println("Version :"+version);
        System.out.println("Ram"+Ram);
        System.out.println("Disk size :"+Disksize);
    }

}*/
public class Computer {
    int id;
    String version;
    String Ram;
    String Disksize;
    Lab lab;

    Computer(int id, String version, String Ram, String Disksize) {
        this.id = id;
        this.version = version;
        this.Ram = Ram;
        this.Disksize = Disksize;
        lab = new Lab();
    }

    void display() {
        lab.display();
        System.out.println("Id: " + id);
        System.out.println("Version: " + version);
        System.out.println("Ram: " + Ram);
        System.out.println("Disk size: " + Disksize);
    }
}