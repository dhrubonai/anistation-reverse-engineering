package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class eu3 implements vu3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eu3(wu3 wu3Var, Object obj, byte b) {
        this.a = b;
        this.b = wu3Var;
        this.c = obj;
    }

    @Override // defpackage.vu3
    public final void a(dt3 dt3Var) {
        byte b = this.a;
        Object obj = this.c;
        wu3 wu3Var = this.b;
        switch (b) {
            case 0:
                String str = ((jq3) obj).x;
                if (TextUtils.isEmpty(str)) {
                    kb0.O("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                fq4 fq4Var = bu3Var.t;
                if (!fq4Var.t0(17)) {
                    kb0.O("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                kf6 G0 = fq4Var.G0();
                jf6 jf6Var = new jf6();
                for (int i = 0; i < G0.o(); i++) {
                    if (TextUtils.equals(G0.m(i, jf6Var, 0L).c.a, str)) {
                        fq4Var.N(i);
                        return;
                    }
                }
                return;
            default:
                bu3 bu3Var2 = wu3Var.i;
                bu3Var2.t();
                ((kq0) obj).e(bu3Var2.t);
                return;
        }
    }
}
