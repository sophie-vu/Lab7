package com.example.lab7;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest2 {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void emailIsInvalid() {
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@"), closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"), closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Email")).check(matches(isDisplayed()));

    }
    @Test
    public void firstNameIsInvalid() {
        onView(withId(R.id.username)).perform(typeText("D:"), closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"), closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid First Name")).check(matches(isDisplayed()));

    }
    @Test
    public void lastNameIsInvalid() {
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("D:"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("admin"), closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Last Name")).check(matches(isDisplayed()));
    }
    @Test
    public void passwordIsInvalid() {
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("1234567890"), closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Pass Word")).check(matches(isDisplayed()));
    }

}
