
public class oose_6a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class compoent
{
	abstract void op();
}

class Question {
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	   public void print() {
	      System.out.println(description);
	   }      
	}