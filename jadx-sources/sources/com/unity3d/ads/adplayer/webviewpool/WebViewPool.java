package com.unity3d.ads.adplayer.webviewpool;

import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface WebViewPool {
    Object acquireForShow(vz0 vz0Var);

    Object acquireFreshEntry(vz0 vz0Var);

    Object enqueueRecycled(PoolEntry poolEntry, vz0 vz0Var);

    Object initialize(int i, vz0 vz0Var);

    Object release(PoolEntry poolEntry, vz0 vz0Var);

    Object resetEntry(PoolEntry poolEntry, vz0 vz0Var);
}
