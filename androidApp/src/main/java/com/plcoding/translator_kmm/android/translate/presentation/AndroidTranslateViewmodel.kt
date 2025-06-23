package com.plcoding.translator_kmm.android.translate.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.translator_kmm.translate.domain.history.HistoryDatasource
import com.plcoding.translator_kmm.translate.domain.translate.Translate
import com.plcoding.translator_kmm.translate.domain.translate.presentation.TranslateEvent
import com.plcoding.translator_kmm.translate.domain.translate.presentation.TranslateViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AndroidTranslateViewmodel @Inject constructor(
    private val translate: Translate,
    private val historyDatasource: HistoryDatasource
) : ViewModel() {
    private val viewModel by lazy {
        TranslateViewModel(
            translate = translate,
            historyDatasource = historyDatasource,
            coroutineScope = viewModelScope
        )
    }

    val state = viewModel.state

    fun onEvent(event: TranslateEvent) {
        viewModel.onEvent(event)
    }
}