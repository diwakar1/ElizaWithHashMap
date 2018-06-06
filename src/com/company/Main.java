// eLIZA WITH USING HASHMAP
package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Welcome to cudtomer Service");
        System.out.println(" ------------------------------\n");
        System.out.println("Please enter your question");
        String question = input.nextLine();
        String message = "";
        int count = 0;
        //String h = getHedges();
        //String q = getQualifiers();


        while (!question.toLowerCase().equals("q")) {

            String[] inpt = (question.split(" "));
            List<String> inptList = new ArrayList<>(Arrays.asList(inpt));
            String q = getQualifiers();


            if ((inptList.contains("I")) || (inptList.contains("my")) || (inptList.contains("me"))
                    || (inptList.contains("am")) || (inptList.contains("you"))) {
                for (int i = 0; i < inpt.length; i++) {
                    if (inpt[i].contains("I")) {
                        inpt[i] = inpt[i].replace("I", "you");
                    } else if (inpt[i].contains("me")) {
                        inpt[i] = inpt[i].replace("me", "you");
                    } else if (inpt[i].contains("my")) {
                        inpt[i] = inpt[i].replace("my", "your");
                    } else if (inpt[i].contains("am")) {
                        inpt[i] = inpt[i].replace("am", "are");
                    } else if (inpt[i].contains("you")) {
                        inpt[i] = inpt[i].replace("you", "me");

                    } else {
                        inpt[i] = inpt[i];
                    }

                    message += (inpt[i] + " ");
                }
                System.out.print(q + " " + message);
                System.out.print("?");
                count++;
                System.out.println("\n-----------------------------------------------------------------" + count);
                System.out.println("Enter your Response here are or 'Q' to End the chat?");
                question = input.nextLine();
                message = "";

            } else {
                count++;
                String h = getHedges();
                System.out.println(h);
                System.out.println("\n-----------------------------------------------------------------" + count);
                System.out.println("Enter your Response here are or 'Q' to End the chat?");
                question = input.nextLine();
            }

        }


        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Thank you For chatting with us Today");
        System.out.println("You received " + count + " Responses today");

    }


      public static String getHedges() {
      Random rand = new Random();
      HashMap<Integer, String> hedges = new HashMap<Integer, String>();
      hedges.put(1, "Please tell me more");
      hedges.put(2, "Many of my patients tell me the same thing It is getting late");
      hedges.put(3, "Maybe we better quit");
      hedges.put(4, "I think we should go now");
      int ran = rand.nextInt(hedges.size());
      String hed = hedges.get(1+ran);
      return (hed);
  }

      public static String getQualifiers(){
          Random rand = new Random();
          HashMap<Integer, String> qualifiers = new HashMap<Integer, String>();
          qualifiers.put(1, "Why do you say that");
          qualifiers.put(2, "You seem to think that");
          qualifiers.put(3, "So you are concerned that");
          qualifiers.put(4, "You meant to say that");
          qualifiers.put(5, "Is that your thought that");
          int ran2 = rand.nextInt(qualifiers.size());
          String hed2 = qualifiers.get(ran2+1);
          return (hed2);
      }




    }




