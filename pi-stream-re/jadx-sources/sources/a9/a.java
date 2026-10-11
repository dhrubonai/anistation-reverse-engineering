package a9;

import androidx.appcompat.widget.w;
import androidx.lifecycle.q0;
import c9.i;
import d9.f;
import java.util.ArrayList;
import r6.h0;
import y8.c;
import y8.c0;
import y8.d0;
import y8.f0;
import y8.j;
import y8.o;
import y8.r;
import y8.x;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f207a = 0;

    static {
        new j(14, 0);
    }

    @Override // y8.r
    public final d0 a(f fVar) {
        i iVar;
        String str;
        boolean z9;
        o oVar;
        boolean z10;
        String str2;
        boolean z11;
        System.currentTimeMillis();
        w wVar = fVar.f3260e;
        h0.u(wVar, "request");
        b bVar = new b(wVar, null);
        c cVar = (c) wVar.f686g;
        if (cVar == null) {
            int i10 = c.f11664n;
            cVar = q0.C((o) wVar.f683d);
            wVar.f686g = cVar;
        }
        if (cVar.f11674j) {
            bVar = new b(null, null);
        }
        i iVar2 = fVar.f3256a;
        if (iVar2 instanceof i) {
            iVar = iVar2;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            q0 q0Var = iVar.f2132e;
        }
        w wVar2 = bVar.f208a;
        d0 d0Var = bVar.f209b;
        if (wVar2 == null && d0Var == null) {
            c0 c0Var = new c0();
            c0Var.f11678a = wVar;
            c0Var.f11679b = x.HTTP_1_1;
            c0Var.f11680c = 504;
            c0Var.f11681d = "Unsatisfiable Request (only-if-cached)";
            c0Var.f11684g = z8.b.f12135c;
            c0Var.f11688k = -1L;
            c0Var.f11689l = System.currentTimeMillis();
            d0 a10 = c0Var.a();
            h0.u(iVar2, "call");
            return a10;
        }
        if (wVar2 == null) {
            h0.q(d0Var);
            c0 c0Var2 = new c0(d0Var);
            d0 a11 = j.a(d0Var);
            c0.b("cacheResponse", a11);
            c0Var2.f11686i = a11;
            d0 a12 = c0Var2.a();
            h0.u(iVar2, "call");
            return a12;
        }
        if (d0Var != null) {
            h0.u(iVar2, "call");
        }
        d0 b10 = fVar.b(wVar2);
        String str3 = "networkResponse";
        if (d0Var == null) {
            str = "networkResponse";
        } else {
            if (b10.f11694d == 304) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                str = "networkResponse";
                f0 f0Var = d0Var.f11697x;
                if (f0Var != null) {
                    z8.b.c(f0Var);
                }
            } else {
                c0 c0Var3 = new c0(d0Var);
                ArrayList arrayList = new ArrayList(20);
                o oVar2 = d0Var.f11696f;
                int length = oVar2.f11770a.length / 2;
                int i11 = 0;
                while (true) {
                    oVar = b10.f11696f;
                    if (i11 >= length) {
                        break;
                    }
                    String c6 = oVar2.c(i11);
                    int i12 = length;
                    String e10 = oVar2.e(i11);
                    o oVar3 = oVar2;
                    if (o7.j.l1("Warning", c6)) {
                        str2 = str3;
                        if (o7.j.C1(e10, "1", false)) {
                            i11++;
                            length = i12;
                            oVar2 = oVar3;
                            str3 = str2;
                        }
                    } else {
                        str2 = str3;
                    }
                    if (!o7.j.l1("Content-Length", c6) && !o7.j.l1("Content-Encoding", c6) && !o7.j.l1("Content-Type", c6)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11 || !j.n(c6) || oVar.b(c6) == null) {
                        h0.u(c6, "name");
                        h0.u(e10, "value");
                        arrayList.add(c6);
                        arrayList.add(o7.j.G1(e10).toString());
                    }
                    i11++;
                    length = i12;
                    oVar2 = oVar3;
                    str3 = str2;
                }
                String str4 = str3;
                int length2 = oVar.f11770a.length / 2;
                for (int i13 = 0; i13 < length2; i13++) {
                    String c10 = oVar.c(i13);
                    if (!o7.j.l1("Content-Length", c10) && !o7.j.l1("Content-Encoding", c10) && !o7.j.l1("Content-Type", c10)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && j.n(c10)) {
                        String e11 = oVar.e(i13);
                        h0.u(c10, "name");
                        h0.u(e11, "value");
                        arrayList.add(c10);
                        arrayList.add(o7.j.G1(e11).toString());
                    }
                }
                c0Var3.f11683f = new o((String[]) arrayList.toArray(new String[0])).d();
                c0Var3.f11688k = b10.B;
                c0Var3.f11689l = b10.C;
                d0 a13 = j.a(d0Var);
                c0.b("cacheResponse", a13);
                c0Var3.f11686i = a13;
                d0 a14 = j.a(b10);
                c0.b(str4, a14);
                c0Var3.f11685h = a14;
                c0Var3.a();
                f0 f0Var2 = b10.f11697x;
                h0.q(f0Var2);
                f0Var2.close();
                h0.q(null);
                throw null;
            }
        }
        c0 c0Var4 = new c0(b10);
        d0 a15 = j.a(d0Var);
        c0.b("cacheResponse", a15);
        c0Var4.f11686i = a15;
        d0 a16 = j.a(b10);
        c0.b(str, a16);
        c0Var4.f11685h = a16;
        return c0Var4.a();
    }
}
