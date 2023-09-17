package com.slaviboy.flags

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class Flag(
    val countryCode: String,
    val iso: String,
    @StringRes val countryResId: Int,
    @StringRes val languageResId: Int,
    @DrawableRes val icon1x1ResId: Int,
    @DrawableRes val icon4x3ResId: Int
) {
    Bulgaria("+359", "bg", R.string.bulgaria, R.string.bulgarian, R.drawable.ic_flag_1x1_bg, R.drawable.ic_flag_4x3_bg),
    UnitedKingdom("+44", "gb", R.string.united_kingdom, R.string.english, R.drawable.ic_flag_1x1_gb, R.drawable.ic_flag_4x3_gb),
    France("+33", "fr", R.string.france, R.string.french, R.drawable.ic_flag_1x1_fr, R.drawable.ic_flag_4x3_fr),
    Germany("+49", "de", R.string.germany, R.string.german, R.drawable.ic_flag_1x1_de, R.drawable.ic_flag_4x3_de),
    China("+86", "cn", R.string.china, R.string.mandarin, R.drawable.ic_flag_1x1_cn, R.drawable.ic_flag_4x3_cn),
    Japan("+81", "jp", R.string.japan, R.string.japanese, R.drawable.ic_flag_1x1_jp, R.drawable.ic_flag_4x3_jp),
    India("+91", "in", R.string.india, R.string.hindi, R.drawable.ic_flag_1x1_in, R.drawable.ic_flag_4x3_in);

    companion object {

        fun ofCountryCode(countryCode: String): Flag? {
            return Flag.values().firstOrNull {
                it.countryCode == countryCode
            }
        }

        fun ofIso(iso: String): Flag? {
            return Flag.values().firstOrNull {
                it.iso == iso
            }
        }
    }
}