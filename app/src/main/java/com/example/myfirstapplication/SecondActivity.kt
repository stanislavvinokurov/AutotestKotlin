package com.example.myfirstapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    companion object {
        var QUEST = "Квест2"
        var REWARD = "Награда2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showQuest()
    }

    private fun showQuest() {
        textView_quest.text = QUEST.toString()
        textView_reward.text = REWARD.toString()
    }
}
