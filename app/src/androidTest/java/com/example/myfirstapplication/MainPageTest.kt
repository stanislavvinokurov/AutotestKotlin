package com.example.myfirstapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainPageTest {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    var mainPage = MainPage()
    var secondPage = SecondPage()

    @Test
    fun checkTextView() {
        activityTestRule.launchActivity(null)
        mainPage.checkTextElementById(mainPage.getTitle(), "Генератор квестов онлайн")
        mainPage.checkTextElementById(mainPage.getWarnTitle(), "Пусть он даже и не онлайн, но всем ведь пофиг")
        mainPage.checkTextElementById(mainPage.getTextLocality(), "Выберите местность")
        mainPage.checkTextElementById(mainPage.getTime(), "Выберите время")
        mainPage.checkTextElementById(mainPage.getButtonGetQuest(), "Получить квест")
    }

    @Test
    fun checkCreateQuest() {
        activityTestRule.launchActivity(null)
        mainPage.clickElementById(mainPage.getSpinnerLocality())
        mainPage.clickElementByText("Лес")
        mainPage.clickElementById(mainPage.getRadioButtonNight())
        mainPage.clickElementById(mainPage.getButtonGetQuest())

        secondPage.checkTextElementById(secondPage.getQuest(), "Прогнать разбойников")
        secondPage.checkTextElementById(secondPage.getReward(), "100 золотых")
    }
}
