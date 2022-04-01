package base;

import org.testng.annotations.Test;

import pages.allElements;

public class bookHotelTest extends baseClass {
	
	@Test
	
public void findHotel () throws InterruptedException {
		
		allElements ae = new allElements (driver);
		ae.clickHotelBtn();
		Thread.sleep(3000);
		ae.searchDestination();
		Thread.sleep(3000);
		ae.selectDestination();
		Thread.sleep(3000);
		ae.selectMayMonth();
		ae.selectCheckInDate();
		ae.selectCheckOutDate();
		Thread.sleep(3000);
		ae.addChild();
		ae.ExtendAgeDropDown();
		ae.SelectAge();
		ae.UpdateInfo();
		Thread.sleep(5000);
		ae.schotelClass(driver);
		Thread.sleep(3000);
		ae.updateHotelClass();
		ae.scTop(driver);
		Thread.sleep(3000);
		ae.getHotelName();
		
	}

}
