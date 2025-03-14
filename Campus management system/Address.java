public class Address{
    String country;
    String city;
     Address(String city,String country){
     this.city=city;
     this.country=country;
     }  
     void display(){
        System.out.println("City :"+city);
        System.out.println("Country :"+country);
     } 
    
}
