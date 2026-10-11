package f9;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b4.j0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r6.h0;

/* loaded from: classes.dex */
public final class x implements b4.y, b4.n, e4.o, e4.e0, v3.o, h4.a, i4.h, i4.g, i4.o, q4.c, q4.a, com.google.android.gms.common.internal.r, com.google.android.gms.common.api.internal.t, d2.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f4108a;

    public /* synthetic */ x(int i10) {
        this.f4108a = i10;
    }

    public static final String k(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z9;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f8345e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z10 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z10) {
                    i12 = 46;
                    z9 = false;
                } else {
                    byte b10 = bArr2[i19][i20];
                    byte[] bArr4 = z8.b.f12133a;
                    int i22 = b10 & 255;
                    z9 = z10;
                    i12 = i22;
                }
                byte b11 = bArr[i16 + i21];
                byte[] bArr5 = z8.b.f12133a;
                i13 = i12 - (b11 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length == i20) {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z10 = true;
                } else {
                    z10 = z9;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            h0.s(charset, "UTF_8");
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    public static ArrayList l(List list) {
        boolean z9;
        h0.u(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((y8.x) obj) != y8.x.HTTP_1_0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x6.j.o0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y8.x) it.next()).f11846a);
        }
        return arrayList2;
    }

    public static k9.e m() {
        k9.e eVar = k9.e.f6514l;
        h0.q(eVar);
        k9.e eVar2 = eVar.f6516f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            k9.e.f6511i.await(k9.e.f6512j, TimeUnit.MILLISECONDS);
            k9.e eVar3 = k9.e.f6514l;
            h0.q(eVar3);
            if (eVar3.f6516f != null || System.nanoTime() - nanoTime < k9.e.f6513k) {
                return null;
            }
            return k9.e.f6514l;
        }
        long nanoTime2 = eVar2.f6517g - System.nanoTime();
        if (nanoTime2 > 0) {
            k9.e.f6511i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        k9.e eVar4 = k9.e.f6514l;
        h0.q(eVar4);
        eVar4.f6516f = eVar2.f6516f;
        eVar2.f6516f = null;
        return eVar2;
    }

    public static void r(long j4, k9.g gVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        boolean z9;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        k9.g gVar2;
        long j10;
        boolean z11;
        int i17 = i10;
        if (i11 < i12) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (((k9.j) arrayList.get(i18)).c() >= i17) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            k9.j jVar = (k9.j) arrayList.get(i11);
            k9.j jVar2 = (k9.j) arrayList.get(i12 - 1);
            int i19 = -1;
            if (i17 == jVar.c()) {
                int intValue = ((Number) arrayList2.get(i11)).intValue();
                int i20 = i11 + 1;
                k9.j jVar3 = (k9.j) arrayList.get(i20);
                i13 = i20;
                i14 = intValue;
                jVar = jVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (jVar.f(i17) != jVar2.f(i17)) {
                int i21 = 1;
                for (int i22 = i13 + 1; i22 < i12; i22++) {
                    if (((k9.j) arrayList.get(i22 - 1)).f(i17) != ((k9.j) arrayList.get(i22)).f(i17)) {
                        i21++;
                    }
                }
                long j11 = 4;
                long j12 = (i21 * 2) + (gVar.f6521b / j11) + j4 + 2;
                gVar.N(i21);
                gVar.N(i14);
                for (int i23 = i13; i23 < i12; i23++) {
                    int f10 = ((k9.j) arrayList.get(i23)).f(i17);
                    if (i23 == i13 || f10 != ((k9.j) arrayList.get(i23 - 1)).f(i17)) {
                        gVar.N(f10 & 255);
                    }
                }
                k9.g gVar3 = new k9.g();
                while (i13 < i12) {
                    byte f11 = ((k9.j) arrayList.get(i13)).f(i17);
                    int i24 = i13 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i12) {
                            if (f11 != ((k9.j) arrayList.get(i25)).f(i17)) {
                                i15 = i25;
                                break;
                            }
                            i25++;
                        } else {
                            i15 = i12;
                            break;
                        }
                    }
                    if (i24 == i15 && i17 + 1 == ((k9.j) arrayList.get(i13)).c()) {
                        gVar.N(((Number) arrayList2.get(i13)).intValue());
                        i16 = i15;
                        gVar2 = gVar3;
                        j10 = j11;
                    } else {
                        gVar.N(((int) ((gVar3.f6521b / j11) + j12)) * i19);
                        i16 = i15;
                        gVar2 = gVar3;
                        j10 = j11;
                        r(j12, gVar3, i17 + 1, arrayList, i13, i16, arrayList2);
                    }
                    gVar3 = gVar2;
                    i13 = i16;
                    j11 = j10;
                    i19 = -1;
                }
                gVar.e(gVar3);
                return;
            }
            int min = Math.min(jVar.c(), jVar2.c());
            int i26 = 0;
            for (int i27 = i17; i27 < min && jVar.f(i27) == jVar2.f(i27); i27++) {
                i26++;
            }
            long j13 = 4;
            long j14 = (gVar.f6521b / j13) + j4 + 2 + i26 + 1;
            gVar.N(-i26);
            gVar.N(i14);
            int i28 = i17 + i26;
            while (i17 < i28) {
                gVar.N(jVar.f(i17) & 255);
                i17++;
            }
            if (i13 + 1 == i12) {
                if (i28 == ((k9.j) arrayList.get(i13)).c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    gVar.N(((Number) arrayList2.get(i13)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            k9.g gVar4 = new k9.g();
            gVar.N(((int) ((gVar4.f6521b / j13) + j14)) * (-1));
            r(j14, gVar4, i28, arrayList, i13, i12, arrayList2);
            gVar.e(gVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static byte[] t(List list) {
        h0.u(list, "protocols");
        k9.g gVar = new k9.g();
        Iterator it = l(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            gVar.K(str.length());
            gVar.Q(str);
        }
        return gVar.l();
    }

    public static k9.j u(String str) {
        boolean z9;
        if (str.length() % 2 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (w7.b.b(str.charAt(i11 + 1)) + (w7.b.b(str.charAt(i11)) << 4));
            }
            return new k9.j(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static k9.j v(String str) {
        h0.u(str, "<this>");
        byte[] bytes = str.getBytes(o7.a.f8311a);
        h0.s(bytes, "this as java.lang.String).getBytes(charset)");
        k9.j jVar = new k9.j(bytes);
        jVar.f6525c = str;
        return jVar;
    }

    public static boolean x() {
        return h0.g("Dalvik", System.getProperty("java.vm.name"));
    }

    public static k9.j z(byte[] bArr) {
        k9.j jVar = k9.j.f6522d;
        int length = bArr.length;
        q6.g.h(bArr.length, 0, length);
        return new k9.j(x6.i.j1(bArr, 0, length + 0));
    }

    @Override // e4.o
    public void a(Bitmap bitmap, y3.d dVar) {
    }

    @Override // d2.r
    public void b() {
        switch (this.f4108a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // i4.h
    public void c(i4.j jVar) {
        jVar.j();
    }

    @Override // i4.g
    public void d(Activity activity) {
    }

    @Override // i4.h
    public void e(i4.j jVar) {
    }

    @Override // h4.a
    public x3.e0 f(x3.e0 e0Var, v3.l lVar) {
        s0.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((u3.e) ((g4.c) e0Var.get()).f4400a.f4399a.f4416a).f10227d.asReadOnlyBuffer();
        AtomicReference atomicReference = p4.b.f8557a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new s0.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f9727a == 0) {
            if (bVar.f9728b == ((byte[]) bVar.f9729c).length) {
                bArr = asReadOnlyBuffer.array();
                return new e4.z(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new e4.z(bArr);
    }

    @Override // q4.a
    public Object g() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception getException(Status status) {
        return p7.a0.s(status);
    }

    @Override // e4.o
    public void h() {
    }

    @Override // d2.r
    public d2.g0 i(int i10, int i11) {
        switch (this.f4108a) {
            case 0:
                return new d2.o();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // b4.y
    public b4.x j(b4.c0 c0Var) {
        int i10 = 0;
        switch (this.f4108a) {
            case 0:
                return new b4.h(i10);
            case 1:
            case 2:
            case 3:
            default:
                return new b4.e0(c0Var.b(b4.o.class, InputStream.class), 1);
            case 4:
                return new b4.e0(c0Var.b(Uri.class, AssetFileDescriptor.class), i10);
            case 5:
                return new b4.e0(c0Var.b(Uri.class, ParcelFileDescriptor.class), i10);
            case 6:
                return new b4.e0(c0Var.b(Uri.class, InputStream.class), i10);
            case zzaja.zze.zzg /* 7 */:
                return new j0(c0Var.b(b4.o.class, InputStream.class));
        }
    }

    @Override // com.google.android.gms.common.internal.r
    public Object n(com.google.android.gms.common.api.s sVar) {
        return ((z4.a) sVar).f12056b;
    }

    public g9.l o() {
        switch (this.f4108a) {
            case 3:
                if (!y()) {
                    return null;
                }
                return new g9.a();
            case 4:
                if (!y()) {
                    return null;
                }
                return new g9.c();
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    h0.s(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    h0.s(method, "putMethod");
                    h0.s(method2, "getMethod");
                    h0.s(method3, "removeMethod");
                    h0.s(cls3, "clientProviderClass");
                    h0.s(cls4, "serverProviderClass");
                    return new g9.i(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    @Override // v3.c
    public boolean p(Object obj, File file, v3.l lVar) {
        try {
            p4.b.d(((u3.e) ((g4.c) ((x3.e0) obj).get()).f4400a.f4399a.f4416a).f10227d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // v3.o
    public int q(v3.l lVar) {
        return 1;
    }

    @Override // d2.r
    public void s(d2.b0 b0Var) {
        switch (this.f4108a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public h9.l w() {
        switch (this.f4108a) {
            case 13:
                return h9.h.f5172b;
            default:
                return h9.k.f5177b;
        }
    }

    public boolean y() {
        switch (this.f4108a) {
            case 3:
                return g9.a.f4490e;
            case 4:
                return g9.c.f4495f;
            case 5:
                return g9.d.f4499e;
            case 6:
            case zzaja.zze.zzg /* 7 */:
            default:
                g9.l lVar = g9.l.f4517a;
                if (x() && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 8:
                return g9.k.f4515e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, int i11) {
        this(24);
        this.f4108a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case zzaja.zze.zzg /* 7 */:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                return;
            default:
                this(0);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x() {
        this(10);
        this.f4108a = 10;
    }
}
