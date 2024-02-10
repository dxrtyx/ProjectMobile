package com.example.mymobileproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mymobileproject.ui.theme.MyMobileProjectTheme
import com.example.mymobileproject.ui.theme.robotoFontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMobileProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()
                ) {
                    Settings("Settings")
                }
            }
        }
    }
}

@Composable
fun Settings(tab: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.secondary
    )
        ) {
            Column {
                Column( modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 21.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "user photo",
                        modifier = modifier
                            .width(51.dp)
                            .height(51.dp)
                            .align(alignment = Alignment.End)
                            .clip(RoundedCornerShape(50))
                    )
                    Text(
                        tab,
                        fontSize = 36.sp,
                        textAlign = TextAlign.Start,
                        fontFamily = robotoFontFamily,
                        fontWeight = FontWeight.Normal

                    )
                }
            }
        }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyMobileProjectTheme {
        Settings("Settings")
    }
}