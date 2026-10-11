package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s92 implements Comparable {
    public static final s92 A;
    public static final s92 B;
    public static final s92 C;
    public static final s92 D;
    public static final s92 E;
    public static final List F;
    public static final s92 y;
    public static final s92 z;
    public final int x;

    static {
        s92 s92Var = new s92(100);
        s92 s92Var2 = new s92(200);
        s92 s92Var3 = new s92(300);
        s92 s92Var4 = new s92(CommonGatewayClient.CODE_400);
        y = s92Var4;
        s92 s92Var5 = new s92(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        z = s92Var5;
        s92 s92Var6 = new s92(600);
        A = s92Var6;
        s92 s92Var7 = new s92(700);
        s92 s92Var8 = new s92(800);
        s92 s92Var9 = new s92(900);
        B = s92Var4;
        C = s92Var5;
        D = s92Var6;
        E = s92Var7;
        F = te4.I(s92Var, s92Var2, s92Var3, s92Var4, s92Var5, s92Var6, s92Var7, s92Var8, s92Var9);
    }

    public s92(int i) {
        this.x = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (!z2) {
            fz2.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s92 s92Var) {
        return a34.D(this.x, s92Var.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s92)) {
            return false;
        }
        if (this.x == ((s92) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x;
    }

    public final String toString() {
        return qx1.i(this.x, "FontWeight(weight=", ")");
    }
}
