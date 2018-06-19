public class Main {

    public static void main(String[] args) {
        System.out.println("//////////////////////////////");

        ///// Pass parameters (number_of_balls, 25, 0) for the first gumball machine
        ///// Pass parameters (number_of_balls, 50, 0) for the second gumball machine
        ///// Pass parameters (number_of_balls, 50, 1) for the third gumball machine

        GumballMachine gumball = new GumballMachine(100,50,1);

        //Pass parameters and check for the third machine

        gumball.insertQuarter(25);
        gumball.insertQuarter(25);
        gumball.turnCrank();
        gumball.insertQuarter(25);
        gumball.insertQuarter(25);
        gumball.turnCrank();

        //Pass parameters and check for the first machine

//        gumball.insertQuarter(25);
//        gumball.turnCrank();
//        gumball.insertQuarter(25);
//        gumball.turnCrank();

        // Pass parameters and check for second machine
//        gumball.insertQuarter(25);
//        gumball.insertQuarter(25);
//        gumball.turnCrank();
//        gumball.insertQuarter(25);
//        gumball.insertQuarter(25);
//        gumball.turnCrank();
    }
}