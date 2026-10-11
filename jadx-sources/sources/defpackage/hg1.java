package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hg1 extends cs0 {
    public sb2 B;
    public eg1 C;
    public final View D;
    public final dg1 E;
    public boolean F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hg1(defpackage.sb2 r6, defpackage.eg1 r7, android.view.View r8, defpackage.ia3 r9, defpackage.ud1 r10, java.util.UUID r11) {
        /*
            r5 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r8.getContext()
            boolean r2 = r7.e
            if (r2 == 0) goto Le
            r2 = 2131951930(0x7f13013a, float:1.9540288E38)
            goto L11
        Le:
            r2 = 2131951965(0x7f13015d, float:1.954036E38)
        L11:
            r0.<init>(r1, r2)
            r1 = 0
            r5.<init>(r0, r1)
            r5.B = r6
            r5.C = r7
            r5.D = r8
            android.view.Window r6 = r5.getWindow()
            r7 = 0
            if (r6 == 0) goto Lf3
            eg1 r0 = r5.C
            android.view.Window r2 = r5.getWindow()
            if (r2 == 0) goto L38
            android.view.WindowManager$LayoutParams r3 = r2.getAttributes()
            byte r0 = r0.g
            r3.type = r0
            r2.setAttributes(r3)
        L38:
            r0 = 1
            r6.requestFeature(r0)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r2)
            eg1 r2 = r5.C
            boolean r2 = r2.e
            defpackage.yu5.k(r6, r2)
            r2 = 17
            r6.setGravity(r2)
            eg1 r2 = r5.C
            boolean r2 = r2.e
            if (r2 != 0) goto L74
            r2 = 65792(0x10100, float:9.2194E-41)
            r6.addFlags(r2)
            android.view.WindowManager$LayoutParams r2 = r6.getAttributes()
            so r3 = defpackage.so.a
            r3.a(r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L71
            to r3 = defpackage.to.a
            r3.b(r2, r1)
            r3.c(r2, r1)
        L71:
            r6.setAttributes(r2)
        L74:
            dg1 r2 = new dg1
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3, r6)
            eg1 r3 = r5.C
            java.lang.String r3 = r3.f
            r5.setTitle(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dialog:"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r3 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            r2.setTag(r3, r11)
            r2.setClipChildren(r1)
            r11 = 1090519040(0x41000000, float:8.0)
            float r10 = r10.g0(r11)
            r2.setElevation(r10)
            gg1 r10 = new gg1
            r10.<init>(r1)
            r2.setOutlineProvider(r10)
            r5.E = r2
            android.view.View r6 = r6.getDecorView()
            boolean r10 = r6 instanceof android.view.ViewGroup
            if (r10 == 0) goto Lb9
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        Lb9:
            if (r7 == 0) goto Lbe
            d(r7)
        Lbe:
            r5.setContentView(r2)
            og3 r6 = defpackage.rz5.c(r8)
            r7 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            r2.setTag(r7, r6)
            ew6 r6 = defpackage.ss5.d(r8)
            r7 = 2131362528(0x7f0a02e0, float:1.834484E38)
            r2.setTag(r7, r6)
            ga5 r6 = defpackage.qs5.f(r8)
            r7 = 2131362527(0x7f0a02df, float:1.8344837E38)
            r2.setTag(r7, r6)
            sb2 r6 = r5.B
            eg1 r7 = r5.C
            r5.e(r6, r7, r9)
            wd4 r6 = r5.getOnBackPressedDispatcher()
            vb r7 = new vb
            r7.<init>(r5, r0)
            defpackage.zz.i(r6, r5, r7)
            return
        Lf3:
            java.lang.String r5 = "Dialog has no window"
            defpackage.ze0.m(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg1.<init>(sb2, eg1, android.view.View, ia3, ud1, java.util.UUID):void");
    }

    public static final void d(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof dg1)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    d(viewGroup2);
                }
            }
        }
    }

    public final void e(sb2 sb2Var, eg1 eg1Var, ia3 ia3Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.B = sb2Var;
        this.C = eg1Var;
        ef5 ef5Var = eg1Var.c;
        boolean b = ae.b(this.D);
        int ordinal = ef5Var.ordinal();
        int i4 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b = false;
                } else {
                    ze0.l();
                    return;
                }
            } else {
                b = true;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (b) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int ordinal2 = ia3Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = 1;
            } else {
                ze0.l();
                return;
            }
        } else {
            i2 = 0;
        }
        dg1 dg1Var = this.E;
        dg1Var.setLayoutDirection(i2);
        boolean z2 = eg1Var.e;
        boolean z3 = eg1Var.d;
        Window window2 = dg1Var.G;
        if (dg1Var.K && z3 == dg1Var.I && z2 == dg1Var.J) {
            z = false;
        } else {
            z = true;
        }
        dg1Var.I = z3;
        dg1Var.J = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !dg1Var.K) {
                window2.setLayout(i3, -2);
                dg1Var.K = true;
            }
        }
        setCanceledOnTouchOutside(eg1Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i4 = 16;
                } else {
                    i4 = 48;
                }
            }
            window3.setSoftInputMode(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.C.a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.B.invoke();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            eg1 r1 = r9.C
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            dg1 r1 = r9.E
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.io3.h0(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.io3.h0(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.F = r3
            return r0
        L77:
            boolean r10 = r9.F
            if (r10 == 0) goto L90
            sb2 r10 = r9.B
            r10.invoke()
            r9.F = r3
            return r4
        L83:
            r9.F = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.F = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
