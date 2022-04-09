package com.iamthanosntakaholdmylimez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner InputShit = new Scanner(System.in);

        String ISTHEREEVENALICENSE = null;
        String NoMod;
        String Attributes;
        String Port;
        String PortAttributes;

        System.out.println("Hello! Welcome to the Limez License Generator!");
        System.out.println("Note: This generator is still in version B-001");
        System.out.println("Remember not to misspell anything, as an answer other than \"yes\" will automatically be seen as \"no\"!");
        System.out.println("Are consumers allowed to modify/remix your product?");
        String Q1 = (InputShit.nextLine().trim());
        if (Q1.equalsIgnoreCase("yes")) {
            NoMod = "";
        } else {
            NoMod = "NM-";
        }
        System.out.println("If consumers are allowed to modify/remix your product, must they credit the creator of the product?");
        String Q2 = (InputShit.nextLine().trim());
        if (Q2.equalsIgnoreCase("yes")) {
            Attributes = "BY";
        } else {
            Attributes = "";
        }
        System.out.println("Are consumers allowed to port your product's content? (Example: modding Ritz the rat into Friday Night Funkin')");
        String Q3 = (InputShit.nextLine().trim());
        if (Q3.equalsIgnoreCase("yes")) {
            Port = "";
        } else {
            Port = "-NP";
        }
        System.out.println("If consumers are allowed to port your product's content, must they credit the creator of the product?");
        String Q4 = (InputShit.nextLine().trim());
        if (Q4.equalsIgnoreCase("yes")) {
            if (Port == "") {
                PortAttributes = "-PBY";
            } else {
                PortAttributes = "";
            }
        } else {
            PortAttributes = "";
        }
        String Commercial;
        System.out.println("Can consumers use your product for commercial purposes");
        String Q5 = (InputShit.nextLine().trim());
        if (Q5.equalsIgnoreCase("yes")) {
            Commercial = "";
        } else {
            Commercial = "-NC";
        }
        String Redistribute;
        System.out.println("If consumers can modify/remix your product, can they share their modification/remix?");
        String Q6 = (InputShit.nextLine().trim());
        if (Q6.equalsIgnoreCase("yes")) {
            if (NoMod == "") {
                Redistribute = "";
            } else {
                Redistribute = "";
            }
        } else {
            if (NoMod == "") {
                Redistribute = "-NMD";
            } else {
                Redistribute = "";
            }
        }
        String RedistributeTerms;
        System.out.println("If consumers can share modifications/remixes of your product, must they use the same license as you?");
        String Q7 = (InputShit.nextLine().trim());
        if (Q7.equalsIgnoreCase("yes")) {
            if (Redistribute == "" && !(NoMod == "NM-")) {
                RedistributeTerms = "-SL";
            } else {
                RedistributeTerms = "";
            }
        } else {
            RedistributeTerms = "";
        }
        String RedistributePort = null;
        System.out.println("If consumers can port your product, can they share their ports?");
        String Q8 = (InputShit.nextLine().trim());
        if (Q8.equalsIgnoreCase("yes")) {
            RedistributePort = "";
        } else {
            if (Port == "") {
                RedistributePort = "-NPD";
            } else {
                RedistributePort = "";
            }
        }
        String RedistributePortTerms = null;
        System.out.println("If consumers can share their ports of your product, must they use the same license as you?");
        String Q9 = (InputShit.nextLine().trim());
        if (Q9.equalsIgnoreCase("yes")) {
            if (RedistributePort == "") {
                RedistributePortTerms = "-PSL";
            } else {
                RedistributePortTerms = "";
            }
        } else {
            RedistributePortTerms = "";
        }

        /* if (NoMod == "" && Attributes == "") {
            System.out.println("You do not need a license!");
            ISTHEREEVENALICENSE = "no";
        } */

        if (NoMod == "" && ISTHEREEVENALICENSE == null) {
            System.out.println("Your license is: Limez " + Attributes + Port + PortAttributes + Commercial + Redistribute + RedistributeTerms + RedistributePort + RedistributePortTerms);
        } else if (NoMod == "NM-") {
            System.out.println("Your license is: Limez " + NoMod + Port + PortAttributes + Commercial + Redistribute + RedistributeTerms + RedistributePort + RedistributePortTerms);
        }
        System.out.println("To terminate the terminal, type anything and hit enter.");
        String ExitConfirm = (InputShit.nextLine().trim());
        if (ExitConfirm == "") {
            // nothing
        } else {
            // something
        }
    }
}
