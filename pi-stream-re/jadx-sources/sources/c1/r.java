package c1;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1885a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1886b;

    public r() {
        this.f1886b = f1.a.f3794a;
    }

    public final void a(int i10) {
        w7.b.u(!this.f1885a);
        ((SparseBooleanArray) this.f1886b).append(i10, true);
    }

    public final s b() {
        w7.b.u(!this.f1885a);
        this.f1885a = true;
        return new s((SparseBooleanArray) this.f1886b);
    }

    public final synchronized void c() {
        this.f1885a = false;
    }

    public final w1.e d(int i10, v vVar, boolean z9, ArrayList arrayList, d2.g0 g0Var) {
        boolean z10;
        d2.p kVar;
        String str = vVar.f1934l;
        if (q0.m(str)) {
            if (!this.f1885a) {
                return null;
            }
            kVar = new y2.h(((w1.o) ((y2.k) this.f1886b)).r(vVar), vVar);
        } else {
            int i11 = 0;
            int i12 = 1;
            if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (!this.f1885a) {
                    i12 = 3;
                }
                kVar = new u2.d(i12, (y2.k) this.f1886b);
            } else if (Objects.equals(str, "image/jpeg")) {
                kVar = new g2.a(1);
            } else if (Objects.equals(str, "image/png")) {
                kVar = new g2.a(1, 0);
            } else {
                if (z9) {
                    i11 = 4;
                }
                if (!this.f1885a) {
                    i11 |= 32;
                }
                kVar = new w2.k((y2.k) this.f1886b, i11, null, arrayList, g0Var);
            }
        }
        if (this.f1885a && !q0.m(str) && !(kVar.c() instanceof w2.k) && !(kVar.c() instanceof u2.d)) {
            kVar = new y2.m(kVar, (y2.k) this.f1886b);
        }
        return new w1.e(kVar, i10, vVar);
    }

    public final synchronized boolean e() {
        if (this.f1885a) {
            return false;
        }
        this.f1885a = true;
        notifyAll();
        return true;
    }

    public final synchronized void f(x3.e0 e0Var, boolean z9) {
        if (!this.f1885a && !z9) {
            this.f1885a = true;
            e0Var.e();
            this.f1885a = false;
        }
        ((Handler) this.f1886b).obtainMessage(1, e0Var).sendToTarget();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i10) {
        this();
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            this.f1886b = new w1.o(7);
            return;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                this.f1886b = new Handler(Looper.getMainLooper(), new x3.h0(0));
            } else if (i10 != 5) {
                this.f1886b = new SparseBooleanArray();
            } else {
                this.f1885a = false;
            }
        }
    }

    public r(BottomSheetBehavior bottomSheetBehavior, boolean z9) {
        this.f1886b = bottomSheetBehavior;
        this.f1885a = z9;
    }
}
