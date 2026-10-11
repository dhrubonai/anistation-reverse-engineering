package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fr2 extends t36 implements lc2 {
    public /* synthetic */ vk6 A;
    public final /* synthetic */ Charset B;
    public boolean x;
    public /* synthetic */ f91 y;
    public /* synthetic */ wc0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr2(Charset charset, vz0 vz0Var) {
        super(5, vz0Var);
        this.B = charset;
    }

    @Override // defpackage.lc2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fr2 fr2Var = new fr2(this.B, (vz0) obj5);
        fr2Var.y = (f91) obj2;
        fr2Var.z = (wc0) obj3;
        fr2Var.A = (vk6) obj4;
        return fr2Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        jz0 jz0Var;
        f91 f91Var = this.y;
        wc0 wc0Var = this.z;
        vk6 vk6Var = this.A;
        boolean z = this.x;
        Charset charset = null;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            if (!vk6Var.a.equals(z05.a(String.class))) {
                return null;
            }
            this.y = f91Var;
            this.z = null;
            this.A = null;
            this.x = true;
            obj = zz.V(wc0Var, this);
            w11 w11Var = w11.x;
            if (obj == w11Var) {
                return w11Var;
            }
        }
        oa0 oa0Var = (oa0) obj;
        yp2 d0 = f91Var.d0();
        yk3 yk3Var = gr2.a;
        String str = d0.d().a().get("Content-Type");
        if (str != null) {
            jz0 jz0Var2 = jz0.e;
            jz0Var = io3.X(str);
        } else {
            jz0Var = null;
        }
        if (jz0Var != null) {
            charset = mz0.a(jz0Var);
        }
        if (charset == null) {
            charset = this.B;
        }
        yk3 yk3Var2 = gr2.a;
        if (nx7.N(yk3Var2)) {
            yk3Var2.h("Reading response body for " + d0.c().getUrl() + " as String with charset " + charset);
        }
        return it5.e(oa0Var, charset);
    }
}
