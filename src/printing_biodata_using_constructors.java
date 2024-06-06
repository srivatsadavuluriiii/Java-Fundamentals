//java program to creare a biodata using constructors and arguments 
// Tue June 04 2024

class biodata {
    String name;
    String id;
    String address;

    public biodata() {
        this.name = "";
        this.id = "";
        this.address = "";

    }

    public biodata(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;

    }
}


public class printing_biodata_using_constructors {
    public static void main(String[] args) {
        biodata object = new biodata();
        object.name = "Srivatsa Davuluri Samavedam";
        object.id = "22BEC0582";
        object.address = "Greater Noida, Uttar Pradesh, India";

        System.out.println("Name : " + object.name + ", " + "ID : " + object.id + ", " + "Address : " + object.address);
    }
}
