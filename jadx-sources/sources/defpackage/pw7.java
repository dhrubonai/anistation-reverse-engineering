package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pw7 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public pw7(qx7 qx7Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.B = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = z;
        Objects.requireNonNull(qx7Var);
        this.C = qx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147 A[Catch: RuntimeException -> 0x00dc, TryCatch #1 {RuntimeException -> 0x00dc, blocks: (B:23:0x006c, B:30:0x00fc, B:32:0x0107, B:35:0x0114, B:37:0x011a, B:38:0x0134, B:39:0x0141, B:41:0x0147, B:44:0x015e, B:45:0x016d, B:47:0x0165, B:48:0x0180, B:50:0x0186, B:52:0x018c, B:54:0x0192, B:56:0x019a, B:58:0x01a2, B:60:0x01aa, B:62:0x01b0, B:65:0x01c2, B:71:0x008d, B:73:0x0093, B:75:0x009b, B:77:0x00a1, B:79:0x00a7, B:81:0x00ad, B:83:0x00b5, B:85:0x00bd, B:87:0x00c5, B:89:0x00cd, B:90:0x00df, B:92:0x00ed), top: B:22:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw7.run():void");
    }

    public pw7(rp7 rp7Var, boolean z, Uri uri, String str, String str2) {
        this.A = z;
        this.B = uri;
        this.y = str;
        this.z = str2;
        this.C = rp7Var;
    }

    public pw7(AppMeasurementDynamiteService appMeasurementDynamiteService, bo7 bo7Var, String str, String str2, boolean z) {
        this.B = bo7Var;
        this.y = str;
        this.z = str2;
        this.A = z;
        this.C = appMeasurementDynamiteService;
    }

    public pw7(zz7 zz7Var, b48 b48Var, boolean z, im7 im7Var, Bundle bundle) {
        this.B = b48Var;
        this.A = z;
        this.y = im7Var;
        this.z = bundle;
        Objects.requireNonNull(zz7Var);
        this.C = zz7Var;
    }
}
