package cse360assignment02;

/**
 * https://github.com/CrPasc-Github/-Assignment-01.-Version-Control
 * 
 * <h1> Adding Machine <h1>
 * This assignment is designed to practice using a version control system
 * 
 */
public class AddingMachine {
  private int total;
  private String history;
  
  /** 
   * constructor
   */
  public AddingMachine () {
    history = "0";
    total = 0;  // not needed - included for clarity
  }
  
  /** This is the getTotal method
   * 
   *  @return int This returns the current total
   */
  public int getTotal () {
    return 0;
  }
  
  /** This is the add method that adds the parameter to the total variable
   * 
   * @param value used
   */
  public void add (int value) {
	  total = total + value;
	  history += " + " + value;
  }

  /** 
   * This is the subtract method that subtracts the parameter from the total variable
   *  
   * @param value used
   */
  public void subtract (int value) {
	  total = value;
	  history += " - " + value;
  }

  /** 
   * A history of the transactions must be kept 
   * to be returned by the toString method
   * 
   * @return string This returns the history
   */
  public String toString () {
    return history;
  }
  
  /**
   * The clear method should clear the "memory"
   */
  public void clear() {
	  total = 0;
	  history = "0";
  } 
}