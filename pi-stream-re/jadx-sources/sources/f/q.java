package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f3763a = new n0(new o0(0));

    /* renamed from: b, reason: collision with root package name */
    public static final int f3764b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static c0.i f3765c = null;

    /* renamed from: d, reason: collision with root package name */
    public static c0.i f3766d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f3767e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3768f = false;

    /* renamed from: x, reason: collision with root package name */
    public static final n.f f3769x = new n.f(0);

    /* renamed from: y, reason: collision with root package name */
    public static final Object f3770y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final Object f3771z = new Object();

    public static boolean d(Context context) {
        int i10;
        if (f3767e == null) {
            try {
                int i11 = l0.f3751a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i10 = k0.a() | 128;
                } else {
                    i10 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) l0.class), i10).metaData;
                if (bundle != null) {
                    f3767e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f3767e = Boolean.FALSE;
            }
        }
        return f3767e.booleanValue();
    }

    public static void g(q qVar) {
        synchronized (f3770y) {
            n.f fVar = f3769x;
            fVar.getClass();
            n.a aVar = new n.a(fVar);
            while (aVar.hasNext()) {
                q qVar2 = (q) ((WeakReference) aVar.next()).get();
                if (qVar2 == qVar || qVar2 == null) {
                    aVar.remove();
                }
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b();

    public abstract void c();

    public abstract void e(Bundle bundle);

    public abstract void f();

    public abstract boolean h(int i10);

    public abstract void i(int i10);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
