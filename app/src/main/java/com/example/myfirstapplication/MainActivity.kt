package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.R.layout.activity_main
import com.example.myfirstapplication.SecondActivity.Companion.QUEST
import com.example.myfirstapplication.SecondActivity.Companion.REWARD
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }

    fun getQuest(view: View) {
        var quest = Quest("Какой-то дефолтный квест. Ну зхнаете, приходите вы в деревню, а там вам \"Убей крысу в подвале\". Это он", "Награда")

        when (spinner_locality.selectedItem.toString()) {
            "Снег" -> {
                quest = if (radiobutton_time_day.isChecked) {
                    Quest("Добыть шкуры трех медведей для утепления юрты", "300 золотых")
                } else {
                    Quest("Выследить, кто воет неподалеку от деревни", "150 золотых")
                }
            }
            "Пустыня" -> {
                quest = if (radiobutton_time_day.isChecked) {
                    Quest("Решить проблему с пересохшим колодцем", "50 золотых и верблюд")
                } else {
                    Quest("Посетить ночной рынок с целью нахождения артефакта, помогающего переносить жару", "50 золотых")
                }
            }
            "Лес" -> {
                quest = if (radiobutton_time_day.isChecked) {
                    Quest("Найти потерявшуюся корову", "30 золотых")
                } else {
                    Quest("Прогнать разбойников", "100 золотых")
                }
            }
            "Море" -> {
                quest = if (radiobutton_time_day.isChecked) {
                    Quest("Проверить рыбацкие сначти рыбаку от мастера", "10 золотых")
                } else {
                    Quest("Проверить слухи о рыбалке", "100 золотых")
                }
            }
            "Горы" -> {
                quest = if (radiobutton_time_day.isChecked) {
                    Quest("Разгрести завал, перекрывающий торговый путь", "200 золотых")
                } else {
                    Quest("Проверить место удара молнии на предмет наличия золота", "250 золота")
                }
        }
        }

        val randomIntent = Intent(this, SecondActivity::class.java)

        QUEST = quest.textQuest
        REWARD = quest.reward

        startActivity(randomIntent);
    }
}

data class Quest(var textQuest: String, var reward: String)