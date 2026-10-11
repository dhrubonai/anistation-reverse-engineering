package k3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c1.h1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.concurrent.futures.l f6461a = new androidx.concurrent.futures.l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6462b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static h1 f6463c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return j.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static h1 b(int i10, boolean z9, boolean z10) {
        h1 h1Var = new h1(i10, z9, z10);
        f6463c = h1Var;
        f6461a.set(h1Var);
        return f6463c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.l.c(android.content.Context, boolean):void");
    }
}
