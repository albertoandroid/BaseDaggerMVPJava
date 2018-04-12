package com.androiddesdecero.a004daggerjava.api;

import retrofit2.Call;
import retrofit2.http.GET;
import com.androiddesdecero.a004daggerjava.model.Video;

import java.util.List;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface VideosApiService {
    //@GET("Obtener Videos Aplicacion")
    @GET("app/get_videos.php")
    Call<List<Video>> getAllVideos();

}
