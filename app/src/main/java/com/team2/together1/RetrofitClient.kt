package com.team2.together1


// object는 싱글턴
//object RetrofitClient {
//    private const val URL = "http://15.164.10.19:8080"
//
//    private val retrofit= Retrofit.Builder()
//        .baseUrl(URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    val service : APIS = retrofit.create(APIS::class.java)
//
//    val interceptor = HttpLoggingInterceptor().apply {
//        this.level = HttpLoggingInterceptor.Level.BODY
//    }
//    val client = OkHttpClient.Builder().apply {
//        this.addInterceptor(interceptor)
//            .connectTimeout(30, TimeUnit.SECONDS)
//            .readTimeout(20, TimeUnit.SECONDS)
//            .writeTimeout(25, TimeUnit.SECONDS)
//    }.build()
//
//    fun getRetrofitInstance(): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(URL)
//            .client(client)
//            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
//            .build()
//    }
//}

