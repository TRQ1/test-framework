package test;

public class targetClass {
    public String reflectionVariable;

    public targetClass() {
    }

    public targetClass(String val) {
        this.reflectionVariable = val;
    }

    public void debugLog(String val) {
        System.out.println("=== [DEBUG] " + val);
    }

    public void errorLog(String val) {
        System.out.println("=== [ERROR] " + val);
    }

    public void warnLog(String val) {
        System.out.println("=== [WARNING] " + val);
    }
}
