import java.util.Stack;

public class validateBrackets {
	public static void main(String[] args) throws Exception {
		System.out.println(openCloseValidate("[{()}]"));//true
	}
	/**
	 * This method well return true if all {}  () []are equal and false if not equal
	 * @param str 
	 * @return true if all {} () [] are equal and false if not equal
	 */
	public static boolean openCloseValidate(String str) throws Exception{
		Stack<Character> openClosePar = new Stack<Character>();
    	  if(str != null || str == "") {
  			for (int i = 0; i < str.length(); i++)
  			{
  				if (str.charAt(i) == '{' )
  					openClosePar.push(str.charAt(i));
  				else if (str.charAt(i) == '}' )
  				{
  					if (!openClosePar.empty() && openClosePar.peek() == '{' )
  						openClosePar.pop();
  					else
  						return false;
  				}
  				else if(str.charAt(i) == '[' )
  					openClosePar.push(str.charAt(i));
  				else if( str.charAt(i) == ']')
  				{
  					if (!openClosePar.empty() && openClosePar.peek() == '[')
  						openClosePar.pop();
  					else
  						return false;
  				}
  				else if(str.charAt(i) == '(' )
  					openClosePar.push(str.charAt(i));
  				else if (str.charAt(i) == ')' )
  				{
  					if (!openClosePar.empty() && openClosePar.peek() == '(')
  						openClosePar.pop();
  					else
  						return false;
  				}
  			}
  			if (openClosePar.empty())
  				return true;
  			else
  				return false;
  		}
  		else {
  			return false;
  		}
	}//End of openCloseValidate method
}// End of class validateBrackets
