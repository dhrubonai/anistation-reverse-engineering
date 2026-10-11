package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class su extends BroadcastReceiver {
    public final py1 a;
    public final k46 b;
    public final /* synthetic */ tu c;

    public su(tu tuVar, k46 k46Var, py1 py1Var) {
        this.c = tuVar;
        this.b = k46Var;
        this.a = py1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.f(new p0((Object) this, (byte) 6));
        }
    }
}
