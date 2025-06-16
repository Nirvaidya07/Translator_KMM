package com.plcoding.translator_kmm.translate.data.history

import com.plcoding.translator_kmm.translate.domain.history.HistoryItem
import database.HistoryEntity

fun HistoryEntity.toHistoryItem():HistoryItem{
    return HistoryItem(
        id=id,
        fromText = fromText,
        fromLanguageCode = fromLanguageCode,
        toLanguageCode = toLangugaeCode,
        toText = toText
    )
}