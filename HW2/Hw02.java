/********************************************************************
Class: 		CSCI 470-1
Program: 	Assignment 2
Author: 	Andrew Scheel
Z-number: 	z1790270
Date Due: 	03/25/2020
Purpose: 	In this assignment, we will just use numerology to practice the topics Characters, Strings, Arrays, Classes made of the above.
Execution: 	java Hw02 eeeeeeeeee fffffffff
*********************************************************************/

public class Hw02
{
	public static void main(String[] args)
	{
		DataTable table = new DataTable();

		for(int i = 0; i < args.length; i++)
		{
			for(int j = 0; j < args[i].length(); j++)
			{
				char temp = args[i].charAt(j);
				temp = Character.toLowerCase(temp);
				table.bumpCount(temp);
			}
		}

		//print everything
		table.printTable(args);
	}
}
