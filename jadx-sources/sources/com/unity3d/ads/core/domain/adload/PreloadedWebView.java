package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;
import defpackage.a34;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class PreloadedWebView {
    private final AdPlayer adPlayer;
    private final WebViewBridge bridge;
    private final LoadEvent loadEvent;

    public PreloadedWebView(AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent) {
        adPlayer.getClass();
        webViewBridge.getClass();
        loadEvent.getClass();
        this.adPlayer = adPlayer;
        this.bridge = webViewBridge;
        this.loadEvent = loadEvent;
    }

    public static /* synthetic */ PreloadedWebView copy$default(PreloadedWebView preloadedWebView, AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            adPlayer = preloadedWebView.adPlayer;
        }
        if ((i & 2) != 0) {
            webViewBridge = preloadedWebView.bridge;
        }
        if ((i & 4) != 0) {
            loadEvent = preloadedWebView.loadEvent;
        }
        return preloadedWebView.copy(adPlayer, webViewBridge, loadEvent);
    }

    public final AdPlayer component1() {
        return this.adPlayer;
    }

    public final WebViewBridge component2() {
        return this.bridge;
    }

    public final LoadEvent component3() {
        return this.loadEvent;
    }

    public final PreloadedWebView copy(AdPlayer adPlayer, WebViewBridge webViewBridge, LoadEvent loadEvent) {
        adPlayer.getClass();
        webViewBridge.getClass();
        loadEvent.getClass();
        return new PreloadedWebView(adPlayer, webViewBridge, loadEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadedWebView)) {
            return false;
        }
        PreloadedWebView preloadedWebView = (PreloadedWebView) obj;
        if (a34.i(this.adPlayer, preloadedWebView.adPlayer) && a34.i(this.bridge, preloadedWebView.bridge) && a34.i(this.loadEvent, preloadedWebView.loadEvent)) {
            return true;
        }
        return false;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final WebViewBridge getBridge() {
        return this.bridge;
    }

    public final LoadEvent getLoadEvent() {
        return this.loadEvent;
    }

    public int hashCode() {
        return this.loadEvent.hashCode() + ((this.bridge.hashCode() + (this.adPlayer.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PreloadedWebView(adPlayer=" + this.adPlayer + ", bridge=" + this.bridge + ", loadEvent=" + this.loadEvent + ')';
    }
}
