package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ih0 implements qo {
    public final CastDevice b;
    public final m25 c;
    public final Bundle d;
    public final String e = UUID.randomUUID().toString();

    public /* synthetic */ ih0(st3 st3Var) {
        this.b = (CastDevice) st3Var.x;
        this.c = (m25) st3Var.y;
        this.d = (Bundle) st3Var.z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r3 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ih0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ih0 r8 = (defpackage.ih0) r8
            com.google.android.gms.cast.CastDevice r1 = r7.b
            com.google.android.gms.cast.CastDevice r3 = r8.b
            boolean r1 = defpackage.bx7.q(r1, r3)
            if (r1 == 0) goto L65
            android.os.Bundle r1 = r8.d
            android.os.Bundle r3 = r7.d
            if (r3 == 0) goto L58
            if (r1 != 0) goto L1f
            goto L58
        L1f:
            int r4 = r3.size()
            int r5 = r1.size()
            if (r4 == r5) goto L2a
            goto L65
        L2a:
            java.util.Set r4 = r3.keySet()
            java.util.Set r5 = r1.keySet()
            boolean r5 = r4.containsAll(r5)
            if (r5 != 0) goto L39
            goto L65
        L39:
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.get(r5)
            java.lang.Object r5 = r1.get(r5)
            boolean r5 = defpackage.bx7.q(r6, r5)
            if (r5 != 0) goto L3d
            goto L65
        L58:
            if (r3 != r1) goto L65
        L5a:
            java.lang.String r7 = r7.e
            java.lang.String r8 = r8.e
            boolean r7 = defpackage.bx7.q(r7, r8)
            if (r7 == 0) goto L65
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, 0, this.e});
    }
}
