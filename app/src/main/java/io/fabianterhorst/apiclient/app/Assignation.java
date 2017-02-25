package io.fabianterhorst.apiclient.app;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.UUID;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

/**
 * Created by jorgehdezvilla on 22/02/17.
 * EMP
 */

@RealmClass
public class Assignation implements Serializable, RealmModel {

    @PrimaryKey
    public String __id = UUID.randomUUID().toString();
    public String id;
    public String status;
    @SerializedName("commission_title")
    public String comissionTitle;
    @SerializedName("account_name")
    public String accountName;
    @SerializedName("commission_from_date")
    public String fromDate;
    @SerializedName("commission_to_date")
    public String toDate;

    public boolean active;

}
