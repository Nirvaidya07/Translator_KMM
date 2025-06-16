package com.plcoding.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

class IOSMutableStateFlow<T>(
    intialValue: T
) : CommonMutableStateFlow<T>(MutableStateFlow(intialValue))
