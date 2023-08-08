public class Address {
    private String street;
    private String city;
    private String county;
    private String zipCode;

    public Address(String st, String cty, String cnty, String zip){
        this.street = st;
        this.city = cty;
        this.county = cnty;
        this.zipCode = zip;
    }

    public void getAddress(){
        System.out.println(
                "Street: " + street
                + "\nCity: " + city
                + "\nCounty: " + county
                + "\nZip Code: " + zipCode
        );
    }
}
