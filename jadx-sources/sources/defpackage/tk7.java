package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tk7 implements Iterable, ik7 {
    public final String x;

    public tk7(String str) {
        if (str != null) {
            this.x = str;
        } else {
            ze0.k("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        return Boolean.valueOf(!this.x.isEmpty());
    }

    @Override // defpackage.ik7
    public final String d() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk7)) {
            return false;
        }
        return this.x.equals(((tk7) obj).x);
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return new ok7(this, (byte) 0);
    }

    @Override // defpackage.ik7
    public final Double h() {
        String str = this.x;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ik7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ik7 i(java.lang.String r29, defpackage.vs7 r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk7.i(java.lang.String, vs7, java.util.ArrayList):ik7");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ok7(this, (byte) 1);
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        return new tk7(this.x);
    }

    public final String toString() {
        String str = this.x;
        return qx1.q(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
