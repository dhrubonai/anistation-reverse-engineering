package androidx.work;

import defpackage.xk3;
import defpackage.yy2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements yy2 {
    public static final String a = xk3.f("WrkMgrInitializer");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r1 = r4.getApplicationContext();
        r2 = defpackage.l77.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r2 = defpackage.n77.E(r1, r0);
        defpackage.l77.l = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        defpackage.l77.k = r2;
     */
    @Override // defpackage.yy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(android.content.Context r4) {
        /*
            r3 = this;
            xk3 r3 = defpackage.xk3.d()
            java.lang.String r0 = androidx.work.WorkManagerInitializer.a
            java.lang.String r1 = "Initializing WorkManager with default configuration."
            r3.a(r0, r1)
            i18 r3 = new i18
            r0 = 11
            r3.<init>(r0)
            pv0 r0 = new pv0
            r0.<init>(r3)
            r4.getClass()
            java.lang.Object r3 = defpackage.l77.m
            monitor-enter(r3)
            l77 r1 = defpackage.l77.k     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            l77 r2 = defpackage.l77.l     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L26
            goto L30
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto L48
        L30:
            if (r1 != 0) goto L42
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            l77 r2 = defpackage.l77.l     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L40
            l77 r2 = defpackage.n77.E(r1, r0)     // Catch: java.lang.Throwable -> L2e
            defpackage.l77.l = r2     // Catch: java.lang.Throwable -> L2e
        L40:
            defpackage.l77.k = r2     // Catch: java.lang.Throwable -> L2e
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            l77 r3 = defpackage.l77.b(r4)
            return r3
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.create(android.content.Context):java.lang.Object");
    }

    @Override // defpackage.yy2
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
