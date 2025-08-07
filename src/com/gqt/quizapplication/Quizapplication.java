package com.gqt.quizapplication;

import java.util.Scanner;

public class Quizapplication {
	public static final String reset = "\u001B[0m";
	public static final String red = "\u001B[31m";
	public static final String green = "\u001B[32m";
	public static final String yellow = "\u001B[33m";
	public static final String purple = "\u001B[35m";
	public static final String cyan = "\u001B[36m";

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean audiencePollUsed = false;
		boolean fiftyFiftyUsed = false;
		boolean quitUsed=false;
		Integer option1,option11,option2,option21,option3,option31,option4,option41,option5,option51,
		option6,option61,option7,option71,option8,option81,option9,option91,option10,option101;
		
		//Question 1
		System.out.println(yellow+"Question 1 : Which of the following is not a Java keyword?\r\n"+ ""+reset);
		String A1="static";
		String B1="Boolean";
		String C1="void";
		String D1="private";
		String L1="LIFE LINE";
		System.out.print(cyan+"1)"+A1+"  ");
		System.out.print("2)"+B1+"  ");
		System.out.print("3)"+C1+"  ");
		System.out.print("4)"+D1+"  ");
		System.out.println("5)"+L1+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option1 = new Integer(sc.nextInt());

		    if (option1 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option11 = sc.nextInt();

		                if (option11 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A1 + " - 20%  ");
		                    System.out.print("2) " + B1 + " - 45%  ");
		                    System.out.print("3) " + C1 + " - 25%  ");
		                    System.out.println("4) " + D1 + " - 10%");
		                    break;
		                } else if (option11 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B1 + "   3) " + C1);
		                    break;
		                } else if (option11 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}

	    if(option1==2) {
	    	    System.out.println(green+"Correct : You won 10000/-"+reset);
	    	}
	    	else{
	    	  System.out.println(red+"Wrong Answer : Quiz End-You lost "+reset);
	    	  System.exit(0);
	    }
	   
		System.out.println("\n........................");
		
		//Question 2 
		System.out.println(yellow+"Question 2 : What is the size of an int variable in Java?\r\n"+ ""+reset);
		String A2="8 bits";
		String B2="16 bits";
		String C2="32 bits";
		String D2="64 bits";
		String L2="LIFE LINE";
		System.out.print(cyan+"1)"+A2+"  ");
		System.out.print("2)"+B2+"  ");
		System.out.print("3)"+C2+"  ");
		System.out.print("4)"+D2+"  ");
		System.out.println("5)"+L2+reset);
		System.out.println();
		//System.out.println("Your Option : ");
		//option2=new Integer(sc.nextInt());
		while (true) {
		    System.out.print("Your Option: ");
		    option2 =new Integer( sc.nextInt());

		    if (option2 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 10000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option21 = sc.nextInt();

		                if (option21 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A2 + " - 20%  ");
		                    System.out.print("2) " + B2 + " - 25%  ");
		                    System.out.print("3) " + C2 + " - 45%  ");
		                    System.out.println("4) " + D2 + " - 10%");
		                    break;
		                } else if (option21 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B2 + "   3) " + C2);
		                    break;
		                } else if (option21 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 10000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}

    if(option2==3) {
    	    System.out.println(green+"Correct : You won 20000/-"+reset);
    	}
    	else{
    	  System.out.println(red+"Wrong Answer : Quiz End-You lost "+reset);
    	  System.exit(0);
    }
    
    System.out.println("\n........................");
    
    //Question 3 
		System.out.println(yellow+"Question 3 : Which method is the entry point of a Java program?\r\n"+ ""+reset);
		String A3="start()";
		String B3="main()";
		String C3="run()";
		String D3="init()";
		String L3="LIFE LINE";
		System.out.print(cyan+"1)"+A3+"  ");
		System.out.print("2)"+B3+"  ");
		System.out.print("3)"+C3+"  ");
		System.out.print("4)"+D3+"  ");
		System.out.println("5)"+L3+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option3 =new Integer( sc.nextInt());

		    if (option3 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 20000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option31 = sc.nextInt();

		                if (option31 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A3 + " - 20%  ");
		                    System.out.print("2) " + B3 + " - 45%  ");
		                    System.out.print("3) " + C3 + " - 25%  ");
		                    System.out.println("4) " + D3 + " - 10%");
		                    break;
		                } else if (option31 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B3 + "   3) " + C3);
		                    break;
		                } else if (option31 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 20000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}

