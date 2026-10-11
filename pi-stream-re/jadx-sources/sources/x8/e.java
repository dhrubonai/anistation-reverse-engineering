package x8;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y.m;

/* loaded from: classes.dex */
public final class e extends w0 {

    /* renamed from: g, reason: collision with root package name */
    public k8.f f11406g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11400a = Executors.newFixedThreadPool(2);

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11401b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final c0 f11402c = new c0(new ArrayList());

    /* renamed from: d, reason: collision with root package name */
    public final c0 f11403d = new c0(Boolean.FALSE);

    /* renamed from: e, reason: collision with root package name */
    public final c0 f11404e = new c0(Boolean.TRUE);

    /* renamed from: f, reason: collision with root package name */
    public final c0 f11405f = new c0(null);

    /* renamed from: h, reason: collision with root package name */
    public int f11407h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11408i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11409j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f11410k = new ArrayList();

    public static String b(a8.b bVar) {
        if (bVar == null) {
            return "";
        }
        String str = bVar.D;
        if (str != null && !str.trim().isEmpty()) {
            return bVar.D.trim();
        }
        String str2 = bVar.f169b;
        if (str2 != null && !str2.trim().isEmpty()) {
            return bVar.f169b.trim();
        }
        String str3 = bVar.f168a;
        if (str3 == null) {
            return "";
        }
        return str3.trim().toLowerCase(Locale.US);
    }

    public final void c() {
        if (!this.f11408i && !this.f11409j && this.f11406g != null) {
            this.f11408i = true;
            this.f11403d.h(Boolean.TRUE);
            this.f11400a.execute(new m(this, this.f11407h, 6));
        }
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        this.f11400a.shutdownNow();
    }
}
