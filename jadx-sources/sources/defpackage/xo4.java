package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xo4 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ w44 D;
    public Activity x;
    public int y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo4(boolean z, boolean z2, Context context, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = z;
        this.B = z2;
        this.C = context;
        this.D = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new xo4(this.A, this.B, this.C, this.D, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((xo4) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Activity u;
        int i;
        Throwable th;
        w11 w11Var = w11.x;
        boolean z = this.z;
        Context context = this.C;
        if (z) {
            if (!z) {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.y;
            u = this.x;
            try {
                m37.N(obj);
                throw new er0((byte) 3);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            m37.N(obj);
            if (this.A && this.B && (u = iv.u(context)) != null) {
                int requestedOrientation = u.getRequestedOrientation();
                u.setRequestedOrientation(14);
                try {
                    this.x = u;
                    this.y = requestedOrientation;
                    this.z = true;
                    x97.l(this);
                    return w11Var;
                } catch (Throwable th3) {
                    i = requestedOrientation;
                    th = th3;
                }
            } else {
                return pn6.a;
            }
        }
        if (u.getRequestedOrientation() == 14) {
            if (!((Boolean) this.D.getValue()).booleanValue() && iv.E(context)) {
                i = -1;
            }
            u.setRequestedOrientation(i);
        }
        throw th;
    }
}
