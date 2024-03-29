package com.risako070310.music.api

import com.risako070310.music.dataclass.Token
import retrofit2.http.*

interface TokenRequest {
    @POST("api/token")
    @FormUrlEncoded
    @Headers("Authorization: Basic ZmRmNmY0YjExZjNmNDExYmE1ZDFlYjg1OWIxM2MxZjg6YmZkMDM4Nzg2NzYxNGJmMWI3NzQxOWFjNTkwYWZhZGM=")
    suspend fun getToken(@Field("grant_type") grant_type:String ): Token
}
