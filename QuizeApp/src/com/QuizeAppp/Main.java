package com.QuizeAppp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Quize q=new Quize();
	q.logic();
}
}

  class Quize
  {
	  Scanner sc=new Scanner(System.in);
	  int CorrectAnsCount=0;
	  int WrongAnsCount=0;
	  
	  public void logic()
	  {
		  Questions q1=new Questions("Which statement is true about java?","a) Java is a procedure-programing language"
	     ,"b) Java is a Scripting language","c) Java is a platform independent programing language ","d) Java is a object oriented programing language");
		  Questions q2=new Questions("what is the extension of the java code files ?","a) .js","b) .txt", "c) .class","d) .java");
		  Questions q3=new Questions("who invented java programing?","a) Denies Richie","b) James Gosling","c) John Cena","d) Chalse Bevage");
		  Questions q4=new Questions("Which will legally declare, construct, and initialize an array?","a) int [] myList = {\"1\", \"2\", \"3\"};","b) int [] myList = (5, 8, 2);","c) int myList [] [] = {4,9,7,0};","d) int myList [] = {4, 3, 7};");
		  Questions q5=new Questions("Which is a valid keyword in java?","a) interface","b) string","c) Float","d) unsigned");
		
		  Map<Questions,Character> hmap=new HashMap<Questions,Character>();
		  hmap.put(q1, 'c');
		  hmap.put(q2,'d');
		  hmap.put(q3,'b');
		  hmap.put(q4,'d');
		  hmap.put(q5, 'a');
			
		  for (Map.Entry<Questions, Character> map:hmap.entrySet()) {
			  System.out.println(map.getKey().getQuestion());
			  System.out.println(map.getKey().getOption1());
			  System.out.println(map.getKey().getOption2());
			  System.out.println(map.getKey().getOption3());
			  System.out.println(map.getKey().getOption4());
			  
				
			System.out.println("Enter Your Answer: ");
			Character ans=sc.next().charAt(0);
			int cans=Character.compare(ans,map.getValue() );
			if(cans==0)
			{
				System.out.println("Correct ");
				System.out.println("-------------------------------");
				CorrectAnsCount++;
			}
			else
			{
				System.err.print("Your Answer is Wrong!!!");
				System.out.println("-------------------------------");
				WrongAnsCount++;
			}
			}
		  
		  System.out.println();
		  System.out.println("------Result------");
		  System.out.println("Correct Answer Questions: "+CorrectAnsCount);
		  System.out.println("Wrong Answer Questions: "+WrongAnsCount);
		  int perc=(100*CorrectAnsCount)/hmap.size();
		  System.out.println("Percentage: "+perc);
		  if(perc>90)
		  {
			  System.out.println("Your are Qualify for next Round ");
		  }
		  else if(perc<35)
		  {
			  System.err.println("Your are not Qualify!!!");
		  }
		  else {
               System.err.println("You need to take one more attemp for next round!!!");			  
		  }
		}

				  
	  }
  
  
