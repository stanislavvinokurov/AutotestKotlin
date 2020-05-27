package com.example.myfirstapplication

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