package com.example.mvvm2.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvm2.model.User

@Composable
fun detail(user: User) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        Text(
            text = "Detail Bulan",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(text = "Nama bulan: ${user.name}")
        Text(text = "Bulan ke-${user.id}")
        Text(text = "Jumlah hari: ${user.jumlahHari}")
        Text(text = "Kuartal: ${user.kuartal}")
    }
}