import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck
	{
		static ArrayList<Card> deck = new ArrayList<Card>();
		static String name;
		static int numOfDec;
		static String option;
		static int totalValue;
		static int nTotalValue;
		static int pTotalValue;

		public static void greetUser()
			{
				System.out.println("What is your name? ");
				Scanner userInput = new Scanner(System.in);
				name = userInput.nextLine();
				System.out.println("Hi, " + name);
				String[] array = new String[6];
				array[0] = "You look flawless today";
				array[1] = "I like your outfit today";
				array[2] = "You're clearly a genius";
				array[3] = "That's an awesome name";
				array[4] = "You have a nice smile";
				array[5] = "You rock";
				int comp = (int) (Math.random() * 6);// random generator
					{
						System.out.println(array[comp] + " " + name);// randomly
																		// inputs
																		// an
																		// array
					}
			}

		public static void fillDeck()
			{
				deck.add(new Card("Ace", "Hearts", 1));
				deck.add(new Card("Two", "Hearts", 2));
				deck.add(new Card("Three", "Hearts", 3));
				deck.add(new Card("Four", "Hearts", 4));
				deck.add(new Card("Five", "Hearts", 5));
				deck.add(new Card("Six", "Hearts", 6));
				deck.add(new Card("Seven", "Hearts", 7));
				deck.add(new Card("Eight", "Hearts", 8));
				deck.add(new Card("Nine", "Hearts", 9));
				deck.add(new Card("Ten", "Hearts", 10));
				deck.add(new Card("Jack", "Hearts", 10));
				deck.add(new Card("Queen", "Hearts", 10));
				deck.add(new Card("King", "Hearts", 10));
				deck.add(new Card("Ace", "Diamods", 1));
				deck.add(new Card("Two", "Diamonds", 2));
				deck.add(new Card("Three", "Diamonds", 3));
				deck.add(new Card("Four", "Diamonds", 4));
				deck.add(new Card("Five", "Diamonds", 5));
				deck.add(new Card("Six", "Diamonds", 6));
				deck.add(new Card("Seven", "Diamonds", 7));
				deck.add(new Card("Eight", "Diamonds", 8));
				deck.add(new Card("Nine", "Diamonds", 9));
				deck.add(new Card("Ten", "Diamonds", 10));
				deck.add(new Card("Jack", "Diamonds", 10));
				deck.add(new Card("Queen", "Diamonds", 10));
				deck.add(new Card("King", "Diamonds", 10));
				deck.add(new Card("Ace", "Spades", 1));
				deck.add(new Card("Two", "Spade", 2));
				deck.add(new Card("Three", "Spade", 3));
				deck.add(new Card("Four", "Spade", 4));
				deck.add(new Card("Five", "Spade", 5));
				deck.add(new Card("Six", "Spade", 6));
				deck.add(new Card("Seven", "Spade", 7));
				deck.add(new Card("Eight", "Spade", 8));
				deck.add(new Card("Nine", "Spade", 9));
				deck.add(new Card("Ten", "Spade", 10));
				deck.add(new Card("Jack", "Spade", 10));
				deck.add(new Card("Queen", "Spade", 10));
				deck.add(new Card("King", "Spade", 10));
				deck.add(new Card("Ace", "Clubs", 1));
				deck.add(new Card("Two", "Clubs", 2));
				deck.add(new Card("Three", "Clubs", 3));
				deck.add(new Card("Four", "Clubs", 4));
				deck.add(new Card("Five", "Clubs", 5));
				deck.add(new Card("Six", "Clubs", 6));
				deck.add(new Card("Seven", "Clubs", 7));
				deck.add(new Card("Eight", "Clubs", 8));
				deck.add(new Card("Nine", "Clubs", 9));
				deck.add(new Card("Ten", "Clubs", 10));
				deck.add(new Card("Jack", "Clubs", 10));
				deck.add(new Card("Queen", "Clubs", 10));
				deck.add(new Card("King", "Clubs", 10));
			}

		public static void shuffle()
			{
				Collections.shuffle(deck);
			}

		public static int drawCard()
			{
				int cardValue = Deck.deck.get(0).getValue();
				Deck.deck.remove(0);
				return cardValue;

			}

		public static void compare()
			{
				System.out.println("The dealer has a total value of " + totalValue + ". You have a total value of "
						+ pTotalValue + ". You Win.");
				System.exit(0);
			}

		public static void dealersValue()
			{
				totalValue = drawCard() + drawCard();

					{
						System.out.println("The dealer has " + totalValue);
					}
					{
						if (drawCard() < 12)
							{
								if (totalValue > 21)
									{
										System.out.println("The dealer busted. You win!");
										System.exit(0);
									} else
									{
										if (totalValue < 16)
											{
												System.out.println("The dealer hits and has a value of "
														+ (nTotalValue = totalValue + drawCard()));
													{
														if (nTotalValue > 21)
															{
																System.out.println("The dealer busted. You win!");
																System.exit(0);
															}
													}
											}
										if (totalValue > 21)
											{
												System.out.println("The dealer has " + totalValue);
											}
										if (totalValue == 21)
											{
												System.out.println("The dealer has 21. You Lose!");
												System.exit(0);
											}
									}
							}
					}
			}

		public static void playersValue()
			{

				pTotalValue = drawCard() + drawCard();
				String ans;

					{
						System.out.println("You have a value of " + pTotalValue);
					}
					{
						if (drawCard() < 12)
							{
								if (pTotalValue > 21)
									{
										System.out.println("You have busted. You Lose!");
										System.exit(0);
									} else
									{
										System.out.println("Would you like to (hit) or (stay)");
										Scanner userInput = new Scanner(System.in);
										ans = userInput.nextLine();
										if (ans.equals("hit"))

											{
												while (pTotalValue < 21 && ans.equalsIgnoreCase("hit"))
													{
														if (ans.equalsIgnoreCase("hit"))
															{
																pTotalValue = pTotalValue + drawCard();
																System.out
																		.println("Your total is " + pTotalValue + ".");
																System.out.println();
																if (pTotalValue > 21)
																	{
																		System.out.println("You busted. You lose.");
																		System.exit(0);
																	}
																if (pTotalValue == 21)
																	{
																		System.out.println("Blackjack, you win.");
																		System.exit(0);
																	}
																System.out.print("Would you like to (hit) or (stay)? ");
																ans = userInput.next();
																System.out.println();
															}
													}
											}
										if (ans.equalsIgnoreCase("stay"))
											{
												compare();
											}
									}
							}
					}
			}

		public static void main(String[] args)
			{
				greetUser();
				Deck.fillDeck();
				Deck.shuffle();
				Deck.dealersValue();
				Deck.playersValue();
				//github tester
			}
	}
