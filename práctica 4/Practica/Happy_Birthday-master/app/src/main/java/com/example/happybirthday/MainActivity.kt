package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // Utiliza Box para superponer la imagen de fondo y el contenido
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Agrega la imagen de fondo
                    Image(
                        painter = painterResource(id = R.drawable.fondo),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                    // Agrega la imagen de la tarta en la parte inferior izquierda
                    Image(
                        painter = painterResource(id = R.drawable.tarta), // Reemplaza "tarta" con el nombre de tu imagen de tarta
                        contentDescription = null,
                        modifier = Modifier
                            .size(180.dp) // Ajusta el tamaño de la imagen de la tarta
                            .align(Alignment.BottomStart) // Posición inferior izquierda
                    )

                    // Agrega tu contenido encima de la imagen
                    GreetingText(felicitacion= "Nunca es demasiado tarde para ser lo que podrías haber sido.", message = "Happy Birthday Erica!", from = "From Ana")
                }
            }
        }
    }
}

@Composable
fun GreetingText(felicitacion: String,message: String, from: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(top = 220.dp)
    ) {
        Text(
            text = felicitacion,
            fontSize = 44.sp,
            lineHeight = 48.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 56.sp,
            modifier = modifier.padding(top = 10.dp),
            textAlign = TextAlign.End
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(8.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(felicitacion= "Nunca es demasiado tarde para ser lo que podrías haber sido.", message = "Happy Birthday Erica!", from ="From Ana")
    }
}