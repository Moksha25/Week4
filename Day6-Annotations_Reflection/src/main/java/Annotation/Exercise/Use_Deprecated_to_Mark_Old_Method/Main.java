package Annotation.Exercise.Use_Deprecated_to_Mark_Old_Method;

public class Main
{
    public static void main(String[] args)
    {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();
        api.newFeature();
    }
}
