package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s82 implements p82 {
    public final oa7 a;
    public final lc b;
    public final l33 c;
    public final w82 d;
    public final lz0 e;

    public s82(oa7 oa7Var, lc lcVar) {
        l33 l33Var = t82.a;
        w82 w82Var = new w82(t82.b);
        new p18((byte) 27);
        this.a = oa7Var;
        this.b = lcVar;
        this.c = l33Var;
        this.d = w82Var;
        this.e = new lz0(this, (byte) 8);
    }

    public final ll6 a(il6 il6Var) {
        l33 l33Var = this.c;
        r82 r82Var = new r82(this, il6Var, (byte) 0);
        synchronized (((y95) l33Var.y)) {
            ll6 ll6Var = (ll6) ((hm3) l33Var.z).c(il6Var);
            if (ll6Var != null) {
                if (ll6Var.a()) {
                    return ll6Var;
                }
            }
            try {
                ll6 ll6Var2 = (ll6) r82Var.invoke(new ll5((Object) l33Var, (Object) il6Var, (byte) 16));
                synchronized (((y95) l33Var.y)) {
                    if (((hm3) l33Var.z).c(il6Var) == null && ll6Var2.a()) {
                        ((hm3) l33Var.z).d(il6Var, ll6Var2);
                    }
                }
                return ll6Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final ll6 b(q82 q82Var, s92 s92Var, int i, int i2) {
        s92 s92Var2;
        int i3 = this.b.x;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            s92Var2 = new s92(db.C(s92Var.x + i3, 1, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
        } else {
            s92Var2 = s92Var;
        }
        return a(new il6(q82Var, s92Var2, i, i2, null));
    }
}
