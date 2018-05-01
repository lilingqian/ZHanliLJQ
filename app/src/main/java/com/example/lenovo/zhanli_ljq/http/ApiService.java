package com.example.lenovo.zhanli_ljq.http;


import com.example.lenovo.zhanli_ljq.entity.LeftCategory;
import com.example.lenovo.zhanli_ljq.entity.MessageBean;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by eric on 2018/4/18.
 */

public interface ApiService {

    @GET("product/getCatagory")
    Flowable<MessageBean<List<LeftCategory>>> getFirstCategory();

   // @GET("product/getProductCatagory")
    //Flowable<MessageBean<List<RightCategory>>> getSecondCategory(@Query("cid") String cid);
}
