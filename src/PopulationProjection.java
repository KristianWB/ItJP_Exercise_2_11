import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        /* The task will be split in three parts
        1) Prompting the user to enter number of years
        2) Calculating all the differing variables
        3) Printing out the results
        */

        // 1) Prompting user for years and storing it in a variable
        System.out.print(
                "Please enter number of years: "
        );
        int numYears = input.nextInt();

        // 2) Calculating variables
        double currentPopulation = 312032486; // Declaring and assigning current population
        double birthPrYear = ((24. * 60 * 60) / 7.0) * 365; // Declaring and assigning birthrate a year by calculation
        System.out.print("yearly births: " + birthPrYear +"\n");
        double deathPrYear =  ((24. * 60 * 60) / 13.) * 365; // Declaring and assigning deaths a year by calculation
        double immigrantsPrYear = ((24. * 60 * 60) / 45.) * 365; // Declaring and assigning immigration a year by calculation
        double sumOfAllFears = birthPrYear - deathPrYear + immigrantsPrYear; // Declaring and assigning the sum of all fears

        double totalNumPop = currentPopulation + (sumOfAllFears * numYears); // Declaring and assigning the population number


        // 3) Printing out the results
        System.out.printf(
                "The population in the year " + numYears + " is: " +
                        "%5.2f",totalNumPop
        );

    }
}
