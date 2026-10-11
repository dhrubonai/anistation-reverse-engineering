package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class m implements j.c0 {
    public Drawable A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public h J;
    public h K;
    public j L;
    public i M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f563a;

    /* renamed from: b, reason: collision with root package name */
    public Context f564b;

    /* renamed from: c, reason: collision with root package name */
    public j.o f565c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f566d;

    /* renamed from: e, reason: collision with root package name */
    public j.b0 f567e;

    /* renamed from: y, reason: collision with root package name */
    public j.e0 f570y;

    /* renamed from: z, reason: collision with root package name */
    public l f571z;

    /* renamed from: f, reason: collision with root package name */
    public final int f568f = R.layout.abc_action_menu_layout;

    /* renamed from: x, reason: collision with root package name */
    public final int f569x = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final f.p0 N = new f.p0(this, 4);

    public m(Context context) {
        this.f563a = context;
        this.f566d = LayoutInflater.from(context);
    }

    @Override // j.c0
    public final void a(j.o oVar, boolean z9) {
        d();
        h hVar = this.K;
        if (hVar != null && hVar.b()) {
            hVar.f5496j.dismiss();
        }
        j.b0 b0Var = this.f567e;
        if (b0Var != null) {
            b0Var.a(oVar, z9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.d0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(j.q qVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = qVar.getActionView();
        int i10 = 0;
        if (actionView == null || qVar.e()) {
            if (view instanceof j.d0) {
                actionMenuItemView = (j.d0) view;
            } else {
                actionMenuItemView = (j.d0) this.f566d.inflate(this.f569x, viewGroup, false);
            }
            actionMenuItemView.c(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f570y);
            if (this.M == null) {
                this.M = new i(this);
            }
            actionMenuItemView2.setPopupCallback(this.M);
            actionView = actionMenuItemView;
        }
        if (qVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // j.c0
    public final /* bridge */ /* synthetic */ boolean c(j.q qVar) {
        return false;
    }

    public final boolean d() {
        Object obj;
        j jVar = this.L;
        if (jVar != null && (obj = this.f570y) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.L = null;
            return true;
        }
        h hVar = this.J;
        if (hVar != null) {
            if (hVar.b()) {
                hVar.f5496j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.c0
    public final void e() {
        int i10;
        boolean z9;
        j.q qVar;
        ViewGroup viewGroup = (ViewGroup) this.f570y;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            j.o oVar = this.f565c;
            if (oVar != null) {
                oVar.i();
                ArrayList l10 = this.f565c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    j.q qVar2 = (j.q) l10.get(i11);
                    if (qVar2.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof j.d0) {
                            qVar = ((j.d0) childAt).getItemData();
                        } else {
                            qVar = null;
                        }
                        View b10 = b(qVar2, childAt, viewGroup);
                        if (qVar2 != qVar) {
                            b10.setPressed(false);
                            b10.jumpDrawablesToCurrentState();
                        }
                        if (b10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b10);
                            }
                            ((ViewGroup) this.f570y).addView(b10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f571z) {
                    z9 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z9 = true;
                }
                if (!z9) {
                    i10++;
                }
            }
        }
        ((View) this.f570y).requestLayout();
        j.o oVar2 = this.f565c;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f5554i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                j.r rVar = ((j.q) arrayList2.get(i12)).A;
            }
        }
        j.o oVar3 = this.f565c;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f5555j;
        }
        if (this.C && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((j.q) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f571z == null) {
                this.f571z = new l(this, this.f563a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f571z.getParent();
            if (viewGroup3 != this.f570y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f571z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f570y;
                l lVar = this.f571z;
                actionMenuView.getClass();
                o oVar4 = new o();
                ((LinearLayout.LayoutParams) oVar4).gravity = 16;
                oVar4.f582a = true;
                actionMenuView.addView(lVar, oVar4);
            }
        } else {
            l lVar2 = this.f571z;
            if (lVar2 != null) {
                Object parent = lVar2.getParent();
                Object obj = this.f570y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f571z);
                }
            }
        }
        ((ActionMenuView) this.f570y).setOverflowReserved(this.C);
    }

    public final boolean f() {
        h hVar = this.J;
        if (hVar != null && hVar.b()) {
            return true;
        }
        return false;
    }

    @Override // j.c0
    public final void g(Context context, j.o oVar) {
        this.f564b = context;
        LayoutInflater.from(context);
        this.f565c = oVar;
        Resources resources = context.getResources();
        if (!this.D) {
            this.C = true;
        }
        int i10 = 2;
        this.E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.G = i10;
        int i13 = this.E;
        if (this.C) {
            if (this.f571z == null) {
                l lVar = new l(this, this.f563a);
                this.f571z = lVar;
                if (this.B) {
                    lVar.setImageDrawable(this.A);
                    this.A = null;
                    this.B = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f571z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f571z.getMeasuredWidth();
        } else {
            this.f571z = null;
        }
        this.F = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // j.c0
    public final boolean h() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        j.o oVar = this.f565c;
        if (oVar != null) {
            arrayList = oVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = this.G;
        int i13 = this.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f570y;
        int i14 = 0;
        boolean z16 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z9 = true;
            if (i14 >= i10) {
                break;
            }
            j.q qVar = (j.q) arrayList.get(i14);
            int i17 = qVar.f5595y;
            if ((i17 & 2) == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i16++;
                } else {
                    z16 = true;
                }
            }
            if (this.H && qVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.C && (z16 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.I;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            j.q qVar2 = (j.q) arrayList.get(i19);
            int i21 = qVar2.f5595y;
            if ((i21 & 2) == i11) {
                z10 = z9;
            } else {
                z10 = false;
            }
            int i22 = qVar2.f5573b;
            if (z10) {
                View b10 = b(qVar2, null, viewGroup);
                b10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z9);
                }
                qVar2.g(z9);
            } else {
                if ((i21 & 1) == z9) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11) {
                    boolean z17 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z17) && i13 > 0) {
                        z12 = z9;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View b11 = b(qVar2, null, viewGroup);
                        b11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = b11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z12 &= z13;
                    }
                    if (z12 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z17) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i19; i23++) {
                            j.q qVar3 = (j.q) arrayList.get(i23);
                            if (qVar3.f5573b == i22) {
                                if (qVar3.f()) {
                                    i18++;
                                }
                                qVar3.g(false);
                            }
                        }
                    }
                    if (z12) {
                        i18--;
                    }
                    qVar2.g(z12);
                } else {
                    qVar2.g(false);
                    i19++;
                    i11 = 2;
                    z9 = true;
                }
            }
            i19++;
            i11 = 2;
            z9 = true;
        }
        return z9;
    }

    @Override // j.c0
    public final /* bridge */ /* synthetic */ boolean i(j.q qVar) {
        return false;
    }

    @Override // j.c0
    public final void j(j.b0 b0Var) {
        this.f567e = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // j.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(j.i0 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            j.o r2 = r0.f5530z
            j.o r3 = r8.f565c
            if (r2 == r3) goto L13
            r0 = r2
            j.i0 r0 = (j.i0) r0
            goto L9
        L13:
            j.e0 r2 = r8.f570y
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof j.d0
            if (r6 == 0) goto L35
            r6 = r5
            j.d0 r6 = (j.d0) r6
            j.q r6 = r6.getItemData()
            j.q r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            j.q r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = r1
        L5f:
            androidx.appcompat.widget.h r2 = new androidx.appcompat.widget.h
            android.content.Context r4 = r8.f564b
            r2.<init>(r8, r4, r9, r5)
            r8.K = r2
            r2.f5494h = r0
            j.x r2 = r2.f5496j
            if (r2 == 0) goto L71
            r2.o(r0)
        L71:
            androidx.appcompat.widget.h r0 = r8.K
            boolean r2 = r0.b()
            if (r2 == 0) goto L7b
        L79:
            r1 = r3
            goto L84
        L7b:
            android.view.View r2 = r0.f5492f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.d(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            j.b0 r0 = r8.f567e
            if (r0 == 0) goto L8d
            r0.m(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m.k(j.i0):boolean");
    }

    public final boolean l() {
        j.o oVar;
        if (this.C && !f() && (oVar = this.f565c) != null && this.f570y != null && this.L == null) {
            oVar.i();
            if (!oVar.f5555j.isEmpty()) {
                j jVar = new j(0, this, new h(this, this.f564b, this.f565c, this.f571z));
                this.L = jVar;
                ((View) this.f570y).post(jVar);
                return true;
            }
        }
        return false;
    }
}
