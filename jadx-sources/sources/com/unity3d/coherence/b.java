package com.unity3d.coherence;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ long x;

    public b(long j) {
        this.x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CoherenceBridge.warmPlugins(this.x);
        } catch (Throwable unused) {
        }
    }
}
