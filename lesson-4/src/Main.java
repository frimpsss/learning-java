public class Main{
    public static void main(String[] args){
//        conditional statements

// if else
        int x = 25;
        if(x > 10 && x < 20) // between 10 and 20
            System.out.println("Hello");
        else
        System.out.println("Bye");


        // program to print max of 2 integers

        int a = 10;
        int b = 414;

        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }



//        tenary operator '?:'

        String result;
        result = b % 2 == 0 ? "even" : "false";




//        switch statement

        int n = 3000000;
        switch (n){
            case  4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Out of range");
        }


        String day = "Monday";
        String results;
        switch (day){
            case "Saturday", "Sunday":
                System.out.println("Weekend");
                break;
            case "Monday":
                System.out.println("1st day of the week");
                break;
            case "Friday":
                System.out.println("Ready for bolingo!!!");
                break;

            default:
                System.out.println("Boring ass 9-5 days");
        }

        //                this also works

       results = switch (day){
            case "Tuesday" ->  "r";
           default -> "test";
        };

        System.out.println(results);


//        if you want to use a colon youll use the 'yield' keyword

        results = switch (day){
            case "Monday": yield "Sleep";
            default: yield "Work hard";
        };

        System.out.println(results);

    }
}