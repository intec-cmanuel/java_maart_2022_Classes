package be.intecbrussel;

public class TestingStaticAccesibility {
    public static int width = getHeight();

    public static int getHeight(){
        return 1;
    }

}
