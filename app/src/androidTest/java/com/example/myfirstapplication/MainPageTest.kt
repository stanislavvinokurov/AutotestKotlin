package com.example.myfirstapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainPageTest {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun checkTextView() {
        activityTestRule.launchActivity(null)
        onView(withId(R.id.title))
            .check(matches(withText("Генератор квестов онлайн")))
        onView(withId(R.id.warn_title))
            .check(matches(withText("Пусть он даже и не онлайн, но всем ведь пофиг")))
        onView(withId(R.id.textview_locality))
            .check(matches(withText("Выберите местность")))
        onView(withId(R.id.textview_time))
            .check(matches(withText("Выберите время")))
        onView(withId(R.id.button))
            .check(matches(withText("Получить квест")))
    }

    @Test
    fun checkCreateQuest() {
        activityTestRule.launchActivity(null)
        onView(withId(R.id.spinner_locality))
            .perform(click())
        onView(withText("Лес"))
            .perform(click())
        onView(withId(R.id.radiobutton_night))
            .perform(click())
        onView(withId(R.id.button))
            .perform(click())

        onView(withId(R.id.textView_quest))
            .check(matches(withText("Прогнать разбойников")))
        onView(withId(R.id.textView_reward))
            .check(matches(withText("100 золотых")))
    }
}