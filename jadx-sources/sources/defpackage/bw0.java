package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw0 {
    public static final bw0 e;
    public static final cn7 f;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;

    static {
        bw0 bw0Var = new bw0(14);
        bw0 bw0Var2 = new bw0(13);
        e = bw0Var2;
        f = tl7.j(te4.I(new ai4("close", bw0Var), new ai4("keep-alive", bw0Var2), new ai4("upgrade", new bw0(11))), new hi0((byte) 26), new st0((byte) 2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ bw0(int r5) {
        /*
            r4 = this;
            r0 = r5 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r3 = r5 & 2
            if (r3 == 0) goto Lf
            r3 = r2
            goto L10
        Lf:
            r3 = r1
        L10:
            r5 = r5 & 4
            if (r5 == 0) goto L15
            r1 = r2
        L15:
            nt1 r5 = defpackage.nt1.x
            r4.<init>(r0, r3, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw0.<init>(int):void");
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        List list = this.d;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.a) {
            arrayList.add("close");
        }
        if (this.b) {
            arrayList.add("keep-alive");
        }
        if (this.c) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        yo0.p0(arrayList, sb, null, null, 126);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw0.class != obj.getClass()) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        if (this.a == bw0Var.a && this.b == bw0Var.b && this.c == bw0Var.c && a34.i(this.d, bw0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.g(zo5.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        if (this.d.isEmpty()) {
            boolean z = this.c;
            boolean z2 = this.b;
            boolean z3 = this.a;
            if (z3 && !z2 && !z) {
                return "close";
            }
            if (!z3 && z2 && !z) {
                return "keep-alive";
            }
            if (!z3 && z2 && z) {
                return "keep-alive, Upgrade";
            }
            return a();
        }
        return a();
    }

    public bw0(boolean z, boolean z2, boolean z3, List list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }
}
