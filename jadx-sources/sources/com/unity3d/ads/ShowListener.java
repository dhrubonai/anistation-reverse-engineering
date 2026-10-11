package com.unity3d.ads;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityad);

    void onCompleted(UnityAd unityad, ShowFinishState showFinishState);

    void onFailed(UnityAd unityad, UnityAdsError unityAdsError);

    void onStarted(UnityAd unityad);
}
