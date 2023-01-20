import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class StringPlay {
  
  public static void main(String[] args) {

        // 1. Create a String called myFavouriteArtist and initialize it to your favourite music artist.
    String myFavouriteArtist = "Eric Clapton";
        // 2. Print myFavouriteArtist.
    System.out.println(myFavouriteArtist);
        // 3. Create a variable called myFavouriteArtistLength and initialize it to the length of myFavouriteArtist.
        //    Ensure to use a method call to achieve this.
    int myFavouriteArtistLength = myFavouriteArtist.length();
        // 4. Print myFavouriteArtistLength.
    System.out.println(myFavouriteArtistLength);
        // 5. Create a String called myFavouriteArtistUpper that is equal to myFavouriteArtist except every character is uppercase.
        //    Ensure to use a method call to achieve this.
    String myFavouriteArtistUpper = myFavouriteArtist.toUpperCase();
        // 6. Print myFavouriteArtistUpper.
    System.out.println(myFavouriteArtistUpper);
        // 7. Create a String called myFavouriteArtistLower that is equal to myFavouriteArtist except every character is lowercase.
        //    Ensure to use a method call to achieve this.
    String myFavouriteArtistLower = myFavouriteArtist.toLowerCase();
        // 8. Print myFavouriteArtistLower.
    System.out.println(myFavouriteArtistLower);
        // 9. Create a variable called checkFor that is equal to “ift”.
    String checkFor = "ift";
        // 10. Create a variable called myFavouriteArtistContains that is equal to whether myFavouriteArtist contains checkFor or not.
        //     Ensure to use a method call to achieve this.
    boolean myFavouriteArtistContains = myFavouriteArtist.contains(checkFor);
        // 11. Print myFavouriteArtistContains.
    System.out.println(myFavouriteArtistContains);
        // 12. Create a variable called firstName and initialize it to your first name.
    String firstName = "Richard";
        // 13. Create a variable called lastName and initialize it to your last name.
    String lastName = "Guo";
        // 14. Create a variable called age and initialize it to your age.
    int age = 15;
        // 15. Declare a variable called myInfo.
    String myInfo;
        // 16. Initialize myInfo (note that the declaration and initialization are separate statements) to be equal to a String that
        //     contains a description that includes the variables firstName, lastName, age, and myFavouriteArtist.
        //     The format of the String should be, for example, as follows:
    myInfo = "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nFavourite Artist:" + myFavouriteArtist;
            /*  First name: Keanu
                Last name: Reeves
                Age: 58
                Favourite artist: Biggie Smalls
            */

        // 17. Print myInfo.
    System.out.println(myInfo);
        // 18. Create a String called stringToIntTest and initialize it to “16”.
    String stringToIntTest = "16";
        // 19. Create an int called stringToIntTestStore and initialize it to an integer representation of stringToIntTest.
        //     Ensure to use a method call to achieve this.
    int stringToIntTestScore = Integer.parseInt(stringToIntTest);
        // 20. Create a variable called intToStringTest and initialize it to a String representation of stringToIntTestStore.
        //     Ensure to use String concatenation to achieve this.
    String intToStringTest = "" + stringToIntTestScore;
    }
}
