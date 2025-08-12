package com.example.carshop.ui.feature.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReusableComposeNode
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carshop.R

@Composable
@Preview
fun IntroScreen(navToMain:()-> Unit={}){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "Cách đơn giản để sở hữu\n" +
                        "chiếc xe mơ ước của bạn"
                    , color = Color.White,
                    modifier = Modifier.padding(horizontal = 24.dp)
                        .statusBarsPadding()
                    , fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(text = "Mang đến giải pháp di chuyển tối ưu\n" +
                        "với những chiếc xe chất lượng\n" +
                        "dịch vụ hậu mãi tận tâm.",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 24.dp),
                    fontSize = 15.sp,
                    lineHeight = 24.sp)
            }
            Column {
                Image(painter = painterResource(id= R.drawable.intro_car),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min =200.dp))
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    onClick = navToMain,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .height(height = 60.dp),
                    shape = RoundedCornerShape(size = 50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text("Bắt Đầu",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
            }
        }

    }
}