package com.example.practice_fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.practice_fitness.fitness.Fitness_Hi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button
        val selectFitness = findViewById<Button>(R.id.selectFitness)

        //메인 화면에서 selectFitness 버튼 선택 시
        selectFitness.setOnClickListener{
            var intent = Intent(this, SelectFitnessActivity::class.java)
            startActivity(intent)
        }

    }
}