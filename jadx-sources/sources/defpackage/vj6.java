package defpackage;

import android.util.Log;
import android.view.View;
import com.anistation.android.R;
import com.unity3d.ads.adplayer.DisplayRecoverer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vj6 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj6(ak6 ak6Var, sb2 sb2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 1;
        this.z = ak6Var;
        this.A = sb2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                vj6 vj6Var = new vj6(obj2, vz0Var, (byte) 0);
                vj6Var.A = obj;
                return vj6Var;
            case 1:
                return new vj6((ak6) obj2, (sb2) this.A, vz0Var);
            case 2:
                vj6 vj6Var2 = new vj6(obj2, vz0Var, (byte) 2);
                vj6Var2.A = obj;
                return vj6Var2;
            case 3:
                return new vj6((n80) this.A, (w44) obj2, vz0Var, (byte) 3);
            case 4:
                return new vj6(obj2, vz0Var, (byte) 4);
            case 5:
                return new vj6((px5) this.A, (w44) obj2, vz0Var, (byte) 5);
            case 6:
                return new vj6((v27) this.A, (t17) obj2, vz0Var, (byte) 6);
            default:
                return new vj6((h05) this.A, (View) obj2, vz0Var, (byte) 7);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((vj6) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((vj6) create(obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((vj6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        hp4 hp4Var;
        byte b = this.x;
        jq1 jq1Var = jq1.MILLISECONDS;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        Object obj2 = this.z;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ij4 ij4Var = (ij4) this.A;
                this.y = true;
                Object a = ((ak6) obj2).a(ij4Var, this);
                if (a == w11Var) {
                    return w11Var;
                }
                return a;
            case 1:
                sb2 sb2Var = (sb2) this.A;
                boolean z2 = this.y;
                try {
                    if (z2) {
                        if (z2) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        this.y = true;
                        obj = ((ak6) obj2).c(this);
                        if (obj == w11Var) {
                            return w11Var;
                        }
                    }
                    return pn6Var;
                } finally {
                    sb2Var.invoke();
                }
            case 2:
                Object obj3 = this.A;
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.A = null;
                this.y = true;
                if (((x42) obj2).emit(obj3, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    do5 do5Var = ((n80) this.A).a;
                    this.y = true;
                    if (do5Var.d(this) == w11Var) {
                        return w11Var;
                    }
                }
                ((w44) obj2).setValue(Boolean.FALSE);
                return pn6Var;
            case 4:
                w44 w44Var = (w44) obj2;
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        hp4Var = (hp4) this.A;
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    tw5 tw5Var = s07.a;
                    hp4 hp4Var2 = (hp4) w44Var.getValue();
                    if (hp4Var2 != null) {
                        m18 m18Var = fq1.y;
                        long W = w65.W(1600L, jq1Var);
                        this.A = hp4Var2;
                        this.y = true;
                        if (x97.v(W, this) == w11Var) {
                            return w11Var;
                        }
                        hp4Var = hp4Var2;
                    } else {
                        return pn6Var;
                    }
                }
                tw5 tw5Var2 = s07.a;
                if (a34.i((hp4) w44Var.getValue(), hp4Var)) {
                    w44Var.setValue(null);
                    return pn6Var;
                }
                return pn6Var;
            case 5:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                mx0 j = wt5.j(new ci((px5) this.A, (byte) 8));
                rc rcVar = new rc((w44) obj2, (byte) 11);
                this.y = true;
                if (j.collect(rcVar, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 6:
                v27 v27Var = (v27) this.A;
                t17 t17Var = (t17) obj2;
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    m18 m18Var2 = fq1.y;
                    long W2 = w65.W(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, jq1Var);
                    this.y = true;
                    if (x97.v(W2, this) == w11Var) {
                        return w11Var;
                    }
                }
                v27Var.O = null;
                if (a34.i(t17Var, v27Var.K) && t17Var.c == v27Var.c0 && ((dq4) v27Var.o.getValue()).j) {
                    Log.w("WatchViewModel", "Cast playback timed out on " + t17Var.a + " (attempt " + t17Var.d + ").");
                    if (v27Var.E == null) {
                        v27Var.H(t17Var, v27Var.j());
                        return pn6Var;
                    }
                    v27Var.q(true);
                    return pn6Var;
                }
                return pn6Var;
            default:
                h05 h05Var = (h05) this.A;
                View view = (View) obj2;
                boolean z8 = this.y;
                try {
                    if (z8) {
                        if (z8) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        this.y = true;
                        Object q = sw0.q(h05Var.u, new h70(2, vz0Var, (byte) 4), this);
                        if (q != w11Var) {
                            q = pn6Var;
                        }
                        if (q == w11Var) {
                            return w11Var;
                        }
                    }
                    if (p67.a(view) == h05Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                        return pn6Var;
                    }
                    return pn6Var;
                } finally {
                    if (p67.a(view) == h05Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj6(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj6(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = obj2;
    }
}
