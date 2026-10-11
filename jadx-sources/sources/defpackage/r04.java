package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r04 implements q04 {
    public bx5 A;
    public final Context x;
    public ke0 y;
    public final pi4 z = new pi4(1.0f);

    public r04(Context context) {
        this.x = context;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, vn5] */
    @Override // defpackage.q04
    public final float T() {
        vz0 vz0Var;
        qx5 qx5Var;
        if (this.A == null) {
            Context context = this.x;
            p44 p44Var = p67.a;
            synchronized (p44Var) {
                try {
                    Object g = p44Var.g(context);
                    vz0Var = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        za0 d = iv.d(-1, 6, null);
                        g = h41.d0(new mx0(new d23(contentResolver, uriFor, new o67(d, Handler.createAsync(Looper.getMainLooper())), d, context, null), (byte) 5), db.j(), new Object(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        p44Var.n(context, g);
                    }
                    qx5Var = (qx5) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.z.i(((Number) qx5Var.getValue()).floatValue());
            ke0 ke0Var = this.y;
            if (ke0Var != null) {
                this.A = tl7.z(ke0Var, null, null, new e52(qx5Var, this, vz0Var, (byte) 8), 3);
            } else {
                ze0.m("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
        }
        return this.z.h();
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
