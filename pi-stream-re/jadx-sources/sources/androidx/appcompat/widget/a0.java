package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements v1.c0, o1.o, q1.p, z1.q, y2.l, d2.h, h3.c0, c0.c, v3.h, com.bumptech.glide.load.data.d, y3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f402a;

    /* renamed from: b, reason: collision with root package name */
    public Object f403b;

    /* renamed from: c, reason: collision with root package name */
    public Object f404c;

    public /* synthetic */ a0(int i10, Object obj) {
        this.f402a = i10;
    }

    public static String M(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    @Override // o1.o
    public final void A(int i10, v1.w wVar, Exception exc) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new q0.o(this, N, exc, 2));
        }
    }

    @Override // v1.c0
    public final void B(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.v0(this, N, nVar, sVar, 2));
        }
    }

    @Override // y3.j
    public final String C(Bitmap bitmap) {
        return M(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // v1.c0
    public final void D(int i10, v1.w wVar, v1.n nVar, v1.s sVar, IOException iOException, boolean z9) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.x0(this, N, nVar, sVar, iOException, z9, 0));
        }
    }

    @Override // d2.h
    public final void E() {
        f1.t tVar = (f1.t) this.f404c;
        byte[] bArr = f1.b0.f3804f;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
    }

    @Override // v1.c0
    public final void F(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.v0(this, N, nVar, sVar, 0));
        }
    }

    public final void G() {
        this.f403b = null;
        this.f404c = null;
    }

    public final void H(d2.r rVar, h3.i0 i0Var) {
        boolean z9;
        for (int i10 = 0; i10 < ((d2.g0[]) this.f404c).length; i10++) {
            i0Var.a();
            i0Var.b();
            d2.g0 i11 = rVar.i(i0Var.f4809d, 3);
            c1.v vVar = (c1.v) ((List) this.f403b).get(i10);
            String str = vVar.f1935m;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z9 = false;
            } else {
                z9 = true;
            }
            w7.b.f("Invalid closed caption MIME type provided: " + str, z9);
            String str2 = vVar.f1923a;
            if (str2 == null) {
                i0Var.b();
                str2 = i0Var.f4810e;
            }
            c1.u uVar = new c1.u();
            uVar.f1897a = str2;
            uVar.e(str);
            uVar.f1901e = vVar.f1927e;
            uVar.f1900d = vVar.f1926d;
            uVar.D = vVar.E;
            uVar.f1910n = vVar.o;
            i11.b(new c1.v(uVar));
            ((d2.g0[]) this.f404c)[i10] = i11;
        }
    }

    public final void I(j1.f fVar) {
        synchronized (fVar) {
        }
        Object obj = this.f403b;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new l1.m(this, fVar, 0));
        }
    }

    public final byte[] J(n2.a aVar) {
        ((ByteArrayOutputStream) this.f403b).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.f404c;
            dataOutputStream.writeBytes(aVar.f7989a);
            dataOutputStream.writeByte(0);
            String str = aVar.f7990b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.f404c;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.f404c).writeLong(aVar.f7991c);
            ((DataOutputStream) this.f404c).writeLong(aVar.f7992d);
            ((DataOutputStream) this.f404c).write(aVar.f7993e);
            ((DataOutputStream) this.f404c).flush();
            return ((ByteArrayOutputStream) this.f403b).toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Object K(y3.k kVar) {
        int i10;
        y3.f fVar = (y3.f) ((Map) this.f404c).get(kVar);
        if (fVar == null) {
            fVar = new y3.f(kVar);
            ((Map) this.f404c).put(kVar, fVar);
        } else {
            kVar.a();
        }
        y3.f fVar2 = fVar.f11588d;
        fVar2.f11587c = fVar.f11587c;
        fVar.f11587c.f11588d = fVar2;
        y3.f fVar3 = (y3.f) this.f403b;
        fVar.f11588d = fVar3;
        y3.f fVar4 = fVar3.f11587c;
        fVar.f11587c = fVar4;
        fVar4.f11588d = fVar;
        fVar.f11588d.f11587c = fVar;
        ArrayList arrayList = fVar.f11586b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return fVar.f11586b.remove(i10 - 1);
        }
        return null;
    }

    @Override // o1.o
    public final void L(int i10, v1.w wVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.w0(this, N, 1));
        }
    }

    public final Pair N(int i10, v1.w wVar) {
        v1.w wVar2;
        v1.w wVar3 = null;
        if (wVar != null) {
            j1.z0 z0Var = (j1.z0) this.f403b;
            int i11 = 0;
            while (true) {
                if (i11 < z0Var.f5935c.size()) {
                    if (((v1.w) z0Var.f5935c.get(i11)).f10562d == wVar.f10562d) {
                        Object obj = z0Var.f5934b;
                        int i12 = j1.f1.f5735k;
                        wVar2 = wVar.a(Pair.create(obj, wVar.f10559a));
                        break;
                    }
                    i11++;
                } else {
                    wVar2 = null;
                    break;
                }
            }
            if (wVar2 == null) {
                return null;
            }
            wVar3 = wVar2;
        }
        return Pair.create(Integer.valueOf(i10 + ((j1.z0) this.f403b).f5936d), wVar3);
    }

    @Override // o1.o
    public final void O(int i10, v1.w wVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.w0(this, N, 3));
        }
    }

    @Override // o1.o
    public final /* synthetic */ void P() {
    }

    public final KeyListener Q(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((j6.e) ((s0.b) this.f404c).f9729c).p(keyListener);
        }
        return keyListener;
    }

    public final void R(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f403b).getContext().obtainStyledAttributes(attributeSet, e.a.f3278i, i10, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((j6.e) ((s0.b) this.f404c).f9729c).z(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection S(InputConnection inputConnection, EditorInfo editorInfo) {
        s0.b bVar = (s0.b) this.f404c;
        if (inputConnection == null) {
            bVar.getClass();
            return null;
        }
        return ((j6.e) bVar.f9729c).u(inputConnection, editorInfo);
    }

    public final void T(d0.f fVar) {
        boolean z9;
        int i10 = fVar.f3021b;
        int i11 = 0;
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            ((Handler) this.f404c).post(new d0.a(this, (f.p0) this.f403b, fVar.f3020a, i11));
        } else {
            ((Handler) this.f404c).post(new a.d(this, (f.p0) this.f403b, i10, 4));
        }
    }

    public final void U(y3.k kVar, Object obj) {
        y3.f fVar = (y3.f) ((Map) this.f404c).get(kVar);
        if (fVar == null) {
            fVar = new y3.f(kVar);
            y3.f fVar2 = fVar.f11588d;
            fVar2.f11587c = fVar.f11587c;
            fVar.f11587c.f11588d = fVar2;
            y3.f fVar3 = (y3.f) this.f403b;
            fVar.f11588d = fVar3.f11588d;
            fVar.f11587c = fVar3;
            fVar3.f11588d = fVar;
            fVar.f11588d.f11587c = fVar;
            ((Map) this.f404c).put(kVar, fVar);
        } else {
            kVar.a();
        }
        if (fVar.f11586b == null) {
            fVar.f11586b = new ArrayList();
        }
        fVar.f11586b.add(obj);
    }

    public final void V(String str) {
        z3.b bVar;
        synchronized (this) {
            Object obj = ((Map) this.f403b).get(str);
            w7.b.q(obj);
            bVar = (z3.b) obj;
            int i10 = bVar.f12039b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                bVar.f12039b = i11;
                if (i11 == 0) {
                    z3.b bVar2 = (z3.b) ((Map) this.f403b).remove(str);
                    if (bVar2.equals(bVar)) {
                        ((z3.c) this.f404c).b(bVar2);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f12039b);
            }
        }
        bVar.f12038a.unlock();
    }

    public final Object W() {
        int i10;
        y3.f fVar = ((y3.f) this.f403b).f11588d;
        while (true) {
            Object obj = null;
            if (fVar.equals((y3.f) this.f403b)) {
                return null;
            }
            ArrayList arrayList = fVar.f11586b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                obj = fVar.f11586b.remove(i10 - 1);
            }
            if (obj != null) {
                return obj;
            }
            y3.f fVar2 = fVar.f11588d;
            fVar2.f11587c = fVar.f11587c;
            fVar.f11587c.f11588d = fVar2;
            Map map = (Map) this.f404c;
            Object obj2 = fVar.f11585a;
            map.remove(obj2);
            ((y3.k) obj2).a();
            fVar = fVar.f11588d;
        }
    }

    @Override // v3.h
    public final int a(v3.e eVar) {
        switch (this.f402a) {
            case 23:
                try {
                    return eVar.b((ByteBuffer) this.f403b, (y3.h) this.f404c);
                } finally {
                    p4.b.c((ByteBuffer) this.f403b);
                }
            default:
                try {
                    return eVar.c((InputStream) this.f403b, (y3.h) this.f404c);
                } finally {
                    ((InputStream) this.f403b).reset();
                }
        }
    }

    @Override // y3.j
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        y3.b bVar = (y3.b) ((y3.c) this.f403b).e();
        bVar.f11580b = i10;
        bVar.f11581c = i11;
        bVar.f11582d = config;
        return (Bitmap) ((a0) this.f404c).K(bVar);
    }

    @Override // y3.j
    public final void c(Bitmap bitmap) {
        y3.c cVar = (y3.c) this.f403b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        y3.b bVar = (y3.b) cVar.e();
        bVar.f11580b = width;
        bVar.f11581c = height;
        bVar.f11582d = config;
        ((a0) this.f404c).U(bVar, bitmap);
    }

    @Override // h3.c0
    public final void d(f1.t tVar) {
        if (tVar.v() != 0 || (tVar.v() & 128) == 0) {
            return;
        }
        tVar.H(6);
        int i10 = (tVar.f3860c - tVar.f3859b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            f1.s sVar = (f1.s) this.f403b;
            tVar.d(sVar.f3851b, 0, 4);
            sVar.o(0);
            int i12 = ((f1.s) this.f403b).i(16);
            ((f1.s) this.f403b).r(3);
            if (i12 == 0) {
                ((f1.s) this.f403b).r(13);
            } else {
                int i13 = ((f1.s) this.f403b).i(13);
                if (((h3.g0) this.f404c).f4775h.get(i13) == null) {
                    h3.g0 g0Var = (h3.g0) this.f404c;
                    g0Var.f4775h.put(i13, new h3.d0(new h3.f0(g0Var, i13)));
                    ((h3.g0) this.f404c).f4781n++;
                }
            }
        }
        h3.g0 g0Var2 = (h3.g0) this.f404c;
        if (g0Var2.f4768a != 2) {
            g0Var2.f4775h.remove(0);
        }
    }

    @Override // h3.c0
    public final void e(f1.y yVar, d2.r rVar, h3.i0 i0Var) {
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // v1.c0
    public final void g(int i10, v1.w wVar, v1.s sVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.u0(this, N, sVar, 1));
        }
    }

    @Override // z1.q
    public final Object h(Uri uri, h1.j jVar) {
        u1.a aVar = (u1.a) ((z1.q) this.f403b).h(uri, jVar);
        List list = (List) this.f404c;
        if (list != null && !list.isEmpty()) {
            return (u1.a) aVar.a((List) this.f404c);
        }
        return aVar;
    }

    @Override // v1.c0
    public final void i(int i10, v1.w wVar, v1.s sVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.u0(this, N, sVar, 0));
        }
    }

    @Override // q1.p
    public final z1.q j(q1.l lVar, q1.i iVar) {
        return new a0(13, ((q1.p) this.f403b).j(lVar, iVar), (List) this.f404c);
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, f.r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    @Override // o1.o
    public final void l(int i10, v1.w wVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.w0(this, N, 0));
        }
    }

    @Override // y3.j
    public final String m(int i10, int i11, Bitmap.Config config) {
        return M(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void n(Exception exc) {
        boolean z9;
        x3.i0 i0Var = (x3.i0) this.f404c;
        b4.w wVar = (b4.w) this.f403b;
        b4.w wVar2 = i0Var.f11214f;
        if (wVar2 != null && wVar2 == wVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            x3.i0 i0Var2 = (x3.i0) this.f404c;
            b4.w wVar3 = (b4.w) this.f403b;
            x3.g gVar = i0Var2.f11210b;
            x3.f fVar = i0Var2.f11215x;
            com.bumptech.glide.load.data.e eVar = wVar3.f1503c;
            gVar.d(fVar, exc, eVar, eVar.d());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x039a, code lost:
    
        r0.addAll(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0121, code lost:
    
        if (")".equals(g3.a.b(r6, r11)) == false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036e  */
    @Override // y2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(byte[] r20, int r21, int r22, f.r0 r23, f1.c r24) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.o(byte[], int, int, f.r0, f1.c):void");
    }

    @Override // c0.c
    public final void p() {
        ((q3.s) this.f403b).d();
    }

    @Override // v1.c0
    public final void q(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.v0(this, N, nVar, sVar, 1));
        }
    }

    @Override // y2.l
    public final /* synthetic */ y2.d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void s(Object obj) {
        boolean z9;
        x3.i0 i0Var = (x3.i0) this.f404c;
        b4.w wVar = (b4.w) this.f403b;
        b4.w wVar2 = i0Var.f11214f;
        if (wVar2 != null && wVar2 == wVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            x3.i0 i0Var2 = (x3.i0) this.f404c;
            b4.w wVar3 = (b4.w) this.f403b;
            x3.o oVar = i0Var2.f11209a.f11206p;
            if (obj != null && oVar.a(wVar3.f1503c.d())) {
                i0Var2.f11213e = obj;
                i0Var2.f11210b.a();
            } else {
                x3.g gVar = i0Var2.f11210b;
                v3.i iVar = wVar3.f1501a;
                com.bumptech.glide.load.data.e eVar = wVar3.f1503c;
                gVar.b(iVar, obj, eVar, eVar.d(), i0Var2.f11215x);
            }
        }
    }

    @Override // y3.j
    public final int t(Bitmap bitmap) {
        return p4.m.c(bitmap);
    }

    public final String toString() {
        int i10;
        switch (this.f402a) {
            case 5:
                return "Bounds{lower=" + ((z.d) this.f403b) + " upper=" + ((z.d) this.f404c) + "}";
            case 27:
                return "AttributeStrategy:\n  " + ((a0) this.f404c);
            case 28:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                y3.f fVar = ((y3.f) this.f403b).f11587c;
                boolean z9 = false;
                while (!fVar.equals((y3.f) this.f403b)) {
                    sb.append('{');
                    sb.append(fVar.f11585a);
                    sb.append(':');
                    ArrayList arrayList = fVar.f11586b;
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    } else {
                        i10 = 0;
                    }
                    sb.append(i10);
                    sb.append("}, ");
                    fVar = fVar.f11587c;
                    z9 = true;
                }
                if (z9) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // y3.j
    public final Bitmap u() {
        return (Bitmap) ((a0) this.f404c).W();
    }

    @Override // q1.p
    public final z1.q v() {
        return new a0(13, ((q1.p) this.f403b).v(), (List) this.f404c);
    }

    @Override // o1.o
    public final void w(int i10, v1.w wVar) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new j1.w0(this, N, 2));
        }
    }

    @Override // y2.l
    public final int x() {
        return 1;
    }

    @Override // o1.o
    public final void y(int i10, v1.w wVar, int i11) {
        Pair N = N(i10, wVar);
        if (N != null) {
            ((f1.x) ((j1.a1) this.f404c).f5627i).c(new f1.k(this, N, i11, 1));
        }
    }

    @Override // d2.h
    public final d2.g z(d2.q qVar, long j4) {
        int d10;
        long q9 = qVar.q();
        int min = (int) Math.min(20000L, qVar.c() - q9);
        ((f1.t) this.f404c).D(min);
        qVar.n(((f1.t) this.f404c).f3858a, 0, min);
        f1.t tVar = (f1.t) this.f404c;
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (true) {
            int i12 = tVar.f3860c;
            int i13 = tVar.f3859b;
            if (i12 - i13 >= 4) {
                if (h2.a.d(tVar.f3858a, i13) != 442) {
                    tVar.H(1);
                } else {
                    tVar.H(4);
                    long c6 = h3.z.c(tVar);
                    if (c6 != -9223372036854775807L) {
                        long b10 = ((f1.y) this.f403b).b(c6);
                        if (b10 > j4) {
                            if (j10 == -9223372036854775807L) {
                                return new d2.g(-1, b10, q9);
                            }
                            return d2.g.b(q9 + i11);
                        }
                        if (100000 + b10 > j4) {
                            return d2.g.b(q9 + tVar.f3859b);
                        }
                        i11 = tVar.f3859b;
                        j10 = b10;
                    }
                    int i14 = tVar.f3860c;
                    if (i14 - tVar.f3859b < 10) {
                        tVar.G(i14);
                    } else {
                        tVar.H(9);
                        int v9 = tVar.v() & 7;
                        if (tVar.f3860c - tVar.f3859b < v9) {
                            tVar.G(i14);
                        } else {
                            tVar.H(v9);
                            int i15 = tVar.f3860c;
                            int i16 = tVar.f3859b;
                            if (i15 - i16 < 4) {
                                tVar.G(i14);
                            } else {
                                if (h2.a.d(tVar.f3858a, i16) == 443) {
                                    tVar.H(4);
                                    int A = tVar.A();
                                    if (tVar.f3860c - tVar.f3859b < A) {
                                        tVar.G(i14);
                                    } else {
                                        tVar.H(A);
                                    }
                                }
                                while (true) {
                                    int i17 = tVar.f3860c;
                                    int i18 = tVar.f3859b;
                                    if (i17 - i18 < 4 || (d10 = h2.a.d(tVar.f3858a, i18)) == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                        break;
                                    }
                                    tVar.H(4);
                                    if (tVar.f3860c - tVar.f3859b < 2) {
                                        tVar.G(i14);
                                        break;
                                    }
                                    tVar.G(Math.min(tVar.f3860c, tVar.f3859b + tVar.A()));
                                }
                            }
                        }
                    }
                    i10 = tVar.f3859b;
                }
            } else {
                if (j10 != -9223372036854775807L) {
                    return new d2.g(-2, j10, q9 + i10);
                }
                return d2.g.f3140d;
            }
        }
    }

    public /* synthetic */ a0(int i10, Object obj, Object obj2) {
        this.f402a = i10;
        this.f403b = obj;
        this.f404c = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i10) {
        this.f402a = i10;
        this.f404c = obj;
        this.f403b = obj2;
    }

    public a0(int i10) {
        this.f402a = i10;
        if (i10 != 17) {
            int i11 = 0;
            switch (i10) {
                case 27:
                    this.f403b = new y3.c(i11);
                    this.f404c = new a0(28);
                    return;
                case 28:
                    this.f403b = new y3.f(null);
                    this.f404c = new HashMap();
                    return;
                case 29:
                    this.f403b = new HashMap();
                    this.f404c = new z3.c(0);
                    return;
                default:
                    this.f403b = new ByteArrayOutputStream(512);
                    this.f404c = new DataOutputStream((ByteArrayOutputStream) this.f403b);
                    return;
            }
        }
        this.f403b = new f1.t();
        this.f404c = new g3.a();
    }

    public a0(List list) {
        this.f402a = 19;
        this.f403b = list;
        this.f404c = new d2.g0[list.size()];
    }

    public a0(TextView textView) {
        this.f402a = 1;
        textView.getClass();
        this.f403b = textView;
    }

    public a0(EditText editText) {
        this.f402a = 0;
        this.f403b = editText;
        this.f404c = new s0.b(editText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(f1.y yVar, int i10) {
        this(yVar);
        this.f402a = 18;
    }

    public a0(f1.y yVar) {
        this.f402a = 18;
        this.f403b = yVar;
        this.f404c = new f1.t();
    }

    public a0(Handler handler, l1.s sVar) {
        this.f402a = 10;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f403b = handler;
        this.f404c = sVar;
    }

    public a0(ArrayList arrayList, ArrayList arrayList2) {
        this.f402a = 3;
        int size = arrayList.size();
        this.f403b = new int[size];
        this.f404c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f403b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f404c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public a0(int i10, int i11) {
        this.f402a = 3;
        this.f403b = new int[]{i10, i11};
        this.f404c = new float[]{0.0f, 1.0f};
    }

    public a0(int i10, int i11, int i12) {
        this.f402a = 3;
        this.f403b = new int[]{i10, i11, i12};
        this.f404c = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(String str, Map map) {
        this(21, str, map);
        this.f402a = 21;
    }

    public a0(h3.g0 g0Var) {
        this.f402a = 20;
        this.f404c = g0Var;
        this.f403b = new f1.s(new byte[4], 0, (Object) null);
    }
}
