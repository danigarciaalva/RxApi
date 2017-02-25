package io.fabianterhorst.apiclient.app;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import io.dflabs.emp.model.pojos.Assignation;
import io.realm.RealmList;
import io.realm.annotations.PrimaryKey;

/**
 * Created by dflabs on 1/10/17.
 * EMP
 */
public class AssignmentsResponse {

    @SerializedName("results")
    public RealmList<Assignation> assignments;

}
