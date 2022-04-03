package edu.upc.eetac.dsa;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Bean {

    private String name;
    private int size;

    public String getName() {
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize() {
        this.size = size;
    }

    public static void introspect(Class aClass) {
        // class name
        System.out.println("Structure of class " + aClass.getSimpleName() + ":");

        // properties
        for (Field field: aClass.getDeclaredFields()) {
            System.out.println("\tProperty: " + field.getName());
            System.out.println("\t\tType: " + field.getType().getSimpleName());
        }

        // methods and return types
        System.out.println("\nMethods of class " + aClass.getSimpleName() + ":");
        Method[] methods = aClass.getMethods();
        for (Method m: methods) {
            System.out.println("\t" + m.toString());
            System.out.println("\t\t" + m.getReturnType());
        }

    }

    public static void main( String[] args ) {
        introspect(Bean.class);
    }

}
