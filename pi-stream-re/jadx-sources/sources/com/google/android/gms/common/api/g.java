package com.google.android.gms.common.api;

import java.util.Set;

/* loaded from: classes.dex */
public interface g extends b {
    void connect(com.google.android.gms.common.internal.d dVar);

    void disconnect();

    void disconnect(String str);

    b5.c[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(com.google.android.gms.common.internal.m mVar, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(com.google.android.gms.common.internal.e eVar);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
