package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel untuk mengingat nilai masukan dari keyboard
    var textName by remember { mutableStateOf(value = "")}
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    //variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }


}