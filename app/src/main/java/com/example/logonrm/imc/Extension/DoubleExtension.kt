package com.example.logonrm.imc.Extension

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f",this)

