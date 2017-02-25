package io.fabianterhorst.apiclient.app;

import java.util.List;

import io.fabianterhorst.apiclient.ApiClient;
import retrofit2.http.Path;
import rx.Observable;

class Github extends ApiClient<GithubApi> implements GithubApi {

    private Github() {
        super(GithubApi.class, GithubApi.END_POINT);
    }

    static void init() {
        init(new Github());
    }

    @Override
    public Observable<List<Repository>> getRepositories(@Path("user") String user) {
        return getApiObservable(getApi().getRepositories(user), Repository.class);
    }

    @Override
    public Observable<User> getUser(@Path("user") String user) {
        return getApiObservableSingle(getApi().getUser(user), User.class, "login", user);
    }
}
