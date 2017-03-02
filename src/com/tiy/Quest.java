package com.tiy;

import java.util.Scanner;

/**
 * Created by josh on 3/1/17.
 */
public class Quest {
	private String input;
	boolean yes;
	private Scanner in = new Scanner(System.in);
	private ConsolePrintFormat CPF = new ConsolePrintFormat();
	private Money money = new Money(20);
	private  Beer beer;

	public void start() {
		buyBeer();
		while(money.getDollars() > 4){
			drink();
		}


	}

	private void drink(){
		yes = false;
		while(!yes){
			CPF.printConsole("\nWould you like to take a sip? y/n : ");
			input = in.next();
			if(input.toLowerCase().equals("y")){
				if(beer.getLevel()==0){
					buyBeer();
				}
				else {
					if(beer.getLevel()==5){
						CPF.printConsole("Your glass is half full!");
					}
					beer.setLevel(beer.getLevel() - 2);
				}
			}else if(input.toLowerCase().equals("n")){

			}else{

			}
		}

	}

	private void buyBeer() {
		yes = false;
		while (!yes) {
			CPF.printConsole("Would you like to buy a beer? y/n : ");
			input = in.next();
			if (input.toLowerCase().equals("y")) {
				if(money.getDollars() < 5){
					System.out.println();
					CPF.printConsole("Sorry you only have $"+money.getDollars()+" and beer is $"+beer.getCost());
					yes=true;
				}else {
					beer = new Beer(10);
					money.setDollars(money.getDollars() - beer.getCost());
					CPF.printConsole("You have $" + money.getDollars());
					yes = true;
				}
			} else if (input.toLowerCase().equals("n")) {
				System.out.println("Sorry to hear that today!");
				yes = true;
			} else {

			}
		}
	}
}
