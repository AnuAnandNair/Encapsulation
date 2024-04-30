package excelread;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(Excel_Code.getStringData(1,0));//to access String name from excel sheet
		System.out.println(Excel_Code.getIntegerData(1,1));//to access id from excel sheet
	}

}
