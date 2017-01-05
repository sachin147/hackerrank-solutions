package hackerrankproj.algorithms.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringEscapeUtils;

public class BlacklistCharacters {

	public static boolean hasBlackListCharacters(CharSequence strString)
	{
	    boolean hasBlackListedChar = false;
	    String expression = "$+!*'(),\\{\\}|\\\\^\\[\\]`<>#%\";/?:&=";
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(strString);
	    if (matcher.matches()) {
	        hasBlackListedChar = true;
	    }


	    return hasBlackListedChar;
	}
	
	public static void main(String args[]) throws Exception {
		boolean result = false;
		result = hasBlackListCharacters("<img src = \"http://evil.com\">");
		System.out.println(result);
	}
}
