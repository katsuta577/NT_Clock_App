package com.example.nt_clock_app

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nt_clock_app.ui.theme.NT_Clock_AppTheme

val Nimbus_Sans = FontFamily(
    Font(R.font.nimbussanl_reg, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.nimbussanl_regita, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.nimbussanl_bol, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.nimbussanl_bolita, FontWeight.Bold, FontStyle.Italic)
)

@Composable
fun TitleText_MA() {
    Text(
        modifier = Modifier.offset(x = 40.dp, y = 60.dp),
        text = "Clock",
        fontSize = 30.sp,
        fontFamily = Nimbus_Sans,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal
    )
}

@Composable
fun TimeText_MA(fontSize: androidx.compose.ui.unit.TextUnit) {
    Text(
        text = "13:57:11",
        fontSize = fontSize,
        fontFamily = Nimbus_Sans,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun DateText_MA(fontSize: androidx.compose.ui.unit.TextUnit) {
    Text(
        text = "Monday, July 7, 2025",
        fontSize = fontSize,
        fontFamily = Nimbus_Sans,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun ResponsiveClockTextGroup() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val timeScale = if (maxWidth > 600.dp) {
            if (maxWidth > maxHeight) 0.1f else 0.12f
        } else {
            if (maxWidth > maxHeight) 0.15f else 0.2f
        }

        val dateScale = if (maxWidth > 600.dp) {
            if (maxWidth > maxHeight) 0.04f else 0.05f
        } else {
            if (maxWidth > maxHeight) 0.06f else 0.08f
        }

        val timeTextResponsiveFontSize = with(LocalDensity.current) {(minOf(maxWidth, maxHeight) * timeScale).toSp()}
        val dateTextResponsiveFontSize = with(LocalDensity.current) {(minOf(maxWidth, maxHeight) * dateScale).toSp()}
        val spacerTop = maxHeight * 0.2f
        val spacerBetween = maxHeight * 0.01f

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(spacerTop))
            TimeText_MA(fontSize = timeTextResponsiveFontSize)
            Spacer(modifier = Modifier.height(spacerBetween))
            DateText_MA(fontSize = dateTextResponsiveFontSize)
        }
    }
}

@Preview(showBackground = true, name = "Smartphone Size", widthDp = 400, heightDp = 800)
@Composable
fun Preview_Mobile_MA() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_MA()
            ResponsiveClockTextGroup()
        }
    }
}

@Preview(showBackground = true, name = "Tablet Size", widthDp = 1200, heightDp = 800)
@Composable
fun Preview_Tablet_MA() {
    NT_Clock_AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            TitleText_MA()
            ResponsiveClockTextGroup()
        }
    }
}
