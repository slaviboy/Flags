package com.slaviboy.flags

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class Language(
    val code: String,
    val country: String? = null,
    @StringRes val languageResId: Int,
    @DrawableRes val icon1x1ResId: Int,
    @DrawableRes val icon4x3ResId: Int
) {
    Afrikaans("af", null, R.string.afrikaans, R.drawable.ic_flag_1x1_af, R.drawable.ic_flag_4x3_af),
    Arabic("ar", null, R.string.arabic, R.drawable.ic_flag_1x1_sa, R.drawable.ic_flag_4x3_sa),
    Bengali("bn", null, R.string.bengali, R.drawable.ic_flag_1x1_bd, R.drawable.ic_flag_4x3_bd),
    Bulgarian("bg", null, R.string.bulgarian, R.drawable.ic_flag_1x1_bg, R.drawable.ic_flag_4x3_bg),
    Catalan("ca", null, R.string.catalan, R.drawable.ic_flag_1x1_es, R.drawable.ic_flag_4x3_es),
    Croatian("hr", null, R.string.croatian, R.drawable.ic_flag_1x1_hr, R.drawable.ic_flag_4x3_hr),
    Czech("cs", null, R.string.czech, R.drawable.ic_flag_1x1_cz, R.drawable.ic_flag_4x3_cz),
    Danish("da", null, R.string.danish, R.drawable.ic_flag_1x1_dk, R.drawable.ic_flag_4x3_dk),
    Dutch("nl", null, R.string.dutch, R.drawable.ic_flag_1x1_nl, R.drawable.ic_flag_4x3_nl),
    Lithuanian("lt", null, R.string.lithuanian, R.drawable.ic_flag_1x1_lt, R.drawable.ic_flag_4x3_lt),
    Latvian("lv", null, R.string.latvian, R.drawable.ic_flag_1x1_lv, R.drawable.ic_flag_4x3_lv),
    Malay("ms", null, R.string.malay, R.drawable.ic_flag_1x1_my, R.drawable.ic_flag_4x3_my),
    Malayalam("ml", null, R.string.malayalam, R.drawable.ic_flag_1x1_in, R.drawable.ic_flag_4x3_in),
    Tamil("ta", null, R.string.tamil, R.drawable.ic_flag_1x1_in, R.drawable.ic_flag_4x3_in),
    English("en", null, R.string.english, R.drawable.ic_flag_1x1_gb, R.drawable.ic_flag_4x3_gb),
    Finnish("fi", null, R.string.finnish, R.drawable.ic_flag_1x1_fi, R.drawable.ic_flag_4x3_fi),
    French("fr", null, R.string.french, R.drawable.ic_flag_1x1_fr, R.drawable.ic_flag_4x3_fr),
    German("de", null, R.string.german, R.drawable.ic_flag_1x1_de, R.drawable.ic_flag_4x3_de),
    Greek("el", null, R.string.greek, R.drawable.ic_flag_1x1_gr, R.drawable.ic_flag_4x3_gr),
    Hebrew("iw", null, R.string.hebrew, R.drawable.ic_flag_1x1_il, R.drawable.ic_flag_4x3_il),
    Hindi("hi", null, R.string.hindi, R.drawable.ic_flag_1x1_in, R.drawable.ic_flag_4x3_in),
    Hungarian("hu", null, R.string.hungarian, R.drawable.ic_flag_1x1_hu, R.drawable.ic_flag_4x3_hu),
    Indonesian("in", null, R.string.indonesian, R.drawable.ic_flag_1x1_id, R.drawable.ic_flag_4x3_id),
    Italian("it", null, R.string.italian, R.drawable.ic_flag_1x1_it, R.drawable.ic_flag_4x3_it),
    Japanese("ja", null, R.string.japanese, R.drawable.ic_flag_1x1_jp, R.drawable.ic_flag_4x3_jp),
    Korean("ko", null, R.string.korean, R.drawable.ic_flag_1x1_kr, R.drawable.ic_flag_4x3_kr),
    Norwegian("nn", null, R.string.norwegian, R.drawable.ic_flag_1x1_no, R.drawable.ic_flag_4x3_no),
    Polish("pl", null, R.string.polish, R.drawable.ic_flag_1x1_pl, R.drawable.ic_flag_4x3_pl),
    Portuguese("pt", null, R.string.portuguese, R.drawable.ic_flag_1x1_pt, R.drawable.ic_flag_4x3_pt),
    Romanian("ro", null, R.string.romanian, R.drawable.ic_flag_1x1_ro, R.drawable.ic_flag_4x3_ro),
    Russian("ru", null, R.string.russian, R.drawable.ic_flag_1x1_ru, R.drawable.ic_flag_4x3_ru),
    Serbian("sr", null, R.string.serbian, R.drawable.ic_flag_1x1_rs, R.drawable.ic_flag_4x3_rs),
    Slovak("sk", null, R.string.slovak, R.drawable.ic_flag_1x1_sk, R.drawable.ic_flag_4x3_sk),
    Slovenian("sl", null, R.string.slovenian, R.drawable.ic_flag_1x1_si, R.drawable.ic_flag_4x3_si),
    Spanish("es", null, R.string.spanish, R.drawable.ic_flag_1x1_es, R.drawable.ic_flag_4x3_es),
    Swedish("sv", null, R.string.swedish, R.drawable.ic_flag_1x1_se, R.drawable.ic_flag_4x3_se),
    Telugu("te", null, R.string.telugu, R.drawable.ic_flag_1x1_in, R.drawable.ic_flag_4x3_in),
    Thai("th", null, R.string.thai, R.drawable.ic_flag_1x1_th, R.drawable.ic_flag_4x3_th),
    Turkish("tr", null, R.string.turkish, R.drawable.ic_flag_1x1_tr, R.drawable.ic_flag_4x3_tr),
    Ukrainian("uk", null, R.string.ukrainian, R.drawable.ic_flag_1x1_ua, R.drawable.ic_flag_4x3_ua),
    Vietnamese("vi", null, R.string.vietnamese, R.drawable.ic_flag_1x1_vn, R.drawable.ic_flag_4x3_vn),
    Armenian("hy", null, R.string.armenian, R.drawable.ic_flag_1x1_am, R.drawable.ic_flag_4x3_am),
    Burmese("my", null, R.string.burmese, R.drawable.ic_flag_1x1_mm, R.drawable.ic_flag_4x3_mm),
    Bosnian("bs", null, R.string.bosnian, R.drawable.ic_flag_1x1_ba, R.drawable.ic_flag_4x3_ba),
    Filipino("fil", null, R.string.filipino, R.drawable.ic_flag_1x1_ph, R.drawable.ic_flag_4x3_ph),
    Estonian("et", null, R.string.estonian, R.drawable.ic_flag_1x1_ee, R.drawable.ic_flag_4x3_ee),
    Georgian("ka", null, R.string.georgian, R.drawable.ic_flag_1x1_ge, R.drawable.ic_flag_4x3_ge),
    Irish("ga", null, R.string.irish, R.drawable.ic_flag_1x1_ie, R.drawable.ic_flag_4x3_ie),
    Icelandic("is", null, R.string.icelandic, R.drawable.ic_flag_1x1_is, R.drawable.ic_flag_4x3_is),
    Chinese("zh", null, R.string.chinese, R.drawable.ic_flag_1x1_cn, R.drawable.ic_flag_4x3_cn);

    companion object {
        fun ofLanguageCode(languageCode: String, country: String? = null): Language? {
            return Language.values().firstOrNull {
                it.code == languageCode && it.country == country
            }
        }
    }
}