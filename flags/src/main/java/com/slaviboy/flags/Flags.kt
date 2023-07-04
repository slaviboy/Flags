package com.slaviboy.flags

import androidx.annotation.DrawableRes

sealed class Flags(
    val countryCallingCode: String,
    val iso: String,
    @DrawableRes val imageResId: Int
) {
    object Bulgaria : Flags("+359", "bg", R.drawable.flag_bg)
    object UnitedKingdom : Flags("+44", "gb", R.drawable.flag_gb)
    object Ireland : Flags("+353", "ie", R.drawable.flag_ie)
    object Island : Flags("+354", "is", R.drawable.flag_is)
    object France : Flags("+33", "fr", R.drawable.flag_fr)
    object Lithuania : Flags("+370", "lt", R.drawable.flag_lt)
    object Latvia : Flags("+371", "lv", R.drawable.flag_lv)
    object Greece : Flags("+30", "gr", R.drawable.flag_gr)
    object Macedonia : Flags("+389", "mk", R.drawable.flag_mk)
    object Serbia : Flags("+381", "rs", R.drawable.flag_rs)
    object Romania : Flags("+40", "ro", R.drawable.flag_ro)
    object Turkey : Flags("+90", "tr", R.drawable.flag_tr)
    object Russia : Flags("+7", "ru", R.drawable.flag_ru)
    object Ukraine : Flags("+380", "ua", R.drawable.flag_ua)
    object Albania : Flags("+355", "al", R.drawable.flag_al)
    object Spain : Flags("+34", "es", R.drawable.flag_es)
    object Portugal : Flags("+351", "pt", R.drawable.flag_pt)
    object Poland : Flags("+48", "pl", R.drawable.flag_pl)
    object Italy : Flags("+39", "it", R.drawable.flag_it)
    object Germany : Flags("+49", "de", R.drawable.flag_de)
    object Sweden : Flags("+46", "se", R.drawable.flag_se)
    object Norway : Flags("+47", "no", R.drawable.flag_no)
    object China : Flags("+86", "cn", R.drawable.flag_cn)
    object Japan : Flags("+81", "jp", R.drawable.flag_jp)
    object Philippines : Flags("+63", "ph", R.drawable.flag_ph)
    object India : Flags("+91", "in", R.drawable.flag_in)
    object Indonesia : Flags("+62", "id", R.drawable.flag_id)
    object Pakistan : Flags("+92", "pk", R.drawable.flag_pk)
    object Mexico : Flags("+52", "mx", R.drawable.flag_mx)
    object Belarus : Flags("+375", "by", R.drawable.flag_by)
    object Georgia : Flags("+995", "ge", R.drawable.flag_ge)
}