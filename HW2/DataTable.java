/****************************************************************
DataTable

Author: Andrew Scheel
Z-number: z1790270
Description: This class holds all the entries and addes to the according to the input and then prints the table out when done.
****************************************************************/

public class DataTable
{
	//variables
	private TableEntry[] innerTable = new TableEntry[42];
	public int numInTable = 0;

	//declaring the arrays that hold the values
	char[] letters = new char[42];
	int[] value = new int[42];
	int[] frequency = new int[42];

	//default constructor
	public DataTable()
	{
		//initializing the letters
		letters[0] = 'a';
		letters[1] = 'b';
		letters[2] = 'c';
		letters[3] = 'd';
		letters[4] = 'e';
		letters[5] = 'f';
		letters[6] = 'g';
		letters[7] = 'h';
		letters[8] = 'i';
		letters[9] = 'j';
		letters[10] = 'k';
		letters[11] = 'l';
		letters[12] = 'm';
		letters[13] = 'n';
		letters[14] = 'o';
		letters[15] = 'p';
		letters[16] = 'q';
		letters[17] = 'r';
		letters[18] = 's';
		letters[19] = 't';
		letters[20] = 'u';
		letters[21] = 'v';
		letters[22] = 'w';
		letters[23] = 'x';
		letters[24] = 'y';
		letters[25] = 'z';
		letters[26] = 'é';
		letters[27] = 'â';
		letters[28] = 'ê';
		letters[29] = 'î';
		letters[30] = 'ô';
		letters[31] = 'û';
		letters[32] = 'à';
		letters[33] = 'è';
		letters[34] = 'ù';
		letters[35] = 'ë';
		letters[36] = 'ï';
		letters[37] = 'ÿ';
		letters[38] = 'ü';
		letters[39] = 'æ';
		letters[40] = '\u0153';
		letters[41] = 'ç';

		//initializing the values
		value[0] = 1;
		value[1] = 2;
		value[2] = 3;
		value[3] = 4;
		value[4] = 5;
		value[5] = 6;
		value[6] = 7;
		value[7] = 8;
		value[8] = 9;
		value[9] = 0;
		value[10] = 10;
		value[11] = 20;
		value[12] = 30;
		value[13] = 40;
		value[14] = 50;
		value[15] = 60;
		value[16] = 70;
		value[17] = 80;
		value[18] = 90;
		value[19] = 100;
		value[20] = 110;
		value[21] = 120;
		value[22] = 130;
		value[23] = 140;
		value[24] = 150;
		value[25] = 160;
		value[26] = 1;
		value[27] = 2;
		value[28] = 3;
		value[29] = 4;
		value[30] = 5;
		value[31] = 6;
		value[32] = 7;
		value[33] = 8;
		value[34] = 9;
		value[35] = 10;
		value[36] = 20;
		value[37] = 30;
		value[38] = 40;
		value[39] = 50;
		value[40] = 60;
		value[41] = 70;

		//initializing the frequency
		frequency[0] = 0;
		frequency[1] = 0;
		frequency[2] = 0;
		frequency[3] = 0;
		frequency[4] = 0;
		frequency[5] = 0;
		frequency[6] = 0;
		frequency[7] = 0;
		frequency[8] = 0;
		frequency[9] = 0;
		frequency[10] = 0;
		frequency[11] = 0;
		frequency[12] = 0;
		frequency[13] = 0;
		frequency[14] = 0;
		frequency[15] = 0;
		frequency[16] = 0;
		frequency[17] = 0;
		frequency[18] = 0;
		frequency[19] = 0;
		frequency[20] = 0;
		frequency[21] = 0;
		frequency[22] = 0;
		frequency[23] = 0;
		frequency[24] = 0;
		frequency[25] = 0;
		frequency[26] = 0;
		frequency[27] = 0;
		frequency[28] = 0;
		frequency[29] = 0;
		frequency[30] = 0;
		frequency[31] = 0;
		frequency[32] = 0;
		frequency[33] = 0;
		frequency[34] = 0;
		frequency[35] = 0;
		frequency[36] = 0;
		frequency[37] = 0;
		frequency[38] = 0;
		frequency[39] = 0;
		frequency[40] = 0;
		frequency[41] = 0;

		//adds everything to the table
		for(int i = 0; i < innerTable.length; i++)
		{
			innerTable[i] = new TableEntry(letters[i], value[i], frequency[i]);
		}
	}

