/*
Alexander Zetterström
M11P1163
MPP(valbar kurs)
*/
package partyModel;

import javax.swing.*;

public class GuestManager {
  /* Keep ONLY the following instance variables for the class:
     - number of guests currently stored in the list/array
       (not the total possible number of guests (use .length for this))
     - one array for the list with guests where
       the guests are objects of class Guest
  */
  private int nbrOfGuests = 0;
  private Guest[] guestList;

  /* Create a constructor with one parameter which is
     the max number of elements (guests) in the list/array.
     Create the array with the max number of elements.
     Check that the max number of Guests is larger than 0.
     If max number of guests is not larger than 0 ask the user to give a new value
     until you get a value that is larger than 0.
   */
  public GuestManager(int maxNbrOfGuests){
    System.out.println("Called constructor for GuestManager"); //You can remove this line if you want to
    //Add more code according to description above

    guestList = new Guest[maxNbrOfGuests];
  }

  /* A method that returns the number of guests stored in
     the guest list.
   */

  public int getNbrOfGuests(){
    return nbrOfGuests;
  }

  public void addGuest(String firstName, String lastName, String street, String city, String zipCode, Countries country){
    Guest newGuest = new Guest(firstName, lastName, street, city, zipCode, country);

    if(nbrOfGuests + 1 > guestList.length){
      increaseGuestList();
    }

    guestList[nbrOfGuests] = newGuest;
    nbrOfGuests++;

  }

  public void printArray(Guest[] array){
    System.out.println("[" );
    for(int i = 0; i < array.length; i++){
      if(array[i] != null){
        System.out.println(array[i].toString());
      }
      else{
        System.out.println(array[i]);
      }
    }
    System.out.println("]");
  }
  /* Create a method to add a guest to the list with all the parameters
     matching instance variables of Guest and Address.
     In the method create a new Guest-object and let classes Guest and Address
     take care of issues with values of the parameters.
     Add the new Guest-object to the array at the first empty element (here is where you
     use the instance variable for number of guests stored in the list). If there are no
     more empty elements call a private method in GuestManager to increase the size
     of the array and then add the new Guest-object. Do not forget to update the value
     of the instance variable for number of guests in the list.
   */
public void deleteGuest(int index){
  for(int i = 0; i < guestList.length; i++){
    if(i == index){
      guestList[i] = null;
      moveElementsToLeft(index);
      printArray(guestList);
    }
  }
  nbrOfGuests--;
}
  /* Create method to delete a guest by giving the index in the array
     for the object (guest) to delete as a parameter to the method.
     This method should call the private method moveElementsToleft to remove
     the empty element in between other objects (may not be necessary
     if the guest removed was the last guest in the list).
     Remember to update the value of the instance variable for
     number of guests in the list.
   */


  private void moveElementsToLeft(int index){
        /* Add code to remove empty element places that
           is not att the end of the array. Start at
           the parameter index that is the empty element
           whose gap we want to fill.
         */
    for(int i = index; i < guestList.length - 1 ; i++){

      guestList[i] = guestList[i + 1];
      guestList[i + 1] = null;
    }
  }

  private void increaseGuestList(){
    /* Write code that creates a new array of Guest-objects
       that is 10 elements larger that the current array instance variable .

       Copy the current array to the larger array and after that is done
       point the instance variable to the new array.

       Do not take a shot cut by using class Array from the Java-library.
     */
    Guest[] temporaryGuestList = new Guest[nbrOfGuests + 10];

    for(int i = 0; i < guestList.length; i++){
      temporaryGuestList[i] = guestList[i];
      printArray(temporaryGuestList);
    }
    guestList = temporaryGuestList;
  }

  /* A method that returns the Guest-object at the given
     index n the parameter.
   */
  public Guest getGuestAt(int index){
    /* Add code to check that the parameter index
       has a value within the range of the array.
       If index is not in valid range return null.
       Yes, some checks are done in the Controller-object
       in this program but we do not want this class to depend
       on other classes for this, so sometimes we write redundant
       error handling in different ways to have more robust classes or code.
     */
    if(index < guestList.length || index > 0){
      return guestList[index];
    }
    return null;
  }

  public String[] getInfoStrings() {
    /* Write code that returns an array of strings where each element
       represents information about one guest in the list by calling every
       Guest-object's toString method.

       The number of elements in the array should be equal to the
       number of guests currently stored in the list.
       (no strings should be created for empty places at the end of the array st)
    */
    String[] infoStrings = new String[nbrOfGuests];
    int currentIndex = 0;
    for(int i = 0; i < guestList.length; i++){
      if(guestList[i] != null){
        infoStrings[currentIndex++] = guestList[i].toString();
      }
    }
    // String[] infoStrings = {"Person 1", "Person 2", "Person 3"}; //Change this to construct an array of String-objects as above

    return infoStrings;
  }

}
