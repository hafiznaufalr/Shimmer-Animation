package net.hafiznaufalr.shimmer.retrofit;

import net.hafiznaufalr.shimmer.model.Model;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {
    @GET("photos")
    Observable<List<Model>> getData();
}
