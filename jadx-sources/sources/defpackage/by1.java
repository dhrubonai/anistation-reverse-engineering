package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class by1 implements io4 {
    public final zs a;
    public final /* synthetic */ dy1 b;

    public by1(dy1 dy1Var, zs zsVar) {
        this.b = dy1Var;
        this.a = zsVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // defpackage.io4
    public final void A(qh6 qh6Var) {
        zs zsVar = this.a;
        boolean z = true;
        try {
            ?? a = qh6Var.a(1);
            int i = a;
            if (qh6Var.a(2)) {
                i = a + 1;
            }
            for (int i2 = 0; i2 < qh6Var.a.size(); i2++) {
                int i3 = ((ph6) qh6Var.a.get(i2)).b.c;
                if (i3 != 1 && i3 != 2) {
                    h11.r(i3, "Unsupported track type: ", "ExoPlayerAssetLoader");
                }
            }
            dy1 dy1Var = this.b;
            if (i > 0) {
                zsVar.c(i);
                ((vy1) dy1Var.f).Y(true);
                return;
            }
            String str = "The asset loader has no audio or video track to output.";
            String f = yu5.f((Context) dy1Var.c, ((qr1) dy1Var.d).a);
            if (f == null || !qy3.k(f)) {
                z = false;
            }
            if (z) {
                str = "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems.";
            }
            zsVar.b(oz1.a(new IllegalStateException(str), 1001));
        } catch (RuntimeException e) {
            zsVar.b(oz1.a(e, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
        }
    }

    @Override // defpackage.io4
    public final void H(kf6 kf6Var, int i) {
        boolean z;
        int i2;
        zs zsVar = this.a;
        dy1 dy1Var = this.b;
        try {
            jf6 jf6Var = new jf6();
            kf6Var.n(0, jf6Var);
            if (!jf6Var.k) {
                if (dy1Var.a == 1) {
                    long j = jf6Var.m;
                    dy1Var.b = j;
                    if (j > 0 && j != -9223372036854775807L) {
                        i2 = 2;
                        dy1Var.a = i2;
                        zsVar.f(j);
                        return;
                    }
                    i2 = 3;
                    dy1Var.a = i2;
                    zsVar.f(j);
                    return;
                }
                long j2 = dy1Var.b;
                if (j2 != -9223372036854775807L) {
                    if (Math.abs(j2 - jf6Var.m) <= 20000) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.C(z, "Unexpected duration change: old=%s, new=%s", dy1Var.b, jf6Var.m);
                }
            }
        } catch (RuntimeException e) {
            zsVar.b(oz1.a(e, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
        }
    }

    @Override // defpackage.io4
    public final void J(yx1 yx1Var) {
        Throwable cause = yx1Var.getCause();
        if ((cause instanceof gz1) && ((gz1) cause).x == 1) {
            kb0.t("ExoPlayerAssetLoader", "Releasing the player timed out.", yx1Var);
            return;
        }
        n15 n15Var = oz1.y;
        String b = yx1Var.b();
        Object valueOf = Integer.valueOf(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        Object obj = n15Var.get(b);
        if (obj != null) {
            valueOf = obj;
        }
        this.a.b(oz1.a(yx1Var, ((Integer) valueOf).intValue()));
    }
}
