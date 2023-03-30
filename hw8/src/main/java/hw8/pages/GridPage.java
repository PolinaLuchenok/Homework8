package hw8.pages;

import org.openqa.selenium.By;

public class GridPage {
	private By grid = By.xpath("//div[@role='grid']");
	private By gridCell = By.xpath("//div[@role='gridcell']");
	private By linesElement = By.xpath("//div[@class='chart-settings mr-1']");
}
