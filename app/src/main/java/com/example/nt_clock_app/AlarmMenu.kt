package com.example.nt_clock_app

import androidx.compose.foundation.layout.Box
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
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier
            .size(width = 360.dp, height = 200.dp)
            .offset(x = 20.dp, y = 150.dp)
            .fillMaxSize()
    )

    {
        Text(
            modifier = Modifier.offset(x = 30.dp, y = 30.dp),

            text = "Weekend",
            fontSize = 20.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )

        Text(
            modifier = Modifier.offset(x = 30.dp, y = 40.dp),

            text = "7:30",
            fontSize = 60.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )

        Switch(
            modifier = Modifier.offset(x = 270.dp, y = (-20).dp),
            checked = true,
            onCheckedChange = {}
        )

        Button(onClick = {}, modifier = Modifier.offset(x = 30.dp, y = (-5).dp)) {
            Text(
                text = "Edit",
                fontSize = 20.sp,
                fontFamily = Nimbus_Sans,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal
            )
        }

        Text(
            modifier = Modifier.offset(x = 130.dp, y = (-38).dp),

            text = "Operates on Weekdays",
            fontSize = 18.sp,
            fontFamily = Nimbus_Sans,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )
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
