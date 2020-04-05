/**
 * 
 */
package com.testcases;

import org.testng.annotations.Test;

import com.base.Configuration;
import com.locators.Fbaccount_locators;
import com.values.Fbaccount_values;

/**
 * @author Imtiaz
 * Every test cases come as a method
 *
 */
public class Fbaccount_Tc extends Configuration {
	Fbaccount_locators lobj = new Fbaccount_locators();
	Fbaccount_values vobj = new Fbaccount_values ();
	
	@Test
	public void fbAccount() {
		typebyxpath(lobj.fb_firstname_xpath,vobj.fb_firstname_values);//type first name
		//typebyid(lobj.fb_firstname_id,vobj.fb_firstname_values);//type first name using id locator
		//typebycss(lobj.fb_firstname_css,vobj.fb_firstname_values);//type first name using css locator
		typebyxpath(lobj.fb_lastname_xpath,vobj.fb_lastname_values);//type last name
		typebyxpath(lobj.fb_email_locator,vobj.fb_email_values );// type email
		typebyxpath(lobj.fb_Remail_xpath,vobj.fb_reemail_values);// type Re-enter email
		typebyxpath(lobj.fb_password_locator,vobj.fb_password_values);// type password
		//select month from drop down
		dropdownByxpath(lobj.fb_month_xpath,vobj.fb_bdmonth_values);
		//select day from drop down
		dropdownByxpath(lobj.fb_day_xpath,vobj.fb_bdday_values);
		//select year from drop down
		dropdownByxpath(lobj.fb_year_xpath,vobj.fb_bdyear_values);
		//select radio button
		//radioButtonByname(lobj.fb_radio_name);
		radioButtonByxpath(lobj.fb_radio_F_xpath,lobj.fb_radio_M_xpath);
		clickbyxpath(lobj.fb_click_locator);//for click
		
	}
	
	@Test
	public void fbSignIn() {
		
	}

}
