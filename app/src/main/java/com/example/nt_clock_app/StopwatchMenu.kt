package com.example.nt_clock_app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nt_clock_app.ui.theme.NT_Clock_AppTheme

@Composable
fun TitleText_SM() {
    Text(
        modifier = Modifier.offset(x = 40.dp, y = 60.dp),
        text = "Stopwatch",
        fontSize = 30.sp,
        fontFamily = Nimbus_Sans,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal
    )
}

@Composable
fun TextSM_1() {
    Text(
        modifier = Modifier.offset(x = 40.dp, y = 150.dp),
        text = "00.00.00",
        fontSize = 80.sp,
        fontFamily = Nimbus_Sans,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun ButtonSM_1() {
    Button(onClick = {}, modifier = Modifier.offset(x = 130.dp, y = 350.dp)) {
        Text(
            text = "Start",
            fontSize = 40.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )
    }
}

@Preview(showBackground = true, name = "Smartphone Size", widthDp = 400, heightDp = 800)
@Composable
fun Preview_Mobile_SM() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_SM()
            TextSM_1()
            ButtonSM_1()
        }
    }
}

@Preview(showBackground = true, name = "Tablet Size", widthDp = 1200, heightDp = 800)
@Composable
fun Preview_Tablet_SM() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_SM()
            TextSM_1()
            ButtonSM_1()
        }
    }
}
