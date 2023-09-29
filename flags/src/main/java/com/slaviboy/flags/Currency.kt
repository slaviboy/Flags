package com.slaviboy.flags

import androidx.annotation.DrawableRes

enum class Currency(
    val symbol: String,
    val description: String,
    @DrawableRes val icon1x1ResId: Int,
    @DrawableRes val icon4x3ResId: Int
) {
    BGN("BGN", "Bulgarian lev", R.drawable.ic_flag_1x1_bg, R.drawable.ic_flag_4x3_bg),
    EUR("€", "Euro", R.drawable.ic_flag_1x1_eu, R.drawable.ic_flag_4x3_eu),
    GBP("£", "Pound sterling", R.drawable.ic_flag_1x1_gb, R.drawable.ic_flag_4x3_gb),
    RON("RON", "Romanian Leu", R.drawable.ic_flag_1x1_ro, R.drawable.ic_flag_4x3_ro),
    USD("$", "United States dollar", R.drawable.ic_flag_1x1_us, R.drawable.ic_flag_4x3_us);
}