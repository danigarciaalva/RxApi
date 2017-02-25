package io.fabianterhorst.apiclient.app;

import io.fabianterhorst.apiclient.ApiClient;
import retrofit2.Call;
import rx.Observable;

/**
 * Created by dflabs on 2/24/17.
 * ApiClient-master
 */

public class Business extends ApiClient<BusinessApi> implements BusinessApi{

    public Business(){
        super(BusinessApi.class, BusinessApi.END_POINT);
    }

    @Override
    public Observable<AssignmentsResponse> assignments() {
        return getApiObservable(getApi().assignments(), Assignation.class);
    }
}
