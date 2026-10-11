package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class js7 implements Runnable {
    public final String A;
    public final Map B;
    public final Object C;
    public final /* synthetic */ qt0 D;
    public final /* synthetic */ byte x = 0;
    public final URL y;
    public final byte[] z;

    public js7(ls7 ls7Var, String str, URL url, byte[] bArr, Map map, hs7 hs7Var) {
        Objects.requireNonNull(ls7Var);
        this.D = ls7Var;
        a34.u(str);
        a34.x(url);
        this.y = url;
        this.z = bArr;
        this.C = hs7Var;
        this.A = str;
        this.B = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        au7 au7Var = ((gu7) ((xx7) this.D).x).D;
        gu7.l(au7Var);
        au7Var.U(new vx7(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js7.run():void");
    }

    public js7(xx7 xx7Var, String str, URL url, byte[] bArr, HashMap hashMap, ux7 ux7Var) {
        Objects.requireNonNull(xx7Var);
        this.D = xx7Var;
        a34.u(str);
        this.y = url;
        this.z = bArr;
        this.C = ux7Var;
        this.A = str;
        this.B = hashMap;
    }
}
