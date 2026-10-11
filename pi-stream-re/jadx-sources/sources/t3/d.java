package t3;

import android.util.Log;
import androidx.appcompat.widget.a0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import o1.d0;
import v3.i;
import v3.l;
import x3.k;

/* loaded from: classes.dex */
public final class d implements z3.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10005a;

    /* renamed from: b, reason: collision with root package name */
    public e f10006b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10007c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f10008d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10009e;

    public d(File file, long j4) {
        this.f10009e = new a0(29);
        this.f10008d = file;
        this.f10005a = j4;
        this.f10007c = new z3.e(1);
    }

    public final synchronized e a() {
        if (this.f10006b == null) {
            this.f10006b = e.G((File) this.f10008d, this.f10005a);
        }
        return this.f10006b;
    }

    @Override // z3.a
    public final void h(i iVar, k kVar) {
        z3.b bVar;
        boolean z9;
        String w9 = ((z3.e) this.f10007c).w(iVar);
        a0 a0Var = (a0) this.f10009e;
        synchronized (a0Var) {
            bVar = (z3.b) ((Map) a0Var.f403b).get(w9);
            if (bVar == null) {
                bVar = ((z3.c) a0Var.f404c).a();
                ((Map) a0Var.f403b).put(w9, bVar);
            }
            bVar.f12039b++;
        }
        bVar.f12038a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + w9 + " for for Key: " + iVar);
            }
            try {
                e a10 = a();
                if (a10.v(w9) == null) {
                    d0 r8 = a10.r(w9);
                    if (r8 != null) {
                        try {
                            if (((v3.c) kVar.f11216a).p(kVar.f11217b, r8.j(), (l) kVar.f11218c)) {
                                e.a((e) r8.f8140d, r8, true);
                                r8.f8137a = true;
                            }
                            if (!z9) {
                                try {
                                    r8.c();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!r8.f8137a) {
                                try {
                                    r8.c();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(w9));
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            ((a0) this.f10009e).V(w9);
        }
    }

    @Override // z3.a
    public final File n(i iVar) {
        String w9 = ((z3.e) this.f10007c).w(iVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + w9 + " for for Key: " + iVar);
        }
        try {
            d v9 = a().v(w9);
            if (v9 == null) {
                return null;
            }
            return ((File[]) v9.f10009e)[0];
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, String str, long j4, File[] fileArr, long[] jArr) {
        this.f10006b = eVar;
        this.f10007c = str;
        this.f10005a = j4;
        this.f10009e = fileArr;
        this.f10008d = jArr;
    }
}
