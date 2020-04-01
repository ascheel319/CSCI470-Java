/****************************************************************
TableEntry

Author: Andrew Scheel
Z-number: z1790270
Description: This class is one entry in the data table, it holds the letter, the value of the letter, and the frequency that that letter happens
****************************************************************/

public class TableEntry
{
	//variables for each of the letter in the chart, their value, and their frequency
	private char letter;
	private int value;
	private int frequency;

	//constructor
	public TableEntry(char letter, int value, int frequency)
	{
		setLetter(letter);
		setValue(value);
		setFrequency(frequency);
	}

	//increments the frequency
	public void addOneCount()
	{
		frequency++;
	}

	//getters
	public char getLetter()
	{
		return letter;
	}
	public int getValue()
	{
		return value;
	}
	public int getFrequency()
	{
		return frequency;
	}

	//setters
	public void setLetter(char newLetter)
	{
		letter = Character.toLowerCase(newLetter);
	}
	public void setValue(int newValue)
	{
		value = newValue;
	}
	public void setFrequency(int newFrequency)
	{
		frequency = newFrequency;
	}

}
