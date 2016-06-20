package ErrorHandling;

public class AlreadyCapitalizedException extends Exception {
	@Override   public String toString() {
		return "@@@ Input has already been capitalized @@@";
	}
}
