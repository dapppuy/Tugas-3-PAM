package com.example.mvvm2.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvm2.model.User

@Composable
fun allUser(
    listUser: List<User>,
    onItemClicked: (User) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        Text(
            text = "Nama: Dafa Luthfan Otter",
            fontSize = 18.sp
        )

        Text(
            text = "NIM: 245150407111068",
            fontSize = 18.sp
        )

        Text(
            text = "Daftar Bulan",
            fontSize = 24.sp,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(listUser) { bulan ->
                userCard(
                    user = bulan,
                    onClick = onItemClicked
                )
            }
        }
    }
}