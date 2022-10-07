package DataAbstraction;

public interface CentralGovernment {
           public void numberPlate();
           public void plateFont();
           public void plateColour();
           default void noOfLetter() {
        	   System.out.println("10 letters");
           }
}
