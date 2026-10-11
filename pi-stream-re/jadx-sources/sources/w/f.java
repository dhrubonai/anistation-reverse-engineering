package w;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.ImageView;
import android.widget.ScrollView;
import c1.f1;
import c1.k1;
import c1.n0;
import c1.p1;
import c1.x0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import f.p0;
import f1.b0;
import g0.k2;
import g0.y0;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import m8.d0;
import r6.h0;
import r6.l0;
import r6.m0;
import r6.m1;
import r6.n1;
import r6.o0;
import s1.z;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements f1.l, f1.c, s1.y, y1.m, d2.f, h0.d, Continuation, g0.y, i8.c, i8.i, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10698b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f10697a = i10;
        this.f10698b = obj;
    }

    @Override // y1.m
    public final n1 a(int i10, f1 f1Var, int[] iArr) {
        y1.j jVar = (y1.j) this.f10698b;
        m1 m1Var = y1.p.f11515j;
        m0 m0Var = o0.f9505b;
        h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < f1Var.f1690a) {
            y1.g gVar = new y1.g(i10, f1Var, i11, jVar, iArr[i11]);
            int i13 = i12 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i13));
            }
            objArr[i12] = gVar;
            i11++;
            i12 = i13;
        }
        return o0.h(i12, objArr);
    }

    @Override // f1.c
    public final void accept(Object obj) {
        int i10 = this.f10697a;
        Object obj2 = this.f10698b;
        switch (i10) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((o1.n) obj).e((Exception) ((Throwable) obj2));
                return;
            case 17:
                y2.h hVar = (y2.h) obj2;
                y2.a aVar = (y2.a) obj;
                hVar.getClass();
                long j4 = aVar.f11541b;
                hVar.f11551b.getClass();
                y2.g gVar = new y2.g(j4, w1.o.s(aVar.f11542c, aVar.f11540a));
                hVar.f11553d.add(gVar);
                long j10 = hVar.f11560k;
                if (j10 == -9223372036854775807L || aVar.f11541b >= j10) {
                    hVar.b(gVar);
                    return;
                }
                return;
            default:
                ((l0) obj2).x0((y2.a) obj);
                return;
        }
    }

    @Override // i8.i
    public final void b(a8.e eVar) {
        h8.j jVar = ((h8.y) this.f10698b).f5144a;
        if (jVar != null) {
            jVar.f5044b.b(eVar);
        }
    }

    @Override // s1.y
    public final int c(Object obj) {
        boolean z9;
        c1.v vVar = (c1.v) this.f10698b;
        s1.n nVar = (s1.n) obj;
        Pattern pattern = z.f9849a;
        nVar.getClass();
        String str = vVar.f1935m;
        String str2 = nVar.f9802b;
        if (!str2.equals(str) && !str2.equals(z.b(vVar))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 || !nVar.c(vVar, false)) {
            return 0;
        }
        return 1;
    }

    @Override // m8.d0
    public final ImageView d(int i10, int i11, int i12, int i13) {
        return ((l8.z) this.f10698b).b(i10, i11, i12, i13);
    }

    @Override // i8.c
    public final void e(a8.b bVar) {
        h8.j jVar = ((h8.q) this.f10698b).f5080a;
        if (jVar != null) {
            jVar.f5044b.e(bVar);
        }
    }

    @Override // d2.f
    public final long f(long j4) {
        return b0.i((j4 * r0.f3199e) / 1000000, 0L, ((d2.v) this.f10698b).f3204j - 1);
    }

    public final boolean g(p0 p0Var, int i10, Bundle bundle) {
        g0.e fVar;
        View view = (View) this.f10698b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((j0.f) p0Var.f3762b).h();
                InputContentInfo a10 = j0.a.a(((j0.f) p0Var.f3762b).c());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", a10);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        }
        ClipData clipData = new ClipData(((j0.f) p0Var.f3762b).a(), new ClipData.Item(((j0.f) p0Var.f3762b).g()));
        if (i11 >= 31) {
            fVar = new g0.d(clipData, 2);
        } else {
            fVar = new g0.f(clipData, 2);
        }
        fVar.b(((j0.f) p0Var.f3762b).i());
        fVar.a(bundle);
        if (y0.h(view, fVar.build()) == null) {
            return true;
        }
        return false;
    }

    public final void h(Display display) {
        b2.y yVar = (b2.y) this.f10698b;
        yVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            yVar.f1414k = refreshRate;
            yVar.f1415l = (refreshRate * 80) / 100;
        } else {
            f1.o.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            yVar.f1414k = -9223372036854775807L;
            yVar.f1415l = -9223372036854775807L;
        }
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        int i10 = this.f10697a;
        Object obj2 = this.f10698b;
        switch (i10) {
            case 2:
                int i11 = j1.d0.f5664i0;
                ((x0) obj).M((n0) obj2);
                return;
            case 3:
                int i12 = j1.d0.f5664i0;
                ((x0) obj).H((k1) obj2);
                return;
            case 4:
                ((x0) obj).s((List) obj2);
                return;
            case 5:
                ((x0) obj).M(((j1.z) obj2).f5932a.M);
                return;
            case 6:
                ((x0) obj).r((c1.p0) obj2);
                return;
            case zzaja.zze.zzg /* 7 */:
                ((x0) obj).o((e1.c) obj2);
                return;
            case 8:
                ((x0) obj).b((c1.n) obj2);
                return;
            default:
                ((x0) obj).J((p1) obj2);
                return;
        }
    }

    @Override // g0.y
    public final k2 o(View view, k2 k2Var) {
        ScrollView scrollView = (ScrollView) this.f10698b;
        int i10 = f8.e.J0;
        scrollView.setPadding(0, k2Var.e(), 0, 0);
        return k2Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (AuthResult) ((Task) this.f10698b).getResult();
    }
}
