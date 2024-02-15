package testing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountValidation {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zigwheels.com/");
        driver.manage().window().maximize();

        LinkedHashMap<String, List<String>> bikeDetailsMap = new LinkedHashMap<>();

        WebElement newbike = driver.findElement(By.xpath("//a[contains(text(),'New Bikes')]"));
        Actions action = new Actions(driver);
        action.moveToElement(newbike).build().perform();
        Thread.sleep(1000);

        WebElement upcomingbike = driver.findElement(By.xpath("//span[contains(text(),'Upcoming Bikes')]"));
        upcomingbike.click();

        WebElement manufacturer = driver.findElement(By.xpath("//select[@id='makeId']"));
        Select select = new Select(manufacturer);
        select.selectByVisibleText("Honda");

        WebElement scroll = driver.findElement(By.xpath("//span[@data-track-label='view-more-models-button']"));
        WebElement viewmore = driver.findElement(By.xpath("//span[@class='zw-cmn-loadMore']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", viewmore);

        List<WebElement> bikenames = driver.findElements(By.xpath("//a[@data-track-label='model-name']"));
        List<WebElement> bikeprices = driver
                .findElements(By.xpath("//a[@data-track-label='model-name']/following-sibling::div[1]"));
        List<WebElement> bikelaunchdate = driver
                .findElements(By.xpath("//a[@data-track-label='model-name']/following-sibling::div[2]"));

        for (int i = 0; i < bikenames.size(); i++) {
            String bikename = bikenames.get(i).getText();
            String bikeprice = bikeprices.get(i).getText();
            String launchdate = bikelaunchdate.get(i).getText();

            // Convert bikeprice to a numeric value for comparison
            String price = bikeprice.replaceAll("[^\\d.]", "").replaceFirst("\\.(?=.*\\.)", "");
            double priceValue = Double.parseDouble(price);
            // Check if the price is less than 4 lakhs
            if (priceValue < 4) {
                // Create a list to store details
                List<String> detailsList = new ArrayList<>();
                detailsList.add(bikename);
                detailsList.add(bikeprice);
                detailsList.add(launchdate);

                // Use 'bikedetails' as the key and the list of details as the value
                String bikeDetailsKey = "bikedetails" + (i + 1);
                bikeDetailsMap.put(bikeDetailsKey, detailsList);
            }
        }

        // Print the HashMap
        for (String key : bikeDetailsMap.keySet()) {
            List<String> detailsList = bikeDetailsMap.get(key);
            System.out.println("\nBike Details: " + detailsList);
            System.out.println("------------------------");
        }

    }

}












private static void writeBikeDetailsToExcel(LinkedHashMap<String, List<String>> bikeDetailsMap, String fileName) {
        try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fileOut = new FileOutputStream(fileName)) {
            Sheet sheet = workbook.createSheet("Bike Details");

            int rowNum = 0;
            for (List<String> detailsList : bikeDetailsMap.values()) {
                Row row = sheet.createRow(rowNum++);
                int cellNum = 0;
                for (String detail : detailsList) {
                    Cell cell = row.createCell(cellNum++);
                    cell.setCellValue(detail);
                }
            }

            // Write the workbook content to the file
            workbook.write(fileOut);
            System.out.println("Bike details written to Excel file: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing Excel file: " + e.getMessage());
        }
    }