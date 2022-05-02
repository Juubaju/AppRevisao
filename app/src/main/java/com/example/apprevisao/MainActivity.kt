package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1 = findViewById<EditText>(R.id.editTextNumber)
        val valor2 = findViewById<EditText>(R.id.editTextNumber2)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
            val valor1int = findViewById<EditText>(R.id.editTextNumber)
            val valor2int = findViewById<EditText>(R.id.editTextNumber2)

            if(valor1.text.isNotEmpty() && valor2.text.isNotEmpty()){
                if(Integer.parseInt(valor1.text.toString()) > Integer.parseInt(valor2int.text.toString())){
                    Toast.makeText(this, "O Campo 1 é maior que o campo 2", Toast.LENGTH_SHORT).show()
                }else if(Integer.parseInt(valor1.text.toString()) < Integer.parseInt(valor2int.text.toString())){
                    Toast.makeText(this, "O Campo 1 é menor que o campo 2", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "O Campo 1 é igual ao campo 2", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}