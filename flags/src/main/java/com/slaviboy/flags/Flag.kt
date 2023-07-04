package com.slaviboy.flags

import androidx.annotation.DrawableRes

sealed class Flag(
    val countryCallingCode: String,
    val iso: String,
    @DrawableRes val imageResId: Int
) {
    object Bulgaria : Flag("+359", "bg", R.drawable.flag_bg)
    object UnitedKingdom : Flag("+44", "gb", R.drawable.flag_gb)
    object Ireland : Flag("+353", "ie", R.drawable.flag_ie)
    object Island : Flag("+354", "is", R.drawable.flag_is)
    object France : Flag("+33", "fr", R.drawable.flag_fr)
    object Lithuania : Flag("+370", "lt", R.drawable.flag_lt)
    object Latvia : Flag("+371", "lv", R.drawable.flag_lv)
    object Greece : Flag("+30", "gr", R.drawable.flag_gr)
    object Macedonia : Flag("+389", "mk", R.drawable.flag_mk)
    object Serbia : Flag("+381", "rs", R.drawable.flag_rs)
    object Romania : Flag("+40", "ro", R.drawable.flag_ro)
    object Turkey : Flag("+90", "tr", R.drawable.flag_tr)
    object Russia : Flag("+7", "ru", R.drawable.flag_ru)
    object Ukraine : Flag("+380", "ua", R.drawable.flag_ua)
    object Albania : Flag("+355", "al", R.drawable.flag_al)
    object Spain : Flag("+34", "es", R.drawable.flag_es)
    object Portugal : Flag("+351", "pt", R.drawable.flag_pt)
    object Poland : Flag("+48", "pl", R.drawable.flag_pl)
    object Italy : Flag("+39", "it", R.drawable.flag_it)
    object Germany : Flag("+49", "de", R.drawable.flag_de)
    object Sweden : Flag("+46", "se", R.drawable.flag_se)
    object Norway : Flag("+47", "no", R.drawable.flag_no)
    object China : Flag("+86", "cn", R.drawable.flag_cn)
    object Japan : Flag("+81", "jp", R.drawable.flag_jp)
    object Philippines : Flag("+63", "ph", R.drawable.flag_ph)
    object India : Flag("+91", "in", R.drawable.flag_in)
    object Indonesia : Flag("+62", "id", R.drawable.flag_id)
    object Pakistan : Flag("+92", "pk", R.drawable.flag_pk)
    object Mexico : Flag("+52", "mx", R.drawable.flag_mx)
    object Belarus : Flag("+375", "by", R.drawable.flag_by)
    object Georgia : Flag("+995", "ge", R.drawable.flag_ge)
}