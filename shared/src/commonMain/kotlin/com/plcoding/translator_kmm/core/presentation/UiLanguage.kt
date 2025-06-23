package com.plcoding.translator_kmm.core.presenatation

import com.plcoding.translator_kmm.core.domain.language.Language

expect class UiLanguage {
    expect val language:Language
    companion object{
        fun byCode(langCode:String): UiLanguage
        val allLanguages:List<UiLanguage>
    }
}