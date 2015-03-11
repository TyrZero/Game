package main;
import java.util.*;
import java.io.*;
import java.lang.System.*;//kill yourself

public class RetardedMain {
	public static void main(String[] args)throws IOException {
		Scanner PlayerMonkren = new Scanner(System.in);
		System.out.println("Enter a Monkren's Name, Current Choices Dulcarn, Dunput or Unpunk");
		String Choice = PlayerMonkren.next() + ".txt";
		Scanner PlayerMonkrenFile = new Scanner(new File(Choice));
		String Monkren1Name = PlayerMonkrenFile.next();
		PlayerMonkrenFile.nextLine();
		String Monkren1Type = PlayerMonkrenFile.nextLine();
		int Monkren1Level = PlayerMonkrenFile.nextInt();
		int Monkren1Health = PlayerMonkrenFile.nextInt();
		int Monkren1Mana = PlayerMonkrenFile.nextInt();
		int Monkren1ManaPerTurn = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability1Name = PlayerMonkrenFile.nextLine();
		String Ability1Type = PlayerMonkrenFile.next();
		int Ability1Damage = PlayerMonkrenFile.nextInt();
		int Ability1Cost = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability1Name2 = PlayerMonkrenFile.nextLine();
		String Ability1Type2 = PlayerMonkrenFile.next();
		int Ability1Damage2 = PlayerMonkrenFile.nextInt();
		int Ability1Cost2 = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability1Name3 = PlayerMonkrenFile.nextLine();
		String Ability1Type3 = PlayerMonkrenFile.next();
		int Ability1Damage3 = PlayerMonkrenFile.nextInt();
		int Ability1Cost3 = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability1Name4 = PlayerMonkrenFile.nextLine();
		String Ability1Type4 = PlayerMonkrenFile.next();
		int Ability1Damage4 = PlayerMonkrenFile.nextInt();
		int Ability1Cost4 = PlayerMonkrenFile.nextInt();
		String Monkren1Description = "Name of Monkren: " + Monkren1Name + ". Monkren Type: " + Monkren1Type + ". Monkren Level: "+ Monkren1Level + ". Monkren Health: " + Monkren1Health + ". Monkren Mana " + Monkren1Mana + ". Monkren ManaPerTurn: +" + Monkren1ManaPerTurn + ".";
		String Ability1Description = "Move Name: " + Ability1Name + ". Ability Type: " + Ability1Type + ". Ability Damage: " + Ability1Damage + ". Ability Mana Cost: " + Ability1Cost + ".";
		String Ability1Description2 = "Move Name: " + Ability1Name2 + ". Ability Type: " + Ability1Type2 + ". Ability Damage: " + Ability1Damage2 + ". Ability Mana Cost: " + Ability1Cost2 + ".";
		String Ability1Description3 = "Move Name: " + Ability1Name3 + ". Ability Type: " + Ability1Type3 + ". Ability Damage: " + Ability1Damage3 + ". Ability Mana Cost: " + Ability1Cost3 + ".";
		String Ability1Description4 = "Move Name: " + Ability1Name4 + ". Ability Type: " + Ability1Type4 + ". Ability Damage: " + Ability1Damage4 + ". Ability Mana Cost: " + Ability1Cost4 + ".";
		String Monkren1Moves = "Moves: " + Ability1Name + ", " + Ability1Name2 + ", " + Ability1Name3 + ", " + Ability1Name4;
		
		System.out.println("Enter a Second Monkren's Name, Current Choices Dulcarn or Dunput");
		Choice = PlayerMonkren.next() + ".txt";
		PlayerMonkrenFile = new Scanner(new File(Choice));
		String Monkren2Name = PlayerMonkrenFile.next();
		PlayerMonkrenFile.nextLine();
		String Monkren2Type = PlayerMonkrenFile.nextLine();
		int Monkren2Level = PlayerMonkrenFile.nextInt();
		int Monkren2Health = PlayerMonkrenFile.nextInt();
		int Monkren2Mana = PlayerMonkrenFile.nextInt();
		int Monkren2ManaPerTurn = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability2Name = PlayerMonkrenFile.nextLine();
		String Ability2Type = PlayerMonkrenFile.next();
		int Ability2Damage = PlayerMonkrenFile.nextInt();
		int Ability2Cost = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability2Name2 = PlayerMonkrenFile.nextLine();
		String Ability2Type2 = PlayerMonkrenFile.next();
		int Ability2Damage2 = PlayerMonkrenFile.nextInt();
		int Ability2Cost2 = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability2Name3 = PlayerMonkrenFile.nextLine();
		String Ability2Type3 = PlayerMonkrenFile.next();
		int Ability2Damage3 = PlayerMonkrenFile.nextInt();
		int Ability2Cost3 = PlayerMonkrenFile.nextInt();
		PlayerMonkrenFile.nextLine();
		String Ability2Name4 = PlayerMonkrenFile.nextLine();
		String Ability2Type4 = PlayerMonkrenFile.next();
		int Ability2Damage4 = PlayerMonkrenFile.nextInt();
		int Ability2Cost4 = PlayerMonkrenFile.nextInt();
		String Monkren2Description = "Name of Monkren: " + Monkren2Name + ". Monkren Type: " + Monkren2Type + ". Monkren Level: "+ Monkren2Level + ". Monkren Health: " + Monkren2Health + ". Monkren Mana " + Monkren2Mana + ". Monkren ManaPerTurn: +" + Monkren2ManaPerTurn + ".";
		String Ability2Description = "Move Name: " + Ability2Name + ". Ability Type: " + Ability2Type + ". Ability Damage: " + Ability2Damage + ". Ability Mana Cost: " + Ability2Cost + ".";
		String Ability2Description2 = "Move Name: " + Ability2Name2 + ". Ability Type: " + Ability2Type2 + ". Ability Damage: " + Ability2Damage2 + ". Ability Mana Cost: " + Ability2Cost2 + ".";
		String Ability2Description3 = "Move Name: " + Ability2Name3 + ". Ability Type: " + Ability2Type3 + ". Ability Damage: " + Ability2Damage3 + ". Ability Mana Cost: " + Ability2Cost3 + ".";
		String Ability2Description4 = "Move Name: " + Ability2Name4 + ". Ability Type: " + Ability2Type4 + ". Ability Damage: " + Ability2Damage4 + ". Ability Mana Cost: " + Ability2Cost4 + ".";
		String Monkren2Moves = "Moves: " + Ability2Name + ", " + Ability2Name2 + ", " + Ability2Name3 + ", " + Ability2Name4;
		
		int turn = 1;
		Scanner selection = new Scanner(System.in);
		while(true)
		{
			String moveDescriptionSelect = "";
			String moveName = "";
			if(turn % 2 == 1)
			{
				System.out.println("Player 1's Turn!");
				System.out.println(Monkren1Description);
				System.out.println(Monkren1Moves);
				while(!moveDescriptionSelect.equals("Yes"))
				{
					System.out.println("Enter a move!");
					moveName = selection.nextLine();
					if(moveName.equals(Ability1Name))
					{
						System.out.println(Ability1Description);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren1Mana >= Ability1Cost)
							{
								Monkren1Mana = Monkren1Mana - Ability1Cost;
								Monkren2Health = Monkren2Health - Ability1Damage;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability1Name2))
					{
						System.out.println(Ability1Description2);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren1Mana >= Ability1Cost2)
							{
								Monkren1Mana = Monkren1Mana - Ability1Cost2;
								Monkren2Health = Monkren2Health - Ability1Damage2;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability1Name3))
					{
						System.out.println(Ability1Description3);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren1Mana >= Ability1Cost3)
							{
								Monkren1Mana = Monkren1Mana - Ability1Cost3;
								Monkren2Health = Monkren2Health - Ability1Damage3;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability1Name4))
					{
						System.out.println(Ability1Description4);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren1Mana >= Ability1Cost4)
							{
								Monkren1Mana = Monkren1Mana - Ability1Cost4;
								Monkren2Health = Monkren2Health - Ability1Damage4;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
				}
				Monkren1Mana = Monkren1Mana + Monkren1ManaPerTurn;
				Monkren1Description = "Name of Monkren: " + Monkren1Name + ". Monkren Type: " + Monkren1Type + ". Monkren Level: "+ Monkren1Level + ". Monkren Health: " + Monkren1Health + ". Monkren Mana " + Monkren1Mana + ". Monkren ManaPerTurn: +" + Monkren1ManaPerTurn + ".";
				Monkren2Description = "Name of Monkren: " + Monkren2Name + ". Monkren Type: " + Monkren2Type + ". Monkren Level: "+ Monkren2Level + ". Monkren Health: " + Monkren2Health + ". Monkren Mana " + Monkren2Mana + ". Monkren ManaPerTurn: +" + Monkren2ManaPerTurn + ".";
				moveDescriptionSelect = "";
			}
			else if(turn % 2 == 0)
			{
				System.out.println("Player 2's Turn!");
				System.out.println(Monkren2Description);
				System.out.println(Monkren2Moves);
				while(!moveDescriptionSelect.equals("Yes"))
				{
					System.out.println("Enter a move!");
					moveName = selection.nextLine();
					if(moveName.equals(Ability2Name))
					{
						System.out.println(Ability2Description);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren2Mana >= Ability2Cost)
							{
								Monkren2Mana = Monkren2Mana - Ability2Cost;
								Monkren1Health = Monkren1Health - Ability2Damage;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability2Name2))
					{
						System.out.println(Ability2Description2);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren2Mana >= Ability2Cost2)
							{
								Monkren2Mana = Monkren2Mana - Ability2Cost2;
								Monkren1Health = Monkren1Health - Ability2Damage2;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability2Name3))
					{
						System.out.println(Ability2Description3);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren2Mana >= Ability2Cost3)
							{
								Monkren2Mana = Monkren2Mana - Ability2Cost3;
								Monkren1Health = Monkren1Health - Ability2Damage3;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
					else if(moveName.equals(Ability2Name4))
					{
						System.out.println(Ability2Description4);
						System.out.println("Select this move?");
						moveDescriptionSelect = selection.next();
						if(moveDescriptionSelect.equals("Yes")||moveDescriptionSelect.equals("yes"))
						{
							if(Monkren2Mana >= Ability2Cost4)
							{
								Monkren2Mana = Monkren2Mana - Ability2Cost4;
								Monkren1Health = Monkren1Health - Ability2Damage4;
							}
							else
							{
								System.out.println("Not Enough Mana!");
								moveDescriptionSelect = "";
							}
						}
					}
				}
				Monkren2Mana = Monkren2Mana + Monkren2ManaPerTurn;
				Monkren1Description = "Name of Monkren: " + Monkren1Name + ". Monkren Type: " + Monkren1Type + ". Monkren Level: "+ Monkren1Level + ". Monkren Health: " + Monkren1Health + ". Monkren Mana " + Monkren1Mana + ". Monkren ManaPerTurn: +" + Monkren1ManaPerTurn + ".";
				Monkren2Description = "Name of Monkren: " + Monkren2Name + ". Monkren Type: " + Monkren2Type + ". Monkren Level: "+ Monkren2Level + ". Monkren Health: " + Monkren2Health + ". Monkren Mana " + Monkren2Mana + ". Monkren ManaPerTurn: +" + Monkren2ManaPerTurn + ".";
				moveDescriptionSelect = "";
			}
			if(Monkren1Health < 0 || Monkren2Health < 0)
			{
				if(Monkren2Health <= 0)
				{
					System.out.println(Monkren2Name + " has lost all of it's Health! " + Monkren1Name + " has won on turn " + turn + "!");
				}
				else if(Monkren1Health <= 0)
				{
					System.out.println(Monkren1Name + " has lost all of it's Health! " + Monkren2Name + " has won on turn " + turn + "!");
				}
				break;
			}
			turn++;
		}
	}
}