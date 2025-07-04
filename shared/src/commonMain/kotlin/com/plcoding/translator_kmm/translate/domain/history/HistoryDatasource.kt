package com.plcoding.translator_kmm.translate.domain.history

import com.plcoding.translator_kmm.core.domain.util.CommonFlow

interface HistoryDatasource {
    fun getHistory(): CommonFlow<List<HistoryItem>>
    suspend fun insertHistoryItem(item: HistoryItem)
}