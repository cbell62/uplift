package com.example.josep.uplift;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
    int[] athleticNums = {9,27,31,34,40,42,46,47,51,58,63,72,81,84,95,107,113,117,121,129,133,142,163,164,173,174};
    String[] athletics = new String[athleticNums.length];

    int[] outdoorNums = {3,4,7,8,9,14,51,59,70,72,92,107,108,110,113,116,120,121,124,128,129,130,134,138,142,147,156,163,164,173,174,179,180,183};
    String[] outdoors = new String[outdoorNums.length];

    int[] indoorNums = {1,3,7,9,27,57,72,83,89,93,104,105,109,116,124,128,129,132,133,134,138,144,146,147,151,157,161,162,165,168,170,171,179,181};
    String[] indoors = new String[indoorNums.length];

    int[] creatingNums = {3,4,15,20,33,41,56,66,67,72,77,78,79,83,85,86,92,104,104,106,111,116,125,135,144,166,177};
    String[] creating = new String[creatingNums.length];

    int[] sightNums = {4,19,24,44,55,56,90,91,92,93,94,99,105,108,110,113,116,120,121,128,130,143,145,147,151,154,156,163,164,171,173,174,180,181,183};
    String[] sight = new String[sightNums.length];

    int[] soundNums = {4,10,14,16,18,37,44,51,75,77,99,103,105,108,110,113,117,140,154,155,156,159,168,184};
    String[] sound = new String[soundNums.length];

    int[] feelNums = {1,3,4,6,14,16,158,162};
    String[] feel = new String[feelNums.length];

    int[] memoryNums = {11,12,15,17,22,24,29,32,35,45,47,60,73,82,90,98,100,101,112,118,131,132,135,137,152,160,175,178};
    String[] memory = new String[memoryNums.length];

    int[] productivityNums = {2,11,15,22,23,25,29,30,32,39,58,83,88,92,101,104,106,109,111,115,116,119,125,126,128,132,141,144,161,169,176,181,184};
    String[] productivity = new String[productivityNums.length];

    int[] consumptionNums = {13,28,39,45,80,87,89,93,94,109,114,119,138,149,161,182};
    String[] consumption = new String[consumptionNums.length];

    int[] personal_timeNums = {1,2,8,14,16,19,26,55,91,103,105,106,112,116,117,118,119,120,122,123,124,125,126,127,131,132,138,141,145,148,152,154,156,160,162,163,166,167,168,170,171,175,176,177,178,181};
    String[] personal_time = new String[personal_timeNums.length];

    int[] socializingNums = {4,8,11,16,20,21,22,23,44,48,49,50,54,59,62,71,72,75,76,77,82,89,90,93,96,97,99,105,107,108,109,110,113,114,115,116,117,120,121,123,125,126,128,129,130,133,134,139,140,142,143,146,150,151,153,155,158,162,163,164,165,166,168,169,170,174,180,184,185};
    String[] socializing = new String[socializingNums.length];

    int[] small_activitiesNums = {1,3,5,7,13,19,29,22,33,34,38,43,48,53,59,63,64,70,72,77,83,94,103,105,106,108,110,111,113,116,117,120,121,122,123,125,216,127,128,129,130,132,135,139,140,141,143,144,145,146,147,149,150,151,153,154,155,156,157,158,161,162,165,166,167,168,169,170,173,174,177,180,181,182,183,184};
    String[] small_activities = new String[small_activitiesNums.length];

    int[] sexualNums = {36,52,76,96,172};
    String[] sexual = new String[sexualNums.length];

    int[] atmosphereNums = {4,14,18,37,44,56,71,88,89,91,96,97,103,105,107,108,110,113,116,117,120,121,122,123,127,128,129,132,140,143,146,147,151,153,154,155,156,157,159,162,163,164,165,168,170,173,174,176,180};
    String[] atmosphere = new String[atmosphereNums.length];

    int[] onlineNums = {7,11,13,22,23,88,90,103,105,127,139,143,145,153,161,170,172,184};
    String[] online = new String[onlineNums.length];

    int[] leaving_comfort_zoneNums = {7,15,23,44,71,113,129,147,176,};
    String[] leaving_comfort_zone = new String[leaving_comfort_zoneNums.length];

    int[] animalNums = {91,179};
    String[] animal = new String[animalNums.length];



    public String[] find(int[] activityNums, String[] activities) {
        File file = new File("D:/Computer Science/Tutoring/Sale/HackNC2019/src/hacknc2019/activities.txt");

        try {
            Scanner scanner = new Scanner(file);
            //now read the file line by line...
            int lineNum = 0;
            int countActivityIndex = 0;
            while (scanner.hasNextLine()) {

                if (lineNum + 1 == activityNums[countActivityIndex]) {
                    activities[countActivityIndex] = scanner.nextLine();
                    System.out.println(activities[countActivityIndex]);
                    countActivityIndex++;
                }
                else {
                    scanner.nextLine();
                }
                if (activityNums[activityNums.length-1] == lineNum +1) {
                    break;
                }
                lineNum++;
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return activities;
    }
}
