package com.example.collapsinglayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalUnitApi::class)
@Composable
internal fun CollapsedHeaderContent(
    modifier: Modifier = Modifier,
) {
    Column(modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            color = Color.Black,
            text = stringResource(R.string.title),
            fontSize = TextUnit(24f, TextUnitType.Sp)
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 24.dp),
            color = Color.Black,
            text = stringResource(R.string.metadata),
            fontSize = TextUnit(16f, TextUnitType.Sp)
        )

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true, device = Devices.PIXEL)
@Composable
fun HeaderContentPreview() {
    CollapsedHeaderContent(
        modifier = Modifier.fillMaxWidth()
    )
}