package com.example.notekeeper;

import androidx.test.espresso.contrib.DrawerActions;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class NextThroughNotesTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void NextThroughNotes() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());
    }
}