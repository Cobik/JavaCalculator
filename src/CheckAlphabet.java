public class CheckAlphabet {


    /**
     * check if input variable is int or not by using try catch
     */

    public  boolean isInt(String s)
    {
        try{
            int i=Integer.parseInt(s);
            return true;

        }catch(NumberFormatException er){
            return false;
        }
    }

    /**
     * check if two numbers are Arabic and return boolean value
     *
     */
    public boolean Arabic(String[] s)
    {
        if(isInt(s[0]) && isInt(s[2]))
            return true;

        return false;

    }

    /**
     * check if argument is invalid and return boolean value
     */

    public boolean Error_In_Arguments(String [] expressionArray){
        if((!isInt(expressionArray[0]) && isInt(expressionArray[2])) || (isInt(expressionArray[0]) && !isInt(expressionArray[2])))
            return true;
        else
         return false;
    }

}
