package com.ort.usuarioycontrasea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var input:EditText
    lateinit var inputPSWR:EditText
    lateinit var label:TextView
    var inputText:String = ""
    var str_user = ""
    var str_pass = ""
    var i = 1



    private val userList: MutableList<User> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList.add(User("Ari","1234","aridayan@gmail"))
        userList.add(User("Liam","5678","liampolo@gmail"))
        btn = findViewById(R.id.button)
        input = findViewById(R.id.edit_txt_user)
        label = findViewById(R.id.textView)
        inputPSWR =findViewById(R.id.edit_txt_pwr)

        label.text = ""

        btn.setOnClickListener {
           inputText = input.text.toString()
            str_pass = inputPSWR.text.toString()


            if ((inputText.isNotEmpty()|| str_pass.isNotEmpty() )){

            }
            else{
                Snackbar.make(it,"ingrese usuario y/o",Snackbar.LENGTH_SHORT).show()
            }

            for(User in userList){

                if(userList[i].name == inputText && userList[i].password== str_pass){


                    Snackbar.make(it,"sesion iniciada",Snackbar.LENGTH_SHORT).show()

                }

                else{

                    Snackbar.make(it,"usuario y/o contraseña incorrectas",Snackbar.LENGTH_SHORT).show()

                }

                i = i + 1




        }
        

    }
}
}

