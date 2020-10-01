import java.util.Scanner;

/**
 *This program allows the user to figure out the type of animal they input
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //gives user first question
    System.out.println("Does the animal have feathers?");
    String feathers = input.nextLine();

    //if the animal has feathers
    if(feathers.equals("yes")){
      //asks if animal swims
      System.out.println("Does the animal swim?");
      String featherSwimmer = input.nextLine();
      //tells you what animal ou have if it swims or not
      if(featherSwimmer.equals("yes")){
        System.out.println("This is a duck");
      }else {
        System.out.println("This is a hen");
      }
    }

    //if the animal doesnt have feathers
    if(feathers.equals("no")){
      //asks if animal has legs
      System.out.println("Does the animal have legs?");
      String noFeatherLegs = input.nextLine();
      //te;;s user what animal you have if it has legs or not
      if(noFeatherLegs.equals("yes")){
        System.out.println("This is a lizard");
      }else {
        System.out.println("This is a snake");
      }
    }
    
  }
}
