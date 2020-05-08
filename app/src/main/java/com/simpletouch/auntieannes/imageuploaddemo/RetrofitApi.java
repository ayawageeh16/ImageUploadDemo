package com.simpletouch.auntieannes.imageuploaddemo;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface RetrofitApi {

    @Multipart
    @POST("upload")
    Call<Map<String, String>> uploadImage(@Part MultipartBody.Part file);

}
