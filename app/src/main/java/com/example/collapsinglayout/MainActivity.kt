package com.example.collapsinglayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.collapsinglayout.ui.theme.CollapsingLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CollapsingLayoutTheme {
                MainContent()
            }
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL)
@Composable
fun MainContentPreview() {
    CollapsingLayoutTheme {
        MainContent()
    }
}