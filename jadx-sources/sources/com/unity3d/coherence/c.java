package com.unity3d.coherence;

import android.content.Context;
import defpackage.eo3;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c {
    public static volatile c d;
    public final d a;
    public final eo3 b;
    public final long c;

    public c(Context context) {
        long init = CoherenceBridge.init(new Coherence(context, context.getSharedPreferences("com.unity3d.coherence.prefs", 0)), context, "0.2.0", 2);
        if (init != 0) {
            this.c = init;
            this.a = new d(this);
            this.b = new eo3((Object) this, (byte) 5);
            try {
                Thread thread = new Thread(new b(init), "udl-warm");
                thread.setDaemon(true);
                thread.start();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        ze0.m("native initialization returned null (source=2)");
        throw null;
    }
}
