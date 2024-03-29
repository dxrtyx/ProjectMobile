package com.example.mymobileproject

import android.os.Bundle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.alpha
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.mymobileproject.ui.theme.robotoFontFamily
import com.example.mymobileproject.ui.theme.MyMobileProjectTheme

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
        color = colorResource(id = R.color.secondary)
    ) {
        Column {
            Column(
                modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 21.dp)
            ) {
                Spacer(modifier.height(15.dp))
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "User Photo",
                    modifier = modifier
                        .width(51.dp)
                        .height(51.dp)
                        .clip(RoundedCornerShape(50))
                        .align(alignment = Alignment.End))
                Spacer(modifier.height(15.dp))
                Text(
                    tab,
                    fontSize = 36.sp,
                    textAlign = TextAlign.Start,
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Normal)
            }
            PhoneDesc(
                title = "Get to know your Pixel",
                desc = "Explore what you can do with your phone",
                icon = R.drawable.settings)

            Search(
                search = "Search Settings...",
                icon = R.drawable.search)

            SettItem(
                title = "Network & Internet",
                desc = "Wi-Fi, Mobile, Data usage," + " Hotspot",
                icon = R.drawable.wifi)

            SettItem(
                title = "Connected devices",
                desc = "Bluetooth, Cast, NFC",
                icon = R.drawable.devices)

            SettItem(
                title = "App",
                desc = "Permission, default apps",
                icon = R.drawable.apps)

            SettItem(
                title = "Notifications",
                desc = "Permissions, default apps",
                icon = R.drawable.notifications)

            SettItem(title = "Digital wellbeing",
                desc = "Screen time, app timer, bedtime schedules",
                icon = R.drawable.accessibility)
        }
    }
}

@Composable
fun PhoneDesc(title: String, desc: String, icon: Int, modifier: Modifier = Modifier) {
    Spacer(modifier.height(23.dp))
    Column(modifier.fillMaxWidth()) {
        Surface(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 21.dp),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row(
                modifier = modifier
                    .background(color = colorResource(id = R.color.primary))
            ) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = "Settings Icon",
                    modifier = modifier
                        .width(50.dp)
                        .padding(10.dp)
                        .clip(RoundedCornerShape(50))
                        .align(alignment = Alignment.CenterVertically))
                Column(
                    modifier = modifier
                        .padding(10.dp),
                ) {
                    Text(
                        text = title,
                        fontSize = 21.sp,
                        fontFamily = robotoFontFamily,
                        fontWeight = FontWeight.Medium,
                        modifier = modifier
                            .alpha(0.6f))
                    Text(
                        text = desc,
                        fontSize = 14.sp,
                        fontFamily = robotoFontFamily,
                        fontWeight = FontWeight.Normal,
                        modifier = modifier
                            .alpha(0.6f))
                }
            }
        }
    }
}

@Composable
fun Search(search: String, icon: Int, modifier: Modifier = Modifier) {
    Spacer(modifier.height(15.dp))
    Column(modifier.fillMaxWidth()) {
        Surface(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 21.dp),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = "Search Icon",
                    modifier = modifier
                        .width(40.dp)
                        .padding(10.dp)
                        .clip(RoundedCornerShape(50))
                        .align(alignment = Alignment.CenterVertically))
                Text(
                    text = search,
                    fontSize = 18.sp,
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = modifier
                        .alpha(0.5f)
                        .align(alignment = Alignment.CenterVertically))
            }

        }
    }
}

@Composable
fun SettItem(title: String, desc: String, icon: Int, modifier: Modifier = Modifier) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
            .padding(horizontal = 21.dp)
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .width(46.dp)
                .height(46.dp)
                .fillMaxHeight()
                .clip(RoundedCornerShape(50))
                .background(Color(0xFFE2E3D8))
        ) {
            Image(painter = painterResource(id = icon), contentDescription = "Cate")
        }
        Spacer(modifier.width(17.dp))
        Column {
            Text(
                text = title,
                fontSize = 20.sp,
                fontFamily = robotoFontFamily,
                fontWeight = FontWeight.Medium)
            Spacer(modifier.height(4.dp))
            Text(
                text = desc,
                fontSize = 14.sp,
                fontFamily = robotoFontFamily,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .alpha(0.6f))
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