package com.example.android.background.sync;

// Complete (1) Create a class called ReminderTasks

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks {

    // Complete (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public static String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

    // Complete (3) Create a private static void method called incrementWaterCount
    // Complete (4) Add a Context called context to the argument list
    private static void incrementWaterCount(Context context) {

        // Complete (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count
        PreferenceUtilities.incrementWaterCount(context);
    }

    // Complete (6) Create a public static void method called executeTask
    // Complete (7) Add a Context called context and String parameter called action to the parameter list

    public static void executeTask(Context context, String action) {
        // Complete (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount
        if (action.equals(ReminderTasks.ACTION_INCREMENT_WATER_COUNT)) {
            incrementWaterCount(context);
        }
    }

}



