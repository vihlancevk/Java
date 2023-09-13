package stepik.JavaBasicCourse.Module4Part1.Step10;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();

        if (stackTraceElements.length < 3)
            return null;
        else
            return stackTraceElements[2].getClassName() + '#' + stackTraceElements[2].getMethodName();
    }
}
