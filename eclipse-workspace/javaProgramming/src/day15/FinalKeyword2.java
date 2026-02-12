package day15;

// If we make a class final, we cannot extend it into a child class.
// If we make a method final, we cannot override it in a child class.

class Test1
{
    // If we do not want this method to be overridden in Test2 class,
    // we can declare it as final.
    void m()
    {
        System.out.println("This is method m from Test1 class");
    }
}

class Test2 extends Test1
{
    // If method m() in Test1 class is declared as final,
    // then overriding it here will cause a compilation error,
    // because a final method cannot be overridden.
    void m()
    {
        System.out.println("This is method m from Test2 class");
    }
}

public class FinalKeyword2 {

    public static void main(String[] args) {

    }

}
