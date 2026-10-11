package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w47 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public w47(qx7 qx7Var, AtomicReference atomicReference, String str, String str2) {
        this.x = (byte) 4;
        this.y = atomicReference;
        this.z = str;
        this.A = str2;
        Objects.requireNonNull(qx7Var);
        this.B = qx7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:127|128|(5:130|(1:132)|134|135|136)|138|(2:141|139)|142|143|144|145|(2:148|146)|149|150|(1:152)|153|135|136) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0438, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r4 + r9)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0508, code lost:
    
        r1.c().F.b(r2, "Failed to parse queued batch. appId");
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w47.run():void");
    }

    public /* synthetic */ w47(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public /* synthetic */ w47(byte b, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.x = b;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj;
    }
}
