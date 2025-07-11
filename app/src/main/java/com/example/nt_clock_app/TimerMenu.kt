package com.example.nt_clock_app

import androidx.compose.foundation.layout.*
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
fun TimerDisplayOnlyScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.offset(x = 40.dp, y = 60.dp),
            text = "Timer",
            fontSize = 30.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )

        Text(
            modifier = Modifier.offset(x = 40.dp, y = 120.dp),
            text = "00:00:00",
            fontSize = 80.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(150.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                KeypadButton("1") {}
                KeypadButton("2") {}
                KeypadButton("3") {}
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                KeypadButton("4") {}
                KeypadButton("5") {}
                KeypadButton("6") {}
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                KeypadButton("7") {}
                KeypadButton("8") {}
                KeypadButton("9") {}
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Button(
                    onClick = {},
                    modifier = Modifier.width(100.dp) .height(70.dp)
                ) {
                    Text(text = "Clear", fontSize = 22.sp, fontFamily = Nimbus_Sans)
                }

                KeypadButton("0") {}
                KeypadButton("Del") {}
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )

        {
            Button(
                onClick = {},
                modifier = Modifier.width(200.dp).height(70.dp)
            ) {
                Text(
                    text = "Start",
                    fontSize = 40.sp,
                    fontFamily = Nimbus_Sans,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            }
        }
    }
}

@Composable
fun KeypadButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.width(100.dp) .height(70.dp)
    ) {
        Text(text = text, fontSize = 35.sp, fontFamily = Nimbus_Sans)
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 800)
@Composable
fun GreetingPreviewDisplayOnly() {
    NT_Clock_AppTheme {
        TimerDisplayOnlyScreen()
    }
}