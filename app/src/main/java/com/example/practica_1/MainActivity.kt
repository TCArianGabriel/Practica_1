package com.example.practica_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica_1.ui.theme.Practica_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cuerpo()
                }
            }
        }
    }
}

@Composable
fun cuerpo() {
    estructura(
        titulo = stringResource(R.string.title_jetpack_compose_tutorial),
        descripcion1 = stringResource(R.string.compose_short_desc),
        descripcion2 = stringResource(R.string.compose_long_desc),
        imagen = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun estructura(
    titulo: String,
    descripcion1: String,
    descripcion2: String,
    imagen: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(
            painter = imagen,
            contentDescription = null
        )
        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = descripcion1,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = descripcion2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Practica_1Preview() {
    Practica_1Theme {
        cuerpo()
    }
}