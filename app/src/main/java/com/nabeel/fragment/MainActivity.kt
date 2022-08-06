package com.nabeel.fragment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var activityInterface: ActivityInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("select Color")
                setPositiveButton("white") { _, _ ->
                    activityInterface.ActivityInterface(1)
                }
                    setNegativeButton("purple") { _, _ ->
                        activityInterface.ActivityInterface(2)
                    }
                        setNeutralButton("Black") { _, _ ->
                            activityInterface.ActivityInterface(3)
                        }

                        }.show()
                    }
                }



            fun showSnackbar(msg: String) {
                Snackbar.make(btn, msg, Snackbar.LENGTH_SHORT).show()
            }
}
