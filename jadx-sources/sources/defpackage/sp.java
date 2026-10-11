package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sp {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public sp() {
        this.b = new yn2[32];
        this.c = new float[32];
        this.d = new byte[32];
        q44 q44Var = db5.a;
        this.e = new q44();
        this.f = new q44();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.y) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, defpackage.zi4 r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.a
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.a
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            a35 r3 = (defpackage.a35) r3
            java.lang.String r5 = defpackage.eq6.a
            long r5 = r3.y
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            zi4 r3 = new zi4
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            zi4 r3 = (defpackage.zi4) r3
        L45:
            int r5 = r12.a()
            r3.K(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f
            a35 r12 = (defpackage.a35) r12
            if (r12 == 0) goto L6c
            long r5 = r12.y
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.x
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            a35 r12 = new a35
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            a35 r12 = (defpackage.a35) r12
        L7e:
            java.util.ArrayList r0 = r12.x
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.io3.n(r8)
            boolean r2 = r0.isEmpty()
            defpackage.io3.B(r2)
            r12.y = r10
            r0.add(r3)
            r1.add(r12)
            r9.f = r12
            int r10 = r9.a
            if (r10 == r4) goto L9e
            r9.c(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.b
            b35 r9 = (defpackage.b35) r9
            r9.e(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp.a(long, zi4):void");
    }

    public void b() {
        TextView textView = (TextView) this.b;
        Drawable background = textView.getBackground();
        if (background != null) {
            if (((pn0) this.d) != null) {
                pn0 pn0Var = (pn0) this.f;
                if (pn0Var == null) {
                    pn0Var = new pn0((byte) 5);
                    this.f = pn0Var;
                }
                pn0Var.A = null;
                pn0Var.z = false;
                pn0Var.B = null;
                pn0Var.y = false;
                int i = pv6.a;
                ColorStateList backgroundTintList = textView.getBackgroundTintList();
                if (backgroundTintList != null) {
                    pn0Var.z = true;
                    pn0Var.A = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = textView.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    pn0Var.y = true;
                    pn0Var.B = backgroundTintMode;
                }
                if (pn0Var.z || pn0Var.y) {
                    int[] drawableState = textView.getDrawableState();
                    PorterDuff.Mode mode = up.b;
                    h45.i(background, pn0Var, drawableState);
                    return;
                }
            }
            pn0 pn0Var2 = (pn0) this.e;
            if (pn0Var2 != null) {
                int[] drawableState2 = textView.getDrawableState();
                PorterDuff.Mode mode2 = up.b;
                h45.i(background, pn0Var2, drawableState2);
            } else {
                pn0 pn0Var3 = (pn0) this.d;
                if (pn0Var3 != null) {
                    int[] drawableState3 = textView.getDrawableState();
                    PorterDuff.Mode mode3 = up.b;
                    h45.i(background, pn0Var3, drawableState3);
                }
            }
        }
    }

    public void c(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            a35 a35Var = (a35) priorityQueue.poll();
            String str = eq6.a;
            int i2 = 0;
            while (true) {
                arrayList = a35Var.x;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((b35) this.b).e(a35Var.y, (zi4) arrayList.get(i2));
                ((ArrayDeque) this.c).push((zi4) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            a35 a35Var2 = (a35) this.f;
            if (a35Var2 != null && a35Var2.y == a35Var.y) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(a35Var);
        }
    }

    public Object d() {
        boolean z;
        Looper myLooper = Looper.myLooper();
        if (myLooper == ((k46) this.c).a.getLooper()) {
            return this.e;
        }
        if (myLooper == ((k46) this.b).a.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return this.f;
    }

    public boolean e() {
        if (this.a < ((List) this.d).size() || !((ArrayList) this.f).isEmpty()) {
            return true;
        }
        return false;
    }

    public void f(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList g;
        TextView textView = (TextView) this.b;
        Context context = textView.getContext();
        int[] iArr = ux4.h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView2 = (TextView) this.b;
        Context context2 = textView2.getContext();
        int i2 = pv6.a;
        nv6.b(textView2, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                this.a = obtainStyledAttributes.getResourceId(0, -1);
                up upVar = (up) this.c;
                Context context3 = textView.getContext();
                int i3 = this.a;
                synchronized (upVar) {
                    g = upVar.a.g(context3, i3);
                }
                if (g != null) {
                    i(g);
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0 || (colorStateList = t80.I(context, resourceId)) == null) {
                    colorStateList = obtainStyledAttributes.getColorStateList(1);
                }
                textView.setBackgroundTintList(colorStateList);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                textView.setBackgroundTintMode(mp1.a(obtainStyledAttributes.getInt(2, -1)));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void g(yn2 yn2Var) {
        int N0 = ms.N0((yn2[]) this.b, yn2Var);
        if (N0 >= 0) {
            yn2[] yn2VarArr = (yn2[]) this.b;
            int i = N0 + 1;
            ms.x0(N0, i, this.a, yn2VarArr, yn2VarArr);
            yn2[] yn2VarArr2 = (yn2[]) this.b;
            int i2 = this.a;
            yn2VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, N0, i2 - i);
            byte[] bArr = (byte[]) this.d;
            ms.v0(N0, i, this.a, bArr, bArr);
            this.a--;
        }
    }

    public void h(Runnable runnable) {
        k46 k46Var = (k46) this.b;
        if (!k46Var.a.getLooper().getThread().isAlive()) {
            return;
        }
        k46Var.f(runnable);
    }

    public void i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            pn0 pn0Var = (pn0) this.d;
            if (pn0Var == null) {
                pn0Var = new pn0((byte) 5);
                this.d = pn0Var;
            }
            pn0Var.A = colorStateList;
            pn0Var.z = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void j(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.a = i;
        c(i);
    }

    public void k(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            vy1 vy1Var = ((ey1) this.d).y;
            ((Integer) obj2).getClass();
            int intValue = ((Integer) obj).intValue();
            vy1Var.E1();
            vy1Var.l.D.b(40, intValue, 0).b();
            vy1Var.m.g(21, new x61(intValue, (byte) 1));
        }
    }

    public sp(b35 b35Var) {
        this.b = b35Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public sp(TextView textView) {
        up upVar;
        this.a = -1;
        this.b = textView;
        PorterDuff.Mode mode = up.b;
        synchronized (up.class) {
            try {
                if (up.c == null) {
                    up.b();
                }
                upVar = up.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = upVar;
    }
}
