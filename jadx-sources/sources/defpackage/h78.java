package defpackage;

import java.io.Closeable;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h78 implements Closeable {
    public final String A;
    public Thread B;
    public final h78 x = null;
    public final UUID y;
    public final String z;

    public h78(String str, UUID uuid, String str2, q88 q88Var) {
        this.A = str;
        this.y = uuid;
        this.z = str2;
        q88Var.getClass();
        this.B = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q88 c = q78.c();
        h78 h78Var = c.b;
        String str = this.A;
        if (h78Var != null) {
            if (this == h78Var) {
                q78.b(c, h78Var.x);
                this.B = null;
                return;
            }
            String str2 = h78Var.A;
            StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
            qx1.x(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
            sb.append(".");
            throw new wm0(sb.toString(), (byte) 8);
        }
        throw new wm0(qx1.q(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), (byte) 7);
    }

    public m88 l() {
        return k88.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b1, code lost:
    
        r9 = r9.d;
        r15 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bb, code lost:
    
        if (r9.containsKey(r15) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        ((defpackage.o88) r1.g).d.put(r15, new defpackage.o88(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cb, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cd, code lost:
    
        r14.c = (defpackage.o88) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r14 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        r14.c = (defpackage.o88) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        r1.b = r7;
        r1.c++;
        r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        if (r1.f(r13, r14, r15, (r15 + r14) - r13) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h78.toString():java.lang.String");
    }
}
