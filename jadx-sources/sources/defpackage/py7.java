package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class py7 extends zq7 {
    public volatile dy7 A;
    public dy7 B;
    public final ConcurrentHashMap C;
    public to7 D;
    public volatile boolean E;
    public volatile dy7 F;
    public dy7 G;
    public boolean H;
    public final Object I;
    public volatile dy7 z;

    public py7(gu7 gu7Var) {
        super(gu7Var);
        this.I = new Object();
        this.C = new ConcurrentHashMap();
    }

    @Override // defpackage.zq7
    public final boolean O() {
        return false;
    }

    public final dy7 P(boolean z) {
        M();
        L();
        dy7 dy7Var = this.B;
        if (!z) {
            return dy7Var;
        }
        if (dy7Var != null) {
            return dy7Var;
        }
        return this.G;
    }

    public final String Q(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        gu7 gu7Var = (gu7) this.x;
        int length2 = str2.length();
        gu7Var.A.getClass();
        if (length2 > 500) {
            gu7Var.A.getClass();
            return str2.substring(0, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(defpackage.dy7 r20, defpackage.dy7 r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py7.R(dy7, dy7, long, boolean, android.os.Bundle):void");
    }

    public final void S(to7 to7Var, Bundle bundle) {
        Bundle bundle2;
        if (((gu7) this.x).A.a0() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.C.put(Integer.valueOf(to7Var.x), new dy7(bundle2.getLong("id"), bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name")));
        }
    }

    public final void T(String str, dy7 dy7Var, boolean z) {
        dy7 dy7Var2;
        dy7 dy7Var3;
        String str2;
        if (this.z == null) {
            dy7Var2 = this.A;
        } else {
            dy7Var2 = this.z;
        }
        dy7 dy7Var4 = dy7Var2;
        if (dy7Var.b == null) {
            if (str != null) {
                str2 = Q(str);
            } else {
                str2 = null;
            }
            dy7Var3 = new dy7(dy7Var.a, str2, dy7Var.c, dy7Var.e, dy7Var.f, dy7Var.g);
        } else {
            dy7Var3 = dy7Var;
        }
        this.A = this.z;
        this.z = dy7Var3;
        gu7 gu7Var = (gu7) this.x;
        gu7Var.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.U(new ey7(this, dy7Var3, dy7Var4, elapsedRealtime, z));
    }

    public final void U(dy7 dy7Var, boolean z, long j) {
        boolean z2;
        gu7 gu7Var = (gu7) this.x;
        io7 io7Var = gu7Var.K;
        gu7.i(io7Var);
        gu7Var.H.getClass();
        io7Var.O(SystemClock.elapsedRealtime());
        if (dy7Var != null && dy7Var.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        r08 r08Var = gu7Var.E;
        gu7.k(r08Var);
        if (r08Var.C.i(j, z2, z) && dy7Var != null) {
            dy7Var.d = false;
        }
    }

    public final dy7 V(to7 to7Var) {
        a34.x(to7Var);
        Integer valueOf = Integer.valueOf(to7Var.x);
        ConcurrentHashMap concurrentHashMap = this.C;
        dy7 dy7Var = (dy7) concurrentHashMap.get(valueOf);
        if (dy7Var == null) {
            String Q = Q(to7Var.y);
            i28 i28Var = ((gu7) this.x).F;
            gu7.j(i28Var);
            dy7 dy7Var2 = new dy7(i28Var.J0(), null, Q);
            concurrentHashMap.put(valueOf, dy7Var2);
            dy7Var = dy7Var2;
        }
        if (this.F != null) {
            return this.F;
        }
        return dy7Var;
    }
}
