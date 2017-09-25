package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
        public static boolean search(ArrayList<String> array, int e, String k) {
        System.out.println("inside search");
        if (array == null) return false;
        
        for (String elt : array) {
          if (elt.length == k || elt == e) return true;
        }
        return false;
      }

}
