package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class testReflection {

    static void printMethods(Object object) {
        System.out.println("printLog");

        Method[] methodList = object.getClass().getMethods();
        for (Method method : methodList) {
            System.out.println(" : " + method.getName());
        }
    }

    public static void main(String[] args) {

    }
}
