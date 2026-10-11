package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class af2 implements nw4, w25 {
    public static volatile af2 B;
    public static volatile af2 D;
    public static volatile af2 z;
    public final /* synthetic */ byte x;
    public Object y;
    public static final Object A = new Object();
    public static final Object C = new Object();
    public static final z95 E = new z95(11);
    public static final np7 F = new np7(9);

    public af2(byte b) {
        this.x = b;
        byte b2 = 2;
        switch (b) {
            case 1:
                this.y = new ConcurrentHashMap();
                return;
            case 3:
                int i = se7.a;
                this.y = new qb7(new ng7[]{l68.U, E}, b2);
                return;
            case 4:
                int i2 = b98.a;
                uw7 uw7Var = new uw7(new cb8[]{q18.C, F});
                Charset charset = la8.a;
                this.y = uw7Var;
                return;
            case 5:
                this.y = new AtomicReference(null);
                return;
            case 8:
                this.y = new AtomicInteger(0);
                return;
            case 9:
                this.y = new CopyOnWriteArrayList();
                return;
            case 14:
                this.y = tx5.a(cn6.b);
                return;
            case 17:
                this.y = Handler.createAsync(Looper.getMainLooper());
                return;
            case 18:
                this.y = new TreeSet(wc7.c);
                return;
            case 23:
                this.y = new zi4(10);
                return;
            default:
                this.y = new HashSet();
                return;
        }
    }

    public static fg3 e(ev2 ev2Var) {
        Object obj;
        k76 k76Var = ev2Var.c;
        if (k76Var instanceof zd2) {
            obj = ((zd2) k76Var).getView().getContext();
        } else {
            obj = ev2Var.a;
        }
        while (!(obj instanceof og3)) {
            if (!(obj instanceof ContextWrapper)) {
                return null;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return ((og3) obj).getLifecycle();
    }

    public static af2 g() {
        if (B == null) {
            synchronized (A) {
                try {
                    if (B == null) {
                        B = new af2((byte) 1);
                    }
                } finally {
                }
            }
        }
        af2 af2Var = B;
        a34.x(af2Var);
        return af2Var;
    }

    public static af2 h(Context context) {
        af2 af2Var;
        synchronized (C) {
            try {
                if (D == null) {
                    Context applicationContext = context.getApplicationContext();
                    af2 af2Var2 = new af2((byte) 2, (byte) 0);
                    y23 y23Var = new y23((byte) 4);
                    y23Var.y = applicationContext;
                    y23Var.z = applicationContext.getContentResolver();
                    af2Var2.y = y23Var;
                    D = af2Var2;
                }
                af2Var = D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return af2Var;
    }

    public static boolean j(ev2 ev2Var, Bitmap.Config config) {
        if (w65.F(config)) {
            if (((Boolean) wk6.o(ev2Var, jv2.g)).booleanValue()) {
                k76 k76Var = ev2Var.c;
                if (k76Var instanceof zd2) {
                    View view = ((zd2) k76Var).getView();
                    if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public void a(za3 za3Var) {
        if (!za3Var.I()) {
            ez2.b("DepthSortedSet.add called on an unattached node");
        }
        ((zu5) this.y).add(za3Var);
    }

    public f11 b(f11 f11Var) {
        float f;
        if (f11Var instanceof x15) {
            return f11Var;
        }
        go3 go3Var = (go3) this.y;
        if (go3Var.f()) {
            f = go3Var.p.getStrokeWidth() / 2.0f;
        } else {
            f = 0.0f;
        }
        return new u6(-f, f11Var);
    }

    @Override // defpackage.w25
    public w30[] c() {
        return (w30[]) this.y;
    }

    public void d() {
        ((qu0) this.y).getClass();
    }

    public ox5 f() {
        return (ox5) ((sx5) this.y).getValue();
    }

    @Override // defpackage.nw4
    public Object get() {
        switch (this.x) {
            case 13:
                return new st3((Context) ((l03) this.y).x, new xb5((byte) 8), new z95((byte) 7));
            default:
                String packageName = ((Context) ((nw4) this.y).get()).getPackageName();
                if (packageName == null) {
                    qi2.m("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
        }
    }

    public void i(float f, float f2, float f3, float f4) {
        dn0 dn0Var = (dn0) this.y;
        vg0 y = dn0Var.y();
        float intBitsToFloat = Float.intBitsToFloat((int) (dn0Var.B() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dn0Var.B() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            dz2.a("Width and height must be greater than or equal to zero");
        }
        dn0Var.S(floatToRawIntBits);
        y.o(f, f2);
    }

    public boolean k(xu3 xu3Var) {
        y23 y23Var = (y23) this.y;
        zu3 zu3Var = xu3Var.a;
        y23Var.getClass();
        int i = zu3Var.c;
        String str = zu3Var.a;
        try {
            if (((Context) y23Var.y).getPackageManager().getApplicationInfo(str, 0) != null) {
                if (i != 1000 && i != Process.myUid() && !y23Var.Y(zu3Var, "android.permission.STATUS_BAR_SERVICE") && !y23Var.Y(zu3Var, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    String string = Settings.Secure.getString((ContentResolver) y23Var.z, "enabled_notification_listeners");
                    if (string != null) {
                        for (String str2 : string.split(":")) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                            if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                return true;
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            kb0.q("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void l(Exception exc) {
        kb0.t("MediaCodecAudioRenderer", "Audio sink error", exc);
        pz2 pz2Var = ((jp3) this.y).f1;
        Handler handler = (Handler) pz2Var.y;
        if (handler != null) {
            handler.post(new gw(pz2Var, exc, (byte) 1));
        }
    }

    public void m(gs3 gs3Var, cs3 cs3Var, Collection collection) {
        ff2 ff2Var = (ff2) this.y;
        ns3 ns3Var = null;
        if (gs3Var == ff2Var.y && cs3Var != null) {
            ps3 ps3Var = ff2Var.x.a;
            String d = cs3Var.d();
            ns3 ns3Var2 = new ns3(ps3Var, d, ff2Var.b(ps3Var, d));
            ns3Var2.f(cs3Var);
            if (ff2Var.d != ns3Var2) {
                gs3 gs3Var2 = ff2Var.y;
                qs3 qs3Var = ff2Var.x;
                os3 os3Var = ff2Var.f;
                if (os3Var != null) {
                    os3Var.a();
                    ff2Var.f = null;
                }
                os3 os3Var2 = new os3(ff2Var, ns3Var2, gs3Var2, 3, true, qs3Var, collection);
                ff2Var.f = os3Var2;
                os3Var2.b();
                ff2Var.x = null;
                ff2Var.y = null;
                return;
            }
            return;
        }
        if (gs3Var == ff2Var.e) {
            if (cs3Var != null) {
                ff2Var.o(ff2Var.d, cs3Var);
            }
            qs3 qs3Var2 = ff2Var.d;
            qs3Var2.getClass();
            if (qs3Var2 instanceof ns3) {
                ns3Var = (ns3) qs3Var2;
            }
            if (ns3Var != null) {
                ns3Var.i(collection);
            }
        }
    }

    public mg4 n(ev2 ev2Var, tq5 tq5Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        Context context = ev2Var.a;
        xa5 xa5Var = ev2Var.p;
        as4 as4Var = ev2Var.q;
        n22 n22Var = ev2Var.e;
        af0 af0Var = ev2Var.i;
        af0 af0Var2 = ev2Var.j;
        af0 af0Var3 = ev2Var.k;
        w4 w4Var = jv2.b;
        Bitmap.Config config = (Bitmap.Config) wk6.o(ev2Var, w4Var);
        w4 w4Var2 = jv2.h;
        boolean booleanValue = ((Boolean) wk6.o(ev2Var, w4Var2)).booleanValue();
        w4 w4Var3 = hv2.a;
        if (!((List) wk6.o(ev2Var, w4Var3)).isEmpty() && !ms.t0(pq6.a, (Bitmap.Config) wk6.o(ev2Var, w4Var))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (w65.F((Bitmap.Config) wk6.o(ev2Var, w4Var)) && !j(ev2Var, (Bitmap.Config) wk6.o(ev2Var, w4Var))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || !z3) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (booleanValue && ((List) wk6.o(ev2Var, w4Var3)).isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z4 = true;
        } else {
            z4 = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(vn3.V(ev2Var.t.n.a, ev2Var.r.a));
        if (config != ((Bitmap.Config) wk6.o(ev2Var, w4Var))) {
            if (config != null) {
                linkedHashMap.put(w4Var, config);
            } else {
                linkedHashMap.remove(w4Var);
            }
        }
        if (z4 != ((Boolean) wk6.o(ev2Var, w4Var2)).booleanValue()) {
            linkedHashMap.put(w4Var2, Boolean.valueOf(z4));
        }
        return new mg4(context, tq5Var, xa5Var, as4Var, null, n22Var, af0Var, af0Var2, af0Var3, new g12(oi4.J(linkedHashMap)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r12.N(r5);
        r4 = r12.b;
        r12.O(6);
        r5 = r12.z();
        r6 = r5 + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r13.p() == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if ((r13.k() + r5) <= r13.p()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r12 = defpackage.qx1.s(r6, "Skipping ID3 tag with tagLength=", " greater than input length=");
        r12.append(r13.p());
        defpackage.kb0.O("Id3Peeker", r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r2 = new byte[r6];
        java.lang.System.arraycopy(r12.a, r4, r2, 0, 10);
        r13.A(r2, 10, r5);
        r2 = new defpackage.fu2(r14).Y(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r13.l(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.fy3 o(defpackage.c12 r13, defpackage.du2 r14, int r15) {
        /*
            r12 = this;
            java.lang.Object r12 = r12.y
            zi4 r12 = (defpackage.zi4) r12
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L8:
            r4 = r0
        L9:
            int r5 = r4 % 10
            int r6 = r5 + 10
            r7 = 10
            if (r5 != 0) goto L1a
            if (r4 == 0) goto L1a
            byte[] r8 = r12.a
            r9 = 9
            java.lang.System.arraycopy(r8, r7, r8, r0, r9)
        L1a:
            if (r4 != 0) goto L1e
            r8 = r7
            goto L1f
        L1e:
            r8 = 1
        L1f:
            byte[] r9 = r12.a     // Catch: java.io.EOFException -> Lca
            int r10 = r6 - r8
            r13.A(r9, r10, r8)     // Catch: java.io.EOFException -> Lca
            r12.N(r5)
            r12.M(r6)
            int r6 = r12.a()
            r8 = 3
            if (r6 < r8) goto Lc2
            int r6 = r12.D()
            int r9 = r12.b
            int r9 = r9 - r8
            r12.b = r9
            r9 = 4801587(0x494433, float:6.728456E-39)
            if (r6 != r9) goto Laa
            r12.O(r8)
            int r6 = r12.A()
            r8 = 2
            if (r6 < r8) goto Lb6
            r8 = 4
            if (r6 > r8) goto Lb6
            r12.N(r5)
            int r4 = r12.b
            r5 = 6
            r12.O(r5)
            int r5 = r12.z()
            int r6 = r5 + 10
            long r8 = r13.p()
            r10 = -1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            long r8 = r13.k()
            long r10 = (long) r5
            long r8 = r8 + r10
            long r10 = r13.p()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L8e
            java.lang.String r12 = "Skipping ID3 tag with tagLength="
            java.lang.String r14 = " greater than input length="
            java.lang.StringBuilder r12 = defpackage.qx1.s(r6, r12, r14)
            long r14 = r13.p()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "Id3Peeker"
            defpackage.kb0.O(r14, r12)
            goto Lca
        L8e:
            if (r2 != 0) goto La4
            byte[] r2 = new byte[r6]
            byte[] r8 = r12.a
            java.lang.System.arraycopy(r8, r4, r2, r0, r7)
            r13.A(r2, r7, r5)
            fu2 r4 = new fu2
            r4.<init>(r14)
            fy3 r2 = r4.Y(r6, r2)
            goto La7
        La4:
            r13.l(r5)
        La7:
            int r3 = r3 + r6
            goto L8
        Laa:
            int r5 = r12.i()
            int r5 = defpackage.a34.a0(r5)
            r6 = -1
            if (r5 == r6) goto Lb6
            goto Lca
        Lb6:
            if (r4 != 0) goto Lbd
            r5 = 20
            r12.c(r5)
        Lbd:
            int r4 = r4 + 1
            if (r4 <= r15) goto L9
            goto Lca
        Lc2:
            int r13 = r12.b
            int r12 = r12.c
            defpackage.qi2.g(r13, r12)
            return r1
        Lca:
            r13.u()
            r13.l(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af2.o(c12, du2, int):fy3");
    }

    public boolean p(za3 za3Var) {
        if (!za3Var.I()) {
            ez2.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((zu5) this.y).remove(za3Var);
    }

    public void q(float f, long j) {
        vg0 y = ((dn0) this.y).y();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        y.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        y.c(f);
        y.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void r(float f, float f2, long j) {
        vg0 y = ((dn0) this.y).y();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        y.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        y.b(f, f2);
        y.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void s(float f, float f2) {
        ((dn0) this.y).y().o(f, f2);
    }

    @Override // defpackage.w25
    public int size() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5.a > ((defpackage.f41) r1).a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.ox5 r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r4 = r4.y
            sx5 r4 = (defpackage.sx5) r4
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            ox5 r1 = (defpackage.ox5) r1
            boolean r2 = r1 instanceof defpackage.ny4
            if (r2 != 0) goto L3c
            cn6 r2 = defpackage.cn6.b
            boolean r2 = defpackage.a34.i(r1, r2)
            if (r2 == 0) goto L1b
            goto L3c
        L1b:
            boolean r2 = r1 instanceof defpackage.f41
            if (r2 == 0) goto L29
            int r2 = r5.a
            r3 = r1
            f41 r3 = (defpackage.f41) r3
            int r3 = r3.a
            if (r2 <= r3) goto L3d
            goto L3c
        L29:
            boolean r2 = r1 instanceof defpackage.e32
            if (r2 == 0) goto L2e
            goto L3d
        L2e:
            boolean r4 = r1 instanceof defpackage.z94
            if (r4 == 0) goto L38
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.ze0.m(r4)
            return
        L38:
            defpackage.ze0.l()
            return
        L3c:
            r1 = r5
        L3d:
            boolean r0 = r4.j(r0, r1)
            if (r0 == 0) goto L7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af2.t(ox5):void");
    }

    public String toString() {
        switch (this.x) {
            case 18:
                return ((zu5) this.y).toString();
            default:
                return super.toString();
        }
    }

    public void u(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.y;
        if (!(serviceConnection instanceof o08) && concurrentHashMap.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        } else {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
            }
        }
    }

    public boolean v(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        boolean bindService2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.y;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((f97.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof o08)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (executor != null) {
                    bindService2 = context.bindService(intent, i, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i);
                }
                if (!bindService2) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return bindService2;
            } catch (Throwable th) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th;
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (executor != null) {
            bindService = context.bindService(intent, i, executor, serviceConnection);
        } else {
            bindService = context.bindService(intent, serviceConnection, i);
        }
        return bindService;
    }

    @Override // defpackage.w25
    public void release() {
    }

    public /* synthetic */ af2(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public af2(v65 v65Var) {
        this.x = (byte) 25;
        this.y = v65Var;
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
    }

    public /* synthetic */ af2(byte b, byte b2) {
        this.x = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[LOOP:1: B:14:0x0046->B:15:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public af2(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 7
            r0.x = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            pr[][] r4 = new defpackage.pr[r2]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L13:
            if (r6 >= r2) goto L6a
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L29
            if (r9 == r3) goto L32
            if (r9 == r11) goto L30
            if (r9 == r10) goto L2b
            r10 = 4
            if (r9 == r10) goto L29
            r10 = 5
            if (r9 == r10) goto L29
            r13 = r8
            goto L34
        L29:
            r13 = r10
            goto L34
        L2b:
            if (r7 != r3) goto L32
            goto L30
        L2e:
            r13 = r7
            goto L34
        L30:
            r7 = r11
            goto L2e
        L32:
            r7 = r3
            goto L2e
        L34:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            pr[] r11 = new defpackage.pr[r3]
            r12 = r5
        L46:
            if (r12 >= r3) goto L64
            int r16 = r12 * 2
            r17 = r12
            pr r12 = new pr
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L46
        L64:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L13
        L6a:
            r0.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af2.<init>(int[], float[], float[][]):void");
    }

    public af2(BottomSheetBehavior bottomSheetBehavior) {
        this.x = (byte) 10;
        this.y = bottomSheetBehavior;
        new la((Object) this, (byte) 1);
    }
}
