import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        double eachPay=0, eachTip=0,totalTip=0,totalToPay=0;
        String and = "&&&&&&&&&&&&&&&&&&&", numOf="";


        String splitNoSplit=s.next();
        int numberOfPeople = s.nextInt();
        double chequeAmt = s.nextDouble();
        String serviceQuality = s.next() ;

        if (numberOfPeople >0){
            numOf=and.substring(0,numberOfPeople);
        }

        if (serviceQuality.equals("Poor")){
            totalTip = chequeAmt *0.05;
        } else if (serviceQuality.equals("Fair")){
            totalTip = chequeAmt *0.1;
        }else if (serviceQuality.equals("Good")){
            totalTip = chequeAmt *0.15;
        }else if (serviceQuality.equals("Great")){
            totalTip = chequeAmt *0.20;
        }else if (serviceQuality.equals("Excellent")){
            totalTip = chequeAmt *0.25;
        }

        totalToPay =  chequeAmt + totalTip;

        if (splitNoSplit.equals("Yes")){
            eachPay = totalToPay/numberOfPeople;
            eachTip = totalTip/numberOfPeople;
        }else if (splitNoSplit.equals("No")){
            eachPay =0;
            eachTip =0;
        }


        System.out.println("Number of people entered: "+numOf);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+eachPay);
        System.out.println("Tip per person: "+ eachTip);

    }
}
    /*
    Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

    > Poor = 5%
    > Fair = 10%
    > Good = 15%
    > Great = 20%
    > Excellent = 25%

    The program should display the following information based on the user input:

    Split or No split (Yes or No)
    Number of people entered: (number) (each person = & in output)
    Check amount: (number)
    Service Quality: (String)
    Total to pay:
    Total tip:
    Total per person:
    Tip per person:

    ```
    Example

    Input:
    Yes
    4
    476.0
    Excellent

    Output:
    Number of people entered: &&&&
    Total to pay: 595.0
    Total tip: 119.0
    Total per person: 148.75
    Tip per person: 29.75
    ```
     */