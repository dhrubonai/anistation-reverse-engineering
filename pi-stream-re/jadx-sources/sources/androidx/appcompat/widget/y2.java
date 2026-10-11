package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: i, reason: collision with root package name */
    public static y2 f714i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f716a;

    /* renamed from: b, reason: collision with root package name */
    public n.k f717b;

    /* renamed from: c, reason: collision with root package name */
    public n.l f718c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f719d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f720e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f721f;

    /* renamed from: g, reason: collision with root package name */
    public w f722g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f713h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final w2 f715j = new w2();

    public static synchronized y2 d() {
        y2 y2Var;
        synchronized (y2.class) {
            if (f714i == null) {
                y2 y2Var2 = new y2();
                f714i = y2Var2;
                j(y2Var2);
            }
            y2Var = f714i;
        }
        return y2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (y2.class) {
            w2 w2Var = f715j;
            w2Var.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) w2Var.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                w2Var.getClass();
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(y2 y2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            y2Var.a("vector", new v2(3));
            y2Var.a("animated-vector", new v2(1));
            y2Var.a("animated-selector", new v2(0));
            y2Var.a("drawable", new v2(2));
        }
    }

    public final void a(String str, v2 v2Var) {
        if (this.f717b == null) {
            this.f717b = new n.k();
        }
        this.f717b.put(str, v2Var);
    }

    public final synchronized void b(Context context, long j4, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            n.i iVar = (n.i) this.f719d.get(context);
            if (iVar == null) {
                iVar = new n.i();
                this.f719d.put(context, iVar);
            }
            iVar.f(new WeakReference(constantState), j4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable c(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f720e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f720e = r0
        Lb:
            android.util.TypedValue r0 = r7.f720e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.e(r8, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            androidx.appcompat.widget.w r1 = r7.f722g
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r9 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131230775(0x7f080037, float:1.8077612E38)
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131230777(0x7f080039, float:1.8077616E38)
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L74
        L4c:
            r1 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r9 != r1) goto L59
            r9 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.w.c(r7, r8, r9)
            goto L74
        L59:
            r1 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r9 != r1) goto L66
            r9 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.w.c(r7, r8, r9)
            goto L74
        L66:
            r1 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r9 != r1) goto L73
            r9 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.w.c(r7, r8, r9)
            goto L74
        L73:
            r9 = 0
        L74:
            if (r9 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.b(r8, r3, r9)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y2.c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, long j4) {
        n.i iVar = (n.i) this.f719d.get(context);
        if (iVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) iVar.e(null, j4);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int c6 = j5.a.c(iVar.f7882b, iVar.f7884d, j4);
            if (c6 >= 0) {
                Object[] objArr = iVar.f7883c;
                Object obj = objArr[c6];
                Object obj2 = n.i.f7880e;
                if (obj != obj2) {
                    objArr[c6] = obj2;
                    iVar.f7881a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002b, code lost:
    
        if (r0 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        a0.b.i(r13, r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ec, B:27:0x00f2, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c5, B:83:0x00d1, B:84:0x00d8, B:87:0x00da, B:89:0x00e3, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2 A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ec, B:27:0x00f2, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c5, B:83:0x00d1, B:84:0x00d8, B:87:0x00da, B:89:0x00e3, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[Catch: all -> 0x00ce, TryCatch #1 {all -> 0x00ce, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ec, B:27:0x00f2, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c5, B:83:0x00d1, B:84:0x00d8, B:87:0x00da, B:89:0x00e3, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #1 {all -> 0x00ce, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0032, B:10:0x0038, B:12:0x003e, B:15:0x004c, B:18:0x005d, B:20:0x0061, B:21:0x0068, B:25:0x00ec, B:27:0x00f2, B:29:0x00f8, B:31:0x00fe, B:35:0x0115, B:40:0x0111, B:41:0x011b, B:45:0x0132, B:56:0x0168, B:57:0x0192, B:62:0x019f, B:66:0x0082, B:68:0x0086, B:71:0x0092, B:72:0x009a, B:78:0x00a6, B:80:0x00b9, B:82:0x00c5, B:83:0x00d1, B:84:0x00d8, B:87:0x00da, B:89:0x00e3, B:90:0x0056, B:92:0x0008, B:94:0x0013, B:96:0x0017, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y2.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        n.l lVar;
        try {
            WeakHashMap weakHashMap = this.f716a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (lVar = (n.l) weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) lVar.c(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                w wVar = this.f722g;
                if (wVar != null) {
                    colorStateList2 = wVar.d(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f716a == null) {
                        this.f716a = new WeakHashMap();
                    }
                    n.l lVar2 = (n.l) this.f716a.get(context);
                    if (lVar2 == null) {
                        lVar2 = new n.l();
                        this.f716a.put(context, lVar2);
                    }
                    lVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        n.i iVar = (n.i) this.f719d.get(context);
        if (iVar != null) {
            iVar.b();
        }
    }

    public final synchronized void l(w wVar) {
        this.f722g = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.w r0 = r6.f722g
            r1 = 0
            if (r0 == 0) goto L7b
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.x.f697b
            java.lang.Object r3 = r0.f681b
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.w.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968812(0x7f0400ec, float:1.7546288E38)
            goto L4e
        L17:
            java.lang.Object r3 = r0.f683d
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.w.a(r3, r8)
            if (r3 == 0) goto L25
            r8 = 2130968810(0x7f0400ea, float:1.7546284E38)
            goto L4e
        L25:
            java.lang.Object r0 = r0.f684e
            int[] r0 = (int[]) r0
            boolean r0 = androidx.appcompat.widget.w.a(r0, r8)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L4b
        L32:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r8 != r0) goto L46
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L56
        L46:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r8 != r0) goto L51
        L4b:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4e:
            r0 = r8
            r8 = r4
            goto L53
        L51:
            r8 = r1
            r0 = r8
        L53:
            r3 = r2
            r2 = r0
            r0 = r5
        L56:
            if (r8 == 0) goto L77
            int[] r8 = androidx.appcompat.widget.v1.f670a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.v3.c(r7, r2)
            java.lang.Class<androidx.appcompat.widget.x> r9 = androidx.appcompat.widget.x.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r7 = h(r7, r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r9)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L72
            r8.setAlpha(r0)
        L72:
            r7 = r4
            goto L78
        L74:
            r7 = move-exception
            monitor-exit(r9)
            throw r7
        L77:
            r7 = r1
        L78:
            if (r7 == 0) goto L7b
            r1 = r4
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y2.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
