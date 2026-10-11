package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yd6 {
    public final boolean a;
    public final x03 b;
    public int c;
    public int d;

    public yd6(yd6 yd6Var, boolean z) {
        x03 x03Var;
        this.a = z;
        if (yd6Var != null) {
            x03 x03Var2 = yd6Var.b;
            x03Var2.b();
            x03Var = new x03(x03Var2);
        } else {
            x03Var = new x03(null);
        }
        this.b = x03Var;
        if (yd6Var != null) {
            this.c = yd6Var.c;
            this.d = yd6Var.d;
        } else {
            this.c = 0;
            this.d = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd6.a(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd6.b(int):void");
    }

    public final int c() {
        return this.d - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yd6) {
            yd6 yd6Var = (yd6) obj;
            if (this.c != yd6Var.c || this.d != yd6Var.d) {
                return false;
            }
            return this.b.equals(yd6Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }
}
