package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
 By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
 By tops = By.linkText("Tops");
 By clickOnJackets= By.linkText("Jackets");
 By selectByFilterProductName = By.xpath("//div[2]//div[3]//select[1]");
 By selectByFilterPrice = By.xpath("//select[@id='sorter']");
 //Mouse Hover on Women Menu
public void mouseHoverOnWomen(){
     mouseHoverToElement(womenMenu);

 }
 //Mouse Hover on Tops
 public void mouseHoverOnTops(){
     mouseHoverToElement(tops);
 }
 //Click on Jackets
 public void clickOnJacket(){
     clickOnElement(clickOnJackets);
 }
 //Select Sort By filter “Product Name”
 public void selectProductNameFromDropDownList(){

    selectByVisibleTextFromDropDown(selectByFilterProductName,"Product Name");
 }
 public void selectByFilterPrice(){
 selectByValueFromDropDown(selectByFilterPrice,"price");
 }
////Verify the products name display in alphabetical order
  }



