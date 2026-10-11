package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh2 implements zh1 {
    public static yh2 z;
    public Object x;
    public volatile Object y;

    /* JADX WARN: Type inference failed for: r1v4, types: [yh2, java.lang.Object] */
    public static yh2 a(Context context) {
        yh2 yh2Var;
        a34.x(context);
        synchronized (yh2.class) {
            yh2 yh2Var2 = z;
            yh2Var = yh2Var2;
            if (yh2Var2 == null) {
                mo7 mo7Var = n08.a;
                synchronized (n08.class) {
                    if (n08.e == null) {
                        n08.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                ?? obj = new Object();
                obj.x = context.getApplicationContext();
                z = obj;
                yh2Var = obj;
            }
        }
        return yh2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[Catch: IllegalArgumentException -> 0x00cf, TryCatch #0 {IllegalArgumentException -> 0x00cf, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x004f, B:34:0x0078, B:35:0x0074, B:37:0x0061, B:39:0x0067, B:43:0x007e, B:44:0x0085, B:48:0x0088, B:49:0x0095, B:51:0x009b, B:53:0x00a6, B:54:0x00b0, B:56:0x00b8, B:65:0x00c7, B:66:0x00ce, B:67:0x008b, B:68:0x0091, B:69:0x002e), top: B:15:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7 A[Catch: IllegalArgumentException -> 0x00cf, TryCatch #0 {IllegalArgumentException -> 0x00cf, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x004f, B:34:0x0078, B:35:0x0074, B:37:0x0061, B:39:0x0067, B:43:0x007e, B:44:0x0085, B:48:0x0088, B:49:0x0095, B:51:0x009b, B:53:0x00a6, B:54:0x00b0, B:56:0x00b8, B:65:0x00c7, B:66:0x00ce, B:67:0x008b, B:68:0x0091, B:69:0x002e), top: B:15:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh2.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static iv7 f(PackageInfo packageInfo, iv7... iv7VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            nw7 nw7Var = new nw7(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < iv7VarArr.length; i++) {
                if (iv7VarArr[i].equals(nw7Var)) {
                    return iv7VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh2.b(int):boolean");
    }

    @Override // defpackage.zh1
    public nc1 c() {
        return (oc1) this.y;
    }

    public a28 d(final sx7 sx7Var) {
        boolean z2;
        final d18 d18Var = (d18) this.y;
        d18 d18Var2 = a28.i;
        if (d18Var != d18Var2) {
            qb7 qb7Var = a28.h;
            qb7Var.getClass();
            final qx2 qx2Var = new qx2((byte) 6);
            byte b = 0;
            qx2Var.y = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) qb7Var.y;
            Context context = sx7Var.b;
            String str = d18Var.d;
            if (str == null) {
                str = (String) d18Var.a.apply(context);
                d18Var.d = str;
            }
            f18 f18Var = (f18) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: w18
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    f18 f18Var2 = new f18(new a28(sx7.this, d18Var));
                    qx2Var.y = true;
                    return f18Var2;
                }
            });
            if (qx2Var.y) {
                Context context2 = sx7Var.b;
                uw7 uw7Var = new uw7(qb7Var);
                if (f38.b == null) {
                    synchronized (f38.class) {
                        try {
                            if (f38.b == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        context2.registerReceiver(new f38(b), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new f38(b), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                f38.b = uw7Var;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.x = f18Var.a;
            this.y = d18Var2;
        }
        return (a28) this.x;
    }
}
