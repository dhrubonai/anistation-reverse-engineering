package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wi6 {
    public final j12 a;
    public final hr5 b;
    public final ij0 c;
    public final ya5 d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ wi6(defpackage.j12 r3, defpackage.hr5 r4, defpackage.ij0 r5, defpackage.ya5 r6, java.util.LinkedHashMap r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r8 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r8 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r8 & 32
            if (r0 == 0) goto L1b
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            r8 = r8 & 64
            if (r8 == 0) goto L22
            ot1 r7 = defpackage.ot1.x
        L22:
            r8 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi6.<init>(j12, hr5, ij0, ya5, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi6)) {
            return false;
        }
        wi6 wi6Var = (wi6) obj;
        if (a34.i(this.a, wi6Var.a) && a34.i(this.b, wi6Var.b) && a34.i(this.c, wi6Var.c) && a34.i(this.d, wi6Var.d) && this.e == wi6Var.e && a34.i(this.f, wi6Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        j12 j12Var = this.a;
        if (j12Var == null) {
            hashCode = 0;
        } else {
            hashCode = j12Var.hashCode();
        }
        int i2 = hashCode * 31;
        hr5 hr5Var = this.b;
        if (hr5Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hr5Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ij0 ij0Var = this.c;
        if (ij0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ij0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ya5 ya5Var = this.d;
        if (ya5Var != null) {
            i = ya5Var.hashCode();
        }
        return this.f.hashCode() + zo5.g((i4 + i) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public wi6(j12 j12Var, hr5 hr5Var, ij0 ij0Var, ya5 ya5Var, boolean z, Map map) {
        this.a = j12Var;
        this.b = hr5Var;
        this.c = ij0Var;
        this.d = ya5Var;
        this.e = z;
        this.f = map;
    }
}
