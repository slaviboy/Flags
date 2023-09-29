package com.slaviboy.flagsexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.slaviboy.flags.Country

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sliderPosition by remember { mutableStateOf(1f) }
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(top = 100.dp)
                    .padding(horizontal = 30.dp)
            ) {
                Country.values().forEachIndexed { index, country ->
                    if (index < 20)
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier
                                    .height(50.dp)
                                    .wrapContentWidth()
                                    .padding(10.dp)
                                    .clip(RoundedCornerShape(15.dp * sliderPosition)),
                                contentScale = ContentScale.FillHeight,
                                painter = painterResource(id = country.icon1x1ResId),
                                contentDescription = null
                            )
                            Text(text = stringResource(id = country.countryResId))
                        }
                }
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .background(Color.White)
            ) {
                Text(text = "Round corners:")
                Slider(
                    value = sliderPosition,
                    onValueChange = {
                        sliderPosition = it
                    },
                    steps = 10
                )
            }
        }
    }
}