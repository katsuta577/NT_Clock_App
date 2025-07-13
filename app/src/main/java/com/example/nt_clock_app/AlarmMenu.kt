package com.example.nt_clock_app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nt_clock_app.ui.theme.NT_Clock_AppTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Button
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.Alignment

@Composable
fun TitleText_AM() {
    Text(
        modifier = Modifier.offset(x = 40.dp, y = 60.dp),
        text = "Alarm",
        fontSize = 30.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal
    )
}

@Composable
fun Card_AM() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val cardWidth: Dp = maxWidth * 0.9f

        Card(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.size(width = cardWidth, height = 200.dp).align(Alignment.TopCenter).offset(y = 150.dp)
        ) {
            BoxWithConstraints {
                Text(
                    modifier = Modifier.offset(x = maxWidth * 0.08f, y = 25.dp),
                    text = "Weekend",
                    fontSize = 20.sp,
                    fontFamily = Nimbus_Sans,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            }

            BoxWithConstraints {
                Text(
                    modifier = Modifier.offset(x = maxWidth * 0.08f, y = 40.dp),
                    text = "7:30",
                    fontSize = 60.sp,
                    fontFamily = Nimbus_Sans,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            }

            BoxWithConstraints {
                Switch(
                    modifier = Modifier.offset(x = maxWidth * 0.75f, y = (-20).dp),
                    checked = true,
                    onCheckedChange = {}
                )
            }

            BoxWithConstraints {
                Button(onClick = {}, modifier = Modifier.offset(x = maxWidth * 0.08f, y = (-5).dp)) {
                    Text(
                        text = "Edit",
                        fontSize = 20.sp,
                        fontFamily = Nimbus_Sans,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    )
                }
            }

            BoxWithConstraints {
                Text(
                    modifier = Modifier.offset(x = maxWidth * 0.35f, y = (-38).dp),
                    text = "Operates on Weekdays",
                    fontSize = 18.sp,
                    fontFamily = Nimbus_Sans,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Smartphone Size", widthDp = 400, heightDp = 800)
@Composable
fun Preview_Mobile_AM() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_AM()
            Card_AM()
        }
    }
}

@Preview(showBackground = true, name = "Tablet Size", widthDp = 1200, heightDp = 800)
@Composable
fun Preview_Tablet_AM() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_AM()
            Card_AM()
        }
    }
}