		if(option3==2) {
			System.out.println(green+"Correct : You won 30000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End-You lost"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 4
		System.out.println(yellow+"Question 4 :  What is the default value of a boolean variable in Java?\r\n"+ ""+reset);
		String A4="true";
		String B4="0";
		String C4="false";
		String D4="null";
		String L4="LIFE LINE";
		System.out.print(cyan+"1)"+A4+"  ");
		System.out.print("2)"+B4+"  ");
		System.out.print("3)"+C4+"  ");
		System.out.print("4)"+D4+"  ");
		System.out.println("5)"+L4+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option4 =new Integer( sc.nextInt());

		    if (option4 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 30000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option41 = sc.nextInt();

		                if (option41 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A4 + " - 20%  ");
		                    System.out.print("2) " + B4 + " - 25%  ");
		                    System.out.print("3) " + C4 + " - 45%  ");
		                    System.out.println("4) " + D4 + " - 10%");
		                    break;
		                } else if (option41 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B4 + "   3) " + C4);
		                    break;
		                } else if (option41 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 30000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		if(option4==3) {
			System.out.println(green+"Correct : You won 40000/-"+reset);
			
		}else {
			System.out.println(red+"Wrong Answer : Quiz End-You lost"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 5
		System.out.println(yellow+"Question 5 :   Which of the following is used to handle exceptions in Java?\r\n"+ ""+reset);
		String A5="throw";
		String B5="try-catch";
		String C5="throws";
		String D5="final";
		String L5="LIFE LINE";
		System.out.print(cyan+"1)"+A5+"  ");
		System.out.print("2)"+B5+"  ");
		System.out.print("3)"+C5+"  ");
		System.out.print("4)"+D5+"  ");
		System.out.println("5)"+L5+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option5 =new Integer( sc.nextInt());

		    if (option5 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 40000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option51 = sc.nextInt();

		                if (option51 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A5 + " - 20%  ");
		                    System.out.print("2) " + B5 + " - 45%  ");
		                    System.out.print("3) " + C5 + " - 25%  ");
		                    System.out.println("4) " + D5 + " - 10%");
		                    break;
		                } else if (option51 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B5 + "   3) " + C5);
		                    break;
		                } else if (option51 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 40000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		if(option5==2) {
			System.out.println(green+"Correct : You won Prize 50000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End-You lost"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 6
		System.out.println(yellow+"Question 6 :   Which of the following is a wrapper class in Java?\r\n"+ ""+reset);
		String A6="int";
		String B6="String";
		String C6="Integer";
		String D6="float";
		String L6="LIFE LINE";
		System.out.print(cyan+"1)"+A6+"  ");
		System.out.print("2)"+B6+"  ");
		System.out.print("3)"+C6+"  ");
		System.out.print("4)"+D6+"  ");
		System.out.println("5)"+L6+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option6 =new Integer( sc.nextInt());

		    if (option6 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 50000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option61 = sc.nextInt();

		                if (option61 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A6 + " - 20%  ");
		                    System.out.print("2) " + B6 + " - 25%  ");
		                    System.out.print("3) " + C6 + " - 45%  ");
		                    System.out.println("4) " + D6 + " - 10%");
		                    break;
		                } else if (option61 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B6 + "   3) " + C6);
		                    break;
		                } else if (option61 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 50000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		if(option6==3) {
			System.out.println(green+"Correct : You won Prize 60000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End"+reset);
			System.out.println(green+"You won Prize 50000/-"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 7
		System.out.println(yellow+"Question 7 :  What is the output of: System.out.println(10 + 20 + \"30\");?\r\n"+""+reset);
		String A7="3030";
		String B7="102030";
		String C7="30";
		String D7="3030";
		String L7="LIFE LINE";
		System.out.print(cyan+"1)"+A7+"  ");
		System.out.print("2)"+B7+"  ");
		System.out.print("3)"+C7+"  ");
		System.out.print("4)"+D7+"  ");
		System.out.println("5)"+L7+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option7 =new Integer( sc.nextInt());

		    if (option7 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 60000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option71 = sc.nextInt();

		                if (option71 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A7 + " - 20%  ");
		                    System.out.print("2) " + B7 + " - 10%  ");
		                    System.out.print("3) " + C7 + " - 25%  ");
		                    System.out.println("4) " + D7 + " - 45%");
		                    break;
		                } else if (option71 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B7 + "   4) " + D7);
		                    break;
		                } else if (option71 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 60000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		if(option7==4) {
			System.out.println(green+"Correct : You won Prize 70000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End"+reset);
			System.out.println(green+"You won Prize 50000/-"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 8
		System.out.println(yellow+"Question 8 :   Which interface is used to achieve multiple inheritance in Java?\r\n"+ ""+reset);
		String A8="Runnable";
		String B8="Serializable";
		String C8="Cloneable";
		String D8="Interface";
		String L8="LIFE LINE";
		System.out.print(cyan+"1)"+A8+"  ");
		System.out.print("2)"+B8+"  ");
		System.out.print("3)"+C8+"  ");
		System.out.print("4)"+D8+"  ");
		System.out.println("5)"+L8+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option8 =new Integer( sc.nextInt());

		    if (option8 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 70000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option81 = sc.nextInt();

		                if (option81 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A8 + " - 20%  ");
		                    System.out.print("2) " + B8 + " - 10%  ");
		                    System.out.print("3) " + C8 + " - 25%  ");
		                    System.out.println("4) " + D8 + " - 45%");
		                    break;
		                } else if (option81 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("3) " + C8 + "   4) " + D8);
		                    break;
		                } else if (option81 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 70000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		
		if(option8==4) {
			System.out.println(green+"Correct : You won Prize 80000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End"+reset);
			System.out.println(green+"You won Prize 70000/-"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 9
		System.out.println(yellow+"Question 9 :    Which collection class allows you to store key-value pairs and does not allow duplicate keys?\r\n"+ ""+reset);
		String A9="List";
		String B9="Set";
		String C9="Map";
		String D9="Queue";
		String L9="LIFE LINE";
		System.out.print(cyan+"1)"+A9+"  ");
		System.out.print("2)"+B9+"  ");
		System.out.print("3)"+C9+"  ");
		System.out.print("4)"+D9+"  ");
		System.out.println("5)"+L9+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option9 =new Integer( sc.nextInt());

		    if (option9 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 80000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option91 = sc.nextInt();

		                if (option91 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A9 + " - 20%  ");
		                    System.out.print("2) " + B9 + " - 25%  ");
		                    System.out.print("3) " + C9 + " - 45%  ");
		                    System.out.println("4) " + D9 + " - 10%");
		                    break;
		                } else if (option91 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B9 + "   3) " + C9);
		                    break;
		                } else if (option91 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 80000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		
		
		if(option9==3) {
			System.out.println(green+"Correct : You won Prize 90000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End"+reset);
			System.out.println(green+"You won Prize 70000/-"+reset);
			System.exit(0);
		}
		
		System.out.println("\n........................");
		
		//Question 10
		System.out.println(yellow+"Question 10 :    Which keyword is used to inherit a class in Java?\r\n"+ ""+reset);
		String A10="this";
		String B10="import";
		String C10="extends";
		String D10="implements";
		String L10="LIFE LINE";
		System.out.print(cyan+"1)"+A10+"  ");
		System.out.print("2)"+B10+"  ");
		System.out.print("3)"+C10+"  ");
		System.out.print("4)"+D10+"  ");
		System.out.println("5)"+L10+reset);
		System.out.println();
		while (true) {
		    System.out.print("Your Option: ");
		    option10 =new Integer( sc.nextInt());

		    if (option10 == 5) {
		        // Case: All 3 lifelines used
		        if (audiencePollUsed && fiftyFiftyUsed && quitUsed) {
		            System.out.println(red + "All lifelines have already been used!" + reset);
		            continue;
		        }

		        // Case: Audience Poll and 50-50 used, Quit is available
		        else if (audiencePollUsed && fiftyFiftyUsed && !quitUsed) {
		            System.out.println(yellow + "Two lifelines are over." + reset);
		            System.out.println("1) Quit the game");
		            System.out.println("2) Choose your option");

		            int decision = sc.nextInt();

		            if (decision == 1) {
		                quitUsed = true;
		                System.out.println(green + "You quit the game. You won 90000/-" + reset);
		                System.exit(0);
		            } else if (decision == 2) {
		                continue; // Let user answer the question
		            } else {
		                System.out.println(red + "Invalid input. Returning to question." + reset);
		                continue;
		            }
		        }

		        // Normal lifeline menu (some lifelines still available)
		        else {
		            while (true) {
		                System.out.println(yellow + "Lifeline Options:" + reset);
		                if (!audiencePollUsed) System.out.println("1) Audience Poll");
		                if (!fiftyFiftyUsed) System.out.println("2) 50-50");
		                if (!quitUsed) System.out.println("3) Quit");

		                System.out.print("Choose lifeline: ");
		                option101 = sc.nextInt();

		                if (option101 == 1 && !audiencePollUsed) {
		                    audiencePollUsed = true;
		                    System.out.println("Audience Poll Result:");
		                    System.out.print("1) " + A10 + " - 20%  ");
		                    System.out.print("2) " + B10 + " - 25%  ");
		                    System.out.print("3) " + C10 + " - 45%  ");
		                    System.out.println("4) " + D10 + " - 10%");
		                    break;
		                } else if (option101 == 2 && !fiftyFiftyUsed) {
		                    fiftyFiftyUsed = true;
		                    System.out.println("50-50 Option:");
		                    System.out.println("2) " + B10 + "   3) " + C10);
		                    break;
		                } else if (option101 == 3 && !quitUsed) {
		                    quitUsed = true;
		                    System.out.println(green + "You quit the game. You won 90000/-" + reset);
		                    System.exit(0);
		                } else {
		                    System.out.println(red + "Invalid or already used lifeline." + reset);
		                }
		            }
		        }
		    } else {
		        break; // user selected an answer other than lifeline
		    }
		}
		
		if(option10==3) {
			System.out.println(purple+"Correct : Congratulations you won the Quiz : You won Prize 100000/-"+reset);
		}else {
			System.out.println(red+"Wrong Answer : Quiz End"+reset);
			System.out.println(green+"You won Prize 70000/-"+reset);
			System.exit(0);
		}
	}
}
