package com.example.domain.usecase

import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface FetchApisUseCase {
    suspend fun fetchApis(): Flow<Response<Any>>
}