	//return numerological value of input char
	public int getTableValue(char x)
	{
		int value = 0;
		for(int i = 0; i < innerTable.length; i++)
		{
			char temp = innerTable[i].getLetter();
			if(temp == x)//if it matches the letter we are looking for
			{
				value = innerTable[i].getValue();
			}

		}
		return value;
	}

	//add 1 to count for input char
	public void bumpCount(char x)
	{
                for(int i = 0; i < innerTable.length; i++)
                {
                        char temp = innerTable[i].getLetter();
                        if(temp == x)//if it matches the letter
                        {
							int value = innerTable[i].getFrequency();
							value++;
                            innerTable[i].setFrequency(value);
                        }
                }
	}

	//return the count for input char, for printing
	public int getTableCount(char x)
	{
		int value = 0;
                for(int i = 0; i < innerTable.length; i++)
                {
                        char temp = innerTable[i].getLetter();
                        if(temp == x)//matches the letter
                        {
                                value = innerTable[i].getFrequency();
                        }

                }
                return value;
	}

	//return the number of entries in the table
	public int getTableSize()
	{
		return numInTable;
	}

	//prints the input and shows the length and numberology total and the input
	//it then prints out the table and the total of letters that were in it
	public void printTable(String[] args)
	{
		//print the header
		System.out.println("Parm  Length  Total  String");
		System.out.println("----  ------  -----  ------");
		System.out.println("");

		//printing out the input and the totals
		for(int i = 0; i < args.length; i++)//loops through the parms
		{
			String temp = args[i];

			//calculates the total of the numberology total
			int number = 0;
			for(int j = 0; j < args[i].length(); j++)//loops through the words, letter by letter
			{
				char lowering = args[i].charAt(j);
				lowering = Character.toLowerCase(lowering);
				number += getTableValue(lowering);
			}

			//makes the format to print it out and the prints it out
			String summary = String.format("%4d %7d %6d  %s", (i+1), temp.length(), number, args[i]);
			System.out.println(summary);
		}

		System.out.println("");

		//printing the table of all the values
		String tableOut = String.format("%s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d", letters[0], getTableCount(letters[0]), letters[41], getTableCount(letters[41]), letters[35], getTableCount(letters[35]), letters[29], getTableCount(letters[29]), letters[12], getTableCount(letters[12]), letters[15], getTableCount(letters[15]), letters[20], getTableCount(letters[20]), letters[22], getTableCount(letters[22]));
		System.out.println(tableOut);
		tableOut = String.format("%s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d", letters[32], getTableCount(letters[32]), letters[3], getTableCount(letters[3]), letters[5], getTableCount(letters[5]), letters[36], getTableCount(letters[36]), letters[13], getTableCount(letters[13]), letters[16], getTableCount(letters[16]), letters[34], getTableCount(letters[34]), letters[23], getTableCount(letters[23]));
		System.out.println(tableOut);
		tableOut = String.format("%s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d", letters[27], getTableCount(letters[27]), letters[4], getTableCount(letters[4]), letters[6], getTableCount(letters[6]), letters[9], getTableCount(letters[9]), letters[14], getTableCount(letters[14]), letters[17], getTableCount(letters[17]), letters[31], getTableCount(letters[31]), letters[24], getTableCount(letters[24]));
		System.out.println(tableOut);
		tableOut = String.format("%s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d", letters[39], getTableCount(letters[39]), letters[33], getTableCount(letters[33]), letters[7], getTableCount(letters[7]), letters[10], getTableCount(letters[10]), letters[30], getTableCount(letters[30]), letters[18], getTableCount(letters[18]), letters[38], getTableCount(letters[38]), letters[37], getTableCount(letters[37]));
		System.out.println(tableOut);
		tableOut = String.format("%s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d   %s %2d", letters[1], getTableCount(letters[1]), letters[26], getTableCount(letters[26]), letters[8], getTableCount(letters[8]), letters[11], getTableCount(letters[11]), letters[40], getTableCount(letters[40]), letters[19], getTableCount(letters[19]), letters[21], getTableCount(letters[21]), letters[25], getTableCount(letters[25]));
		System.out.println(tableOut);
		tableOut = String.format("%s %2d   %s %2d", letters[2], getTableCount(letters[2]), letters[28], getTableCount(letters[28]));
		System.out.println(tableOut);

		//calcuates how many numbers are in the table
		for(int i = 0; i < 42; i++)
		{
			numInTable += getTableCount(letters[i]);
		}

		//total letter count
		System.out.println("\nTotal letters = " + getTableSize());
	}
}
