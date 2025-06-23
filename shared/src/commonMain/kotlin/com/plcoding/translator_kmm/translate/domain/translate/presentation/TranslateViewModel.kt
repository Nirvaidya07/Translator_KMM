package com.plcoding.translator_kmm.translate.domain.translate.presentation

import com.plcoding.translator_kmm.translate.domain.history.HistoryDatasource
import com.plcoding.translator_kmm.translate.domain.translate.Translate
import kotlinx.coroutines.CoroutineScope

class TranslateViewModel(
    private val translate: Translate,
    private val historyDatasource: HistoryDatasource,
    private val coroutineScope: CoroutineScope?
) {
}