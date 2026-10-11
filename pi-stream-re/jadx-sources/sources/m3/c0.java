package m3;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7186a;

    public /* synthetic */ c0(RecyclerView recyclerView) {
        this.f7186a = recyclerView;
    }

    public final void a(a aVar) {
        int i10 = aVar.f7146a;
        RecyclerView recyclerView = this.f7186a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        recyclerView.E.X(aVar.f7147b, aVar.f7149d);
                        return;
                    }
                    return;
                }
                recyclerView.E.Z(aVar.f7147b, aVar.f7149d);
                return;
            }
            recyclerView.E.Y(aVar.f7147b, aVar.f7149d);
            return;
        }
        recyclerView.E.V(aVar.f7147b, aVar.f7149d);
    }

    public final a1 b(int i10) {
        RecyclerView recyclerView = this.f7186a;
        int h10 = recyclerView.f1238f.h();
        int i11 = 0;
        a1 a1Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            a1 L = RecyclerView.L(recyclerView.f1238f.g(i11));
            if (L != null && !L.j() && L.f7155c == i10) {
                if (recyclerView.f1238f.j(L.f7153a)) {
                    a1Var = L;
                } else {
                    a1Var = L;
                    break;
                }
            }
            i11++;
        }
        if (a1Var == null) {
            return null;
        }
        if (recyclerView.f1238f.j(a1Var.f7153a)) {
            if (RecyclerView.R0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
        return a1Var;
    }

    public final int c() {
        return this.f7186a.getChildCount();
    }

    public final void d(Object obj, int i10, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f7186a;
        int h10 = recyclerView.f1238f.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f1238f.g(i15);
            a1 L = RecyclerView.L(g10);
            if (L != null && !L.p() && (i13 = L.f7155c) >= i10 && i13 < i14) {
                L.b(2);
                L.a(obj);
                ((l0) g10.getLayoutParams()).f7296c = true;
            }
        }
        a3.h hVar = recyclerView.f1232c;
        ArrayList arrayList = (ArrayList) hVar.f68e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a1 a1Var = (a1) arrayList.get(size);
                if (a1Var != null && (i12 = a1Var.f7155c) >= i10 && i12 < i14) {
                    a1Var.b(2);
                    hVar.h(size);
                }
            } else {
                recyclerView.B0 = true;
                return;
            }
        }
    }

    public final void e(int i10, int i11) {
        RecyclerView recyclerView = this.f7186a;
        int h10 = recyclerView.f1238f.h();
        for (int i12 = 0; i12 < h10; i12++) {
            a1 L = RecyclerView.L(recyclerView.f1238f.g(i12));
            if (L != null && !L.p() && L.f7155c >= i10) {
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + L + " now at position " + (L.f7155c + i11));
                }
                L.m(i11, false);
                recyclerView.f1258x0.f7411f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1232c.f68e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            a1 a1Var = (a1) arrayList.get(i13);
            if (a1Var != null && a1Var.f7155c >= i10) {
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + a1Var + " now at position " + (a1Var.f7155c + i11));
                }
                a1Var.m(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0 = true;
    }

    public final void f(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RecyclerView recyclerView = this.f7186a;
        int h10 = recyclerView.f1238f.h();
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        boolean z9 = false;
        for (int i20 = 0; i20 < h10; i20++) {
            a1 L = RecyclerView.L(recyclerView.f1238f.g(i20));
            if (L != null && (i19 = L.f7155c) >= i13 && i19 <= i12) {
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + L);
                }
                if (L.f7155c == i10) {
                    L.m(i11 - i10, false);
                } else {
                    L.m(i14, false);
                }
                recyclerView.f1258x0.f7411f = true;
            }
        }
        a3.h hVar = recyclerView.f1232c;
        hVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
            i17 = -1;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = 1;
        }
        ArrayList arrayList = (ArrayList) hVar.f68e;
        int size = arrayList.size();
        int i21 = 0;
        while (i21 < size) {
            a1 a1Var = (a1) arrayList.get(i21);
            if (a1Var != null && (i18 = a1Var.f7155c) >= i16 && i18 <= i15) {
                if (i18 == i10) {
                    a1Var.m(i11 - i10, z9);
                } else {
                    a1Var.m(i17, z9);
                }
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + a1Var);
                }
            }
            i21++;
            z9 = false;
        }
        recyclerView.requestLayout();
        recyclerView.A0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(m3.a1 r9, z1.h r10, z1.h r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f7186a
            r0.getClass()
            r1 = 0
            r9.o(r1)
            m3.h0 r1 = r0.f1239f0
            r2 = r1
            m3.j r2 = (m3.j) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.f11924a
            int r6 = r11.f11924a
            if (r4 != r6) goto L1f
            int r1 = r10.f11925b
            int r3 = r11.f11925b
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.f11925b
            int r7 = r11.f11925b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.l(r9)
            android.view.View r10 = r9.f7153a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f7257i
            r10.add(r9)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.U()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.c0.g(m3.a1, z1.h, z1.h):void");
    }

    public final void h(a1 a1Var, z1.h hVar, z1.h hVar2) {
        int i10;
        int i11;
        boolean z9;
        RecyclerView recyclerView = this.f7186a;
        recyclerView.f1232c.m(a1Var);
        recyclerView.h(a1Var);
        a1Var.o(false);
        j jVar = (j) recyclerView.f1239f0;
        jVar.getClass();
        int i12 = hVar.f11924a;
        int i13 = hVar.f11925b;
        View view = a1Var.f7153a;
        if (hVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = hVar2.f11924a;
        }
        int i14 = i10;
        if (hVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = hVar2.f11925b;
        }
        int i15 = i11;
        if (!a1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z9 = jVar.g(a1Var, i12, i13, i14, i15);
        } else {
            jVar.l(a1Var);
            jVar.f7256h.add(a1Var);
            z9 = true;
        }
        if (z9) {
            recyclerView.U();
        }
    }

    public final void i(int i10) {
        RecyclerView recyclerView = this.f7186a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.L(childAt);
            d0 d0Var = recyclerView.D;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
