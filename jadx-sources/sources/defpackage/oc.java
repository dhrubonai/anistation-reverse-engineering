package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc implements ci2 {
    public final oa a;
    public final Object b = new Object();
    public boolean c;
    public final mc d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [mc, android.content.ComponentCallbacks, java.lang.Object] */
    public oc(oa oaVar) {
        this.a = oaVar;
        ?? obj = new Object();
        this.d = obj;
        if (oaVar.isAttachedToWindow()) {
            Context context = oaVar.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.c = true;
            }
        }
        oaVar.addOnAttachStateChangeListener(new nc(this, (byte) 0));
    }

    @Override // defpackage.ci2
    public final void a(di2 di2Var) {
        synchronized (this.b) {
            if (!di2Var.s) {
                di2Var.s = true;
                di2Var.b();
            }
        }
    }

    @Override // defpackage.ci2
    public final di2 b() {
        di2 di2Var;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            di2Var = new di2(new hi2());
        }
        return di2Var;
    }
}
