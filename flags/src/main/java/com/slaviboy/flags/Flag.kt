package com.slaviboy.flags

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Flag(
    val countryCode: String,
    val iso: String,
    @StringRes val countryResId: Int,
    @DrawableRes val imageResId: Int
) {
    object None : Flag("", "", R.string.none, R.drawable.flag_none)
    object Bulgaria : Flag("+359", "bg", R.string.bulgaria, R.drawable.flag_bg)
    object UnitedKingdom : Flag("+44", "gb", R.string.united_kingdom, R.drawable.flag_gb)
    object Ireland : Flag("+353", "ie", R.string.ireland, R.drawable.flag_ie)
    object Island : Flag("+354", "is", R.string.island, R.drawable.flag_is)
    object France : Flag("+33", "fr", R.string.france, R.drawable.flag_fr)
    object Lithuania : Flag("+370", "lt", R.string.lithuania, R.drawable.flag_lt)
    object Latvia : Flag("+371", "lv", R.string.latvia, R.drawable.flag_lv)
    object Greece : Flag("+30", "gr", R.string.greece, R.drawable.flag_gr)
    object Macedonia : Flag("+389", "mk", R.string.macedonia, R.drawable.flag_mk)
    object Serbia : Flag("+381", "rs", R.string.serbia, R.drawable.flag_rs)
    object Romania : Flag("+40", "ro", R.string.romania, R.drawable.flag_ro)
    object Turkey : Flag("+90", "tr", R.string.turkey, R.drawable.flag_tr)
    object Russia : Flag("+7", "ru", R.string.russia, R.drawable.flag_ru)
    object Ukraine : Flag("+380", "ua", R.string.ukraine, R.drawable.flag_ua)
    object Albania : Flag("+355", "al", R.string.albania, R.drawable.flag_al)
    object Spain : Flag("+34", "es", R.string.spain, R.drawable.flag_es)
    object Portugal : Flag("+351", "pt", R.string.portugal, R.drawable.flag_pt)
    object Poland : Flag("+48", "pl", R.string.poland, R.drawable.flag_pl)
    object Italy : Flag("+39", "it", R.string.italy, R.drawable.flag_it)
    object Germany : Flag("+49", "de", R.string.germany, R.drawable.flag_de)
    object Sweden : Flag("+46", "se", R.string.sweden, R.drawable.flag_se)
    object Norway : Flag("+47", "no", R.string.norway, R.drawable.flag_no)
    object China : Flag("+86", "cn", R.string.china, R.drawable.flag_cn)
    object Japan : Flag("+81", "jp", R.string.japan, R.drawable.flag_jp)
    object Philippines : Flag("+63", "ph", R.string.philippines, R.drawable.flag_ph)
    object India : Flag("+91", "in", R.string.india, R.drawable.flag_in)
    object Indonesia : Flag("+62", "id", R.string.indonesia, R.drawable.flag_id)
    object Pakistan : Flag("+92", "pk", R.string.pakistan, R.drawable.flag_pk)
    object Mexico : Flag("+52", "mx", R.string.mexico, R.drawable.flag_mx)
    object Belarus : Flag("+375", "by", R.string.belarus, R.drawable.flag_by)
    object Georgia : Flag("+995", "ge", R.string.georgia, R.drawable.flag_ge)

    companion object {
        fun allFlags(): List<Flag> {
            return listOf(
                Bulgaria, UnitedKingdom, Ireland, Island, France, Lithuania,
                Latvia, Greece, Macedonia, Serbia, Romania, Turkey, Russia,
                Ukraine, Albania, Spain, Portugal, Poland, Italy, Germany,
                Sweden, Norway, China, Japan, Philippines, India, Indonesia,
                Pakistan, Mexico, Belarus, Georgia
            )
        }

        fun ofCountryCode(countryCode: String): Flag? {
            return allFlags().firstOrNull {
                it.countryCode == countryCode
            }
        }

        fun ofIso(iso: String): Flag? {
            return allFlags().firstOrNull {
                it.iso == iso
            }
        }
    }
}