package defpackage;

import com.unity3d.ads.adplayer.DisplayRecoverer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jn6 extends t36 implements kc2 {
    public boolean x;
    public /* synthetic */ Throwable y;
    public /* synthetic */ long z;

    /* JADX WARN: Type inference failed for: r4v2, types: [jn6, t36] */
    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        ?? t36Var = new t36(4, (vz0) obj4);
        t36Var.y = (Throwable) obj2;
        t36Var.z = longValue;
        return t36Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            Throwable th = this.y;
            long j = this.z;
            xk3.d().c(kn6.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, kn6.b);
            this.x = true;
            Object u = x97.u(min, this);
            w11 w11Var = w11.x;
            if (u == w11Var) {
                return w11Var;
            }
        }
        return Boolean.TRUE;
    }
}
