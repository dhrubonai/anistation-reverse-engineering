package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p9 {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final cu3 b;
    public final Executor c;
    public final o9 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public p9(Context context, cu3 cu3Var) {
        this.a = context.getApplicationContext();
        this.b = cu3Var;
        Executor F = zz.F();
        this.c = F;
        this.d = new o9(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        F.execute(new n9(this, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.e
            boolean r2 = r1.get()
            java.lang.String r0 = "CarConnectionState"
            r3 = 0
            android.content.Context r4 = r11.a     // Catch: java.lang.Exception -> L4c
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Exception -> L4c
            android.net.Uri r6 = defpackage.p9.g     // Catch: java.lang.Exception -> L4c
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L4c
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L4c
            if (r4 != 0) goto L24
            if (r4 == 0) goto L4c
        L20:
            r4.close()     // Catch: java.lang.Exception -> L4c
            goto L4c
        L24:
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L41
            r5 = -1
            if (r0 != r5) goto L2c
            goto L20
        L2c:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L33
            goto L20
        L33:
            int r0 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = r3
        L3c:
            r4.close()     // Catch: java.lang.Exception -> L4c
            r3 = r0
            goto L4c
        L41:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Exception -> L4c
        L4b:
            throw r5     // Catch: java.lang.Exception -> L4c
        L4c:
            r1.set(r3)
            if (r2 == r3) goto L5e
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f
            boolean r0 = r0.get()
            if (r0 != 0) goto L5e
            cu3 r11 = r11.b
            r11.run()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9.a():void");
    }
}
