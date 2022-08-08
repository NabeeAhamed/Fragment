package com.nabeel.fragment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
    import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
    import com.google.android.material.dialog.MaterialAlertDialogBuilder
    import com.google.android.material.snackbar.Snackbar

    class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var activityInterface: ActivityInterface
    var i = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("select Color")
                setPositiveButton("white") { _, _ ->
                    activityInterface.setBackgroundColor(1, i)
                    i++
                }
                    setNegativeButton("purple") { _, _ ->
                        activityInterface.setBackgroundColor(2, i)
                        i++
                    }
                        setNeutralButton("Black") { _, _ ->
                            activityInterface.setBackgroundColor(3, i)
                            i++
                        }

                        }.show()
                    }
                }



            fun showSnackbar(msg: String) {
                Snackbar.make(btn, msg, Snackbar.LENGTH_SHORT).show()
            }
}
