package com.plcoding.translator_kmm.translate.domain.translate

import com.plcoding.translator_kmm.core.domain.language.Language
import com.plcoding.translator_kmm.core.domain.util.Resource
import com.plcoding.translator_kmm.translate.domain.history.HistoryDatasource
import com.plcoding.translator_kmm.translate.domain.history.HistoryItem

class Translate(
    private val client: TranslateClient,
    private val historyDatasource: HistoryDatasource
) {
    suspend fun execute(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): Resource<String> {
        return try {
            val translatedText =
                client.translate(fromLanguage, fromText, toLanguage)
            historyDatasource.insertHistoryItem(
                HistoryItem(
                    id = null,
                    fromLanguageCode = fromLanguage.langCode,
                    fromText = fromText,
                    toLanguageCode = toLanguage.langCode,
                    toText = translatedText,
                )
            )
            Resource.Success(translatedText)
        } catch (e: TranslateException) {
            e.printStackTrace()
            Resource.Error(e)
        }
    }
}