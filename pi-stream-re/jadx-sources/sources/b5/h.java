package b5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import b4.c0;
import b4.u;
import b4.x;
import b4.y;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h implements q0.k, y, b4.k {

    /* renamed from: c, reason: collision with root package name */
    public static h f1525c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1526a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1527b;

    public /* synthetic */ h(Context context, int i10, int i11) {
        this.f1526a = i10;
        this.f1527b = context;
    }

    public static h b(Context context) {
        w7.b.s(context);
        synchronized (h.class) {
            if (f1525c == null) {
                p.a(context);
                f1525c = new h(context, 0);
            }
        }
        return f1525c;
    }

    public static void d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e10) {
                e(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                e(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                e(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                e(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static final l f(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        m mVar = new m(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            if (lVarArr[i10].equals(mVar)) {
                return lVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean g(PackageInfo packageInfo, boolean z9) {
        l f10;
        if (z9 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z9) {
                f10 = f(packageInfo, o.f1535a);
            } else {
                f10 = f(packageInfo, o.f1535a[0]);
            }
            if (f10 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // q0.k
    public final void a(com.bumptech.glide.d dVar) {
        int i10 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new q0.a("EmojiCompatInitializer", i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new q0.o(this, dVar, threadPoolExecutor, i10));
    }

    public final PackageInfo c(int i10, String str) {
        return this.f1527b.getPackageManager().getPackageInfo(str, i10);
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        int i10 = this.f1526a;
        Context context = this.f1527b;
        switch (i10) {
            case 3:
                return new b4.l(context, this);
            case 4:
                return new b4.l(context, this);
            case 5:
                return new b4.l(context, this);
            case 6:
                return new u(context, 0);
            case zzaja.zze.zzg /* 7 */:
                return new b4.l(context, c0Var.b(Integer.class, AssetFileDescriptor.class));
            case 8:
                return new b4.l(context, c0Var.b(Integer.class, InputStream.class));
            case 9:
                return new u(context, 1);
            default:
                return new u(context, 2);
        }
    }

    public h(Context context, int i10) {
        this.f1526a = i10;
        if (i10 != 2) {
            this.f1527b = context.getApplicationContext();
        } else {
            this.f1527b = context.getApplicationContext();
        }
    }
}
