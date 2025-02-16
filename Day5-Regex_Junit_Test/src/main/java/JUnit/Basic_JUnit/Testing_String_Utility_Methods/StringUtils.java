package JUnit.Basic_JUnit.Testing_String_Utility_Methods;

public class StringUtils
{
    public String reverse(String str)
    {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str)
    {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public String toUpperCase(String str)
    {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
