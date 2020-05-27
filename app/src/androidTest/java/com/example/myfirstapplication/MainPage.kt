package com.example.myfirstapplication

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

class MainPage : BaseTest() {
    fun getTitle(): Int {
        return R.id.title
    }

    fun getWarnTitle(): Int {
        return R.id.warn_title
    }

    fun getTextLocality() : Int {
        return R.id.textview_locality
    }

    fun getTime() : Int {
        return R.id.textview_time
    }

    fun getSpinnerLocality(): Int {
        return R.id.spinner_locality
    }

    fun getRadioButtonNight(): Int {
        return R.id.radiobutton_night
    }

    fun getButtonGetQuest(): Int {
        return R.id.button
    }
}

class MainScreen : Screen<MainScreen>() {
    val title = KTextView{withId(R.id.title)}
    val warnTitle = KTextView{withId(R.id.warn_title)}
    val textLocality = KTextView{withId(R.id.textview_locality)}
    val textTime = KTextView{withId(R.id.textview_time)}
    val spinnerLocality = KView{withId(R.id.spinner_locality)}
    val localityForest = KView{withText("Лес")}
    val radioNight = KButton{withId(R.id.radiobutton_night)}
    val buttonGetQuest = KButton{withId(R.id.button)}
}
