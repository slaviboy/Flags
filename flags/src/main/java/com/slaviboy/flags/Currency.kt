package com.slaviboy.flags

import androidx.annotation.DrawableRes

enum class Currency(
    val symbol: String,
    val description: String,
    @DrawableRes val icon1x1ResId: Int,
    @DrawableRes val icon4x3ResId: Int
) {
    BGN("BGN", "(£) BGN・Bulgarian lev", R.drawable.ic_flag_1x1_bg, R.drawable.ic_flag_4x3_bg),
    EUR("€", "Euro", R.drawable.ic_flag_1x1_eu, R.drawable.ic_flag_4x3_eu),
    GBP("£", "(£) GBP・Pound sterling", R.drawable.ic_flag_1x1_gb, R.drawable.ic_flag_4x3_gb),
    RON("RON", "RON・Romanian Leu", R.drawable.ic_flag_1x1_ro, R.drawable.ic_flag_4x3_ro),
    USD("$", "($) USD・United States dollar", R.drawable.ic_flag_1x1_us, R.drawable.ic_flag_4x3_us),
    RUB("$", "(₽) RUB・Russian ruble", R.drawable.ic_flag_1x1_ru, R.drawable.ic_flag_4x3_ru),
    CNY("¥", "(₽) CNY・Chinese Yuan", R.drawable.ic_flag_1x1_cn, R.drawable.ic_flag_4x3_cn),
    CAD("CAD", "CAD・Canadian Dollar", R.drawable.ic_flag_1x1_ca, R.drawable.ic_flag_4x3_ca),
    MXN("MXN", "MXN・Mexican Peso", R.drawable.ic_flag_1x1_mx, R.drawable.ic_flag_4x3_mx),
    JPY("¥", "(¥) JPY・Japanese Yen", R.drawable.ic_flag_1x1_jp, R.drawable.ic_flag_4x3_jp);
}