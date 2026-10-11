package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wy0 extends t36 implements lc2 {
    public /* synthetic */ vk6 A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ ArrayList C;
    public final /* synthetic */ cn0 D;
    public boolean x;
    public /* synthetic */ f91 y;
    public /* synthetic */ wc0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(cn0 cn0Var, vz0 vz0Var, ArrayList arrayList, Set set) {
        super(5, vz0Var);
        this.B = set;
        this.C = arrayList;
        this.D = cn0Var;
    }

    @Override // defpackage.lc2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList = this.C;
        wy0 wy0Var = new wy0(this.D, (vz0) obj5, arrayList, this.B);
        wy0Var.y = (f91) obj2;
        wy0Var.z = (wc0) obj3;
        wy0Var.A = (vk6) obj4;
        return wy0Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        jz0 jz0Var;
        f91 f91Var = this.y;
        wc0 wc0Var = this.z;
        vk6 vk6Var = this.A;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        f91Var.getClass();
        String str = f91Var.a().get("Content-Type");
        if (str != null) {
            jz0 jz0Var2 = jz0.e;
            jz0Var = io3.X(str);
        } else {
            jz0Var = null;
        }
        if (jz0Var == null) {
            return null;
        }
        Charset a = mz0.a(jz0Var);
        if (a == null) {
            a = kl0.a;
        }
        Charset charset = a;
        op6 url = f91Var.d0().c().getUrl();
        this.y = null;
        this.z = null;
        this.A = null;
        this.x = true;
        Object b = zy0.b(this.B, this.C, url, vk6Var, wc0Var, jz0Var, charset, this);
        w11 w11Var = w11.x;
        if (b == w11Var) {
            return w11Var;
        }
        return b;
    }
}
