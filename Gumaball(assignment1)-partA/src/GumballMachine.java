public class GumballMachine
{
    private final int machine;
    int sum = 0,total=0;
    int mach1 = 0;
    private int num_gumballs;
    private boolean has_quarter;
    int machinetype;
    public GumballMachine( int size, int machinetype, int machine)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.machinetype = machinetype;
        this.machine = machine;
    }

    public void insertQuarter(int coin) {
        if (machinetype == 25 && machine ==0) {
            //  mach1 = mach1 + coin;
//            if (coin == 25)
//            {
//                System.out.println();
//            }
//           else
            checkmachine1(coin);

        }
        else if ( machinetype == 50 && machine==0) {
            checkmachine2(coin);
        }
        else if( machinetype == 50 && machine==1) {
            checkmachine3(coin);
        }
    }
    public void checkmachine1 (int coin){
        if (coin == 25) {
            this.has_quarter = true;
        } else{
            this.has_quarter = false;
        }
    }


    public void checkmachine2(int coin) {
        if (coin == 25) {
            sum = sum + coin;
            if (sum == 50) {
                this.has_quarter = true;
                sum = 0;
            } else
                this.has_quarter = false;
        }
        else {
            System.out.println("The system cannot accept other than the quarters");
            sum=0;
        }
    }

    public void checkmachine3 (int coin) {
        if (coin == 25 || coin == 10 || coin == 5) {
            total = total + coin;
            if (total == 50) {
                this.has_quarter = true;
                total=0;
            } else
                this.has_quarter = false;
        }
        else{
            System.out.println("The system cannot accept other than quarter, nickels and dimes");
            total=0;
        }
    }


    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
               this.num_gumballs-- ;
                System.out.println(num_gumballs);
                this.has_quarter = false;
                sum =0;
                total=0;
                System.out.println( "Thanks for your amount.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert right amount" ) ;
        }
    }
}