package com.example.gabyb3.view
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun MainView(viewModel: MainViewModel){

    val contador: Int by viewModel.contador.observeAsState(0)

    var txtfieldValue by remember {
        mutableStateOf("")
    }

    Column {
        TextField(value = contador.toString(), onValueChange = {
        })
        Button(onClick = {
            viewModel.incrementContador()
         }) {
            Text(text = "Cliquei")
        }
    }

}

