package msr.pistream.app.viewmodel;

import android.util.Log;
import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import dagger.hilt.android.lifecycle.HiltViewModel;
import e8.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import x8.d;
import y7.c;
import y7.i;
import y7.t;

@HiltViewModel
/* loaded from: classes.dex */
public class HomeViewModel extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final i f7807b;

    /* renamed from: c, reason: collision with root package name */
    public final t f7808c;

    /* renamed from: d, reason: collision with root package name */
    public final c f7809d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7810e;

    /* renamed from: r, reason: collision with root package name */
    public final c0 f7822r;

    /* renamed from: s, reason: collision with root package name */
    public List f7823s;

    /* renamed from: t, reason: collision with root package name */
    public List f7824t;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f7806a = Executors.newCachedThreadPool();

    /* renamed from: f, reason: collision with root package name */
    public final c0 f7811f = new c0();

    /* renamed from: g, reason: collision with root package name */
    public final c0 f7812g = new c0();

    /* renamed from: h, reason: collision with root package name */
    public final c0 f7813h = new c0();

    /* renamed from: i, reason: collision with root package name */
    public final c0 f7814i = new c0();

    /* renamed from: j, reason: collision with root package name */
    public final c0 f7815j = new c0();

    /* renamed from: k, reason: collision with root package name */
    public final c0 f7816k = new c0();

    /* renamed from: l, reason: collision with root package name */
    public final c0 f7817l = new c0();

    /* renamed from: m, reason: collision with root package name */
    public final c0 f7818m = new c0();

    /* renamed from: n, reason: collision with root package name */
    public final c0 f7819n = new c0();
    public final c0 o = new c0();

    /* renamed from: p, reason: collision with root package name */
    public final c0 f7820p = new c0();

    /* renamed from: q, reason: collision with root package name */
    public final c0 f7821q = new c0();

    public HomeViewModel(i iVar, t tVar, c cVar, a aVar) {
        new c0();
        this.f7822r = new c0();
        this.f7823s = Collections.emptyList();
        this.f7824t = Collections.emptyList();
        this.f7807b = iVar;
        this.f7808c = tVar;
        this.f7809d = cVar;
        this.f7810e = aVar;
    }

    public final c0 b(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2146974588:
                if (str.equals("fanFavorites")) {
                    c6 = 0;
                    break;
                }
                break;
            case -2008465223:
                if (str.equals("special")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1109880953:
                if (str.equals("latest")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1068259517:
                if (str.equals("movies")) {
                    c6 = 3;
                    break;
                }
                break;
            case -906335517:
                if (str.equals("season")) {
                    c6 = 4;
                    break;
                }
                break;
            case -393940263:
                if (str.equals("popular")) {
                    c6 = 5;
                    break;
                }
                break;
            case 110178:
                if (str.equals("ona")) {
                    c6 = 6;
                    break;
                }
                break;
            case 110426:
                if (str.equals("ova")) {
                    c6 = 7;
                    break;
                }
                break;
            case 104263205:
                if (str.equals("music")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 110545591:
                if (str.equals("topTv")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1306691868:
                if (str.equals("upcoming")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1394955557:
                if (str.equals("trending")) {
                    c6 = 11;
                    break;
                }
                break;
        }
        c0 c0Var = this.f7811f;
        switch (c6) {
            case 0:
                return this.f7815j;
            case 1:
                return this.o;
            case 2:
                return this.f7821q;
            case 3:
                return this.f7816k;
            case 4:
                return this.f7813h;
            case 5:
                return this.f7812g;
            case 6:
                return this.f7818m;
            case zzaja.zze.zzg /* 7 */:
                return this.f7819n;
            case '\b':
                return this.f7820p;
            case '\t':
                return this.f7817l;
            case '\n':
                return this.f7814i;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            default:
                return c0Var;
        }
    }

    public final void c() {
        boolean isEmpty = this.f7823s.isEmpty();
        c0 c0Var = this.f7822r;
        if (!isEmpty) {
            c0Var.h(b8.a.d(new ArrayList(this.f7823s)));
        } else {
            c0Var.h(b8.a.c());
        }
        this.f7806a.execute(new d(this, 0));
    }

    public final List d() {
        try {
            i iVar = this.f7807b;
            iVar.getClass();
            try {
                a aVar = iVar.f11641a;
                aVar.getClass();
                try {
                    return aVar.f3594a.k(0, 2, "9167640870324258216");
                } catch (Exception e10) {
                    Log.e("AnimeRepository", "popular failed", e10);
                    return Collections.emptyList();
                }
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        } catch (Exception e11) {
            Log.e("HomeVM", "popular", e11);
            return Collections.emptyList();
        }
    }

    public final List e() {
        try {
            t tVar = this.f7808c;
            tVar.getClass();
            try {
                a aVar = tVar.f11644a;
                aVar.getClass();
                try {
                    aVar.f3594a.getClass();
                    return Collections.emptyList();
                } catch (Exception e10) {
                    Log.e("AnimeRepository", "upcoming failed", e10);
                    return Collections.emptyList();
                }
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        } catch (Exception e11) {
            Log.e("HomeVM", "upcoming", e11);
            return Collections.emptyList();
        }
    }
}
