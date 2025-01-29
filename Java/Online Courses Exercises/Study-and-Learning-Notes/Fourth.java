public class Fourth {

  //creating METHODS
  
    public static void main(String[] args) { 
        greetUser("Kaue", "Berto");
        String message = greetUser1("KAUE", "BERTO");
        System.out.println(message);

    } 
    
    public static void greetUser(String firstName, String lastName) {  //We can add multiple parameters sine we separe them with comma ','   
         System.out.println("Hello " + firstName + " " + lastName);
     }

     public static String greetUser1(String firstName, String lastName) { //We can also return the value of a String/Int/etc. method following this way
        return "Hello " + firstName + " " + lastName;
     }

    }

    
