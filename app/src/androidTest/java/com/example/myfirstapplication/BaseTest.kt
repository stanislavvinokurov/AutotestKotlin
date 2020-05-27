package com.example.myfirstapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

open class BaseTest {
    fun clickElementById(resourceId: Int) {
        onView(withId(resourceId))
            .perform(click())
    }

    fun clickElementByText(resourceText: String) {
        onView(withText(resourceText))
            .perform(click())
    }

    fun checkTextElementById(resourceId: Int, text: String) {
        onView(withId(resourceId))
            .check(ViewAssertions.matches(withText(text)))
    }

}
