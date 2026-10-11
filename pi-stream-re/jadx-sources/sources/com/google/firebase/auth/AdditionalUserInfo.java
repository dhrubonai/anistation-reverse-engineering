package com.google.firebase.auth;

import c5.b;
import java.util.Map;

/* loaded from: classes.dex */
public interface AdditionalUserInfo extends b {
    Map<String, Object> getProfile();

    String getProviderId();

    String getUsername();

    boolean isNewUser();
}
