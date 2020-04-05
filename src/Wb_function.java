/**
 * 
 */
package com.utility;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Imtiaz
 * initializing  the wevdriver 
 * All of my  Generic method as typebyxpath(),clickbyxpath()...............
 * 
 *
 */
public class Wb_function {
	public static WebDriver driver = null;
	public static Logger application_log = Logger.getLogger("devpinoyLogger");
	public void typebyxpath(String locators,String values) {
		try {
			driver.findElement(By.xpath(locators)).clear();
			driver.findElement(By.xpath(locators)).sendKeys(values);
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void clickbyxpath(String locators) {
		try {
			driver.findElement(By.xpath(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}

	public void typebyname(String locators,String values) {
		try {
			driver.findElement(By.name(locators)).clear();
			driver.findElement(By.name(locators)).sendKeys(values);
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void clickbyname(String locators) {
		try {
			driver.findElement(By.name(locators)).click();
			
		}catch(Exception e) {
			
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void typebyid(String locators,String values) {
		try {
			driver.findElement(By.id(locators)).clear();
			driver.findElement(By.id(locators)).sendKeys(values);
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void clickbyid(String locators) {
		try {
			driver.findElement(By.id(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}

	public void typebycss(String locators,String values) {
		try {
			driver.findElement(By.cssSelector(locators)).clear();
			driver.findElement(By.cssSelector(locators)).sendKeys(values);
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void clickbycss(String locators) {
		try {
			driver.findElement(By.cssSelector(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}

	public void typebyclass(String locators,String values) {
		try {
			driver.findElement(By.className(locators)).clear();
			driver.findElement(By.className(locators)).sendKeys(values);
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	public void clickbyclass(String locators) {
		try {
			driver.findElement(By.className(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}

/*ublic void typebylinkText(String locators) {
		try {
			driver.findElement(By.linkText(locators)).click();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}*/
	public void clickbylinkText(String locators) {
		try {
			driver.findElement(By.linkText(locators)).click();
		
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}

	/*public void typebypartialText(String locators) {
		try {
			driver.findElement(By.partialLinkText(locators)).click();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}*/
	public void clickbypartialText(String locators) {
		try {
			driver.findElement(By.partialLinkText(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	/*public void typebytag(String locators) {
		try {
			driver.findElement(By.tagName(locators)).click();
			}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}*/
	public void clickbytag(String locators) {
		try {
			driver.findElement(By.tagName(locators)).click();
			
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		
	}
	//This method for delete for cookies
	public  void cookies() {
		try {
			driver.manage().deleteAllCookies();
				}
		catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	//This method for window maximize
		public  void maximize() {
			try {
				driver.manage().window().maximize();

					}
			catch(Exception e) {
				application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
			}
		}
	
	//This method for Implicit wait 
	public  void waitTillPageLoad(long i) {
		try {
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
		}
		catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	//This method for Explicit wait ( for condition....elementToBeClickable)
	public void waitForElement(String locators,long seconds) {
        try {
        	WebElement element = driver.findElement(By.xpath(locators));
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
        catch(Exception e) {
        	application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	//This method for Explicit wait ( for condition....visibilityOf)
		public  void waitTillElementFound(String locators, long seconds) {
		try {
			WebElement ElementTobeFound  = driver.findElement(By.xpath(locators));
			WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
		}
		//This method for navigate forward
		public  void navigate_forward() {
			try {
			driver.navigate().forward();
			}catch(Exception e) {
				application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
			}
		}
		//This method for navigate back
			public void navigate_back() {
				try {
			driver.navigate().back();
			}catch(Exception e) {
				application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
			}
			}
//This method for navigate refresh
			public void refresh() {
				try {
			driver.navigate().refresh();
			}catch(Exception e) {
				application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
			}
			}
			//This method for clear Text box
			public static void clearTextField(String locators) {
				try {
					WebElement element = driver.findElement(By.xpath(locators));
				element.clear();

				}catch(Exception e) {
					application_log.debug("Issued with:" + e.getMessage());
					//System.out.println(e.getMessage());
				}
			}
			//This method for Element enable or not
			public static boolean enabneElement(WebElement en, String locators) {
				boolean resultEbable = false;
			
				try {
					WebElement element = driver.findElement(By.xpath(locators));
					resultEbable=element.isEnabled();
				if(resultEbable) {
				element.click();
				}
               } catch (Exception e) {
            	   application_log.info("Element is not enable");
            	   //System.out.println("Element is not enable");
            	   application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
				
				}
				   return resultEbable ;
				}
			//This method is  for check WebElement  Displayed or not
			public static boolean displayElement(WebElement ds, String locators) {
				boolean resultDisplay = false;
				try {
					WebElement element  = driver.findElement(By.xpath(locators));
					resultDisplay=element.isDisplayed();
				     if(resultDisplay) {
				     element.click();
				      }
               } catch (Exception e) {
            	   application_log.debug("Issued with:" + e.getMessage());
            	// System.out.println(e.getMessage());
                  }
				   return resultDisplay;
				}
				////This method is  for check WebElement  Selected  or not
			public static boolean selectElement(WebElement sl, String locators) {
				boolean resultSelect = false;
				try {
					WebElement element = driver.findElement(By.xpath(locators));
					resultSelect =element.isSelected();
				if(resultSelect) {
				element.click();
				}
				//return resultSelect;
               } catch (Exception e) {
            	   application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
				
				}
				return resultSelect;
				}
			
			//This method for checkbox Checking(by default check or not )  
			public void checkbox_Checking(String locators) {
				try {
					WebElement checkbox = driver.findElement(By.xpath(locators));
				    boolean checkstatus = selectElement(checkbox, locators);
				    if (checkstatus) {
				     System.out.println("Checkbox is already checked");
				                    } 
				    else {
				    checkbox.click();
				     System.out.println("other wise click the check box");
				           }
				}catch(Exception e) {
					application_log.debug("Issued with:" + e.getMessage());
					//System.out.println(e.getMessage());
				            }
				}
			/*
			// This method for checkbox unchecking(if default select then do unselect if need) 
			public void checkbox_Unchecking(String locators) {
				try {
					WebElement checkbox = driver.findElement(By.xpath(locators));
			        boolean checkstatus = checkbox.isSelected();
			        if (checkstatus) {
			        checkbox.click();
			        System.out.println("Checkbox is unchecked");
			        } else {
			         System.out.println("Checkbox is already unchecked");
			       }
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			*/
			/*
			 * This method for radio button select if have in the page 
			 * multiple radio button. If have 2 radio button take method 2 parameter,
			 * if have 3 method take 3 parameters
			 */
			public void radioButtonByxpath(String locatorF, String locatorM) {
				try {
					boolean isSelectedGender = driver.findElement(By.xpath(locatorF)).isSelected();
					if(isSelectedGender) {
						driver.findElement(By.xpath(locatorM)).click();
					}
					else {
						driver.findElement(By.xpath(locatorF)).click();
					}
				}catch(Exception e) {
					application_log.debug("Issued with:" + e.getMessage());
					//System.out.println(e.getMessage());
				}
			}
			/*
			//This method for Radio button select
			public  void radiobutton_Select(String locators) {
				try {
					WebElement radio = driver.findElement(By.xpath(locators));
				boolean checkstatus = radio.isSelected();
				if (checkstatus) {
				System.out.println("RadioButton is already checked");
				} else {
				radio.click();
				System.out.println(" otherwise Select the Radiobutton");
				}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}
				*/
			/*
			//This method for Radio button Deselect 
			public  void radioButton_Deselect(String locators){
				try {
					WebElement radio = driver.findElement(By.xpath(locators));
				boolean checkstatus = radio.isSelected();
				if (checkstatus) {
				radio.click();
				System.out.println("Radio Button is deselected");
				} else {
				System.out.println("Radio Button was already Deselected");
				}
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}
				*/
			//This method for also radio button select if have multiple radio button
			public void radioButtonByname(String locator) {
			try {
			        List<WebElement> radio=driver.findElements(By.name(locator));
			        int radio_size=radio.size();
			        System.out.println("The size of radio button is:"+radio_size );
			        boolean  element=radio.get(0).isSelected();// first one is selected
			    if(element) {
			    	 radio.get(1).click();//if first one have default, then select second one
			         }
			    else if(element) {
			    	System.out.println("Otherwise select first radio button");
			    	radio.get(0).click();//otherwise select first one
			    }
			    else if(element) {
			    	radio.get(2).click();//otherwise select 3rd one 
			    }
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
					//System.out.println(e.getMessage());
				}
			}
	//This method for switch to new window
	public  void switchToNewWindow() {
		try {
			//WebElement element1 = driver.findElement(By.xpath(locator1));
			//WebElement element2 = driver.findElement(By.xpath(locator2));
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		String w1 =  itr.next();
		String w2 =  itr.next();
		driver.switchTo().window(w2);
		
	}catch(Exception e) {
		application_log.debug("Issued with:" + e.getMessage());
		//System.out.println(e.getMessage());
	}
	}
	
	//This method go back main/parent window
	public static void switchToParentWindow() {
		try {
		driver.switchTo().defaultContent();
		}catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	//This method for accept alert
	public void checkAlert_Accept(String locator) {
		try {
		driver.findElement(By.xpath(locator));	
		Alert a = driver.switchTo().alert();
		//String str = a.getText();
		a.accept();
		} catch (Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
      //System.out.println(e.getMessage());
		}
		}
	//This method for dismiss alert
	public  void checkAlert_Dismiss(String locator) {
		try {
	        	driver.findElement(By.xpath(locator));	
	        	Alert a = driver.switchTo().alert();
	        	//String str = a.getText();
	        	a.dismiss();
			} catch (Exception e) {
				application_log.debug("Issued with:" + e.getMessage());
				//System.out.println(e.getMessage());
			}
		}
	//This method for Drag and drop
	public void dragAndDrop(String locator1, String locator2) {
		try {
			WebElement fromWebElement = driver.findElement(By.xpath(locator1));
			WebElement toWebElement = driver.findElement(By.xpath(locator2));
			Actions builder = new Actions(driver);
			builder.dragAndDrop(fromWebElement, toWebElement);
			}
		catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}
	}
	//This method for Perform mouse hover
	public void hoverEvent(String locators) {
		try {
			WebElement targetElement = driver.findElement(By.xpath(locators));
			Actions builder = new Actions(driver);
			builder.moveToElement(targetElement).build().perform();
		}
		catch(Exception e) {
			application_log.debug("Issued with:" + e.getMessage());
			//System.out.println(e.getMessage());
		}

			}
	
	//This method for doubleClick Webelement
public  void doubleClickEvent(String locators){
	try {
		WebElement doubleclickonWebElement = driver.findElement(By.xpath(locators));
	Actions builder = new Actions(driver);
	builder.doubleClick(doubleclickonWebElement).perform();
	}
	catch(Exception e) {
		application_log.debug("Issued with:" + e.getMessage());
		//System.out.println(e.getMessage());
	}

			}
//This method for RightClick Webelement
public  void rightClickEvent(String locators){
	try {	
		WebElement rightclickonWebElement =driver.findElement(By.xpath(locators));
	Actions builder = new Actions(driver);
	builder.contextClick(rightclickonWebElement).perform();
	}
	catch(Exception e) {
		application_log.debug("Issued with:" + e.getMessage());
		//System.out.println(e.getMessage());
	}

			}
//This method for get ToolTip using getAttribute
public void getToolTip(String locators) {
	try {
		WebElement toolTipofWebElement=  driver.findElement(By.xpath(locators));
String tooltip = toolTipofWebElement.getAttribute("title");
 }
	catch(Exception e) {
		application_log.debug("Issued with:" + e.getMessage());
		//System.out.println(e.getMessage());
	}
}
//This method for date picker from web table//need to work ..........update it
public void datepicker(String locatorsrow,String locatorscol,String valueToDate,WebElement element) {
try {
List<WebElement> rows = driver.findElements(By.tagName(locatorsrow));
for (int i = 0; i < rows.size(); i++) {
List<WebElement> coloumn = rows.get(i).findElements(By.tagName(locatorscol));
for (int j=0;j<coloumn.size();j++) {
	String date =coloumn.get(j).getText(); 
System.out.println(" date value in the list : " + date);
if (date.equalsIgnoreCase(valueToDate)) {
element.click();
}
    }
      }
        }
catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for drop down by xpath & for SelectByValue
public void dropdownByxpath(String locators,String values) {
	try {
		WebElement dd= driver.findElement(By.xpath(locators));
Select ddSelect= new Select(dd);
ddSelectByvalue(ddSelect,values);
}
catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//
//This method for drop down by id & for SelectByvisibleText
public void dropdownByid(String locators,String values) {
	try {
		WebElement dd= driver.findElement(By.id(locators));
Select ddSelect= new Select(dd);
ddSelectByvisibleText(ddSelect,values);
}
catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}

//This method for drop down by cssSelector & For SelectByindex
public void dropdownBycss(String locators,String values) {
	try {
		WebElement dd = driver.findElement(By.cssSelector(locators));
Select ddSelect= new Select(dd);
ddSelectByindex(ddSelect);
}
catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for  handle drop down using selectByVisibleText() method
public  void ddSelectByvisibleText(Select sValue, String values) {
	try {
sValue.selectByVisibleText(values);
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for  handle drop down using selectByValue() method
public void ddSelectByvalue(Select sValue,String values) {
	try {

sValue.selectByValue(values);
}
catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for  handle drop down using selectByindex() method
public  void ddSelectByindex(Select sValue) {
	try {

sValue.selectByIndex(3);//here 3 is suppose, here use index number which one is need
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for scrolling window down JavaScriptExecutor
public void scroll_down(int i) {
	try {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,i)","");
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for scrolling window up using JavaScriptExecutor
public void scroll_up(int i) {
	try {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-i)","");
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}

//This method for takeScreenshot
public  void takeScreenshotMethod(String Destination){
	try {
File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File(Destination));
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for key down (mouse event)
public  void pressKeyDown(String locators) {
	try {
		WebElement element =  driver.findElement(By.xpath(locators));
element.sendKeys(Keys.DOWN);
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for press Key enter
public void pressKeyEnter(String locators) {
	try {
		WebElement element =  driver.findElement(By.xpath(locators));

element.sendKeys(Keys.ENTER);
}catch(Exception e) {
	application_log.debug("Issued with:" + e.getMessage());
	//System.out.println(e.getMessage());
}
}
//This method for press Key up
public void pressKeyUp(String locators) {
	try {
		WebElement element =  driver.findElement(By.xpath(locators));
element.sendKeys(Keys.UP);
}
	catch(Exception e) {
		application_log.debug("Issued with:" + e.getMessage());
		//System.out.println(e.getMessage());
	}
	}
}

/*typebyxpath()
 * typebyname()
 * typebyid()
 * typebycss()
 * typebyclass()
 * clickbyname()
 * clickbyxpath()
 * clickbyid()
 * clickbycss()
 * linkText()
 * parialLinkText()
 * tagname()
 * dropdownbyxpath()
 * dropdownbyid()
 * dropdownbycss()
 * checkboxbyid()
 * checkboxbyxpath()
 * checkboxbycss()
 * radiobuttonbyxpath()
 * radiobuttonbycss()
 * radiobuttonbyid()
 * webtablebyid()
 * webtablebyxpath()
 * webtablebycss()
 * draganddropbyid()
 * draganddropbyxpath()
 * draganddropbycss()
 * popupbyxpath()
 * delete cookies
 * window maximize
 * wait pack
 * window handle
 * keybord event(doubleclick,right click, mouse hover)
 * key up, key down, key enter
 * tooltip
 * Screenshot
 * Scrolling window
 * method for getText,grtAttribute,getTille,
 * Method for verification
 */
 
