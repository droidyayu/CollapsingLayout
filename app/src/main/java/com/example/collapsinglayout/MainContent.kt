package com.example.collapsinglayout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.collapsinglayout.genericLayouts.CollapsingLayout
import com.example.collapsinglayout.ui.theme.materialBlue

@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Collapsing Layout ") },
                backgroundColor = materialBlue
            )
        },
        content = { padding ->
            CollapsingLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(padding),
                collapsingTop = {
                    CollapsedHeaderContent()
                },
                bodyContent = {
                    TabContent()
                }
            )
        },
        bottomBar = { }
    )
}
