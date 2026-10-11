package com.unity3d.ads.adplayer;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.db;
import defpackage.jn5;
import defpackage.pn6;
import defpackage.t44;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w42;
import defpackage.xa4;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface AdPlayer {
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final t44 broadcastEventChannel = jn5.b(0, 0, null, 7);

        private Companion() {
        }

        public final t44 getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, vz0 vz0Var) {
            db.t(adPlayer.getScope(), null);
            return pn6.a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            showOptions.getClass();
            throw new xa4(0);
        }
    }

    Object destroy(vz0 vz0Var);

    void dispatchShowCompleted();

    w42 getOnLoadEvent();

    w42 getOnOfferwallEvent();

    w42 getOnShowEvent();

    v11 getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, vz0 vz0Var);

    Object onBroadcastEvent(String str, vz0 vz0Var);

    Object requestShow(Map<String, ? extends Object> map, vz0 vz0Var);

    Object sendActivityDestroyed(vz0 vz0Var);

    Object sendFocusChange(boolean z, vz0 vz0Var);

    Object sendMuteChange(boolean z, vz0 vz0Var);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, vz0 vz0Var);

    Object sendPrivacyFsmChange(byte[] bArr, vz0 vz0Var);

    Object sendUserConsentChange(byte[] bArr, vz0 vz0Var);

    Object sendVisibilityChange(boolean z, vz0 vz0Var);

    Object sendVolumeChange(double d, vz0 vz0Var);

    void show(ShowOptions showOptions);
}
