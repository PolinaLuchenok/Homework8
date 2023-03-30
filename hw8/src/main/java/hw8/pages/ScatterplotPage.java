package hw8.pages;

import org.openqa.selenium.By;

public class ScatterplotPage {
	private By diagram = By.xpath("//scatter-plot");
	private By attributeX = By.xpath("//div[text()='X Attribute']/..//div[@class='deltix-autocomplete']");
	private By attributeY = By.xpath("//div[text()='Y Attribute']/..//div[@class='deltix-autocomplete']");
	private By interval = By.xpath("//app-intervals-count-control//div[@class='deltix-autocomplete']");
}
