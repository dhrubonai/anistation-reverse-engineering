package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface Listeners {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String str) {
            str.getClass();
        }

        public static void onComplete(Listeners listeners, String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            str.getClass();
            unityAdsShowCompletionState.getClass();
        }

        public static void onError(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            str.getClass();
            unityAdsShowError.getClass();
            str2.getClass();
        }

        public static void onLeftApplication(Listeners listeners, String str) {
            str.getClass();
        }

        public static void onRewarded(Listeners listeners, String str) {
            str.getClass();
        }

        public static void onStart(Listeners listeners, String str) {
            str.getClass();
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onRewarded(String str);

    void onStart(String str);
}
