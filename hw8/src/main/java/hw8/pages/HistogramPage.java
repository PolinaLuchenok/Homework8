package hw8.pages;

import org.openqa.selenium.By;

public class HistogramPage {
	private By histogram = By.xpath("//histogram[@class='h-100']");
	private By attribute = By.xpath("//app-property-select-control//div[@class='deltix-autocomplete']");
	private By interval = By.xpath("//app-intervals-count-control//div[@class='deltix-autocomplete']");
}
