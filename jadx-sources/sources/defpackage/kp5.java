package defpackage;

import android.os.ConditionVariable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kp5 extends Thread {
    public final /* synthetic */ ConditionVariable x;
    public final /* synthetic */ lp5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp5(lp5 lp5Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.y = lp5Var;
        this.x = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.y) {
            this.x.open();
            this.y.h();
            this.y.b.getClass();
        }
    }
}
