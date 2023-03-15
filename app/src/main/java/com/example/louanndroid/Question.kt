package com.example.louanndroid

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean) {
}