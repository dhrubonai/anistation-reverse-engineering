package defpackage;

import android.app.RemoteAction;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Trace;
import com.anistation.android.R;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nj4 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nj4(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.sb2
    public final Object invoke() {
        int X;
        ai4 ai4Var;
        ai4 ai4Var2;
        long j;
        sb2 sb2Var;
        a05 a05Var;
        char c;
        boolean z;
        long j2;
        long j3;
        byte b = 9;
        long j4 = -9187201950435737472L;
        char c2 = 7;
        boolean z2 = true;
        boolean z3 = false;
        fc fcVar = null;
        switch (this.x) {
            case 0:
                pj4 pj4Var = (pj4) this.y;
                return pj4Var.x.e(pj4Var.y);
            case 1:
                fr4 fr4Var = (fr4) this.y;
                aj5 buildSerialDescriptor = dj5.buildSerialDescriptor("kotlinx.serialization.Polymorphic", er4.a, new aj5[0], new pz3(fr4Var, b));
                e73 e73Var = fr4Var.a;
                buildSerialDescriptor.getClass();
                return new pz0(buildSerialDescriptor, e73Var);
            case 2:
                return Boolean.valueOf(vr4.m((vr4) this.y));
            case 3:
                File file = (File) ((va1) this.y).invoke();
                String name = file.getName();
                name.getClass();
                if (uz5.n0('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                ze0.h("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                return null;
            case 4:
                float f = 1.0f;
                if (((bx4) this.y).a.a() < 1.0f) {
                    f = 0.3f;
                }
                return Float.valueOf(f);
            case 5:
                p05 p05Var = (p05) this.y;
                p05Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    p05Var.a();
                    Trace.endSection();
                    return pn6.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 6:
                d45 d45Var = (d45) this.y;
                ClassLoader classLoader = d45Var.z;
                n22 n22Var = d45Var.A;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Object obj = list.get(i);
                    i++;
                    URL url = (URL) obj;
                    url.getClass();
                    if (!a34.i(url.getProtocol(), "file")) {
                        ai4Var2 = null;
                    } else {
                        String str = qj4.y;
                        ai4Var2 = new ai4(n22Var, r18.n(new File(url.toURI())));
                    }
                    if (ai4Var2 != null) {
                        arrayList.add(ai4Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = list2.get(i2);
                    i2++;
                    URL url2 = (URL) obj2;
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (!b06.I(url3, "jar:file:", false) || (X = uz5.X(6, url3, "!")) == -1) {
                        ai4Var = null;
                    } else {
                        String str2 = qj4.y;
                        ai4Var = new ai4(iz5.g(r18.n(new File(URI.create(url3.substring(4, X)))), n22Var, new rs4(b)), d45.C);
                    }
                    if (ai4Var != null) {
                        arrayList2.add(ai4Var);
                    }
                }
                return yo0.u0(arrayList2, arrayList);
            case 7:
                ((Runnable) this.y).run();
                return pn6.a;
            case 8:
                return ((Callable) this.y).call();
            case 9:
                i95 i95Var = (i95) this.y;
                ja5 ja5Var = i95Var.x;
                Object obj3 = i95Var.A;
                if (obj3 != null) {
                    return ja5Var.u(i95Var, obj3);
                }
                ze0.k("Value should be initialized");
                return null;
            case 10:
                fa5 fa5Var = ((q95) this.y).z;
                if (fa5Var == null) {
                    return null;
                }
                Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
                fa5Var.b(g);
                if (g.isEmpty()) {
                    return null;
                }
                return g;
            case 11:
                return w65.D((ew6) this.y);
            case 12:
                ga5 ga5Var = (ga5) this.y;
                ga5Var.getLifecycle().a(new m05(ga5Var, (byte) 0));
                return pn6.a;
            case 13:
                ad5 ad5Var = (ad5) this.y;
                gc gcVar = (gc) t80.C(ad5Var, fh4.a);
                ad5Var.X = gcVar;
                if (gcVar != null) {
                    fcVar = new fc(gcVar.a, gcVar.b, gcVar.c, gcVar.d);
                }
                ad5Var.Y = fcVar;
                return pn6.a;
            case 14:
                return dj5.buildSerialDescriptor("com.anistation.navigation.Route", er4.b, new aj5[0], new ud5((vd5) this.y, (byte) 0));
            case 15:
                return ((ic6) this.y).c().A.toString();
            case 16:
                sf5 sf5Var = (sf5) this.y;
                xi6 xi6Var = sf5Var.B;
                if (xi6Var != null) {
                    j = ((Number) xi6Var.m.getValue()).longValue();
                } else {
                    j = 0;
                }
                sf5Var.C = j;
                return pn6.a;
            case 17:
                return this.y;
            case 18:
                cj5 cj5Var = (cj5) this.y;
                return Integer.valueOf(o80.z(cj5Var, cj5Var.k));
            case 19:
                ((sm3) this.y).a(new String[]{"application/vnd.anistation.backup+json", "application/json", "application/octet-stream", "*/*"});
                return pn6.a;
            case 20:
                Resources resources3 = (Resources) this.y;
                si siVar = si.a;
                String string = resources3.getString(R.string.backup_saved);
                string.getClass();
                si.b.d(string);
                return pn6.a;
            case 21:
                gl5 gl5Var = (gl5) this.y;
                gl5Var.g.invoke(gl5Var.d);
                return pn6.a;
            case 22:
                jm5 jm5Var = (jm5) this.y;
                ti4 ti4Var = jm5Var.z;
                if (((uq5) ti4Var.getValue()).a == 9205357640488583168L || uq5.f(((uq5) ti4Var.getValue()).a)) {
                    return null;
                }
                return jm5Var.x.b(((uq5) ti4Var.getValue()).a);
            case 23:
                return ((do5) this.y).d;
            case 24:
                tr5 tr5Var = (tr5) this.y;
                if (!((Boolean) tr5Var.K.getValue()).booleanValue() && (sb2Var = tr5Var.y) != null) {
                    sb2Var.invoke();
                }
                return pn6.a;
            case 25:
                l12 l12Var = (l12) this.y;
                if (!a34.i(null, l12Var.a)) {
                    dp0.a0(l12Var.b, new tg5((byte) 16));
                    zz4 zz4Var = l12Var.c;
                    if (zz4Var != null && (a05Var = zz4Var.a) != null) {
                        a05Var.f(zz4Var, null);
                    }
                }
                return pn6.a;
            case 26:
                long j5 = 128;
                eu5 eu5Var = (eu5) this.y;
                while (true) {
                    synchronized (eu5Var.g) {
                        try {
                            if (!eu5Var.c) {
                                eu5Var.c = z2;
                                try {
                                    z44 z44Var = eu5Var.f;
                                    Object[] objArr = z44Var.x;
                                    int i3 = z44Var.z;
                                    for (?? r4 = z3; r4 < i3; r4++) {
                                        try {
                                            du5 du5Var = (du5) objArr[r4];
                                            q44 q44Var = du5Var.g;
                                            ub2 ub2Var = du5Var.a;
                                            Object[] objArr2 = q44Var.b;
                                            long[] jArr = q44Var.a;
                                            int length = jArr.length - 2;
                                            char c3 = c2;
                                            if (length >= 0) {
                                                ?? r14 = z3;
                                                while (true) {
                                                    long j6 = jArr[r14];
                                                    int i4 = length;
                                                    if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i5 = 8 - ((~(r14 - i4)) >>> 31);
                                                        int i6 = 0;
                                                        while (i6 < i5) {
                                                            if ((j6 & 255) < j5) {
                                                                ub2Var.invoke(objArr2[(r14 << 3) + i6]);
                                                            }
                                                            j6 >>= 8;
                                                            i6++;
                                                            j5 = 128;
                                                        }
                                                        if (i5 != 8) {
                                                        }
                                                    }
                                                    length = i4;
                                                    if (r14 != length) {
                                                        j5 = 128;
                                                        r14++;
                                                    }
                                                }
                                            }
                                            q44Var.b();
                                            c2 = c3;
                                            z3 = false;
                                            j5 = 128;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z = false;
                                            eu5Var.c = z;
                                            throw th;
                                        }
                                    }
                                    c = c2;
                                    eu5Var.c = z3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = z3;
                                }
                            } else {
                                c = c2;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!eu5Var.c()) {
                        return pn6.a;
                    }
                    c2 = c;
                    z2 = true;
                    z3 = false;
                    j5 = 128;
                }
            case 27:
                mb3 a = ((w06) this.y).a();
                za3 za3Var = a.x;
                if (a.K != ((z44) ((d44) za3Var.o()).y).z) {
                    p44 p44Var = a.C;
                    Object[] objArr3 = p44Var.c;
                    long[] jArr2 = p44Var.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j7 = jArr2[i7];
                            if ((((~j7) << 7) & j7 & j4) != j4) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j7 & 255) < 128) {
                                        j3 = j4;
                                        ((fb3) objArr3[(i7 << 3) + i9]).d = true;
                                    } else {
                                        j3 = j4;
                                    }
                                    j7 >>= 8;
                                    i9++;
                                    j4 = j3;
                                }
                                j2 = j4;
                                if (i8 != 8) {
                                }
                            } else {
                                j2 = j4;
                            }
                            if (i7 != length2) {
                                i7++;
                                j4 = j2;
                            }
                        }
                    }
                    if (za3Var.E != null) {
                        if (!za3Var.d0.e) {
                            za3.U(za3Var, false, 7);
                        }
                    } else if (!za3Var.q()) {
                        za3.W(za3Var, false, 7);
                    }
                }
                return pn6.a;
            case 28:
                i86 i86Var = (i86) this.y;
                i86Var.Z = null;
                z51.w(i86Var);
                w65.E(i86Var);
                v94.y(i86Var);
                return Boolean.TRUE;
            default:
                lz5.d(((RemoteAction) this.y).getActionIntent());
                return pn6.a;
        }
    }
}
