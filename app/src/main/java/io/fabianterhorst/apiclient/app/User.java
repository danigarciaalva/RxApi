package io.fabianterhorst.apiclient.app;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by dflabs on 2/24/17.
 * ApiClient-master
 */
public class User extends RealmObject{

    @PrimaryKey
    private long id;
    private String login;
    private String email;

    public User(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
