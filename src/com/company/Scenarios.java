package com.company;

import java.util.Scanner;

public class Scenarios {
static Scanner scan=new Scanner(System.in);


    public static void beginningScenario(){
        Game.printHeading("The Dungeon of Supreme Ancalagon");
        Game.anythingToContinue();
        Game.printHeading("Once upon a time, there was a beautiful life in a village. The name of this village was Andirul.\nThe villagers lived a very happy, comfortable and prosperous life. On the other hand, they had some enemies.\nThey called themselves Ribbles. Ribbles was the lord of evil. They called themselves sons of fire. \nThey wanted to take over the world and burn it down completely. \nThe Andirul people and the Ribble people went through a great war 600 years ago. \nThe name of this battle was the battle of Liaundum. The battle of Liandum got its name from a stone. \nThis stone was very important to the people of Andirul. Because this stone was destroying fire. This battle was for the Liandum stone. \nThe people of Andirul won the war. However, the Liandum stone was lost in the war. \n" +
                "                                                                                       \nAt least that's how it was known.\n");
        Game.anythingToContinue();
        Game.clearConsole();
        Game.printHeading("One day, 600 years later, the people of Anduril woke up with evil. When they woke up, everything was on fire. Houses, fields, gardens, people. There was complete chaos. \nNobody could understand anything. 600 years had passed, and no one could have made a fire of such a magnitude. Until he shows up. \nSupreme ANCALAGON, known as the greatest, biggest and most powerful of dragons. He was the most dangerous being of all time. The strongest creature of the Ribbles people. It was an uncontrollable creature. \nHe drew his strength from fire. The Andirul people needed to find the stone. They understood this. Otherwise they would die. ");
        Game.printHeading("What is your hero's name?");
        String heroName=scan.nextLine();
        Game.printHeading("\nThey needed a hero. That hero was the person who would become the great-grandson of Oswald the Great, the hero of the war 600 years ago. This hero’s name is "+heroName+".");
        Game.anythingToContinue();
        Game.clearConsole();
    }
    public static void assassinBackground(){
        Game.printHeading("The Assassin class is a very fast class. It moves and accelerates quickly. Their attacks are often deadly. \nThe Assassin class uses dual blades, machetes, and throwing blades. \nHowever, they are not as protected as the Tank class. They use light armor.");
    }
    public static void tankBackground(){
        Game.printHeading("Tank class is very powerful class. They have heavy armor reinforced with steel made of special elephant tusks. \nThey use long swords, short swords and sword-shields. However, it is slow compared to other classes.");
    }
    public static void archerBackground(){
        Game.printHeading("The Archer class is the ranged class. They can take down their opponent from great distances. He is fast in this class. \nThey use medium armor. They use long-range arrows, short-range arrows, crossbows. However, they are not as fast as the assassin class.");
    }

}
