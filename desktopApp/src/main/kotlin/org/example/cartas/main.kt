package org.example.cartas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import org.example.cartas.resources.Res
import org.example.cartas.resources.doraemon
import org.example.cartas.resources.yoshi
import org.example.cartas.resources.zen
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


fun main() = application {
    val windowState = WindowState(size = DpSize(1200.dp, 800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Cartas",
        state = windowState
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFE0E0E0)
        ) {
            Column(
                modifier = Modifier.fillMaxSize().background(Color(0xFFE0E0E0)),
            ) {
                tarjeta(Res.drawable.doraemon, "Carlos Rojas Gomariz", "Desarrollador DAM", "carlos@gmail.com", "palma")
                tarjeta(Res.drawable.yoshi, "Juan Lomas Lugubres", "Desarrollador DAW", "juan@gmail.com", "Barcelona")
                tarjeta(Res.drawable.zen, "Javier Fernandez Cifuentes", "Inglés", "javifernandezpro@gmail.com", "palma")
            }
        }
    }
}

@Composable
fun tarjeta(img: DrawableResource, nme:String, estudia: String, correo:String, ciudad:String) {
    Card(modifier = Modifier

        .padding(10.dp)
        .background(Color(0xFFE0E0E0)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )

    ) {
        Row(modifier = Modifier.height(190.dp)) {
            Image(painter = painterResource(img), contentScale = ContentScale.Crop, contentDescription = "", modifier = Modifier
                .padding(horizontal = 30.dp)
                .width(100.dp)
                .height(100.dp)
                .clip(CircleShape)
                .border(width = 3.dp, color = Color(0xFF00838F), shape = CircleShape)
                .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier

                    .height(300.dp)
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,

            ) {
                Text(nme, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(estudia, color = Color.Red)
                HorizontalDivider()

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Correo: ", fontWeight = FontWeight.Bold)
                    Text(correo)
                }

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Ciudad: ", fontWeight = FontWeight.Bold)
                    Text(ciudad)
                }
            }
        }
    }
}