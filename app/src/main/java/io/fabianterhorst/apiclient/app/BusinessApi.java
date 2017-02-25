package io.fabianterhorst.apiclient.app;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by dflabs on 2/24/17.
 * ApiClient-master
 */
public interface BusinessApi {

    String END_POINT = "http://emp-qa.dflabs.io/";

    @GET("business/api/v1/assignations/")
    Observable<AssignmentsResponse> assignments();
}
