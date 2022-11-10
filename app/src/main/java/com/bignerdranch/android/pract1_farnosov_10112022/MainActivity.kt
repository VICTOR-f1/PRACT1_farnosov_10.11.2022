package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // A surface container using the 'background' color from the theme

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MyGreenLight

            )
            {


                Row(

                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    ) {
                        Spacer(modifier = Modifier.size(100.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 0.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 30.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Text(
                                text = "Вечерний поход в кино",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text(
                                text = "Идем в кино с коллегами!",
                                color = MyGray,
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .padding(40.dp)
                                    .offset(x = (-24).dp, y = 0.dp)

                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 0.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 30.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Row() {}
                            Text(
                                text = "Забрать заказ Ozon",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text(
                                text = "Пункт выдачи на ул. Ленина, 103",
                                fontSize = 14.sp,
                                color = MyGray,
                                modifier = Modifier
                                    .padding(40.dp)
                                    .offset(x = (-24).dp, y = 0.dp)

                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 0.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 30.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Text(
                                text = "Запись в автосервис",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(10.dp)
                            )


                        }
                        Spacer(modifier = Modifier.size(305.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 0.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 35.dp,
                                        topEnd = 35.dp,
                                        bottomEnd = 0.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyGreend)
                        )

                    }
                }
                Row(

                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    )

                    {
                        Text(
                            text = "Сдать автомобиль в автосервис на ул  \nБисертская, д. 14. Замена масла",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (9).dp, y = 352.dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (275).dp, y = 220.dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (275).dp, y = (-18).dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (275).dp, y = (-255).dp)
                        )
                        Text(
                            text = stringResource(R.string.List),
                            fontSize = 16.sp,
                            color = MyGreenLight,
                            modifier = Modifier
                                .offset(x = (65).dp, y = (350).dp)
                        )
                        Text(
                            text = stringResource(R.string.Alarm),
                            fontSize = 14.sp,
                            color = Red,
                            modifier = Modifier
                                .offset(x = 135.dp, y = 330.dp)
                        )
                        Text (
                            text = stringResource(R.string.Calender),
                        fontSize = 14.sp,
                        color = Red,
                        modifier = Modifier
                            .offset(x = 212.dp, y = 311.dp)
                        )
                        Text(
                        text = stringResource(R.string.Settings),
                        fontSize = 14.sp,
                            color = Red,
                        modifier = Modifier
                            .offset(x = 305.dp, y =292.dp)
                    )
                        Image(
                            painter = painterResource(id = R.drawable.settings),
                            contentDescription = null,

                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .offset(x = 305.dp, y = 25.dp)
                                .alpha(0f)



                        )
                        Image(
                            painter = painterResource(id = R.drawable.alarm),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(40.dp)
                                .offset(x = 135.dp, y = 171.dp)
                                .clickable(
                                    onClick={
                                        val intent = Intent(this@MainActivity,AlarmActivity::class.java)
                                        startActivity(intent)
                                    }
                                )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.settings),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(40.dp)
                                .offset(x = 310.dp, y = 130.dp)
                                .clickable(
                                    onClick={
                                        val inten2t = Intent(this@MainActivity,CalendarActivity::class.java)
                                        startActivity(inten2t)
                                    }
                                )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.list),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(40.dp)
                                .offset(x = 60.dp, y = 91.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.calendar),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(40.dp)
                                .offset(x = 218.dp, y = 52.dp)
                        )
                        Spacer(modifier = Modifier.size(1852.dp))


                    }
                }
                Row(

                )
                {


                    up_panel(stringResource(R.string.DoList))

                }
                Row() {

                    Button_add_task("добавить задачу")
                }


            }


        }


    }
    @Composable
    fun Button_add_task (value:String)
    {
        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.CenterEnd)
        ) {
            Spacer(modifier = Modifier.size(677.dp))
            Button(
                {val intent = Intent(this@MainActivity,CalendarActivity::class.java)
                    startActivity(intent)},
                colors = ButtonDefaults.buttonColors(backgroundColor = MyGreend),
                modifier = Modifier
                    .size(400.dp, 50.dp)
                    .clip(RoundedCornerShape(10))
                    .offset(x = 22.dp, y = (0).dp)
            )

            {
                Text(
                    text = "$value ",
                    color = MaterialTheme.colors.background,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .offset(x = (-15).dp, y = 0.dp)
                )
            }
        }
    }
    @Composable
    fun up_panel (value:String)
    {
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
                .offset(x = 200.dp, y = 5.dp)
        )

    }
}









