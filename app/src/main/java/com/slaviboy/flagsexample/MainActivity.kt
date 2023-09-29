package com.slaviboy.flagsexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.slaviboy.flags.Country

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier.verticalScroll(rememberScrollState())
            ) {
                Country.values().forEach {
                    Image(
                        modifier = Modifier
                            .height(100.dp)
                            .wrapContentWidth()
                            .padding(10.dp),
                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = it.icon1x1ResId),
                        contentDescription = null
                    )
                }
            }
        }
    }
}