package com.example.puppy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.puppy.ui.theme.LuffyTheme
import com.example.puppy.ui.theme.AccentColor
import com.example.puppy.ui.theme.DarkPrimaryColor
import com.example.puppy.ui.theme.PrimaryColor

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LuffyTheme {
                LuffyApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LuffyApp() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Luffy 🐾",
                        fontWeight = FontWeight.Bold,
                        color = DarkPrimaryColor
                    )
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Surface(
                modifier = Modifier.size(180.dp),
                shape = CircleShape,
                color = PrimaryColor
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "🐶",
                        fontSize = 90.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "¡Bienvenido a Luffy!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = DarkPrimaryColor,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Todo lo que tu mascota necesita " +
                        "en un solo lugar.",
                fontSize = 18.sp,
                color = DarkPrimaryColor,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            LuffyCard()

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DarkPrimaryColor
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Explorar productos",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AccentColor
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Nuestros servicios",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "🐾 Amor, cuidado y bienestar animal 🐾",
                color = DarkPrimaryColor,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun LuffyCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = PrimaryColor
        ),
        shape = RoundedCornerShape(20.dp)
    ) {

        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Conoce nuestra marca",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = DarkPrimaryColor
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "En Luffy pensamos que las mascotas " +
                        "son parte de la familia.",
                textAlign = TextAlign.Center,
                color = DarkPrimaryColor
            )
        }
    }
}