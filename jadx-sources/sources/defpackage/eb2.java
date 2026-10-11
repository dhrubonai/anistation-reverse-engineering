package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class eb2 implements xx1, xc2, f60 {
    public static final v71 B = new v71(28);
    public Object A;
    public final /* synthetic */ byte x;
    public int y;
    public Object z;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eb2(defpackage.f13 r13, defpackage.db r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb2.<init>(f13, db):void");
    }

    @Override // defpackage.xx1
    public void A(byte[] bArr) {
        ((MediaDrm) this.A).provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
    
        if (java.util.Objects.equals(r1, "aidl-1") == false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e8  */
    @Override // defpackage.xx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.vx1 B(byte[] r15, java.util.List r16, int r17, java.util.HashMap r18) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb2.B(byte[], java.util.List, int, java.util.HashMap):vx1");
    }

    public eb2 C(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.y) * 2;
            Object[] objArr = (Object[]) this.z;
            if (size > objArr.length) {
                this.z = Arrays.copyOf(objArr, fw2.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            y(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public eb2 D(Map map) {
        return C(map.entrySet());
    }

    @Override // defpackage.xx1
    public int E() {
        return 2;
    }

    public void F(int i, int i2, int i3, long j) {
        int i4;
        long j2;
        char c;
        int i5;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i6 = o05.b;
            long j3 = -1125899873288193L;
            int i7 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.z;
            long[] jArr2 = (long[]) this.A;
            int i8 = this.y;
            jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
            int i9 = 1;
            while (i9 > 0) {
                i9--;
                long j4 = jArr2[i9];
                int i10 = ((int) j4) & i7;
                int i11 = ((int) (j4 >> c3)) & i7;
                int i12 = ((int) (j4 >> c2)) & 1023;
                if (i12 == 1023) {
                    i4 = i8;
                } else {
                    i4 = (i12 * 3) + i11;
                }
                if (i11 >= 0) {
                    while (i11 < i8 - 2 && i11 <= i4) {
                        int i13 = i11 + 2;
                        long j5 = jArr[i13];
                        char c4 = c2;
                        int i14 = i7;
                        if ((((int) (j5 >> c3)) & i14) == i10) {
                            long j6 = jArr[i11];
                            int i15 = i11 + 1;
                            j2 = j3;
                            long j7 = jArr[i15];
                            c = c3;
                            i5 = i4;
                            jArr[i11] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
                            jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
                            jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                            if ((((int) (j5 >> c4)) & 1023) > 0) {
                                int i16 = o05.b;
                                jArr2[i9] = (j5 & j2) | (((i11 + 3) & i14) << c);
                                i9++;
                            }
                        } else {
                            j2 = j3;
                            c = c3;
                            i5 = i4;
                        }
                        i11 += 3;
                        i4 = i5;
                        c3 = c;
                        i7 = i14;
                        c2 = c4;
                        j3 = j2;
                    }
                    c3 = c3;
                    i7 = i7;
                    c2 = c2;
                    j3 = j3;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.xx1
    public void H(byte[] bArr, cp4 cp4Var) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = (MediaDrm) this.A;
                LogSessionId a = cp4Var.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                    playbackComponent.getClass();
                    sh1.d(playbackComponent).setLogSessionId(a);
                }
            } catch (UnsupportedOperationException unused2) {
                kb0.O("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.xx1
    public boolean J(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        boolean requiresSecureDecoder;
        MediaDrm mediaDrm = (MediaDrm) this.A;
        UUID uuid = (UUID) this.z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (uuid.equals(ce0.e)) {
                if (i < 37) {
                    String propertyString = mediaDrm.getPropertyString("version");
                    if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                        equals = false;
                    }
                }
                equals = true;
            } else {
                equals = uuid.equals(ce0.d);
            }
            if (equals) {
                requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
                return requiresSecureDecoder;
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(uuid, bArr);
            } catch (MediaCryptoException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(ce0.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // defpackage.f60
    public e60 a(c12 c12Var, long j) {
        long j2;
        long position = c12Var.getPosition();
        int min = (int) Math.min(112800L, c12Var.p() - position);
        zi4 zi4Var = (zi4) this.A;
        zi4Var.K(min);
        c12Var.A(zi4Var.a, 0, min);
        int i = zi4Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (zi4Var.a() >= 188) {
                byte[] bArr = zi4Var.a;
                int i2 = zi4Var.b;
                while (true) {
                    if (i2 < i) {
                        j2 = -9223372036854775807L;
                        if (bArr[i2] == 71) {
                            break;
                        }
                        i2++;
                    } else {
                        j2 = -9223372036854775807L;
                        break;
                    }
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long d = ov5.d(zi4Var, i2, this.y);
                if (d != j2) {
                    long b = ((tf6) this.z).b(d);
                    if (b > j) {
                        if (j5 == j2) {
                            return new e60(b, -1, position);
                        }
                        return new e60(-9223372036854775807L, 0, position + j4);
                    }
                    j5 = b;
                    if (100000 + j5 > j) {
                        return new e60(-9223372036854775807L, 0, position + i2);
                    }
                    j4 = i2;
                }
                zi4Var.N(i3);
                j3 = i3;
            } else {
                j2 = -9223372036854775807L;
                break;
            }
        }
        if (j5 != j2) {
            return new e60(j5, -2, position + j3);
        }
        return e60.d;
    }

    @Override // defpackage.f60
    public void b() {
        zi4 zi4Var = (zi4) this.A;
        byte[] bArr = eq6.b;
        zi4Var.L(bArr.length, bArr);
    }

    @Override // defpackage.xx1
    public Map c(byte[] bArr) {
        return ((MediaDrm) this.A).queryKeyStatus(bArr);
    }

    public void d(int i, id3 id3Var) {
        if (i < 0) {
            hz2.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        g23 g23Var = new g23(this.y, i, id3Var);
        this.y += i;
        ((z44) this.z).b(g23Var);
    }

    public t15 e(boolean z) {
        qw2 qw2Var;
        qw2 qw2Var2;
        if (z && (qw2Var2 = (qw2) this.A) != null) {
            throw qw2Var2.a();
        }
        t15 j = t15.j(this.y, (Object[]) this.z, this);
        if (z && (qw2Var = (qw2) this.A) != null) {
            throw qw2Var.a();
        }
        return j;
    }

    public rw2 f() {
        return e(false);
    }

    public rw2 g() {
        return e(true);
    }

    public void h(ay0 ay0Var) {
        Iterator it = ((CopyOnWriteArrayList) this.A).iterator();
        while (it.hasNext()) {
            pw3 pw3Var = (pw3) it.next();
            eq6.a0(pw3Var.a, new f32((Object) ay0Var, (Object) pw3Var.b, (byte) 16));
        }
    }

    public g23 i(int i) {
        if (i < 0 || i >= this.y) {
            hz2.e("Index " + i + ", size " + this.y);
        }
        g23 g23Var = (g23) this.A;
        if (g23Var != null) {
            int i2 = g23Var.a;
            if (i < g23Var.b + i2 && i2 <= i) {
                return g23Var;
            }
        }
        z44 z44Var = (z44) this.z;
        g23 g23Var2 = (g23) z44Var.x[x97.o(i, z44Var)];
        this.A = g23Var2;
        return g23Var2;
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.z;
        if (this.y == -1) {
            this.y = 0;
        }
        while (true) {
            int i2 = this.y;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.y--;
        }
        while (this.y < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.y + 1)) {
            this.y++;
        }
        return sparseArray.valueAt(this.y);
    }

    @Override // defpackage.xx1
    public wx1 k() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.A).getProvisionRequest();
        return new wx1(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public int l(Object obj) {
        b44 b44Var = (b44) this.z;
        int d = b44Var.d(obj);
        if (d >= 0) {
            return b44Var.c[d];
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        Object[] objArr;
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.z;
        int i9 = this.y;
        int i10 = i9 + 3;
        this.y = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.z = Arrays.copyOf(jArr, max);
            this.A = Arrays.copyOf((long[]) this.A, max);
        }
        long[] jArr2 = (long[]) this.z;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        boolean z4 = false;
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 == -1) {
            return i9;
        }
        if (i7 != -4) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr == false) {
            ez2.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if ((33554431 & ((int) j)) == i11) {
            z4 = true;
        }
        if (!z4) {
            ez2.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = o05.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, 1023) << 50);
        return i9;
    }

    @Override // defpackage.xx1
    public cb2 n(byte[] bArr) {
        return new cb2((UUID) this.z, bArr);
    }

    @Override // defpackage.xx1
    public byte[] o() {
        return ((MediaDrm) this.A).openSession();
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        List list = (List) obj;
        wu3 wu3Var = (wu3) this.A;
        bu3 bu3Var = wu3Var.i;
        dt3 dt3Var = (dt3) this.z;
        int i = this.y;
        bu3Var.getClass();
        bu3 bu3Var2 = wu3Var.i;
        if (i == -1) {
            bu3Var2.t();
            bu3Var2.t.E0(list);
        } else {
            bu3Var2.t();
            bu3Var2.t.c0(i, list);
        }
        fo4 fo4Var = new fo4();
        fo4Var.a.a(20);
        fo4Var.b();
        bu3Var2.n(dt3Var);
    }

    public void p(ij3 ij3Var, int i, int i2, ea2 ea2Var, int i3, Object obj, long j, long j2) {
        h(new nw3(this, ij3Var, new fr3(i, i2, ea2Var, i3, obj, eq6.l0(j), eq6.l0(j2)), (byte) 1));
    }

    public void q(ij3 ij3Var, int i, int i2, ea2 ea2Var, int i3, Object obj, long j, long j2) {
        h(new nw3(this, ij3Var, new fr3(i, i2, ea2Var, i3, obj, eq6.l0(j), eq6.l0(j2)), (byte) 0));
    }

    public void r(ij3 ij3Var, int i, int i2, ea2 ea2Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new ow3(this, ij3Var, new fr3(i, i2, ea2Var, i3, obj, eq6.l0(j), eq6.l0(j2)), iOException, z));
    }

    @Override // defpackage.xx1
    public synchronized void release() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ((MediaDrm) this.A).release();
        }
    }

    public void s(ij3 ij3Var, int i, IOException iOException, boolean z) {
        r(ij3Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public String toString() {
        switch (this.x) {
            case 12:
                StringBuilder sb = new StringBuilder();
                if (((iw4) this.z) == iw4.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.y);
                sb.append(' ');
                sb.append((String) this.A);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xx1
    public void u(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.A).restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.xx1
    public void v(byte[] bArr) {
        ((MediaDrm) this.A).closeSession(bArr);
    }

    @Override // defpackage.xx1
    public void w(final i75 i75Var) {
        ((MediaDrm) this.A).setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: db2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                fu fuVar = ((e81) i75Var.y).x;
                fuVar.getClass();
                fuVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public void x(ij3 ij3Var, int i, int i2, ea2 ea2Var, int i3, Object obj, long j, long j2, int i4) {
        h(new mw3(this, ij3Var, new fr3(i, i2, ea2Var, i3, obj, eq6.l0(j), eq6.l0(j2)), i4));
    }

    public eb2 y(Object obj, Object obj2) {
        int i = (this.y + 1) * 2;
        Object[] objArr = (Object[]) this.z;
        if (i > objArr.length) {
            this.z = Arrays.copyOf(objArr, fw2.b(objArr.length, i));
        }
        io3.s(obj, obj2);
        Object[] objArr2 = (Object[]) this.z;
        int i2 = this.y;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.y = i2 + 1;
        return this;
    }

    @Override // defpackage.xx1
    public byte[] z(byte[] bArr, byte[] bArr2) {
        ce0.d.equals((UUID) this.z);
        return ((MediaDrm) this.A).provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
    }

    public /* synthetic */ eb2(Object obj, int i, String str, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
        this.A = str;
    }

    public eb2(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.x = (byte) 1;
        this.z = arrayList;
        this.y = i;
        this.A = motionEvent;
        if (arrayList.isEmpty()) {
            ze0.k("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ eb2(byte b) {
        this.x = b;
    }

    public eb2(p65 p65Var) {
        this.x = (byte) 11;
        this.z = new SparseArray();
        this.A = p65Var;
        this.y = -1;
    }

    public eb2(int i, tf6 tf6Var) {
        this.x = (byte) 13;
        this.y = i;
        this.z = tf6Var;
        this.A = new zi4();
    }

    public eb2() {
        this.x = (byte) 7;
        this.z = new z44(new g23[16], 0);
    }

    public eb2(UUID uuid) {
        this.x = (byte) 0;
        uuid.getClass();
        io3.m("Use C.CLEARKEY_UUID instead", !ce0.c.equals(uuid));
        this.z = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.A = mediaDrm;
        this.y = 1;
        if (ce0.e.equals(uuid)) {
            HashSet hashSet = cr3.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public eb2(CopyOnWriteArrayList copyOnWriteArrayList, int i, jw3 jw3Var) {
        this.x = (byte) 6;
        this.A = copyOnWriteArrayList;
        this.y = i;
        this.z = jw3Var;
    }

    public eb2(rv6 rv6Var) {
        this.x = (byte) 2;
        this.z = rv6Var;
    }

    public eb2(int i) {
        this.x = (byte) 3;
        this.z = new Object[i * 2];
        this.y = 0;
    }

    public eb2(wu3 wu3Var, dt3 dt3Var, int i) {
        this.x = (byte) 5;
        this.A = wu3Var;
        this.z = dt3Var;
        this.y = i;
    }
}
