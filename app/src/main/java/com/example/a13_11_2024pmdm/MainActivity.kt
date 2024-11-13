package com.example.a13_11_2024pmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a13_11_2024pmdm.ui.theme._13112024pmdmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _13112024pmdmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tarea(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview
@Composable
fun Tarea(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Inicio de la app
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.WhatsappText),
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
                fontSize = 18.sp
            )

            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "Image 1",
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "Image 2",
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.image3),
                contentDescription = "Image 3",
                modifier = Modifier
                    .size(32.dp)
            )
        }
        Spacer(Modifier.padding(60.dp))


    //personas
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User1),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }
        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User2),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }

        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User3),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }

        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User4),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }

        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User5),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }

        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User6),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }

        Spacer(Modifier.padding(20.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable._2225935),
                contentDescription = "ProfileImage",
                modifier =Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(id = R.string.User7),
                modifier = Modifier
                    .padding(end = 8.dp)
                ,
                fontSize = 18.sp)
        }
    }
}