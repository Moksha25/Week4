package Annotation.Exercise.Use_Deprecated_to_Mark_Old_Method;

public class LegacyAPI
{
    @Deprecated
    public void oldFeature() {
        System.out.println("This is an old feature. Do not use it.");
    }

    public void newFeature() {
        System.out.println("This is the new and improved feature!");
    }
}
