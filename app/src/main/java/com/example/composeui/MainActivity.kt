package com.example.composeui

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.ClickableText
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.InnerPadding
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.Dp
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.composeui.ui.ComposeUITheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                // A surface container using the 'background' color from the theme
                display()

            }
        }
    }
}



@Preview
@Composable
 fun display() {
    Column {
        TopAppBar(title = {
            Text(text = "This is the header")

        }, backgroundColor = Color.Blue)

            Text(text = "diksha",modifier = Modifier.padding(10.dp,10.dp),color = Color.Blue,fontSize = 50.sp)
            Text(text = "raturi",modifier = Modifier.padding(10.dp,10.dp))

        Counter()

    }
}

    @Composable
    fun Counter(){
        val counterState = state { 0 }
        Button(onClick = {counterState.value++}) {
                Text(text = counterState.value.toString(), modifier = Modifier.padding(Dp(4f)))
        }
    }