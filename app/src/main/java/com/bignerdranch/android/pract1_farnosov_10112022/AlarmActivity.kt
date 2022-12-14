package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Arrangement.Absolute.SpaceAround
import androidx.compose.foundation.layout.Arrangement.Absolute.SpaceBetween
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.SpaceAround
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreend
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PRACT1_farnosov_10112022Theme {
                Column()
                {
                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.07f))
                    {
                        up_panel("??????????????????")
                    }
                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.38f))
                    {
                        center("d")
                    }
                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.06f))
                    {
                        Button_add_task("???????????????? ??????????????????")
                    }


                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.08f))
                    {
                        down_butons("")
                    }
                }

            }
        }
    }
}

@Composable
fun up_panel(value: String) {


    Text(
        text = value,
        color = Color.White,
        fontSize = 27.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.offset(x = 15.dp, y = 12.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.is_avatarka),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(60.dp)
            .offset(x = 355.dp, y = 5.dp)
    )

}
@Composable
fun center(value: String) {
    Column( modifier = Modifier
        .offset(x = 0.dp, y = (15).dp)
        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

        val checkedState = remember { mutableStateOf(false) }
        val textColor = remember { mutableStateOf(Color.Unspecified) }
        Column(modifier = Modifier.fillMaxSize().padding(0.dp).offset(20.dp,0.dp)){
            Row (verticalAlignment = Alignment.CenterVertically ){
                Text("07:30", fontSize = 52.sp, color = Color.White)
                Switch(
                    checked = checkedState.value,
                    onCheckedChange = {
                        checkedState.value = it
                        if(checkedState.value) textColor.value = Color(0xFFC62828)
                        else textColor.value = Color.Unspecified
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFC62828),
                        checkedTrackColor = Color(0xFFE57373),
                        uncheckedThumbColor = Color(0xFFEF9A9A),
                        uncheckedTrackColor = Color(0xFFFFEBEE)
                    )
                )

        }
    }

    }

}
@Composable
fun Button_add_task(value: String) {
Column( modifier = Modifier
    .offset(x = 0.dp, y = (15).dp)
    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
    

    Button(
        {  },
        colors = ButtonDefaults.buttonColors(backgroundColor = MyGreend),
        modifier = Modifier
            .size(400.dp, 50.dp)
            .clip(RoundedCornerShape(10))
            .offset(x = 0.dp, y = (0).dp)
    )

    {
        Text(
            text = "$value ",
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier
                .offset(x = (-15).dp, y = 0.dp)
        )
    }
}

}
@Composable
fun down_butons(value: String) {
    Column(modifier = Modifier
        .offset(x = 0.dp, y = (0).dp)
        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        Box(
            modifier = Modifier
                .offset(x = 0.dp, y = 5.dp)
                .size(360.dp, 150.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 35.dp,
                        topEnd = 35.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(MyGreend)
        ){
        Image(
            painter = painterResource(id = R.drawable.list),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .offset(x = 45.dp, y = 25.dp)
                .clickable(
                    onClick = {

                    }
                )
        )
        Image(
            painter = painterResource(id = R.drawable.alarm),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .offset(x = 110.dp, y = 25.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.calendar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .offset(x = 180.dp, y = 25.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.settings),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .offset(x = 255.dp, y = 25.dp)
        )
            Text(
                text = stringResource(R.string.List),
                fontSize = 16.sp,
                color = MyGreenLight,
                modifier = Modifier
                    .offset(x = 50.dp, y = (65).dp)
            )
            Text(
                text = stringResource(R.string.Alarm),
                fontSize = 14.sp,
                color = Color.Red,
                modifier = Modifier
                    .offset(x = 110.dp, y = 65.dp)
            )
            Text (
                text = stringResource(R.string.Calender),
                fontSize = 14.sp,
                color = Color.Red,
                modifier = Modifier
                    .offset(x = 172.dp, y = 65.dp)
            )
            Text(
                text = stringResource(R.string.Settings),
                fontSize = 14.sp,
                color = Color.Red,
                modifier = Modifier
                    .offset(x = 250.dp, y =65.dp)
            )
        }
    }

}
