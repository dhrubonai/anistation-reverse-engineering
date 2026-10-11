package defpackage;

import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cj6 extends Thread {
    public final /* synthetic */ fl5 x;
    public final /* synthetic */ File y;
    public final /* synthetic */ File z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj6(fl5 fl5Var, File file, File file2) {
        super("TransmuxTranscodeHelper:CopyFile");
        this.x = fl5Var;
        this.y = file;
        this.z = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[Catch: IOException -> 0x0064, TRY_LEAVE, TryCatch #4 {IOException -> 0x0064, blocks: (B:42:0x005c, B:37:0x0061), top: B:41:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            fl5 r0 = r7.x
            java.lang.Object r0 = r0.x
            boolean r0 = r0 instanceof defpackage.x0
            if (r0 == 0) goto L9
            goto L59
        L9:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.io.File r2 = r7.y     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.File r3 = r7.z     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = defpackage.pd0.a     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
        L1e:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r5 = -1
            if (r4 != r5) goto L36
            fl5 r3 = r7.x     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r3.l(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r1.close()     // Catch: java.io.IOException -> L59
            r2.close()     // Catch: java.io.IOException -> L59
            return
        L31:
            r7 = move-exception
        L32:
            r0 = r1
            goto L5a
        L34:
            r0 = move-exception
            goto L4a
        L36:
            r5 = 0
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            goto L1e
        L3b:
            r7 = move-exception
            r2 = r0
            goto L32
        L3e:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L4a
        L43:
            r7 = move-exception
            r2 = r0
            goto L5a
        L46:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L4a:
            fl5 r7 = r7.x     // Catch: java.lang.Throwable -> L31
            r7.m(r0)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.io.IOException -> L59
        L54:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.io.IOException -> L59
        L59:
            return
        L5a:
            if (r0 == 0) goto L5f
            r0.close()     // Catch: java.io.IOException -> L64
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.io.IOException -> L64
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj6.run():void");
    }
}
