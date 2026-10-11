package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import defpackage.pn6;
import defpackage.vz0;
import defpackage.w11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, vz0 vz0Var) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, vz0Var);
            if (destroy == w11.x) {
                return destroy;
            }
            return pn6.a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            showOptions.getClass();
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
