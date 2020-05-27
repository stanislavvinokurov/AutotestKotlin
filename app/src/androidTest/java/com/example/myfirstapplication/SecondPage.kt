package com.example.myfirstapplication

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView

class SecondPage : BaseTest() {
    fun getQuest(): Int {
        return R.id.textView_quest
    }

    fun getReward(): Int {
        return R.id.textView_reward
    }

    class SecondScreen : Screen<SecondScreen>() {
        val quest = KTextView{withId(R.id.textView_quest)}
        val reward = KTextView{withId(R.id.textView_reward)}
    }
}