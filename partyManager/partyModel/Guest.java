/*
Alexander Zetterström
M11P1163
MPP(valbar kurs)
*/
package partyModel;

public class Guest {
    /* Declare instance variables for first name and last name as String-objects and
       address as an Address-object.
     */



    private String firstName;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private String lastName;

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private Address address;

    public String getStreet(){
        return address.getStreet();
    }

    public void setStreet(String street){
        address.setStreet(street);
    }

    public String getCity(){
      return address.getCity();
    }

    public void setCity(String city){
        address.setCity(city);
    }

    public String getZipCode(){
        return address.getZipCode();
    }

    public void setZipCode(String zipCode){
        address.setZipCode(zipCode);
    }

    public Enum getCountries(){
        return address.getCountries();
    }

    public void setCountries(Countries country){
        address.setCountries(country);
    }

    public Guest(){
        this(null, null, null);
    }

    /* Write a default constructor (no parameters) that gives default values for
       instance variables and creates the Address-object using
       the default constructor for class Address.
       Use default values for first name and last name of your choice
       that will inform a user that this value isn't really set.

       You can handle this in this constructor or call
       the constructor below with null for all values and handle that there.
     */



    /* Write a constructor with parameters for all instance variables
       given above where the address is a reference to an Address-object
       and first name and last name are of type String.

       Check that the values for the parameters for first name and last name
       isn't empty strings or null before assigning the values to the corresponding
       instance variables. If any value is empty or null assign a default value of your choice
       that will inform a user that this value isn't really set.

       If the parameter for the Address-object is null create an Address-object
       by using the default constructor for class Address.
     */

    public Guest(String firstName, String lastName, Address address){

        if(firstName.equals("")){
            this.firstName = "defaultFirstName";
        }else{
            this.firstName = firstName;
        }

        if(lastName.equals("")){
            this.lastName = "defaultLastName";
        }else{
            this.lastName = lastName;
        }

        if(address.equals("")){
            address = new Address();
        }else{
        this.address = address;
        }


    }

    public Guest(String firstName, String lastName, String street, String city, String zipCode, Countries country ){

        if(firstName.equals("")){
            this.firstName = "defaultFirstName";
        }else{
            this.firstName = firstName;
        }

        if(lastName.equals("")){
            this.lastName = "defaultLastName";
        }else{
            this.lastName = lastName;
        }


        this.address = new Address(street, city, zipCode, country);
    }

    /* Write a constructor with parameters for all instance variables
       given above and all instance variables for the address.
       Create the Address-object with the values given in the parameters.
       Let the Address class take care of assigning default values if any
       parameters for this object is an empty string or null.
   */

    /* Implement get- and set-methods for all instance variables,
       including variables matching the instance variables of
       the Address-object (those call getters and setters in the Address-object).

       Remember to check parameters in set-methods with the same
       rules as in the constructor above.
     */


    public String toString(){
        return firstName + " " + " " + lastName + address.toString() + " ";
    }
    /* Write a toString method to return a String made of first name and
       family name and the address (by calling the toString method of the Address-object)
       formatted in one line (this will be shown in the window under "Guest Register" ).
     */
}
