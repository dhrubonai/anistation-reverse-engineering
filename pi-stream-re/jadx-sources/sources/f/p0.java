package f;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a4;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.p2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.f1;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import g0.a2;
import g0.b2;
import g0.i2;
import g0.k2;
import g0.y0;
import g0.z1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.z0;
import r6.n1;
import v1.w0;
import v1.x0;

/* loaded from: classes.dex */
public class p0 implements p2, j.b0, j.m, g1, g0.y, g0.g, w0, r1.c, s1.l, x1.a, x1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3761a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3762b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f3761a = i10;
        this.f3762b = obj;
    }

    public static Object C(Object[] objArr, int i10, f9.x xVar) {
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        int i13;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object obj = null;
        int i14 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int i15 = xVar.f4108a;
            switch (i15) {
                case 0:
                    i12 = ((d0.i) obj2).f3030c;
                    break;
                default:
                    i12 = ((y.g) obj2).f11428b;
                    break;
            }
            int abs = Math.abs(i12 - i11) * 2;
            switch (i15) {
                case 0:
                    z10 = ((d0.i) obj2).f3031d;
                    break;
                default:
                    z10 = ((y.g) obj2).f11429c;
                    break;
            }
            if (z10 == z9) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            int i16 = abs + i13;
            if (obj == null || i14 > i16) {
                obj = obj2;
                i14 = i16;
            }
        }
        return obj;
    }

    public Typeface A(Context context, InputStream inputStream) {
        File E = p7.a0.E(context);
        if (E == null) {
            return null;
        }
        try {
            if (!p7.a0.k(E, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(E.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            E.delete();
        }
    }

    public Typeface B(Context context, Resources resources, int i10, String str, int i11) {
        File E = p7.a0.E(context);
        if (E == null) {
            return null;
        }
        try {
            if (!p7.a0.j(E, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(E.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            E.delete();
        }
    }

    public d0.i D(int i10, d0.i[] iVarArr) {
        return (d0.i) C(iVarArr, i10, new f9.x(0));
    }

    public final int E(long j4) {
        for (int i10 = 0; i10 < ((ArrayList) this.f3762b).size(); i10++) {
            if (j4 < ((y2.a) ((ArrayList) this.f3762b).get(i10)).f11541b) {
                return i10;
            }
        }
        return ((ArrayList) this.f3762b).size();
    }

    public final void F(Exception exc) {
        f1.o.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        androidx.appcompat.widget.a0 a0Var = ((z0) this.f3762b).X0;
        Handler handler = (Handler) a0Var.f403b;
        if (handler != null) {
            handler.post(new l1.l(a0Var, exc, 1));
        }
    }

    public final void G() {
        Object obj = this.f3762b;
        p1.n nVar = (p1.n) obj;
        int i10 = nVar.K - 1;
        nVar.K = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (p1.t tVar : ((p1.n) obj).M) {
            tVar.g();
            i11 += tVar.Z.f10432a;
        }
        f1[] f1VarArr = new f1[i11];
        int i12 = 0;
        for (p1.t tVar2 : ((p1.n) this.f3762b).M) {
            tVar2.g();
            int i13 = tVar2.Z.f10432a;
            int i14 = 0;
            while (i14 < i13) {
                tVar2.g();
                f1VarArr[i12] = tVar2.Z.a(i14);
                i14++;
                i12++;
            }
        }
        ((p1.n) this.f3762b).L = new v1.g1(f1VarArr);
        Object obj2 = this.f3762b;
        ((p1.n) obj2).J.i((p1.n) obj2);
    }

    public final void H(k1.a aVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f3762b).iterator();
        while (it.hasNext()) {
            z1.b bVar = (z1.b) it.next();
            if (bVar.f11891b == aVar) {
                bVar.f11892c = true;
                ((CopyOnWriteArrayList) this.f3762b).remove(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (f1.b0.f3799a >= 26) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(c1.v r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f1935m
            r1 = 0
            if (r0 == 0) goto L6e
            boolean r0 = c1.q0.l(r0)
            if (r0 != 0) goto Ld
            goto L6e
        Ld:
            int r0 = f1.b0.f3799a
            java.lang.String r6 = r6.f1935m
            r6.getClass()
            int r0 = r6.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L55
        L1f:
            java.lang.String r0 = "image/png"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L28
            goto L55
        L28:
            r4 = r2
            goto L55
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L33
            goto L55
        L33:
            r4 = 3
            goto L55
        L35:
            java.lang.String r0 = "image/webp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3e
            goto L55
        L3e:
            r4 = 2
            goto L55
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L49
            goto L55
        L49:
            r4 = r3
            goto L55
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L54
            goto L55
        L54:
            r4 = r1
        L55:
            switch(r4) {
                case 0: goto L59;
                case 1: goto L5f;
                case 2: goto L5f;
                case 3: goto L5f;
                case 4: goto L5f;
                default: goto L58;
            }
        L58:
            goto L61
        L59:
            int r6 = f1.b0.f3799a
            r0 = 26
            if (r6 < r0) goto L61
        L5f:
            r6 = r3
            goto L62
        L61:
            r6 = r1
        L62:
            if (r6 == 0) goto L69
            int r6 = a3.g.e(r2, r1, r1, r1)
            goto L6d
        L69:
            int r6 = a3.g.e(r3, r1, r1, r1)
        L6d:
            return r6
        L6e:
            int r6 = a3.g.e(r1, r1, r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p0.I(c1.v):int");
    }

    @Override // j.b0
    public final void a(j.o oVar, boolean z9) {
        if (oVar instanceof j.i0) {
            oVar.k().c(false);
        }
        j.b0 b0Var = ((androidx.appcompat.widget.m) this.f3762b).f567e;
        if (b0Var != null) {
            b0Var.a(oVar, z9);
        }
    }

    @Override // s1.l
    public final void b(int i10, i1.d dVar, long j4, int i11) {
        ((MediaCodec) this.f3762b).queueSecureInputBuffer(i10, 0, dVar.f5258i, j4, i11);
    }

    @Override // s1.l
    public final void c(Bundle bundle) {
        ((MediaCodec) this.f3762b).setParameters(bundle);
    }

    @Override // x1.a
    public final void clear() {
        ((ArrayList) this.f3762b).clear();
    }

    @Override // s1.l
    public final void d(int i10, int i11, long j4, int i12) {
        ((MediaCodec) this.f3762b).queueInputBuffer(i10, 0, i11, j4, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // x1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(y2.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f11541b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto Lf
            r4 = r5
            goto L10
        Lf:
            r4 = r6
        L10:
            w7.b.g(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f11543d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r5
            goto L24
        L23:
            r2 = r6
        L24:
            java.lang.Object r3 = r9.f3762b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            int r3 = r3 - r5
        L2d:
            if (r3 < 0) goto L5c
            java.lang.Object r4 = r9.f3762b
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r3)
            y2.a r4 = (y2.a) r4
            long r7 = r4.f11541b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L48
            java.lang.Object r11 = r9.f3762b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r3 = r3 + r5
            r11.add(r3, r10)
            return r2
        L48:
            java.lang.Object r4 = r9.f3762b
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r3)
            y2.a r4 = (y2.a) r4
            long r7 = r4.f11541b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L59
            r2 = r6
        L59:
            int r3 = r3 + (-1)
            goto L2d
        L5c:
            java.lang.Object r11 = r9.f3762b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r6, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p0.e(y2.a, long):boolean");
    }

    @Override // x1.a
    public final r6.o0 f(long j4) {
        int E = E(j4);
        if (E == 0) {
            r6.m0 m0Var = r6.o0.f9505b;
            return n1.f9497e;
        }
        y2.a aVar = (y2.a) ((ArrayList) this.f3762b).get(E - 1);
        long j10 = aVar.f11543d;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            r6.m0 m0Var2 = r6.o0.f9505b;
            return n1.f9497e;
        }
        return aVar.f11540a;
    }

    @Override // s1.l
    public final void flush() {
    }

    @Override // g0.g
    public final ClipData g() {
        ClipData clip;
        clip = ((ContentInfo) this.f3762b).getClip();
        return clip;
    }

    @Override // androidx.appcompat.widget.p2
    public final void h(j.o oVar, MenuItem menuItem) {
        ((j.i) this.f3762b).f5527x.removeCallbacksAndMessages(oVar);
    }

    public void j(int i10) {
    }

    @Override // x1.a
    public final long k(long j4) {
        if (((ArrayList) this.f3762b).isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j4 < ((y2.a) ((ArrayList) this.f3762b).get(0)).f11541b) {
            return ((y2.a) ((ArrayList) this.f3762b).get(0)).f11541b;
        }
        for (int i10 = 1; i10 < ((ArrayList) this.f3762b).size(); i10++) {
            y2.a aVar = (y2.a) ((ArrayList) this.f3762b).get(i10);
            if (j4 < aVar.f11541b) {
                long j10 = ((y2.a) ((ArrayList) this.f3762b).get(i10 - 1)).f11543d;
                long j11 = aVar.f11541b;
                if (j10 == -9223372036854775807L || j10 <= j4 || j10 >= j11) {
                    return j11;
                }
                return j10;
            }
        }
        long j12 = ((y2.a) r6.h0.X((ArrayList) this.f3762b)).f11543d;
        if (j12 == -9223372036854775807L || j4 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // s1.l
    public final void l() {
    }

    @Override // j.b0
    public final boolean m(j.o oVar) {
        Object obj = this.f3762b;
        if (oVar == ((androidx.appcompat.widget.m) obj).f565c) {
            return false;
        }
        ((j.i0) oVar).A.getClass();
        ((androidx.appcompat.widget.m) obj).getClass();
        j.b0 b0Var = ((androidx.appcompat.widget.m) this.f3762b).f567e;
        if (b0Var == null) {
            return false;
        }
        return b0Var.m(oVar);
    }

    @Override // androidx.appcompat.widget.p2
    public final void n(j.o oVar, j.q qVar) {
        j.h hVar = null;
        ((j.i) this.f3762b).f5527x.removeCallbacksAndMessages(null);
        int size = ((j.i) this.f3762b).f5529z.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (oVar == ((j.h) ((j.i) this.f3762b).f5529z.get(i10)).f5512b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < ((j.i) this.f3762b).f5529z.size()) {
            hVar = (j.h) ((j.i) this.f3762b).f5529z.get(i11);
        }
        ((j.i) this.f3762b).f5527x.postAtTime(new j.g(this, hVar, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // g0.y
    public final k2 o(View view, k2 k2Var) {
        boolean z9;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3762b;
        if (!f0.b.a(coordinatorLayout.E, k2Var)) {
            coordinatorLayout.E = k2Var;
            boolean z10 = true;
            if (k2Var.e() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            coordinatorLayout.F = z9;
            if (z9 || coordinatorLayout.getBackground() != null) {
                z10 = false;
            }
            coordinatorLayout.setWillNotDraw(z10);
            i2 i2Var = k2Var.f4227a;
            if (!i2Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    WeakHashMap weakHashMap = y0.f4277a;
                    if (g0.h0.b(childAt) && ((u.d) childAt.getLayoutParams()).f10104a != null && i2Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return k2Var;
    }

    @Override // j.m
    public final void p(j.o oVar) {
        j.m mVar = ((ActionMenuView) this.f3762b).M;
        if (mVar != null) {
            mVar.p(oVar);
        }
    }

    @Override // j.m
    public final boolean q(j.o oVar, MenuItem menuItem) {
        androidx.appcompat.widget.p pVar = ((ActionMenuView) this.f3762b).R;
        if (pVar != null && ((a4) pVar).f414a.f376a0.a()) {
            return true;
        }
        return false;
    }

    @Override // g0.g
    public final int r() {
        int flags;
        flags = ((ContentInfo) this.f3762b).getFlags();
        return flags;
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        p1.n nVar = (p1.n) this.f3762b;
        nVar.J.s(nVar);
    }

    @Override // s1.l
    public final void shutdown() {
    }

    @Override // s1.l
    public final void start() {
    }

    @Override // g0.g
    public final ContentInfo t() {
        return (ContentInfo) this.f3762b;
    }

    public final String toString() {
        switch (this.f3761a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3762b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // x1.a
    public final long u(long j4) {
        if (((ArrayList) this.f3762b).isEmpty() || j4 < ((y2.a) ((ArrayList) this.f3762b).get(0)).f11541b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < ((ArrayList) this.f3762b).size(); i10++) {
            long j10 = ((y2.a) ((ArrayList) this.f3762b).get(i10)).f11541b;
            if (j4 == j10) {
                return j10;
            }
            if (j4 < j10) {
                y2.a aVar = (y2.a) ((ArrayList) this.f3762b).get(i10 - 1);
                long j11 = aVar.f11543d;
                if (j11 == -9223372036854775807L || j11 > j4) {
                    return aVar.f11541b;
                }
                return j11;
            }
        }
        y2.a aVar2 = (y2.a) r6.h0.X((ArrayList) this.f3762b);
        long j12 = aVar2.f11543d;
        if (j12 == -9223372036854775807L || j4 < j12) {
            return aVar2.f11541b;
        }
        return j12;
    }

    public void v(int i10) {
    }

    @Override // g0.g
    public final int w() {
        int source;
        source = ((ContentInfo) this.f3762b).getSource();
        return source;
    }

    @Override // x1.a
    public final void x(long j4) {
        int E = E(j4);
        if (E > 0) {
            ((ArrayList) this.f3762b).subList(0, E).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface y(android.content.Context r10, y.f r11, android.content.res.Resources r12, int r13) {
        /*
            r9 = this;
            f9.x r0 = new f9.x
            r1 = 1
            r0.<init>(r1)
            y.g[] r2 = r11.f11426a
            java.lang.Object r0 = C(r2, r13, r0)
            y.g r0 = (y.g) r0
            if (r0 != 0) goto L12
            r10 = 0
            return r10
        L12:
            int r8 = r0.f11432f
            java.lang.String r0 = r0.f11427a
            f.p0 r2 = z.i.f11865a
            r3 = r10
            r4 = r12
            r5 = r8
            r6 = r0
            r7 = r13
            android.graphics.Typeface r10 = r2.B(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L2d
            r2 = 0
            java.lang.String r12 = z.i.b(r12, r8, r0, r2, r13)
            n.j r13 = z.i.f11866b
            r13.put(r12, r10)
        L2d:
            java.lang.String r12 = "Could not retrieve font from family."
            java.lang.String r13 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r10 != 0) goto L37
        L35:
            r12 = r2
            goto L57
        L37:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r4 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L52
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L52
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L52
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L52
            long r12 = r0.longValue()     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L52
            goto L57
        L4d:
            r0 = move-exception
            android.util.Log.e(r13, r12, r0)
            goto L35
        L52:
            r0 = move-exception
            android.util.Log.e(r13, r12, r0)
            goto L35
        L57:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L66
            java.lang.Object r0 = r9.f3762b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r0.put(r12, r11)
        L66:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p0.y(android.content.Context, y.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface z(Context context, d0.i[] iVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(D(i10, iVarArr).f3028a);
            try {
                Typeface A = A(context, inputStream);
                p7.a0.e(inputStream);
                return A;
            } catch (IOException unused) {
                p7.a0.e(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                p7.a0.e(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public p0(z7.c cVar) {
        this.f3761a = 8;
        this.f3762b = cVar;
    }

    public p0(a3.g gVar) {
        this.f3761a = 20;
        this.f3762b = new p1.e(5);
    }

    public p0(int i10, int i11) {
        this.f3761a = i10;
        int i12 = 9;
        if (i10 == 9) {
            this.f3762b = new ConcurrentHashMap();
            return;
        }
        if (i10 == 12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                this.f3762b = new b2();
                return;
            } else if (i13 >= 29) {
                this.f3762b = new a2();
                return;
            } else {
                this.f3762b = new z1();
                return;
            }
        }
        if (i10 == 22) {
            this.f3762b = new SparseArray();
            return;
        }
        if (i10 != 23) {
            switch (i10) {
                case 25:
                    this.f3762b = new ArrayList();
                    return;
                case 26:
                    this.f3762b = new w1.o(7);
                    return;
                case 27:
                    this.f3762b = new CopyOnWriteArrayList();
                    return;
                default:
                    this.f3762b = new ArrayDeque();
                    return;
            }
        }
        this.f3762b = new j1.l(i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(c1.g gVar, int i10) {
        this(gVar);
        this.f3761a = 18;
    }

    public p0(c1.g gVar) {
        this.f3761a = 18;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(gVar.f1696a).setFlags(gVar.f1697b).setUsage(gVar.f1698c);
        int i10 = f1.b0.f3799a;
        if (i10 >= 29) {
            c1.c.a(usage, gVar.f1699d);
        }
        if (i10 >= 32) {
            c1.e.a(usage, gVar.f1700e);
        }
        this.f3762b = usage.build();
    }

    public p0(TextView textView) {
        this.f3761a = 17;
        if (textView != null) {
            this.f3762b = new s0.i(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public p0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3761a = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3762b = new j0.e(uri, clipDescription, uri2);
        } else {
            this.f3762b = new c(uri, clipDescription, uri2, 3, 0);
        }
    }

    public p0(ContentInfo contentInfo) {
        this.f3761a = 11;
        contentInfo.getClass();
        this.f3762b = com.google.android.gms.common.internal.o0.n(contentInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(p1.n nVar) {
        this(nVar, 21);
        this.f3761a = 21;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(z0 z0Var) {
        this(z0Var, 19);
        this.f3761a = 19;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(u2.d dVar) {
        this(dVar, 29);
        this.f3761a = 29;
    }
}
