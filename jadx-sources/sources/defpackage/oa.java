package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.anistation.android.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oa extends ViewGroup implements kh4, g75, m91, vg4, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, o72 {
    public static Class f1;
    public static Method g1;
    public static Method h1;
    public static final f44 i1 = new f44();
    public static c7 j1;
    public static Method k1;
    public cy2 A;
    public ub2 A0;
    public ug3 B;
    public uc6 B0;
    public vg3 C;
    public sc6 C0;
    public fi1 D;
    public final AtomicReference D0;
    public m55 E;
    public id1 E0;
    public final bs F;
    public final w44 F0;
    public final ea G;
    public final ti4 G0;
    public final ti4 H;
    public tz2 H0;
    public final View I;
    public final zz3 I0;
    public final r72 J;
    public of J0;
    public l11 K;
    public MotionEvent K0;
    public final bc L;
    public long L0;
    public final ti4 M;
    public final l33 M0;
    public final he1 N;
    public final f44 N0;
    public final b03 O;
    public float O0;
    public final za3 P;
    public float P0;
    public final s34 Q;
    public float Q0;
    public final p05 R;
    public float R0;
    public final xh5 S;
    public final la S0;
    public final va T;
    public final ea T0;
    public jb U;
    public boolean U0;
    public final oc V;
    public ic2 V0;
    public final ty W;
    public final i90 W0;
    public final z9 X0;
    public final z9 Y0;
    public boolean Z0;
    public final f44 a0;
    public boolean a1;
    public f44 b0;
    public boolean b1;
    public boolean c0;
    public final jc5 c1;
    public boolean d0;
    public View d1;
    public final t04 e0;
    public final ka e1;
    public final qb0 f0;
    public final ti4 g0;
    public final he1 h0;
    public final q9 i0;
    public final r9 j0;
    public boolean k0;
    public final mh4 l0;
    public boolean m0;
    public og n0;
    public rx0 o0;
    public boolean p0;
    public final e22 q0;
    public long r0;
    public final int[] s0;
    public final float[] t0;
    public final Matrix u0;
    public final float[] v0;
    public final float[] w0;
    public final ti4 x;
    public long x0;
    public long y;
    public boolean y0;
    public final boolean z;
    public long z0;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [xz3, rt1] */
    public oa(Context context, yt0 yt0Var) {
        super(context);
        ia3 ia3Var;
        this.x = xt5.g(yt0Var);
        this.y = 9205357640488583168L;
        byte b = 1;
        this.z = true;
        this.E = ba2.a;
        this.F = new bs();
        byte b2 = 0;
        this.G = new ea(this, b2);
        this.H = new ti4(bb4.f(context), pk2.c0);
        this.J = new r72(this, this);
        this.K = yt0Var.c().k();
        this.L = new bc();
        this.M = xt5.g(Boolean.FALSE);
        byte b3 = 2;
        this.N = ut5.b(new z9(this, b3));
        this.O = new b03();
        za3 za3Var = new za3(3);
        za3Var.d0(h75.c);
        za3Var.a0(getDensity());
        za3Var.f0(getViewConfiguration());
        za3Var.e0(new ma(this).w(((r72) getFocusOwner()).e).w(m159getDragAndDropManager().c));
        this.P = za3Var;
        s34 s34Var = b13.a;
        this.Q = new s34();
        this.R = new p05(getLayoutNodes(), this);
        this.S = new xh5(getRoot(), new xz3(), getLayoutNodes());
        va vaVar = new va(this);
        this.T = vaVar;
        this.U = new jb(this, new ia(0, this, db.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.V = new oc(this);
        this.W = new ty();
        this.a0 = new f44();
        this.e0 = new t04();
        za3 root = getRoot();
        ?? obj = new Object();
        obj.y = root;
        obj.z = new fl2((kz2) root.c0.A);
        obj.A = new fq3((byte) 5);
        obj.B = new il2();
        this.f0 = obj;
        this.g0 = xt5.g(new Configuration(context.getResources().getConfiguration()));
        this.h0 = ut5.b(new z9(this, (byte) 3));
        this.i0 = new q9(this, getAutofillTree());
        this.j0 = new r9(new y23((Object) context, (byte) 10), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.l0 = new mh4(new y9(this, b));
        this.q0 = new e22(getRoot());
        this.r0 = 9223372034707292159L;
        this.s0 = new int[]{0, 0};
        this.t0 = jo3.a();
        this.u0 = new Matrix();
        this.v0 = jo3.a();
        this.w0 = jo3.a();
        this.x0 = -1L;
        this.z0 = 9187343241974906880L;
        this.D0 = new AtomicReference(null);
        this.F0 = yt0Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = m72.a;
        ia3 ia3Var2 = ia3.x;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                ia3Var = null;
            } else {
                ia3Var = ia3.y;
            }
        } else {
            ia3Var = ia3Var2;
        }
        this.G0 = xt5.g(ia3Var != null ? ia3Var : ia3Var2);
        this.I0 = new zz3(this);
        this.M0 = new l33((byte) 24);
        this.N0 = new f44();
        this.O0 = Float.NaN;
        this.P0 = Float.NaN;
        this.Q0 = Float.NaN;
        this.R0 = Float.NaN;
        this.S0 = new la(this, b2);
        this.T0 = new ea(this, b);
        this.V0 = new fa(this, b2);
        this.W0 = new i90(context, new y9(this, b3));
        this.X0 = new z9(this, (byte) 4);
        this.Y0 = new z9(this, b2);
        addOnAttachStateChangeListener(this.U);
        setWillNotDraw(false);
        setFocusable(true);
        cb.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        pv6.a(this, vaVar);
        setOnDragListener(m159getDragAndDropManager());
        wa.a.a(this);
        if (k()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.I = view;
            addView(view, -1);
        }
        this.c1 = Build.VERSION.SDK_INT >= 31 ? new jc5() : null;
        this.e1 = new ka(this);
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof oa) {
                ((oa) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
        }
    }

    public static long d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                p65.l();
                return 0L;
            }
            return 2147483647L;
        }
        return size;
    }

    public static final boolean f(oa oaVar, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final yg0 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.N.getValue()).booleanValue();
    }

    private final uc6 getLegacyTextInputServiceAndroid() {
        uc6 uc6Var = this.B0;
        if (uc6Var == null) {
            uc6 uc6Var2 = new uc6(getView(), this, new ba(this, (byte) 0));
            this.B0 = uc6Var2;
            return uc6Var2;
        }
        return uc6Var;
    }

    private final yt0 get_composeViewContext() {
        return (yt0) this.x.getValue();
    }

    public static void i(za3 za3Var) {
        za3Var.E();
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            i((za3) objArr[i2]);
        }
    }

    public static boolean k() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        return false;
    }

    public static boolean l(MotionEvent motionEvent) {
        boolean z;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) < 2139095040 && u04.a.a(motionEvent, i)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.M.setValue(Boolean.valueOf(z));
    }

    private void setDensity(ud1 ud1Var) {
        this.H.setValue(ud1Var);
    }

    private void setLayoutDirection(ia3 ia3Var) {
        this.G0.setValue(ia3Var);
    }

    private final void set_composeViewContext(yt0 yt0Var) {
        this.x.setValue(yt0Var);
    }

    public final void A(MotionEvent motionEvent) {
        this.x0 = AnimationUtils.currentAnimationTimeMillis();
        Matrix matrix = this.u0;
        int[] iArr = this.s0;
        mf0 mf0Var = mf0.a;
        float[] fArr = this.v0;
        mf0Var.a(this, fArr, matrix, iArr);
        tl7.w(fArr, this.w0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = jo3.b((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.z0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(sb2 sb2Var) {
        bs bsVar = this.F;
        boolean isEmpty = bsVar.isEmpty();
        bsVar.addLast(sb2Var);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.G);
            } else {
                ze0.k("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void D(za3 za3Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (za3Var != null) {
                while (za3Var != null && za3Var.r() == xa3.x) {
                    if (!this.p0) {
                        za3 v = za3Var.v();
                        if (v == null) {
                            break;
                        }
                        long j = ((kz2) v.c0.A).A;
                        if (rx0.f(j) && rx0.e(j)) {
                            break;
                        }
                    }
                    za3Var = za3Var.v();
                }
                if (za3Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long E(long j) {
        z();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.z0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.z0 & 4294967295L));
        return jo3.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.w0);
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.Z0) {
            this.Z0 = false;
            lf3 lf3Var = getComposeViewContext().t;
            s47.a.setValue(new br4(motionEvent.getMetaState()));
        }
        t04 t04Var = this.e0;
        l33 c = t04Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        qb0 qb0Var = this.f0;
        if (c != null) {
            ArrayList arrayList = (ArrayList) c.y;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = arrayList.get(size);
                    if (((wq4) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            obj = null;
            wq4 wq4Var = (wq4) obj;
            if (wq4Var != null) {
                this.y = wq4Var.d;
            }
            int n = qb0Var.n(c, this, m(motionEvent));
            c.z = null;
            if ((actionMasked != 0 && actionMasked != 5) || (n & 1) != 0) {
                return n;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            t04Var.c.delete(pointerId);
            t04Var.b.delete(pointerId);
            return n;
        }
        if (!qb0Var.x) {
            ((sl3) ((fq3) qb0Var.A).y).a();
            ((fl2) qb0Var.z).c();
        }
        return 0;
    }

    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i4 <= i8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f = pointerCoords.x;
            float f2 = pointerCoords.y;
            long p = p((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (p >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (p & 4294967295L));
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        l33 c = this.e0.c(obtain, this);
        c.getClass();
        this.f0.n(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.ic2 r8, defpackage.xz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.na
            if (r0 == 0) goto L13
            r0 = r9
            na r0 = (defpackage.na) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            na r0 = new na
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return
        L27:
            defpackage.m37.N(r9)
            goto L4a
        L2b:
            defpackage.m37.N(r9)
            r9 = r2
            y9 r2 = new y9
            r1 = 0
            r2.<init>(r7, r1)
            r0.z = r9
            j10 r1 = new j10
            r5 = 0
            r6 = 7
            java.util.concurrent.atomic.AtomicReference r3 = r7.D0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.db.K(r1, r0)
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L4a
            return
        L4a:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.H(ic2, xz0):void");
    }

    public final void I(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (!a34.i(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(bb4.f(getContext()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.J():void");
    }

    public final void K(float f) {
        if (k()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.O0) || f > this.O0) {
                    this.O0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.P0) || f < this.P0) {
                    this.P0 = f;
                }
            }
        }
    }

    @Override // defpackage.o72
    public final void a(h82 h82Var, h82 h82Var2) {
        boolean z;
        kf kfVar;
        boolean z2;
        kf kfVar2;
        boolean z3;
        if (h82Var != null) {
            h82 h82Var3 = h82Var;
            if (!h82Var3.x.K) {
                ez2.b("visitAncestors called on an unattached node");
            }
            xz3 xz3Var = h82Var3.x;
            za3 O = wc7.O(h82Var);
            q44 q44Var = null;
            ArrayList arrayList = null;
            while (O != null) {
                if ((((xz3) O.c0.D).A & 2097152) != 0) {
                    while (xz3Var != null) {
                        if ((xz3Var.z & 2097152) != 0) {
                            xz3 xz3Var2 = xz3Var;
                            z44 z44Var = null;
                            while (xz3Var2 != null) {
                                if (xz3Var2 instanceof ly2) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(xz3Var2);
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3 && (xz3Var2.z & 2097152) != 0 && (xz3Var2 instanceof zc1)) {
                                    int i = 0;
                                    for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                        if ((xz3Var3.z & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                xz3Var2 = xz3Var3;
                                            } else {
                                                if (z44Var == null) {
                                                    z44Var = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var2 != null) {
                                                    z44Var.b(xz3Var2);
                                                    xz3Var2 = null;
                                                }
                                                z44Var.b(xz3Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                xz3Var2 = wc7.J(z44Var);
                            }
                        }
                        xz3Var = xz3Var.B;
                    }
                }
                O = O.v();
                if (O != null && (kfVar2 = O.c0) != null) {
                    xz3Var = (z66) kfVar2.C;
                } else {
                    xz3Var = null;
                }
            }
            if (arrayList != null) {
                if (h82Var2 != null) {
                    if (!h82Var2.x.K) {
                        ez2.b("visitAncestors called on an unattached node");
                    }
                    xz3 xz3Var4 = h82Var2.x;
                    za3 O2 = wc7.O(h82Var2);
                    q44 q44Var2 = null;
                    while (O2 != null) {
                        if ((((xz3) O2.c0.D).A & 2097152) != 0) {
                            while (xz3Var4 != null) {
                                if ((xz3Var4.z & 2097152) != 0) {
                                    xz3 xz3Var5 = xz3Var4;
                                    z44 z44Var2 = null;
                                    while (xz3Var5 != null) {
                                        if (xz3Var5 instanceof ly2) {
                                            if (q44Var2 == null) {
                                                q44 q44Var3 = db5.a;
                                                q44Var2 = new q44();
                                            }
                                            q44Var2.a(xz3Var5);
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2 && (xz3Var5.z & 2097152) != 0 && (xz3Var5 instanceof zc1)) {
                                            int i2 = 0;
                                            for (xz3 xz3Var6 = ((zc1) xz3Var5).M; xz3Var6 != null; xz3Var6 = xz3Var6.C) {
                                                if ((xz3Var6.z & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        xz3Var5 = xz3Var6;
                                                    } else {
                                                        if (z44Var2 == null) {
                                                            z44Var2 = new z44(new xz3[16], 0);
                                                        }
                                                        if (xz3Var5 != null) {
                                                            z44Var2.b(xz3Var5);
                                                            xz3Var5 = null;
                                                        }
                                                        z44Var2.b(xz3Var6);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        xz3Var5 = wc7.J(z44Var2);
                                    }
                                }
                                xz3Var4 = xz3Var4.B;
                            }
                        }
                        O2 = O2.v();
                        if (O2 != null && (kfVar = O2.c0) != null) {
                            xz3Var4 = (z66) kfVar.C;
                        } else {
                            xz3Var4 = null;
                        }
                    }
                    q44Var = q44Var2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ly2 ly2Var = (ly2) arrayList.get(i3);
                    if (q44Var != null) {
                        z = q44Var.c(ly2Var);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        ly2Var.l0();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        h82 h82Var = ((r72) getFocusOwner()).c;
        if (h82Var.K) {
            if (!h82Var.x.K) {
                ez2.b("visitSubtreeIf called on an unattached node");
            }
            z44 z44Var = new z44(new xz3[16], 0);
            xz3 xz3Var = h82Var.x;
            xz3 xz3Var2 = xz3Var.C;
            if (xz3Var2 == null) {
                wc7.f(z44Var, xz3Var);
            } else {
                z44Var.b(xz3Var2);
            }
            while (true) {
                int i3 = z44Var.z;
                if (i3 != 0) {
                    xz3 xz3Var3 = (xz3) z44Var.m(i3 - 1);
                    if ((xz3Var3.A & 1024) != 0) {
                        for (xz3 xz3Var4 = xz3Var3; xz3Var4 != null && xz3Var4.K; xz3Var4 = xz3Var4.C) {
                            if ((xz3Var4.z & 1024) != 0) {
                                xz3 xz3Var5 = xz3Var4;
                                z44 z44Var2 = null;
                                while (xz3Var5 != null) {
                                    if (xz3Var5 instanceof h82) {
                                        h82 h82Var2 = (h82) xz3Var5;
                                        if (h82Var2.K && h82Var2.c1().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            h82 h82Var3 = ((r72) getFocusOwner()).c;
                                            if (h82Var3.K) {
                                                if (!h82Var3.x.K) {
                                                    ez2.b("visitSubtreeIf called on an unattached node");
                                                }
                                                z44 z44Var3 = new z44(new xz3[16], 0);
                                                xz3 xz3Var6 = h82Var3.x;
                                                xz3 xz3Var7 = xz3Var6.C;
                                                if (xz3Var7 == null) {
                                                    wc7.f(z44Var3, xz3Var6);
                                                } else {
                                                    z44Var3.b(xz3Var7);
                                                }
                                                while (true) {
                                                    int i4 = z44Var3.z;
                                                    if (i4 == 0) {
                                                        break;
                                                    }
                                                    xz3 xz3Var8 = (xz3) z44Var3.m(i4 - 1);
                                                    if ((xz3Var8.A & 1024) != 0) {
                                                        for (xz3 xz3Var9 = xz3Var8; xz3Var9 != null && xz3Var9.K; xz3Var9 = xz3Var9.C) {
                                                            if ((xz3Var9.z & 1024) != 0) {
                                                                xz3 xz3Var10 = xz3Var9;
                                                                z44 z44Var4 = null;
                                                                while (xz3Var10 != null) {
                                                                    if (xz3Var10 instanceof h82) {
                                                                        h82 h82Var4 = (h82) xz3Var10;
                                                                        if (h82Var4.K) {
                                                                            u72 c1 = h82Var4.c1();
                                                                            if (h82Var4.K && !h82Var4.L && c1.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((xz3Var10.z & 1024) != 0 && (xz3Var10 instanceof zc1)) {
                                                                        int i5 = 0;
                                                                        for (xz3 xz3Var11 = ((zc1) xz3Var10).M; xz3Var11 != null; xz3Var11 = xz3Var11.C) {
                                                                            if ((xz3Var11.z & 1024) != 0) {
                                                                                i5++;
                                                                                if (i5 == 1) {
                                                                                    xz3Var10 = xz3Var11;
                                                                                } else {
                                                                                    if (z44Var4 == null) {
                                                                                        z44Var4 = new z44(new xz3[16], 0);
                                                                                    }
                                                                                    if (xz3Var10 != null) {
                                                                                        z44Var4.b(xz3Var10);
                                                                                        xz3Var10 = null;
                                                                                    }
                                                                                    z44Var4.b(xz3Var11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i5 == 1) {
                                                                        }
                                                                    }
                                                                    xz3Var10 = wc7.J(z44Var4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    wc7.f(z44Var3, xz3Var8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((xz3Var5.z & 1024) != 0 && (xz3Var5 instanceof zc1)) {
                                        int i6 = 0;
                                        for (xz3 xz3Var12 = ((zc1) xz3Var5).M; xz3Var12 != null; xz3Var12 = xz3Var12.C) {
                                            if ((xz3Var12.z & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    xz3Var5 = xz3Var12;
                                                } else {
                                                    if (z44Var2 == null) {
                                                        z44Var2 = new z44(new xz3[16], 0);
                                                    }
                                                    if (xz3Var5 != null) {
                                                        z44Var2.b(xz3Var5);
                                                        xz3Var5 = null;
                                                    }
                                                    z44Var2.b(xz3Var12);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    xz3Var5 = wc7.J(z44Var2);
                                }
                            }
                        }
                    }
                    wc7.f(z44Var, xz3Var3);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        ph5 x;
        ub2 ub2Var;
        ub2 ub2Var2;
        r9 m158getAutofillManager = m158getAutofillManager();
        if (m158getAutofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                za3 za3Var = (za3) m158getAutofillManager.y.c.b(keyAt);
                if (za3Var != null && (x = za3Var.x()) != null) {
                    p44 p44Var = x.x;
                    Object g = p44Var.g(oh5.g);
                    Object obj = null;
                    if (g == null) {
                        g = null;
                    }
                    o3 o3Var = (o3) g;
                    if (o3Var != null && (ub2Var2 = (ub2) o3Var.b) != null) {
                    }
                    Object g2 = p44Var.g(oh5.h);
                    if (g2 != null) {
                        obj = g2;
                    }
                    o3 o3Var2 = (o3) obj;
                    if (o3Var2 != null && (ub2Var = (ub2) o3Var2.b) != null) {
                    }
                }
            }
        }
        q9 autofill = getAutofill();
        if (autofill != null) {
            ty tyVar = autofill.b;
            if (!tyVar.a.isEmpty()) {
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                    if (autofillValue2.isText()) {
                        autofillValue2.getTextValue().toString();
                        if (tyVar.a.get(Integer.valueOf(keyAt2)) != null) {
                            ov3.d();
                            return;
                        }
                    } else if (!autofillValue2.isDate()) {
                        if (!autofillValue2.isList()) {
                            if (autofillValue2.isToggle()) {
                                throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                            }
                        } else {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                    } else {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                }
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        va vaVar = this.T;
        if (a34.i(str, vaVar.a0)) {
            int d2 = vaVar.Y.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (a34.i(str, vaVar.b0) && (d = vaVar.Z.d(i)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, d);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.T.h(i, this.y, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.T.h(i, this.y, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f44 f44Var = this.a0;
        if (!isAttachedToWindow()) {
            i(getRoot());
        }
        q(true);
        mt5.h().m();
        this.c0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            yg0 canvasHolder = getCanvasHolder();
            t9 t9Var = canvasHolder.a;
            Canvas canvas2 = t9Var.a;
            t9Var.a = canvas;
            getRoot().i(t9Var, null);
            canvasHolder.a.a = canvas2;
            if (f44Var.j()) {
                int i = f44Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((fi2) ((ih4) f44Var.g(i2))).g();
                }
            }
            int i3 = uv6.x;
            f44Var.d();
            this.c0 = false;
            Trace.endSection();
            f44 f44Var2 = this.b0;
            if (f44Var2 != null) {
                f44Var.b(f44Var2);
                f44Var2.d();
            }
            if (k()) {
                if (Float.compare(this.O0, this.Q0) != 0) {
                    float f = this.O0;
                    this.Q0 = f;
                    zo.a(this, f);
                }
                View view = this.I;
                if (view != null) {
                    if (Float.compare(this.P0, this.R0) != 0) {
                        float f2 = this.P0;
                        this.R0 = f2;
                        zo.a(view, f2);
                    }
                    if (!Float.isNaN(this.P0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.O0 = Float.NaN;
                this.P0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:648:0x0436, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L248;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [xz3] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v59 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 1985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        if (n(r25) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        r10 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            lf3 lf3Var = getComposeViewContext().t;
            s47.a.setValue(new br4(keyEvent.getMetaState()));
            if (!((r72) getFocusOwner()).e(keyEvent, new vj1((byte) 13)) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((r72) getFocusOwner()).e(keyEvent, new n(this, keyEvent, (byte) 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        kf kfVar;
        if (isFocused()) {
            r72 r72Var = (r72) getFocusOwner();
            if (r72Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                h82 y = bb4.y(r72Var.c);
                if (y != null) {
                    if (!y.x.K) {
                        ez2.b("visitAncestors called on an unattached node");
                    }
                    xz3 xz3Var = y.x;
                    za3 O = wc7.O(y);
                    while (O != null) {
                        if ((((xz3) O.c0.D).A & 131072) != 0) {
                            while (xz3Var != null) {
                                if ((xz3Var.z & 131072) != 0) {
                                    xz3 xz3Var2 = xz3Var;
                                    z44 z44Var = null;
                                    while (xz3Var2 != null) {
                                        if ((xz3Var2.z & 131072) != 0 && (xz3Var2 instanceof zc1)) {
                                            int i = 0;
                                            for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                                if ((xz3Var3.z & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        xz3Var2 = xz3Var3;
                                                    } else {
                                                        if (z44Var == null) {
                                                            z44Var = new z44(new xz3[16], 0);
                                                        }
                                                        if (xz3Var2 != null) {
                                                            z44Var.b(xz3Var2);
                                                            xz3Var2 = null;
                                                        }
                                                        z44Var.b(xz3Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        xz3Var2 = wc7.J(z44Var);
                                    }
                                }
                                xz3Var = xz3Var.B;
                            }
                        }
                        O = O.v();
                        if (O != null && (kfVar = O.c0) != null) {
                            xz3Var = (z66) kfVar.C;
                        } else {
                            xz3Var = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.b1 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.b1 = false;
            y(viewStructure);
        } catch (Throwable th) {
            this.b1 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view;
        Object hxVar;
        h82 g;
        if (this.U0) {
            ea eaVar = this.T0;
            removeCallbacks(eaVar);
            MotionEvent motionEvent2 = this.K0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.U0 = false;
            } else {
                eaVar.run();
            }
        }
        if (!l(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || n(motionEvent))) {
            int h = h(motionEvent);
            if ((h & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                Object parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null || (hxVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    hxVar = new hx(1);
                }
                if (hxVar.equals(new hx(1)) && (g = ((r72) getFocusOwner()).g()) != null) {
                    fa4 N = wc7.N(g);
                    if (!te4.B(N).G(N, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        p72.a(getFocusOwner());
                    }
                }
            }
            if ((h & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final ih4 e(ic2 ic2Var, ca4 ca4Var, di2 di2Var) {
        z44 z44Var;
        Reference poll;
        Object obj;
        if (di2Var != null) {
            return new fi2(di2Var, null, this, ic2Var, ca4Var);
        }
        do {
            l33 l33Var = this.M0;
            ReferenceQueue referenceQueue = (ReferenceQueue) l33Var.z;
            z44Var = (z44) l33Var.y;
            poll = referenceQueue.poll();
            if (poll != null) {
                z44Var.k(poll);
            }
        } while (poll != null);
        while (true) {
            int i = z44Var.z;
            if (i != 0) {
                obj = ((Reference) z44Var.m(i - 1)).get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ih4 ih4Var = (ih4) obj;
        if (ih4Var != null) {
            fi2 fi2Var = (fi2) ih4Var;
            ci2 ci2Var = fi2Var.y;
            if (ci2Var != null) {
                if (!fi2Var.x.s) {
                    ez2.a("layer should have been released before reuse");
                }
                fi2Var.x = ci2Var.b();
                fi2Var.D = false;
                fi2Var.A = ic2Var;
                fi2Var.B = ca4Var;
                fi2Var.N = false;
                fi2Var.O = false;
                fi2Var.P = true;
                jo3.d(fi2Var.E);
                float[] fArr = fi2Var.F;
                if (fArr != null) {
                    jo3.d(fArr);
                }
                fi2Var.L = xh6.b;
                fi2Var.Q = false;
                fi2Var.C = 9223372034707292159L;
                fi2Var.M = null;
                fi2Var.K = 0;
                return ih4Var;
            }
            throw h11.e("currently reuse is only supported when we manage the layer lifecycle");
        }
        return new fi2(getGraphicsContext().b(), getGraphicsContext(), this, ic2Var, ca4Var);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, w05] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null && !this.q0.b) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
            n05 n05Var = null;
            if (findNextFocus == null || !db.J(this, findNextFocus)) {
                findNextFocus = null;
            }
            if (view == this) {
                h82 y = bb4.y(((r72) getFocusOwner()).c);
                if (y != null) {
                    n05Var = bb4.A(y);
                }
                if (n05Var == null) {
                    n05Var = m72.a(view, this);
                }
            } else {
                n05Var = m72.a(view, this);
            }
            f72 d = m72.d(i);
            if (d != null) {
                i2 = d.a;
            } else {
                i2 = 6;
            }
            ?? obj = new Object();
            if (((r72) getFocusOwner()).f(i2, n05Var, new aa(obj, (byte) 0)) == null) {
                return view;
            }
            Object obj2 = obj.x;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i);
                }
            } else if (findNextFocus == null || i2 == 1 || i2 == 2 || vv5.l(bb4.A((h82) obj2), m72.a(findNextFocus, this), n05Var, i2)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final void g(za3 za3Var, boolean z) {
        this.q0.g(za3Var, z);
    }

    public x3 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final og getAndroidViewsHandler$ui() {
        if (this.n0 == null) {
            og ogVar = new og(getContext());
            this.n0 = ogVar;
            addView(ogVar, -1);
            requestLayout();
        }
        og ogVar2 = this.n0;
        ogVar2.getClass();
        return ogVar2;
    }

    public ty getAutofillTree() {
        return this.W;
    }

    public kn0 getClipboard() {
        return getComposeViewContext().n;
    }

    public ln0 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final yt0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.a1;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.g0.getValue();
    }

    public final jb getContentCaptureManager$ui() {
        return this.U;
    }

    public l11 getCoroutineContext() {
        return this.K;
    }

    public ud1 getDensity() {
        return (ud1) this.H.getValue();
    }

    public n05 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            h82 y = bb4.y(((r72) getFocusOwner()).c);
            if (y == null) {
                return null;
            }
            return bb4.A(y);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return m72.a(findFocus, this);
    }

    public p72 getFocusOwner() {
        return this.J;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        n05 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (!a34.i(((r72) getFocusOwner()).f(6, null, new b3((byte) 8)), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public p82 getFontFamilyResolver() {
        return (p82) this.F0.getValue();
    }

    public o82 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final ug3 getFrameEndScheduler$ui() {
        return this.B;
    }

    public ci2 getGraphicsContext() {
        return this.V;
    }

    public sj2 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!((st3) this.q0.e).w() && this.F.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public tz2 getInputModeManager() {
        int i;
        tz2 tz2Var = this.H0;
        if (tz2Var == null) {
            if (isInTouchMode()) {
                i = 1;
            } else {
                i = 2;
            }
            tz2Var = new tz2(i);
            this.H0 = tz2Var;
        }
        return tz2Var;
    }

    public final b03 getInsetsListener() {
        return this.O;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.x0;
    }

    @Override // android.view.View, android.view.ViewParent
    public ia3 getLayoutDirection() {
        return (ia3) this.G0.getValue();
    }

    public fk3 getLocaleList() {
        return (fk3) this.h0.getValue();
    }

    public long getMeasureIteration() {
        if (!this.q0.b) {
            ez2.a("measureIteration should be only used during the measure/layout pass");
            return 1L;
        }
        return 1L;
    }

    public zz3 getModifierLocalManager() {
        return this.I0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public oa m162getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public dm4 getPlacementScope() {
        c94 c94Var = fm4.a;
        return new zl3(this, (byte) 1);
    }

    public final ic2 getPlayNavigationSoundEffect$ui() {
        return this.V0;
    }

    public tq4 getPointerIconService() {
        return this.e1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final cy2 m155getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.A;
    }

    public p05 getRectManager() {
        return this.R;
    }

    public m55 getRetainedValuesStore() {
        return this.E;
    }

    public za3 getRoot() {
        return this.P;
    }

    public final fi1 getSavedStateRegistry() {
        String str;
        fi1 fi1Var = this.D;
        if (fi1Var == null) {
            yt0 composeViewContext = getComposeViewContext();
            composeViewContext.g();
            ga5 ga5Var = composeViewContext.e;
            ga5Var.getClass();
            Object parent = getParent();
            parent.getClass();
            View view = (View) parent;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            LinkedHashMap linkedHashMap = null;
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null) {
                str = String.valueOf(view.getId());
            }
            String l = zo5.l("SaveableStateRegistry:", str);
            ea5 savedStateRegistry = ga5Var.getSavedStateRegistry();
            Bundle a = savedStateRegistry.a(l);
            if (a != null) {
                linkedHashMap = new LinkedHashMap();
                for (String str2 : a.keySet()) {
                    ArrayList parcelableArrayList = a.getParcelableArrayList(str2);
                    parcelableArrayList.getClass();
                    linkedHashMap.put(str2, parcelableArrayList);
                }
            }
            f01 f01Var = new f01((byte) 5);
            tq1 tq1Var = p95.a;
            o95 o95Var = new o95(linkedHashMap, f01Var);
            boolean z = false;
            if (savedStateRegistry.b(l) == null) {
                try {
                    savedStateRegistry.c(l, new or0(o95Var, (byte) 1));
                    z = true;
                } catch (IllegalArgumentException unused) {
                }
            }
            fi1 fi1Var2 = new fi1(o95Var, new gi1(z, savedStateRegistry, l));
            this.D = fi1Var2;
            return fi1Var2;
        }
        return fi1Var;
    }

    public final boolean getScrollCaptureInProgress() {
        jc5 jc5Var;
        if (Build.VERSION.SDK_INT >= 31 && (jc5Var = this.c1) != null && ((Boolean) jc5Var.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof oa) {
                return ((oa) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public xh5 getSemanticsOwner() {
        return this.S;
    }

    public bb3 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return uo.a.a(this);
        }
        return this.m0;
    }

    public mh4 getSnapshotObserver() {
        return this.l0;
    }

    public ou5 getSoftwareKeyboardController() {
        id1 id1Var = this.E0;
        if (id1Var == null) {
            id1 id1Var2 = new id1(getTextInputService());
            this.E0 = id1Var2;
            return id1Var2;
        }
        return id1Var;
    }

    public sc6 getTextInputService() {
        sc6 sc6Var = this.C0;
        if (sc6Var == null) {
            sc6 sc6Var2 = new sc6(getLegacyTextInputServiceAndroid());
            this.C0 = sc6Var2;
            return sc6Var2;
        }
        return sc6Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [of, java.lang.Object, zd6] */
    public zd6 getTextToolbar() {
        of ofVar = this.J0;
        if (ofVar == null) {
            ?? obj = new Object();
            new og5(new y7(obj, (byte) 17), (byte) 5);
            this.J0 = obj;
            return obj;
        }
        return ofVar;
    }

    public final f75 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public rv6 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public r47 getWindowInfo() {
        return getComposeViewContext().t;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:97:0x0190, B:103:0x019c, B:105:0x01a4, B:106:0x01ae, B:110:0x01a7), top: B:96:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:97:0x0190, B:103:0x019c, B:105:0x01a4, B:106:0x01ae, B:110:0x01a7), top: B:96:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:88:0x0180, B:89:0x018c, B:134:0x0056, B:140:0x0062, B:143:0x006a), top: B:120:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:88:0x0180, B:89:0x018c, B:134:0x0056, B:140:0x0062, B:143:0x006a), top: B:120:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.h(android.view.MotionEvent):int");
    }

    public final void j(za3 za3Var) {
        this.q0.s(za3Var, false);
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            j((za3) objArr[i2]);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean n(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.K0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final void o(float[] fArr) {
        z();
        jo3.e(fArr, this.v0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.z0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.z0 & 4294967295L));
        float[] fArr2 = this.t0;
        jo3.d(fArr2);
        jo3.f(fArr2, intBitsToFloat, intBitsToFloat2);
        float N = db.N(0, 0, fArr2, fArr);
        float N2 = db.N(0, 1, fArr2, fArr);
        float N3 = db.N(0, 2, fArr2, fArr);
        float N4 = db.N(0, 3, fArr2, fArr);
        float N5 = db.N(1, 0, fArr2, fArr);
        float N6 = db.N(1, 1, fArr2, fArr);
        float N7 = db.N(1, 2, fArr2, fArr);
        float N8 = db.N(1, 3, fArr2, fArr);
        float N9 = db.N(2, 0, fArr2, fArr);
        float N10 = db.N(2, 1, fArr2, fArr);
        float N11 = db.N(2, 2, fArr2, fArr);
        float N12 = db.N(2, 3, fArr2, fArr);
        float N13 = db.N(3, 0, fArr2, fArr);
        float N14 = db.N(3, 1, fArr2, fArr);
        float N15 = db.N(3, 2, fArr2, fArr);
        float N16 = db.N(3, 3, fArr2, fArr);
        fArr[0] = N;
        fArr[1] = N2;
        fArr[2] = N3;
        fArr[3] = N4;
        fArr[4] = N5;
        fArr[5] = N6;
        fArr[6] = N7;
        fArr[7] = N8;
        fArr[8] = N9;
        fArr[9] = N10;
        fArr[10] = N11;
        fArr[11] = N12;
        fArr[12] = N13;
        fArr[13] = N14;
        fArr[14] = N15;
        fArr[15] = N16;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [yv6, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        m55 m55Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().I()) {
            getRoot().d(this);
        }
        byte b = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a34.b0());
        }
        this.O.onViewAttachedToWindow(this);
        if (!this.a1) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.a1 = false;
        j(getRoot());
        i(getRoot());
        getSnapshotObserver().a.e();
        oa m162getOutOfFrameExecutor = m162getOutOfFrameExecutor();
        if (m162getOutOfFrameExecutor != null) {
            m162getOutOfFrameExecutor.C(new z9(this, b));
            getComposeViewContext().d();
            yt0 composeViewContext = getComposeViewContext();
            composeViewContext.g();
            ew6 ew6Var = composeViewContext.f;
            ug3 ug3Var = this.B;
            if (ew6Var != null && ug3Var != null) {
                cw6 viewModelStore = ew6Var.getViewModelStore();
                ?? obj2 = new Object();
                i21 i21Var = i21.b;
                viewModelStore.getClass();
                i21Var.getClass();
                zp2 zp2Var = new zp2(viewModelStore, obj2, i21Var);
                im0 a = z05.a(wg3.class);
                String e = a.e();
                if (e != null) {
                    wg3 wg3Var = (wg3) zp2Var.w(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e));
                    Object parent = getParent();
                    parent.getClass();
                    int id = ((View) parent).getId();
                    s34 s34Var = wg3Var.b;
                    Object b2 = s34Var.b(id);
                    if (b2 == null) {
                        b2 = new f44(1);
                        s34Var.h(id, b2);
                    }
                    f44 f44Var = (f44) b2;
                    Object[] objArr = f44Var.a;
                    int i2 = f44Var.b;
                    while (true) {
                        if (i < i2) {
                            obj = objArr[i];
                            if (!((vg3) obj).c) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    vg3 vg3Var = (vg3) obj;
                    if (vg3Var == null) {
                        vg3Var = new vg3();
                        f44Var.a(vg3Var);
                    }
                    vg3Var.c = true;
                    this.C = vg3Var;
                    m55Var = vg3Var.b;
                } else {
                    ze0.k("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                m55Var = null;
            }
            if (m55Var == null) {
                m55Var = ba2.a;
            }
            this.E = m55Var;
            ub2 ub2Var = this.A0;
            if (ub2Var != null) {
                ub2Var.invoke(getComposeViewContext());
                this.A0 = null;
            }
            fg3 lifecycle = getComposeViewContext().d().getLifecycle();
            lifecycle.a(this);
            lifecycle.a(this.U);
            tz2 inputModeManager = getInputModeManager();
            if (!isInTouchMode()) {
                b = 2;
            }
            inputModeManager.a.setValue(new rz2(b));
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (Build.VERSION.SDK_INT >= 31) {
                ab.a.b(this);
            }
            r9 m158getAutofillManager = m158getAutofillManager();
            if (m158getAutofillManager != null) {
                ((r72) getFocusOwner()).g.a(m158getAutofillManager);
                getSemanticsOwner().d.a(m158getAutofillManager);
            }
            ((r72) getFocusOwner()).g.a(this);
            return;
        }
        ze0.m("Expected the view to be attached to window.");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        rk5 rk5Var = (rk5) this.D0.get();
        Object obj2 = null;
        if (rk5Var != null) {
            obj = rk5Var.b;
        } else {
            obj = null;
        }
        pd pdVar = (pd) obj;
        if (pdVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        rk5 rk5Var2 = (rk5) pdVar.A.get();
        if (rk5Var2 != null) {
            obj2 = rk5Var2.b;
        }
        if (((qz2) obj2) != null && (!r1.e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        jb jbVar = this.U;
        jbVar.getClass();
        hb.f(jbVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.O.onViewDetachedFromWindow(this);
        View view = this.I;
        if (k() && view != null) {
            removeView(view);
        }
        f44 f44Var = i1;
        synchronized (f44Var) {
            f44Var.k(this);
        }
        getComposeViewContext().b();
        eu5 eu5Var = getSnapshotObserver().a;
        xv3 xv3Var = eu5Var.h;
        if (xv3Var != null) {
            xv3Var.d();
        }
        eu5Var.a();
        fg3 lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.b(this.U);
        lifecycle.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        vg3 vg3Var = this.C;
        if (vg3Var != null) {
            vg3Var.c = false;
        }
        this.C = null;
        if (Build.VERSION.SDK_INT >= 31) {
            ab.a.a(this);
        }
        r9 m158getAutofillManager = m158getAutofillManager();
        if (m158getAutofillManager != null) {
            getSemanticsOwner().d.k(m158getAutofillManager);
            ((r72) getFocusOwner()).g.k(m158getAutofillManager);
        }
        p05 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        p05 rectManager2 = getRectManager();
        ca caVar = rectManager2.i;
        if (caVar != null) {
            rectManager2.b.removeCallbacks(caVar);
            rectManager2.i = null;
        }
        ((r72) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            r72 r72Var = (r72) getFocusOwner();
            v94.I(r72Var.c, true);
            if (r72Var.g() != null) {
                h82 g = r72Var.g();
                r72Var.j(null);
                if (g != null) {
                    g.b1(d82.x, d82.z);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.x0 = 0L;
        J();
        int i = Build.VERSION.SDK_INT;
        if (32 <= i && i < 34) {
            I(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.x0 = 0L;
            this.q0.l(this.X0);
            this.o0 = null;
            J();
            if (this.n0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e22 e22Var = this.q0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().I()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                j(getRoot());
            }
            long d = d(i);
            long d2 = d(i2);
            long o = n03.o((int) (d >>> 32), (int) (d & 4294967295L), (int) (d2 >>> 32), (int) (4294967295L & d2));
            rx0 rx0Var = this.o0;
            if (rx0Var == null) {
                this.o0 = new rx0(o);
                this.p0 = false;
            } else if (!rx0.b(rx0Var.a, o)) {
                this.p0 = true;
            }
            e22Var.t(o);
            e22Var.n();
            setMeasuredDimension(getRoot().d0.p.x, getRoot().d0.p.y);
            if (this.n0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().d0.p.x, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().d0.p.y, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null && !this.b1) {
            y(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        sq4 sq4Var;
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (sq4Var = ((ka) getPointerIconService()).a) != null)) {
            Context context = getContext();
            if (sq4Var instanceof qd) {
                return PointerIcon.getSystemIcon(context, ((qd) sq4Var).b);
            }
            return PointerIcon.getSystemIcon(context, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // defpackage.m91
    public final void onResume(og3 og3Var) {
        sg0 sg0Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a34.b0());
        }
        vg3 vg3Var = this.C;
        if (vg3Var != null) {
            ug3 ug3Var = this.B;
            ug3Var.getClass();
            tm3 tm3Var = vg3Var.a.a;
            if (tm3Var.c()) {
                try {
                    sg0Var = ((d97) ug3Var).x.v(new vt0(vg3Var, (byte) 21));
                } catch (CancellationException unused) {
                    if (!tm3Var.b) {
                        if (tm3Var.c) {
                            es4.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        tm3Var.d();
                        tm3Var.c = true;
                    }
                    sg0Var = null;
                }
                sg0 sg0Var2 = vg3Var.d;
                if (sg0Var2 != null) {
                    sg0Var2.cancel();
                }
                vg3Var.d = sg0Var;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        ia3 ia3Var;
        if (this.z) {
            int[] iArr = m72.a;
            ia3 ia3Var2 = ia3.x;
            if (i != 0) {
                if (i != 1) {
                    ia3Var = null;
                } else {
                    ia3Var = ia3.y;
                }
            } else {
                ia3Var = ia3Var2;
            }
            if (ia3Var != null) {
                ia3Var2 = ia3Var;
            }
            setLayoutDirection(ia3Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        jc5 jc5Var;
        if (Build.VERSION.SDK_INT >= 31 && (jc5Var = this.c1) != null) {
            jc5Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J();
    }

    @Override // defpackage.m91
    public final void onStop(og3 og3Var) {
        vg3 vg3Var = this.C;
        if (vg3Var != null) {
            tm3 tm3Var = vg3Var.a.a;
            if (!tm3Var.c()) {
                if (!tm3Var.b) {
                    if (!tm3Var.c) {
                        es4.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                    }
                    if (!tm3Var.d.i()) {
                        es4.a("Attempted to start retaining exited values with pending exited values");
                    }
                    tm3Var.c = false;
                    return;
                }
                return;
            }
            sg0 sg0Var = vg3Var.d;
            if (sg0Var != null) {
                sg0Var.cancel();
            }
            vg3Var.d = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i;
        tz2 inputModeManager = getInputModeManager();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        inputModeManager.a.setValue(new rz2(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        jb jbVar = this.U;
        jbVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (a34.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            hb.b(jbVar, longSparseArray);
        } else {
            jbVar.x.post(new gb(jbVar, longSparseArray, (byte) 0));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean b0;
        this.Z0 = true;
        super.onWindowFocusChanged(z);
        if (z && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (b0 = a34.b0())) {
            setShowLayoutBounds(b0);
            i(getRoot());
        }
    }

    public final long p(long j) {
        z();
        long b = jo3.b(j, this.v0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.z0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.z0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void q(boolean z) {
        z9 z9Var;
        e22 e22Var = this.q0;
        if (!((st3) e22Var.e).w() && ((z44) ((y23) e22Var.f).y).z == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            if (z) {
                z9Var = this.X0;
            } else {
                z9Var = this.Y0;
            }
            if (e22Var.l(z9Var)) {
                requestLayout();
            }
            e22Var.b(false);
            getRectManager().a();
            if (this.d0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.d0 = false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void r(za3 za3Var, long j) {
        e22 e22Var = this.q0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            e22Var.m(za3Var, j);
            if (!((st3) e22Var.e).w()) {
                e22Var.b(false);
                getRectManager().a();
                this.Y0.invoke();
                if (this.d0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.d0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        n05 n05Var;
        byte b = 1;
        if (!isFocused()) {
            f72 d = m72.d(i);
            if (d != null) {
                i2 = d.a;
            } else {
                i2 = 7;
            }
            p72 focusOwner = getFocusOwner();
            if (rect != null) {
                n05Var = new n05(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                n05Var = null;
            }
            Boolean f = ((r72) focusOwner).f(i2, n05Var, new da(i2, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!a34.i(f, bool)) {
                if (!a34.i(((r72) getFocusOwner()).f(i2, null, new da(i2, b)), bool)) {
                    if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                        return false;
                    }
                    return ((r72) getFocusOwner()).i(i2);
                }
            }
        }
        return true;
    }

    public final boolean s(int i) {
        View view;
        if (i != 7 && i != 8) {
            Integer c = m72.c(i);
            if (c != null) {
                int intValue = c.intValue();
                h82 g = ((r72) getFocusOwner()).g();
                if (g != null) {
                    Integer c2 = m72.c(i);
                    if (c2 != null) {
                        int intValue2 = c2.intValue();
                        sv6 sv6Var = wc7.O(g).L;
                        if (sv6Var != null) {
                            view = sv6Var.getInteropView();
                        } else {
                            view = null;
                        }
                        View findFocus = findFocus();
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = getRootView();
                        rootView.getClass();
                        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
                        if (findNextFocus == null || view == null || !db.J(view, findNextFocus)) {
                            findNextFocus = null;
                        }
                        if (findNextFocus != null) {
                            return m72.b(findNextFocus, Integer.valueOf(intValue), null);
                        }
                    } else {
                        throw h11.e("Invalid focus direction");
                    }
                } else {
                    ze0.m("findNextViewInEmbeddedView called when owner does not have anything focused.");
                    return false;
                }
            } else {
                throw h11.e("Invalid focus direction");
            }
        }
        return false;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.T.E = j;
    }

    public final void setComposeViewContext(yt0 yt0Var) {
        ub2 ub2Var;
        if (getCoroutineContext() != yt0Var.c().k() && !((d44) getRoot().n()).isEmpty()) {
            ez2.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            yt0 yt0Var2 = get_composeViewContext();
            if (yt0Var != yt0Var2) {
                if (isAttachedToWindow()) {
                    yt0Var2.b();
                    yt0Var.e();
                }
                set_composeViewContext(yt0Var);
                setCoroutineContext(yt0Var.c().k());
            }
        } finally {
            et5.k(b, e, ub2Var);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.a1 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.g0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(jb jbVar) {
        this.U = jbVar;
    }

    public void setCoroutineContext(l11 l11Var) {
        this.K = l11Var;
    }

    public final void setFrameEndScheduler$ui(ug3 ug3Var) {
        this.B = ug3Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.x0 = j;
    }

    public final void setOnReadyForComposition(ub2 ub2Var) {
        getDerivedIsAttached();
        if (!isAttachedToWindow() && !this.a1) {
            this.A0 = ub2Var;
        } else {
            ub2Var.invoke(getComposeViewContext());
        }
    }

    public final void setPlayNavigationSoundEffect$ui(ic2 ic2Var) {
        this.V0 = ic2Var;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m156setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(cy2 cy2Var) {
        this.A = cy2Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.m0 = z;
    }

    public void setUncaughtExceptionHandler(f75 f75Var) {
        this.q0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        f44 f44Var;
        Object[] objArr;
        if (this.k0) {
            eu5 eu5Var = getSnapshotObserver().a;
            c94 c94Var = new c94((byte) 21);
            synchronized (eu5Var.g) {
                try {
                    z44 z44Var = eu5Var.f;
                    int i = z44Var.z;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = z44Var.x;
                        if (i2 >= i) {
                            break;
                        }
                        du5 du5Var = (du5) objArr[i2];
                        du5Var.d(c94Var);
                        if (!du5Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = z44Var.x;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    z44Var.z = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.k0 = false;
        }
        og ogVar = this.n0;
        if (ogVar != null) {
            c(ogVar);
        }
        r9 m158getAutofillManager = m158getAutofillManager();
        if (m158getAutofillManager != null) {
            t34 t34Var = m158getAutofillManager.E;
            if (t34Var.d == 0 && m158getAutofillManager.F) {
                m158getAutofillManager.x.W().commit();
                m158getAutofillManager.F = false;
            }
            if (t34Var.d != 0) {
                m158getAutofillManager.F = true;
            }
        }
        while (this.N0.j() && this.N0.g(0) != null) {
            int i5 = this.N0.b;
            int i6 = 0;
            while (true) {
                f44Var = this.N0;
                if (i6 < i5) {
                    sb2 sb2Var = (sb2) f44Var.g(i6);
                    this.N0.o(i6, null);
                    if (sb2Var != null) {
                        sb2Var.invoke();
                    }
                    i6++;
                }
            }
            f44Var.m(0, i5);
        }
    }

    public final void u(za3 za3Var) {
        va vaVar = this.T;
        vaVar.U = true;
        if (vaVar.q()) {
            vaVar.r(za3Var);
        }
        jb jbVar = this.U;
        jbVar.C = true;
        if (jbVar.d()) {
            jbVar.D.i(pn6.a);
        }
    }

    public final void v(za3 za3Var, boolean z, boolean z2, boolean z3) {
        za3 v;
        za3 v2;
        e22 e22Var = this.q0;
        if (z) {
            st3 st3Var = (st3) e22Var.e;
            za3 za3Var2 = za3Var.E;
            db3 db3Var = za3Var.d0;
            if (za3Var2 == null) {
                ez2.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int ordinal = db3Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!db3Var.e || z2) {
                                db3Var.e = true;
                                db3Var.p.S = true;
                                if (!za3Var.n0) {
                                    if ((!a34.i(za3Var.K(), Boolean.TRUE) && !e22.i(za3Var)) || ((v = za3Var.v()) != null && v.d0.e)) {
                                        if ((za3Var.J() || e22.j(za3Var)) && ((v2 = za3Var.v()) == null || !v2.q())) {
                                            st3Var.c(za3Var, d33.z);
                                        }
                                    } else {
                                        st3Var.c(za3Var, d33.x);
                                    }
                                    if (!e22Var.c && z3) {
                                        D(za3Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ze0.l();
                        return;
                    }
                } else {
                    return;
                }
            }
            ((z44) e22Var.h).b(new so3(za3Var, true, z2));
            return;
        }
        if (e22Var.s(za3Var, z2) && z3) {
            D(za3Var);
        }
    }

    public final void w(za3 za3Var, boolean z, boolean z2) {
        boolean z3;
        db3 db3Var = za3Var.d0;
        d33 d33Var = d33.A;
        e22 e22Var = this.q0;
        if (z) {
            st3 st3Var = (st3) e22Var.e;
            int ordinal = db3Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                ze0.l();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            if ((!db3Var.e && !db3Var.f) || z2) {
                db3Var.f = true;
                db3Var.g = true;
                uo3 uo3Var = db3Var.p;
                uo3Var.T = true;
                uo3Var.U = true;
                if (!za3Var.n0) {
                    za3 v = za3Var.v();
                    if (a34.i(za3Var.K(), Boolean.TRUE) && ((v == null || !v.d0.e) && (v == null || !v.d0.f))) {
                        st3Var.c(za3Var, d33.y);
                    } else if (za3Var.J() && ((v == null || !v.p()) && (v == null || !v.q()))) {
                        st3Var.c(za3Var, d33Var);
                    }
                    if (!e22Var.c) {
                        D(null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e22Var.getClass();
        int ordinal2 = db3Var.d.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                za3 v2 = za3Var.v();
                if (v2 != null && !v2.J()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2) {
                    if (!za3Var.q()) {
                        if (za3Var.p() && za3Var.J() == z3 && za3Var.J() == db3Var.p.R) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                uo3 uo3Var2 = db3Var.p;
                uo3Var2.T = true;
                uo3Var2.U = true;
                if (!za3Var.n0 && uo3Var2.R && z3) {
                    if ((v2 == null || !v2.p()) && (v2 == null || !v2.q())) {
                        ((st3) e22Var.e).c(za3Var, d33Var);
                    }
                    if (!e22Var.c) {
                        D(null);
                        return;
                    }
                    return;
                }
                return;
            }
            ze0.l();
        }
    }

    public final void x() {
        va vaVar = this.T;
        vaVar.U = true;
        Handler handler = vaVar.A.getHandler();
        if (vaVar.q() && !vaVar.f0 && handler != null) {
            vaVar.f0 = true;
            handler.post(vaVar.h0);
        }
        jb jbVar = this.U;
        jbVar.C = true;
        Handler handler2 = jbVar.x.getHandler();
        if (jbVar.d() && !jbVar.I && handler2 != null) {
            jbVar.I = true;
            handler2.post(jbVar.J);
        }
    }

    public final void y(ViewStructure viewStructure) {
        r9 m158getAutofillManager = m158getAutofillManager();
        if (m158getAutofillManager != null) {
            za3 za3Var = m158getAutofillManager.y.a;
            AutofillId autofillId = m158getAutofillManager.D;
            String str = m158getAutofillManager.B;
            p05 p05Var = m158getAutofillManager.A;
            q23.M(viewStructure, za3Var, autofillId, str, p05Var);
            Object[] objArr = ec4.a;
            f44 f44Var = new f44(2);
            f44Var.a(za3Var);
            f44Var.a(viewStructure);
            while (f44Var.j()) {
                Object l = f44Var.l(f44Var.b - 1);
                l.getClass();
                ViewStructure viewStructure2 = (ViewStructure) l;
                Object l2 = f44Var.l(f44Var.b - 1);
                l2.getClass();
                d44 d44Var = (d44) ((za3) l2).n();
                int i = ((z44) d44Var.y).z;
                for (int i2 = 0; i2 < i; i2++) {
                    za3 za3Var2 = (za3) d44Var.get(i2);
                    if (!za3Var2.n0 && za3Var2.I() && za3Var2.J()) {
                        ph5 x = za3Var2.x();
                        if (x != null) {
                            p44 p44Var = x.x;
                            if (p44Var.b(oh5.g) || p44Var.b(oh5.h) || p44Var.b(yh5.r) || p44Var.b(yh5.s) || (Build.VERSION.SDK_INT >= 34 && p44Var.b(h98.r))) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                q23.M(newChild, za3Var2, autofillId, str, p05Var);
                                f44Var.a(za3Var2);
                                f44Var.a(newChild);
                            }
                        }
                        f44Var.a(za3Var2);
                        f44Var.a(viewStructure2);
                    }
                }
            }
        }
        q9 autofill = getAutofill();
        if (autofill != null) {
            ty tyVar = autofill.b;
            LinkedHashMap linkedHashMap = tyVar.a;
            LinkedHashMap linkedHashMap2 = tyVar.a;
            if (!linkedHashMap.isEmpty()) {
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        ov3.d();
                        return;
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId(autofill.c, intValue);
                    newChild2.setId(intValue, autofill.a.getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    public final void z() {
        if (!this.y0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.x0) {
                this.x0 = currentAnimationTimeMillis;
                mf0 mf0Var = mf0.a;
                Matrix matrix = this.u0;
                float[] fArr = this.v0;
                int[] iArr = this.s0;
                mf0Var.a(this, fArr, matrix, iArr);
                tl7.w(fArr, this.w0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                view.getLocationInWindow(iArr);
                float f3 = iArr[0];
                float f4 = f2 - iArr[1];
                this.z0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
            }
        }
    }

    public q9 getAutofill() {
        return this.i0;
    }

    /* renamed from: getAutofillManager, reason: merged with bridge method [inline-methods] */
    public r9 m158getAutofillManager() {
        return this.j0;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public bc m159getDragAndDropManager() {
        return this.L;
    }

    public s34 getLayoutNodes() {
        return this.Q;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @de1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m154getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @de1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public g75 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(f75 f75Var) {
    }
}
