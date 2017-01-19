package arrayDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayNumberCalculation {

	public static void main(String[] args) throws Exception{
		//start of code
		
		//variables
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		final int ARRAYSIZE = 20;
		double []dblNumberInput = new double[ARRAYSIZE];
		double dblTotal = 0, dblAverage = 0, dblMax = 0, dblMin = 0;
		int intArrayCount = 0;
		//code
		//accept data
		do
		{
			System.out.print("\nEnter Number: ");
			dblNumberInput[intArrayCount] = Double.parseDouble(reader.readLine());
			
			//increase counter
			intArrayCount++;
		}while (dblNumberInput[intArrayCount-1] != -999);
		intArrayCount--;
		//process data
		
		//Total + Average
		for (int intLoopCounter = 0; intLoopCounter < intArrayCount; 
				intLoopCounter ++)
		{
			dblTotal += dblNumberInput[intLoopCounter]; 
		}
		dblAverage = dblTotal / intArrayCount;
		//check data entered
		if (intArrayCount == 0)
		{
			System.out.println("\n NDE"); 
			return;
		}
		//Min 
		dblMin = dblNumberInput[0];
		for (int intLoopCounter = 0; intLoopCounter < intArrayCount; 
				intLoopCounter ++)
		{
			if (dblNumberInput[intLoopCounter] < dblMin)
			{
				dblMin = dblNumberInput[intLoopCounter];
			}
		}
		// Max
		dblMax = dblNumberInput[0];
		for (int intLoopCounter = 0; intLoopCounter < intArrayCount; 
				intLoopCounter ++)
		{
			if (dblNumberInput[intLoopCounter] > dblMax)
			{
				dblMax = dblNumberInput[intLoopCounter];
			}
		}
		//output
		System.out.println("Total   = " + dblTotal);
		System.out.println("Average = " + dblAverage);
		System.out.println("Min     = " + dblMin);
		System.out.println("Max     = " + dblMax);
		System.out.println("\n\n Bye");
		//end of code
	}

}
