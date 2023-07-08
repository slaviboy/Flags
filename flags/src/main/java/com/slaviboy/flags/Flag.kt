package com.slaviboy.flags

import androidx.annotation.DrawableRes

sealed class Flag(
    val country: String,
    val countryCode: String,
    val iso: String,
    @DrawableRes val imageResId: Int
) {
    object Bulgaria : Flag("Bulgaria", "+359", "bg", R.drawable.flag_bg)
    object UnitedKingdom : Flag("UnitedKingdom", "+44", "gb", R.drawable.flag_gb)
    object Ireland : Flag("Ireland", "+353", "ie", R.drawable.flag_ie)
    object Island : Flag("Island", "+354", "is", R.drawable.flag_is)
    object France : Flag("France", "+33", "fr", R.drawable.flag_fr)
    object Lithuania : Flag("Lithuania", "+370", "lt", R.drawable.flag_lt)
    object Latvia : Flag("Latvia", "+371", "lv", R.drawable.flag_lv)
    object Greece : Flag("Greece", "+30", "gr", R.drawable.flag_gr)
    object Macedonia : Flag("Macedonia", "+389", "mk", R.drawable.flag_mk)
    object Serbia : Flag("Serbia", "+381", "rs", R.drawable.flag_rs)
    object Romania : Flag("Romania", "+40", "ro", R.drawable.flag_ro)
    object Turkey : Flag("Turkey", "+90", "tr", R.drawable.flag_tr)
    object Russia : Flag("Russia", "+7", "ru", R.drawable.flag_ru)
    object Ukraine : Flag("Ukraine", "+380", "ua", R.drawable.flag_ua)
    object Albania : Flag("Albania", "+355", "al", R.drawable.flag_al)
    object Spain : Flag("Spain", "+34", "es", R.drawable.flag_es)
    object Portugal : Flag("Portugal", "+351", "pt", R.drawable.flag_pt)
    object Poland : Flag("Poland", "+48", "pl", R.drawable.flag_pl)
    object Italy : Flag("Italy", "+39", "it", R.drawable.flag_it)
    object Germany : Flag("Germany", "+49", "de", R.drawable.flag_de)
    object Sweden : Flag("Sweden", "+46", "se", R.drawable.flag_se)
    object Norway : Flag("Norway", "+47", "no", R.drawable.flag_no)
    object China : Flag("China", "+86", "cn", R.drawable.flag_cn)
    object Japan : Flag("Japan", "+81", "jp", R.drawable.flag_jp)
    object Philippines : Flag("Philippines", "+63", "ph", R.drawable.flag_ph)
    object India : Flag("India", "+91", "in", R.drawable.flag_in)
    object Indonesia : Flag("Indonesia", "+62", "id", R.drawable.flag_id)
    object Pakistan : Flag("Pakistan", "+92", "pk", R.drawable.flag_pk)
    object Mexico : Flag("Mexico", "+52", "mx", R.drawable.flag_mx)
    object Belarus : Flag("Belarus", "+375", "by", R.drawable.flag_by)
    object Georgia : Flag("Georgia", "+995", "ge", R.drawable.flag_ge)

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