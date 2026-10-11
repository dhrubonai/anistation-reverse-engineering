package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class pz2 implements v96, ln0, cq, k76, h85, a05, o41, fj4, ys {
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public pz2(pz2 pz2Var) {
        z44 z44Var;
        this.x = (byte) 9;
        this.y = new z44(new jj0[16], 0);
        this.z = new z44(new jj0[16], 0);
        if (pz2Var != null && (z44Var = (z44) pz2Var.y) != null) {
            Object[] objArr = z44Var.x;
            int i = z44Var.z;
            for (int i2 = 0; i2 < i; i2++) {
                jj0 jj0Var = (jj0) objArr[i2];
                ((z44) this.y).b(new jj0(jj0Var.e, jj0Var.a, jj0Var.b, jj0Var.c, jj0Var.d));
            }
        }
    }

    public static io0 p(io0 io0Var, List list) {
        io0Var.getClass();
        Map map = io0Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new io0(hashMap);
    }

    @Override // defpackage.o41
    public q41 H() {
        return new s71((Context) this.y, ((o41) this.z).H());
    }

    @Override // defpackage.v96
    public void c(os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        byte b;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-238797401);
        if (kd2Var2.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i3 & 1, z)) {
            z22 z22Var = ar5.c;
            y50 y50Var = pk2.B;
            ic6 ic6Var = (ic6) this.y;
            String str = (String) this.z;
            vo3 c = b90.c(y50Var, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, z22Var);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, c);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            if (ic6Var.c().A.length() == 0) {
                kd2Var2.e0(-1218532503);
                b = 6;
                yc6.b(str, null, 0L, 0L, null, xk6.a, 0L, null, 0L, 0, false, 0, 0, new xd6(ep0.d, hz5.g(16), null, null, 0L, 0, 0, 0L, 16777212), kd2Var, 0, 12582912, 130942);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            } else {
                b = 6;
                kd2Var2.e0(-1218241227);
                kd2Var2.q(false);
            }
            os0Var.invoke(kd2Var2, Integer.valueOf(b));
            kd2Var2.q(true);
        } else {
            b = 6;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new q(b, i, this, os0Var);
        }
    }

    @Override // defpackage.fj4
    public Object d(Uri uri, t41 t41Var) {
        gm2 gm2Var = (gm2) ((fj4) this.y).d(uri, t41Var);
        List list = (List) this.z;
        if (list != null && !list.isEmpty()) {
            return (gm2) gm2Var.a(list);
        }
        return gm2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.h85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g85 e(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz2.e(java.lang.String):g85");
    }

    @Override // defpackage.a05
    public f33 f(zz4 zz4Var, Object obj) {
        f33 f33Var;
        vu0 vu0Var = (vu0) this.y;
        if (vu0Var == null) {
            vu0Var = null;
        }
        f33 f33Var2 = f33.x;
        if (vu0Var == null || (f33Var = vu0Var.f(zz4Var, obj)) == null) {
            f33Var = f33Var2;
        }
        if (f33Var == f33Var2) {
            k14 k14Var = (k14) this.z;
            k14Var.f = yo0.v0(k14Var.f, new ai4(zz4Var, obj));
            return f33.y;
        }
        return f33Var;
    }

    @Override // defpackage.h85
    public boolean g() {
        return ((h85) this.y).g();
    }

    @Override // defpackage.ys
    public at i(qr1 qr1Var, Looper looper, zs zsVar, ex1 ex1Var) {
        return new ou2((Context) this.y, qr1Var, zsVar, (r41) this.z, ex1Var.b);
    }

    public void j(jj0 jj0Var, int i, int i2, int i3, boolean z) {
        int i4;
        z44 z44Var = (z44) this.z;
        int i5 = z44Var.z;
        boolean z2 = true;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 != 0) {
            jj0 jj0Var2 = (jj0) z44Var.x[i5 - 1];
            i4 = jj0Var2.b - jj0Var2.d;
        } else {
            p65.h("MutableVector is empty.");
            return;
        }
        if (jj0Var == null) {
            int i6 = i - i4;
            jj0Var = new jj0(z, i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (!jj0Var.e && !z) {
                z2 = false;
            }
            jj0Var.e = z2;
            if (jj0Var.a > i) {
                jj0Var.a = i;
                jj0Var.c = i;
            }
            int i7 = jj0Var.b;
            if (i2 > i7) {
                int i8 = i7 - jj0Var.d;
                jj0Var.b = i2;
                jj0Var.d = i2 - i8;
            } else {
                i2 = i7;
            }
            jj0Var.b = i2 + i3;
        }
        z44Var.b(jj0Var);
    }

    public mc6 k(List list) {
        or1 or1Var;
        Exception e;
        long a;
        or1 or1Var2;
        nd6 nd6Var = null;
        try {
            int size = list.size();
            int i = 0;
            or1Var = null;
            while (i < size) {
                try {
                    or1Var2 = (or1) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    or1Var2.a((sr1) this.z);
                    i++;
                    or1Var = or1Var2;
                } catch (Exception e3) {
                    e = e3;
                    or1Var = or1Var2;
                    StringBuilder sb = new StringBuilder();
                    int g = ((wp) ((sr1) this.z).f).g();
                    nd6 h = ((sr1) this.z).h();
                    sr1 sr1Var = (sr1) this.z;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + g + ", composition=" + h + ", selection=" + nd6.i(fy5.a(sr1Var.b, sr1Var.c)) + "):");
                    sb.append('\n');
                    yo0.p0(list, sb, "\n", new lz0(or1Var, this, (byte) 6), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            sr1 sr1Var2 = (sr1) this.z;
            sr1Var2.getClass();
            ko koVar = new ko(((wp) sr1Var2.f).toString());
            sr1 sr1Var3 = (sr1) this.z;
            long a2 = fy5.a(sr1Var3.b, sr1Var3.c);
            nd6 nd6Var2 = new nd6(a2);
            if (!nd6.h(((mc6) this.y).b)) {
                nd6Var = nd6Var2;
            }
            if (nd6Var != null) {
                a = nd6Var.a;
            } else {
                a = fy5.a(nd6.f(a2), nd6.g(a2));
            }
            mc6 mc6Var = new mc6(koVar, a, ((sr1) this.z).h());
            this.y = mc6Var;
            return mc6Var;
        } catch (Exception e4) {
            or1Var = null;
            e = e4;
        }
    }

    public void l(Object obj, String str) {
        HashMap hashMap = (HashMap) this.y;
        obj.getClass();
        hashMap.put(str, obj);
        ((ArrayList) this.z).remove(str);
    }

    public void m() {
        this.y = null;
        this.z = null;
    }

    public void n() {
        ((z44) this.y).h();
    }

    public boolean o(int i) {
        return ((g42) this.y).a.get(i);
    }

    @Override // defpackage.k76
    public void onStart(mu2 mu2Var) {
        xh4 xh4Var;
        xh4 j;
        ev2 ev2Var = (ev2) this.y;
        qt qtVar = (qt) this.z;
        if (mu2Var != null) {
            xh4Var = o80.k(mu2Var, ev2Var.a);
        } else {
            xh4Var = null;
        }
        if (xh4Var == null && ((Boolean) wk6.o(ev2Var, iv2.a)).booleanValue() && (j = qtVar.j()) != null) {
            xh4Var = j;
        }
        qtVar.n(new nt(xh4Var));
    }

    public void q(n61 n61Var) {
        synchronized (n61Var) {
        }
        Handler handler = (Handler) this.y;
        if (handler != null) {
            handler.post(new bw(this, n61Var, (byte) 0));
        }
    }

    public Object r(e73 e73Var, ArrayList arrayList) {
        Object y45Var;
        Object y45Var2;
        Object putIfAbsent;
        int i = 0;
        switch (this.x) {
            case 10:
                Object j = m9.j((km0) this.z, t80.M(e73Var));
                j.getClass();
                v44 v44Var = (v44) j;
                Object obj = v44Var.a.get();
                if (obj == null) {
                    synchronized (v44Var) {
                        obj = v44Var.a.get();
                        if (obj == null) {
                            obj = new ni4();
                            v44Var.a = new SoftReference(obj);
                        }
                    }
                }
                ni4 ni4Var = (ni4) obj;
                ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new b83((y73) obj2));
                }
                ConcurrentHashMap concurrentHashMap = ni4Var.a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        y45Var = (x73) ((ic2) this.y).invoke(e73Var, arrayList);
                    } catch (Throwable th) {
                        y45Var = new y45(th);
                    }
                    z45 z45Var = new z45(y45Var);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, z45Var);
                    if (putIfAbsent2 == null) {
                        obj3 = z45Var;
                    } else {
                        obj3 = putIfAbsent2;
                    }
                }
                return ((z45) obj3).x;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.z;
                Class M = t80.M(e73Var);
                Object obj4 = concurrentHashMap2.get(M);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(M, (obj4 = new ni4()))) != null) {
                    obj4 = putIfAbsent;
                }
                ni4 ni4Var2 = (ni4) obj4;
                ArrayList arrayList3 = new ArrayList(zo0.V(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    arrayList3.add(new b83((y73) obj5));
                }
                ConcurrentHashMap concurrentHashMap3 = ni4Var2.a;
                Object obj6 = concurrentHashMap3.get(arrayList3);
                if (obj6 == null) {
                    try {
                        y45Var2 = (x73) ((ic2) this.y).invoke(e73Var, arrayList);
                    } catch (Throwable th2) {
                        y45Var2 = new y45(th2);
                    }
                    z45 z45Var2 = new z45(y45Var2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, z45Var2);
                    if (putIfAbsent3 == null) {
                        obj6 = z45Var2;
                    } else {
                        obj6 = putIfAbsent3;
                    }
                }
                return ((z45) obj6).x;
        }
    }

    public ClipboardManager s() {
        ClipboardManager clipboardManager = (ClipboardManager) this.z;
        if (clipboardManager == null) {
            Object systemService = ((Context) this.y).getSystemService("clipboard");
            systemService.getClass();
            ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
            this.z = clipboardManager2;
            return clipboardManager2;
        }
        return clipboardManager;
    }

    public b12 t(Object... objArr) {
        Constructor d;
        synchronized (((AtomicBoolean) this.z)) {
            if (!((AtomicBoolean) this.z).get()) {
                try {
                    d = ((v71) this.y).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.z).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            d = null;
        }
        if (d == null) {
            return null;
        }
        try {
            return (b12) d.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public String toString() {
        switch (this.x) {
            case 9:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                z44 z44Var = (z44) this.y;
                Object[] objArr = z44Var.x;
                int i = z44Var.z;
                for (int i2 = 0; i2 < i; i2++) {
                    jj0 jj0Var = (jj0) objArr[i2];
                    int i3 = jj0Var.c;
                    int i4 = jj0Var.d;
                    int i5 = jj0Var.a;
                    int i6 = jj0Var.b;
                    StringBuilder u = qx1.u("(", i3, ",", i4, ")->(");
                    u.append(i5);
                    u.append(",");
                    u.append(i6);
                    u.append(")");
                    sb.append(u.toString());
                    if (i2 < ((z44) this.y).z - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public InputMethodManager u() {
        return (InputMethodManager) ((rb3) this.z).getValue();
    }

    public void v() {
        String str = (String) this.y;
        if (((FileChannel) this.z) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.z = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.z;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.z = null;
                throw new IllegalStateException(qx1.m("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public void w(io0 io0Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.y).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!p(io0Var, list).equals(p((io0) this.z, list))) {
                    throw null;
                }
            } else {
                ov3.d();
                return;
            }
        }
        this.z = io0Var;
    }

    public void x(Exception exc, boolean z) {
        int i;
        this.z = null;
        HashSet hashSet = (HashSet) this.y;
        nw2 o = nw2.o(hashSet);
        hashSet.clear();
        z62 listIterator = o.listIterator(0);
        while (listIterator.hasNext()) {
            b81 b81Var = (b81) listIterator.next();
            b81Var.getClass();
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            b81Var.j(exc, i);
        }
    }

    public void y(b81 b81Var) {
        ((HashSet) this.y).add(b81Var);
        if (((b81) this.z) != null) {
            return;
        }
        this.z = b81Var;
        wx1 k = b81Var.b.k();
        b81Var.z = k;
        z71 z71Var = b81Var.s;
        String str = eq6.a;
        k.getClass();
        z71Var.getClass();
        z71Var.obtainMessage(1, new a81(ij3.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), k)).sendToTarget();
    }

    @Override // defpackage.a05
    public void a() {
    }

    @Override // defpackage.a05
    public void b(Object obj) {
    }

    @Override // defpackage.k76
    public void onError(mu2 mu2Var) {
    }

    @Override // defpackage.k76
    public void onSuccess(mu2 mu2Var) {
    }

    public void h(int i, float f) {
    }

    public /* synthetic */ pz2(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public /* synthetic */ pz2(byte b, boolean z) {
        this.x = b;
    }

    public pz2(kz kzVar) {
        this.x = (byte) 14;
        this.y = kzVar;
        this.z = new ArrayList();
    }

    public pz2(String str) {
        this.x = (byte) 23;
        this.y = str.concat(".lck");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pz2(Context context, byte b) {
        this(context, new cn7((byte) 15));
        this.x = b;
        switch (b) {
            case 16:
                return;
            default:
                this.y = context;
                return;
        }
    }

    public pz2(View view) {
        this.x = (byte) 0;
        this.y = view;
        this.z = bx7.B(jf3.z, new vt0(this, (byte) 14));
    }

    public pz2(o65 o65Var, h85 h85Var) {
        this.x = (byte) 7;
        h85Var.getClass();
        this.z = o65Var;
        this.y = h85Var;
    }

    public pz2(byte b) {
        this.x = b;
        switch (b) {
            case 17:
                this.y = new HashSet();
                return;
            case 22:
                this.y = new HashMap();
                this.z = io0.b;
                return;
            default:
                this.y = new HashMap();
                this.z = new ArrayList();
                return;
        }
    }

    public pz2(Context context, o41 o41Var) {
        this.x = (byte) 16;
        this.y = context.getApplicationContext();
        this.z = o41Var;
    }

    public pz2(g42 g42Var, SparseArray sparseArray) {
        this.x = (byte) 2;
        this.y = g42Var;
        SparseBooleanArray sparseBooleanArray = g42Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a = g42Var.a(i);
            q7 q7Var = (q7) sparseArray.get(a);
            q7Var.getClass();
            sparseArray2.append(a, q7Var);
        }
        this.z = sparseArray2;
    }

    public pz2(ic2 ic2Var, byte b) {
        this.x = b;
        switch (b) {
            case 12:
                this.y = ic2Var;
                this.z = new ConcurrentHashMap();
                return;
            default:
                this.y = ic2Var;
                this.z = new km0();
                return;
        }
    }

    public pz2(MediaCodec.CryptoInfo cryptoInfo) {
        this.x = (byte) 15;
        this.y = cryptoInfo;
        this.z = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public pz2(ArrayList arrayList, ArrayList arrayList2) {
        this.x = (byte) 26;
        int size = arrayList.size();
        this.y = new int[size];
        this.z = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.y)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.z)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public pz2(int i, int i2) {
        this.x = (byte) 26;
        this.y = new int[]{i, i2};
        this.z = new float[]{0.0f, 1.0f};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.text.Editable$Factory, ps1] */
    public pz2(rp rpVar) {
        this.x = (byte) 21;
        this.y = rpVar;
        ct1 ct1Var = new ct1(rpVar);
        this.z = ct1Var;
        rpVar.addTextChangedListener(ct1Var);
        if (ps1.b == null) {
            synchronized (ps1.a) {
                try {
                    if (ps1.b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            ps1.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ps1.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ps1.b = factory;
                    }
                } finally {
                }
            }
        }
        rpVar.setEditableFactory(ps1.b);
    }

    public pz2(int i, int i2, int i3) {
        this.x = (byte) 26;
        this.y = new int[]{i, i2, i3};
        this.z = new float[]{0.0f, 0.5f, 1.0f};
    }

    public pz2(kc1 kc1Var) {
        this.x = (byte) 19;
        this.z = kc1Var;
    }

    public pz2(or2 or2Var, int i, f91 f91Var, Throwable th) {
        this.x = (byte) 28;
        or2Var.getClass();
        this.y = or2Var;
        this.z = f91Var;
    }

    public pz2(v71 v71Var) {
        this.x = (byte) 18;
        this.y = v71Var;
        this.z = new AtomicBoolean(false);
    }

    public pz2(eq eqVar) {
        this.x = (byte) 4;
        this.z = eqVar;
        this.y = eqVar;
    }
}
