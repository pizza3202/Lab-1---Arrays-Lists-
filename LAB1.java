package edu.neu.mgen;

import java.util.ArrayList;

public abstract class LAB1 {
    public static void main (String [] args){
        System.out.println("part 1 - Array");
        int [] x = {11,3,5,77,9};
        int [] y = {2,44,66,8,100};
        int [] z = new int[5];
        for (int i=0; i<x.length;i++){
            z[i]=Math.max(x[i], y[i]);
        }

        System.out.print("Array x = { ");
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]);
            if (i<x.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array y = { ");
        for(int i=0; i<y.length; i++){
            System.out.print(y[i]);
            if (i<y.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = max(x,y) = { ");
        for(int i=0; i<z.length; i++){
            System.out.print(z[i]);
            if (i<z.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("***********************************************************");
        System.out.println("part 2 - ArrayList");
        ArrayList<String> names = new ArrayList<>();
        names.add("Amy");
        names.add("Betty");
        names.add("Crystal");
        names.add("Daisy");
        names.add("Emily");

        ArrayList<String> namesSwitched = new ArrayList<>();
        for(String name: names){
            if (name.length()>1) {
                String nameSwitched = name.substring(name.length()-1).toUpperCase() + name.substring(1, name.length()-1).toLowerCase() + name.substring(0, 1).toLowerCase();
                namesSwitched.add(nameSwitched);
            }else{
                namesSwitched.add(name.toUpperCase());
            }
        }
        System.out.print("Names={");
        for(int i=0; i<names.size();i++){
            System.out.print(names.get(i));
            if(i<names.size()-1){
                System.out.print(",");
            }
        }
        System.out.println("}");

        System.out.print("Names (switched)={");
        for(int i=0;i<namesSwitched.size();i++){
            System.out.print(namesSwitched.get(i));
            if(i<namesSwitched.size()-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
