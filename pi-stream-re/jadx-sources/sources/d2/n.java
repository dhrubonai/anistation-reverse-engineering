package d2;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.Map;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class n implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3184c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};

    /* renamed from: d, reason: collision with root package name */
    public static final f.c f3185d = new f.c(new j1.l(15));

    /* renamed from: e, reason: collision with root package name */
    public static final f.c f3186e = new f.c(new j1.l(16));

    /* renamed from: a, reason: collision with root package name */
    public n1 f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.o f3188b = new w1.o(7);

    public final void a(int i10, ArrayList arrayList) {
        w1.o oVar = this.f3188b;
        switch (i10) {
            case 0:
                arrayList.add(new h3.a());
                return;
            case 1:
                arrayList.add(new h3.c());
                return;
            case 2:
                arrayList.add(new h3.f(0));
                return;
            case 3:
                arrayList.add(new e2.a());
                return;
            case 4:
                p n9 = f3185d.n(0);
                if (n9 != null) {
                    arrayList.add(n9);
                    return;
                } else {
                    arrayList.add(new h2.b());
                    return;
                }
            case 5:
                arrayList.add(new i2.b());
                return;
            case 6:
                arrayList.add(new u2.d(2, oVar));
                return;
            case zzaja.zze.zzg /* 7 */:
                arrayList.add(new v2.d(0));
                return;
            case 8:
                arrayList.add(new w2.k(oVar));
                arrayList.add(new w2.m(16, oVar));
                return;
            case 9:
                arrayList.add(new x2.e());
                return;
            case 10:
                arrayList.add(new h3.b0());
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (this.f3187a == null) {
                    m0 m0Var = o0.f9505b;
                    this.f3187a = n1.f9497e;
                }
                arrayList.add(new h3.g0(1, 1, oVar, new f1.y(0L), new h3.h(0, this.f3187a)));
                return;
            case 12:
                arrayList.add(new i3.d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new g2.a(0));
                return;
            case 15:
                p n10 = f3186e.n(new Object[0]);
                if (n10 != null) {
                    arrayList.add(n10);
                    return;
                }
                return;
            case 16:
                arrayList.add(new f2.b(oVar));
                return;
            case 17:
                arrayList.add(new g2.a(1, 0));
                return;
            case 18:
                arrayList.add(new j2.a(1));
                return;
            case 19:
                arrayList.add(new g2.a(0, 0));
                return;
            case 20:
                arrayList.add(new j2.a(0));
                return;
        }
    }

    @Override // d2.s
    public final synchronized p[] d(Uri uri, Map map) {
        p[] pVarArr;
        int[] iArr = f3184c;
        ArrayList arrayList = new ArrayList(20);
        int F = j5.a.F(map);
        if (F != -1) {
            a(F, arrayList);
        }
        int G = j5.a.G(uri);
        if (G != -1 && G != F) {
            a(G, arrayList);
        }
        for (int i10 = 0; i10 < 20; i10++) {
            int i11 = iArr[i10];
            if (i11 != F && i11 != G) {
                a(i11, arrayList);
            }
        }
        pVarArr = new p[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            pVarArr[i12] = (p) arrayList.get(i12);
        }
        return pVarArr;
    }
}
