package pages;

import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeekendResultsPage {
    public WebDriver driver = StepHooks.getDriver();

    private static final String RESULTS_IN_DOLLARS ="//*[@id=\"block_left\"]/div/table[1]/tbody/tr[4]/td/table[1]/tbody/tr[12]/td[2]/table/tbody/tr[1]/td/a";
    private static final String FILTER_BY_ALL_FUNDS="//*[@id=\"block_left\"]/div/table[1]/tbody/tr[4]/td/table[1]/tbody/tr[1]/td[5]/b/a";
    private static final String SUM_OF_MONEY_FROM_ALL_FUNDS="//*[@id=\"block_left\"]/div/table[1]/tbody/tr[4]/td/table[1]/tbody/tr[2]/td[5]";
    private static final String FIRST_MOVIE_FROM_LIST="//*[@id=\"block_left\"]/div/table[1]/tbody/tr[4]/td/table[1]/tbody/tr[2]/td[2]/a";

    public static String getResultsInDollars() {
        return RESULTS_IN_DOLLARS;
    }

    public static String getFilterByAllFunds() {
        return FILTER_BY_ALL_FUNDS;
    }

    public static String getFirstMovieFromList() {
        return FIRST_MOVIE_FROM_LIST;
    }


    public int parseIntFromAllFundsTopList(){
        String stringNumber = driver.findElement(By.xpath(SUM_OF_MONEY_FROM_ALL_FUNDS)).getText();
        String finalStringNumber="";
        for (int i = 0; i < stringNumber.length() - 10; i++) {
            if(stringNumber.charAt(i)==(' ')){
                continue;
            }else{
                finalStringNumber+=stringNumber.charAt(i);
            }
        }
        int result = Integer.parseInt(finalStringNumber);
        return result;
    }
}
