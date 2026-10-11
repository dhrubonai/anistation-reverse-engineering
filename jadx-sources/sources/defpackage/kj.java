package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anistation.model.settings.HoldAction;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kj implements PointerInputEventHandler {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ ud1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sb2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ko4 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ dq4 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ AudioManager l;
    public final /* synthetic */ Activity m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ v11 o;
    public final /* synthetic */ ic2 p;
    public final /* synthetic */ ub2 q;
    public final /* synthetic */ w44 r;
    public final /* synthetic */ ri4 s;
    public final /* synthetic */ w44 t;
    public final /* synthetic */ w44 u;
    public final /* synthetic */ ri4 v;
    public final /* synthetic */ ub2 w;
    public final /* synthetic */ w44 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ HoldAction z;

    public kj(ud1 ud1Var, boolean z, sb2 sb2Var, boolean z2, boolean z3, ko4 ko4Var, boolean z4, boolean z5, boolean z6, dq4 dq4Var, boolean z7, AudioManager audioManager, Activity activity, Context context, v11 v11Var, ic2 ic2Var, ub2 ub2Var, w44 w44Var, ri4 ri4Var, w44 w44Var2, w44 w44Var3, ri4 ri4Var2, ub2 ub2Var2, w44 w44Var4, boolean z8, HoldAction holdAction, w44 w44Var5, w44 w44Var6, w44 w44Var7) {
        this.a = ud1Var;
        this.b = z;
        this.c = sb2Var;
        this.d = z2;
        this.e = z3;
        this.f = ko4Var;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = dq4Var;
        this.k = z7;
        this.l = audioManager;
        this.m = activity;
        this.n = context;
        this.o = v11Var;
        this.p = ic2Var;
        this.q = ub2Var;
        this.r = w44Var;
        this.s = ri4Var;
        this.t = w44Var2;
        this.u = w44Var3;
        this.v = ri4Var2;
        this.w = ub2Var2;
        this.x = w44Var4;
        this.y = z8;
        this.z = holdAction;
        this.A = w44Var5;
        this.B = w44Var6;
        this.C = w44Var7;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        float f;
        float f2 = (int) (((a46) yq4Var).V >> 32);
        float f3 = (int) (((a46) yq4Var).V & 4294967295L);
        if (f3 < 1.0f) {
            f = 1.0f;
        } else {
            f = f3;
        }
        List list = sj.a;
        Object t = n77.t(yq4Var, new jj(this.b, this.c, this.d, f2, this.e, this.f, this.g, this.a.g0(40.0f), this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, f, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, null), vz0Var);
        if (t == w11.x) {
            return t;
        }
        return pn6.a;
    }
}
