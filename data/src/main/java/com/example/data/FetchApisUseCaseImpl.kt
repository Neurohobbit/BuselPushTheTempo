package com.example.data

import com.example.domain.usecase.FetchApisUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import retrofit2.Response
import javax.inject.Inject

class FetchApisUseCaseImpl @Inject constructor(
    private val service: RetrofitService
) : FetchApisUseCase {

    override suspend fun fetchApis(): Flow<Response<Any>> =
        flowOf(service.getApisList())
}
