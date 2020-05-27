package com.example.myfirstapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
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

    @Test
    fun checkTextViewKaspresso() {
        activityTestRule.launchActivity(null)

        onScreen<MainScreen> {
            title { hasText("Генератор квестов онлайн") }
            warnTitle { hasText("Пусть он даже и не онлайн, но всем ведь пофиг") }
            textLocality{hasText("Выберите местность")}
            textTime{hasText("Выберите время")}
            buttonGetQuest{hasText("Получить квест")}
        }
    }

    @Test
    fun checkCreateQuestKaspresso() {
        activityTestRule.launchActivity(null)

        onScreen<MainScreen> {
            spinnerLocality {click()}
            localityForest {click()}
            radioNight {click()}
            buttonGetQuest {click()}
        }
        onScreen<SecondPage.SecondScreen> {
            quest {hasText("Прогнать разбойников")}
            reward {hasText("100 золотых")}
        }
    }
}
