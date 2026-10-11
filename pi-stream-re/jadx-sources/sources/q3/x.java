package q3;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class x extends s {
    public int Q;
    public ArrayList O = new ArrayList();
    public boolean P = true;
    public boolean R = false;
    public int S = 0;

    @Override // q3.s
    public final void A(long j4) {
        ArrayList arrayList;
        this.f9180c = j4;
        if (j4 >= 0 && (arrayList = this.O) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((s) this.O.get(i10)).A(j4);
            }
        }
    }

    @Override // q3.s
    public final void B(com.bumptech.glide.c cVar) {
        this.J = cVar;
        this.S |= 8;
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).B(cVar);
        }
    }

    @Override // q3.s
    public final void C(TimeInterpolator timeInterpolator) {
        this.S |= 1;
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((s) this.O.get(i10)).C(timeInterpolator);
            }
        }
        this.f9181d = timeInterpolator;
    }

    @Override // q3.s
    public final void D(w1.o oVar) {
        super.D(oVar);
        this.S |= 4;
        if (this.O != null) {
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                ((s) this.O.get(i10)).D(oVar);
            }
        }
    }

    @Override // q3.s
    public final void E() {
        this.S |= 2;
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).E();
        }
    }

    @Override // q3.s
    public final void F(long j4) {
        this.f9179b = j4;
    }

    @Override // q3.s
    public final String H(String str) {
        String H = super.H(str);
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            StringBuilder a10 = p.j.a(H, "\n");
            a10.append(((s) this.O.get(i10)).H(str + "  "));
            H = a10.toString();
        }
        return H;
    }

    public final void I(s sVar) {
        this.O.add(sVar);
        sVar.f9186z = this;
        long j4 = this.f9180c;
        if (j4 >= 0) {
            sVar.A(j4);
        }
        if ((this.S & 1) != 0) {
            sVar.C(this.f9181d);
        }
        if ((this.S & 2) != 0) {
            sVar.E();
        }
        if ((this.S & 4) != 0) {
            sVar.D(this.K);
        }
        if ((this.S & 8) != 0) {
            sVar.B(this.J);
        }
    }

    @Override // q3.s
    public final void a(r rVar) {
        super.a(rVar);
    }

    @Override // q3.s
    public final void b(View view) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ((s) this.O.get(i10)).b(view);
        }
        this.f9183f.add(view);
    }

    @Override // q3.s
    public final void d() {
        super.d();
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).d();
        }
    }

    @Override // q3.s
    public final void e(z zVar) {
        View view = zVar.f9197b;
        if (t(view)) {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (sVar.t(view)) {
                    sVar.e(zVar);
                    zVar.f9198c.add(sVar);
                }
            }
        }
    }

    @Override // q3.s
    public final void g(z zVar) {
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).g(zVar);
        }
    }

    @Override // q3.s
    public final void h(z zVar) {
        View view = zVar.f9197b;
        if (t(view)) {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (sVar.t(view)) {
                    sVar.h(zVar);
                    zVar.f9198c.add(sVar);
                }
            }
        }
    }

    @Override // q3.s
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final s clone() {
        x xVar = (x) super.clone();
        xVar.O = new ArrayList();
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            s clone = ((s) this.O.get(i10)).clone();
            xVar.O.add(clone);
            clone.f9186z = xVar;
        }
        return xVar;
    }

    @Override // q3.s
    public final void m(ViewGroup viewGroup, i.g gVar, i.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f9179b;
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) this.O.get(i10);
            if (j4 > 0 && (this.P || i10 == 0)) {
                long j10 = sVar.f9179b;
                if (j10 > 0) {
                    sVar.F(j10 + j4);
                } else {
                    sVar.F(j4);
                }
            }
            sVar.m(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // q3.s
    public final void v(View view) {
        super.v(view);
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).v(view);
        }
    }

    @Override // q3.s
    public final void w(r rVar) {
        super.w(rVar);
    }

    @Override // q3.s
    public final void x(View view) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ((s) this.O.get(i10)).x(view);
        }
        this.f9183f.remove(view);
    }

    @Override // q3.s
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.O.get(i10)).y(viewGroup);
        }
    }

    @Override // q3.s
    public final void z() {
        if (this.O.isEmpty()) {
            G();
            n();
            return;
        }
        w wVar = new w(this);
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(wVar);
        }
        this.Q = this.O.size();
        if (!this.P) {
            for (int i10 = 1; i10 < this.O.size(); i10++) {
                ((s) this.O.get(i10 - 1)).a(new h(2, this, (s) this.O.get(i10)));
            }
            s sVar = (s) this.O.get(0);
            if (sVar != null) {
                sVar.z();
                return;
            }
            return;
        }
        Iterator it2 = this.O.iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).z();
        }
    }
}
