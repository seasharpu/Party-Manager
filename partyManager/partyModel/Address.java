/*
Alexander Zetterström
M11P1163
MPP(valbar kurs)
*/
package partyModel;

public class Address {
   /* Declare instance variables for street, city, zip code as String-objects
      and country by using the enum Countries
    */


    private String street;

    public String getStreet(){
        return this.street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    private String city;

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    private String zipCode;

    public String getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    private Countries countries;

    public Enum getCountries(){
        return countries;
    }

    public void setCountries(Countries country){
        countries = country;
    }

    public Address(){
        this(null, null, null, null);
    }


  /* Write a default constructor (with no parameters) that gives default values for instance variables.
     Set default values for instance variables by calling the other constructor
     below using the this reserved word and:
     - Alternative 1: with arguments that are default values
       of your choice that will inform a user that this value isn't really set.
     - Alternative 2: Use null for all arguments and call the constructor below and handle that there.
   */

    public Address(String street, String city, String zipCode, Countries country){
        if(street.equals("")){
            this.street = "defaultStreetName";
        }else{
            this.street = street;
        }

        if(city.equals("")){
            this.city = "defaultCityName";
        }else{
            this.city = city;
        }

        if(zipCode.equals("")){
            this.zipCode = "defaultZipCode";
        }else{
            this.zipCode = zipCode;
        }

        if(country.equals("")){
            this.countries = Countries.Unknown;
        }else{
            this.countries = country;
        }
    }

  /* Write a constructor with parameters for all instance variables
     given above. Set instance variables to values from parameters.

     Check that the values for the parameters street, zipCode and city
     isn't empty strings or null before assigning the values to the
     corresponding instance variables.

     If any value is empty or null assign a default value of your choice
     that will inform a user that this value isn't really set.

     If the parameter country is null set this to Countries.Unknown
   */


  /* Implement get- and set-methods for all instance variables.
     Remember to check parameters in set-methods with the same
     rules as in the constructor above.
   */

    public String toString(){
        return " " + street + " " + city + " " +  countries;
    }


  /* Write a toString method to return a String-object made of the address details,
     formatted as one line (this will be shown in the window under "Guest Register" ).
   */

}
