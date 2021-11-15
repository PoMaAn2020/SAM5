package com.pomaan.sam5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
private const val TAG = "LogTag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Любви, надежды, тихой славы\n" +
                "Недолго нежил нас обман,\n" +
                "Исчезли юные забавы,\n" +
                "Как сон, как утренний туман;")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Но в нас горит еще желанье,\n" +
                "Под гнетом власти роковой\n" +
                "Нетерпеливою душой\n" +
                "Отчизны внемлем призыванье.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Мы ждем с томленьем упованья\n" +
                "Минуты вольности святой,\n" +
                "Как ждет любовник молодой\n" +
                "Минуты верного свиданья.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Пока свободою горим,\n" +
                "Пока сердца для чести живы,\n" +
                "Мой друг, отчизне посвятим\n" +
                "Души прекрасные порывы!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Товарищ, верь: взойдет она,\n" +
                "Звезда пленительного счастья,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Россия вспрянет ото сна, \n" +
                "И на обломках самовластья \n" +
                "Напишут наши имена!")

    }
}