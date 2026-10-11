package k6;

import a3.g;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.d;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f6478g;

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f6478g = sideSheetBehavior;
    }

    @Override // r6.h0
    public final int Z(View view) {
        return this.f6478g.f2787m;
    }

    @Override // r6.h0
    public final boolean b1(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f6478g;
        if (sideSheetBehavior.f2782h == 1 || (weakReference = sideSheetBehavior.o) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // r6.h0
    public final void q0(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f6478g;
            if (sideSheetBehavior.f2781g) {
                sideSheetBehavior.r(1);
            }
        }
    }

    @Override // r6.h0
    public final void r0(View view, int i10, int i11) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f6478g;
        WeakReference weakReference = sideSheetBehavior.f2789p;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            d dVar = sideSheetBehavior.f2775a;
            int left = view.getLeft();
            view.getRight();
            int i12 = ((SideSheetBehavior) dVar.f6453b).f2787m;
            if (left <= i12) {
                marginLayoutParams.rightMargin = i12 - left;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f2793t;
        if (!linkedHashSet.isEmpty()) {
            d dVar2 = sideSheetBehavior.f2775a;
            dVar2.e();
            dVar2.d();
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                g.z(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r5 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (java.lang.Math.abs(r8 - r1.d()) < java.lang.Math.abs(r8 - r1.e())) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // r6.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r6.f6478g
            k3.d r1 = r0.f2775a
            r1.getClass()
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r4 = 1
            if (r3 >= 0) goto Lf
            goto L98
        Lf:
            int r3 = r7.getRight()
            float r3 = (float) r3
            java.lang.Object r5 = r1.f6453b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            float r5 = r5.f2785k
            float r5 = r5 * r8
            float r5 = r5 + r3
            float r3 = java.lang.Math.abs(r5)
            java.lang.Object r5 = r1.f6453b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r5 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 0
            if (r3 <= 0) goto L30
            r3 = r4
            goto L31
        L30:
            r3 = r5
        L31:
            if (r3 == 0) goto L6c
            float r8 = java.lang.Math.abs(r8)
            float r2 = java.lang.Math.abs(r9)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L41
            r8 = r4
            goto L42
        L41:
            r8 = r5
        L42:
            if (r8 == 0) goto L54
            java.lang.Object r8 = r1.f6453b
            com.google.android.material.sidesheet.SideSheetBehavior r8 = (com.google.android.material.sidesheet.SideSheetBehavior) r8
            r8.getClass()
            r8 = 500(0x1f4, float:7.0E-43)
            float r8 = (float) r8
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 <= 0) goto L54
            r8 = r4
            goto L55
        L54:
            r8 = r5
        L55:
            if (r8 != 0) goto L9a
            int r8 = r7.getLeft()
            int r9 = r1.e()
            int r1 = r1.d()
            int r9 = r9 - r1
            int r9 = r9 / 2
            if (r8 <= r9) goto L69
            r5 = r4
        L69:
            if (r5 == 0) goto L98
            goto L9a
        L6c:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L7f
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L7d
            r5 = r4
        L7d:
            if (r5 != 0) goto L9a
        L7f:
            int r8 = r7.getLeft()
            int r9 = r1.d()
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r1 = r1.e()
            int r8 = r8 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L9a
        L98:
            r8 = 3
            goto L9b
        L9a:
            r8 = 5
        L9b:
            r0.s(r7, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.s0(android.view.View, float, float):void");
    }

    @Override // r6.h0
    public final int y(View view, int i10) {
        SideSheetBehavior sideSheetBehavior = this.f6478g;
        return c.k(i10, sideSheetBehavior.f2775a.d(), sideSheetBehavior.f2787m);
    }

    @Override // r6.h0
    public final int z(View view, int i10) {
        return view.getTop();
    }
}
