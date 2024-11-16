package utilitesFile;

import org.testng.annotations.DataProvider;

public class Dataprovid {
	@DataProvider
	public String[][] dataprovid() {
		String[][] data=new String[][] {
			{"nazeerpashasn580086@gmail.com","12121212"},
			{"nazeershaik@gmail.com","131313131"},
			{"shaiknazeer123@gmial.com","1414141"}
		};
		return data;
	}

}
