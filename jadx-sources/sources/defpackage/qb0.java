package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qb0 implements jf0 {
    public static final d42 C = new Object();
    public Object A;
    public Object B;
    public boolean x;
    public Object y;
    public Object z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0298  */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [ew2, bx2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qb0(defpackage.sz7 r31, defpackage.gj3 r32) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb0.<init>(sz7, gj3):void");
    }

    public static int m(if0 if0Var, int i) {
        int hashCode = if0Var.b.hashCode() + (if0Var.a * 31);
        r71 r71Var = if0Var.e;
        if (i < 2) {
            long a = ry0.a(r71Var);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return r71Var.hashCode() + (hashCode * 31);
    }

    public static if0 o(int i, DataInputStream dataInputStream) {
        r71 q;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            pz2 pz2Var = new pz2((byte) 13);
            pz2Var.l(Long.valueOf(readLong), "exo_len");
            q = r71.c.b(pz2Var);
        } else {
            q = tp.q(dataInputStream);
        }
        return new if0(readInt, readUTF, q);
    }

    @Override // defpackage.jf0
    public void a(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        rt3 rt3Var = (rt3) this.A;
        DataOutputStream dataOutputStream2 = null;
        try {
            mu O = rt3Var.O();
            n55 n55Var = (n55) this.B;
            if (n55Var == null) {
                this.B = new BufferedOutputStream(O);
            } else {
                n55Var.a(O);
            }
            dataOutputStream = new DataOutputStream((n55) this.B);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (if0 if0Var : hashMap.values()) {
                dataOutputStream.writeInt(if0Var.a);
                dataOutputStream.writeUTF(if0Var.b);
                tp.u(if0Var.e, dataOutputStream);
                i += m(if0Var, 2);
            }
            dataOutputStream.writeInt(i);
            dataOutputStream.close();
            ((File) rt3Var.z).delete();
            String str = eq6.a;
            this.x = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            eq6.h(dataOutputStream2);
            throw th;
        }
    }

    public IOException b(boolean z, boolean z2, IOException iOException) {
        bz4 bz4Var = (bz4) this.y;
        if (iOException != null) {
            r(iOException);
        }
        return bz4Var.h(this, z2, z, iOException);
    }

    @Override // defpackage.jf0
    public void c(if0 if0Var, boolean z) {
        this.x = true;
    }

    @Override // defpackage.jf0
    public void d(if0 if0Var) {
        this.x = true;
    }

    public boolean e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent l;
        int i4;
        int i5;
        NestedScrollView nestedScrollView = (NestedScrollView) this.A;
        if (!this.x || (l = l(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null && (iArr = (int[]) this.B) == null) {
            iArr = new int[2];
            this.B = iArr;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (l instanceof o84) {
            ((o84) l).g(i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                l.onNestedPreScroll(nestedScrollView, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + l + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jf0
    public boolean f() {
        rt3 rt3Var = (rt3) this.A;
        if (!((File) rt3Var.y).exists() && !((File) rt3Var.z).exists()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jf0
    public void g(HashMap hashMap) {
        if (!this.x) {
            return;
        }
        a(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
        /*
            r14 = this;
            r1 = r19
            r7 = r20
            java.lang.Object r0 = r14.A
            r9 = r0
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            boolean r0 = r14.x
            r10 = 0
            if (r0 == 0) goto Lb3
            android.view.ViewParent r2 = r14.l(r7)
            if (r2 != 0) goto L16
            goto Lb3
        L16:
            r11 = 1
            if (r15 != 0) goto L27
            if (r16 != 0) goto L27
            if (r17 != 0) goto L27
            if (r18 == 0) goto L20
            goto L27
        L20:
            if (r1 == 0) goto Lb3
            r1[r10] = r10
            r1[r11] = r10
            return r10
        L27:
            if (r1 == 0) goto L33
            r9.getLocationInWindow(r1)
            r0 = r1[r10]
            r3 = r1[r11]
            r12 = r0
            r13 = r3
            goto L35
        L33:
            r12 = r10
            r13 = r12
        L35:
            if (r21 != 0) goto L48
            java.lang.Object r0 = r14.B
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L42
            r0 = 2
            int[] r0 = new int[r0]
            r14.B = r0
        L42:
            r0[r10] = r10
            r0[r11] = r10
            r8 = r0
            goto L4a
        L48:
            r8 = r21
        L4a:
            boolean r14 = r2 instanceof defpackage.o84
            if (r14 == 0) goto L5c
            o84 r2 = (defpackage.o84) r2
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r2.d(r3, r4, r5, r6, r7, r8)
        L5a:
            r3 = r9
            goto La3
        L5c:
            r14 = r8[r10]
            int r14 = r14 + r17
            r8[r10] = r14
            r14 = r8[r11]
            int r14 = r14 + r18
            r8[r11] = r14
            boolean r14 = r2 instanceof defpackage.o84
            if (r14 == 0) goto L7b
            o84 r2 = (defpackage.o84) r2
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r2.b(r3, r4, r5, r6, r7)
            goto L5a
        L7b:
            if (r20 != 0) goto L5a
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3 = r9
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L89
            goto La3
        L89:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewParent "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScroll"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r15, r14)
        La3:
            if (r1 == 0) goto Lb2
            r3.getLocationInWindow(r1)
            r14 = r1[r10]
            int r14 = r14 - r12
            r1[r10] = r14
            r14 = r1[r11]
            int r14 = r14 - r13
            r1[r11] = r14
        Lb2:
            return r11
        Lb3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb0.h(int, int, int, int, int[], int, int[]):boolean");
    }

    @Override // defpackage.jf0
    public void j(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        int readInt;
        DataInputStream dataInputStream2;
        int i;
        int readInt2;
        boolean z = true;
        io3.B(!this.x);
        Cipher cipher = (Cipher) this.y;
        rt3 rt3Var = (rt3) this.A;
        File file = (File) rt3Var.y;
        File file2 = (File) rt3Var.y;
        File file3 = (File) rt3Var.z;
        if (!file.exists() && !file3.exists()) {
            return;
        }
        DataInputStream dataInputStream3 = null;
        try {
            if (file3.exists()) {
                file2.delete();
                file3.renameTo(file2);
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            dataInputStream = new DataInputStream(bufferedInputStream);
            try {
                readInt = dataInputStream.readInt();
            } catch (IOException unused) {
                dataInputStream3 = dataInputStream;
            } catch (Throwable th) {
                th = th;
                dataInputStream3 = dataInputStream;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (readInt >= 0 && readInt <= 2) {
            if ((dataInputStream.readInt() & 1) != 0) {
                if (cipher != null) {
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    try {
                        SecretKeySpec secretKeySpec = (SecretKeySpec) this.z;
                        String str = eq6.a;
                        cipher.init(2, secretKeySpec, ivParameterSpec);
                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
            } else {
                dataInputStream2 = dataInputStream;
            }
            try {
                int readInt3 = dataInputStream2.readInt();
                i = 0;
                for (int i2 = 0; i2 < readInt3; i2++) {
                    if0 o = o(readInt, dataInputStream2);
                    String str2 = o.b;
                    hashMap.put(str2, o);
                    sparseArray.put(o.a, str2);
                    i += m(o, readInt);
                }
                readInt2 = dataInputStream2.readInt();
                if (dataInputStream2.read() != -1) {
                    z = false;
                }
            } catch (IOException unused3) {
                dataInputStream3 = dataInputStream2;
                if (dataInputStream3 != null) {
                    eq6.h(dataInputStream3);
                }
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            } catch (Throwable th3) {
                dataInputStream3 = dataInputStream2;
                th = th3;
                if (dataInputStream3 != null) {
                    eq6.h(dataInputStream3);
                }
                throw th;
            }
            if (readInt2 == i && z) {
                eq6.h(dataInputStream2);
                return;
            }
            eq6.h(dataInputStream2);
            hashMap.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
        eq6.h(dataInputStream);
        hashMap.clear();
        sparseArray.clear();
        file2.delete();
        file3.delete();
    }

    @Override // defpackage.jf0
    public void k() {
        rt3 rt3Var = (rt3) this.A;
        ((File) rt3Var.y).delete();
        ((File) rt3Var.z).delete();
    }

    public ViewParent l(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return (ViewParent) this.z;
        }
        return (ViewParent) this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int n(l33 l33Var, oa oaVar, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        fl2 fl2Var = (fl2) this.z;
        il2 il2Var = (il2) this.B;
        if (this.x) {
            return 0;
        }
        try {
            this.x = true;
            u98 m = ((fq3) this.A).m(l33Var, oaVar);
            sl3 sl3Var = (sl3) m.z;
            int f = sl3Var.f();
            for (int i3 = 0; i3 < f; i3++) {
                uq4 uq4Var = (uq4) sl3Var.g(i3);
                if (!uq4Var.d && !uq4Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int f2 = sl3Var.f();
            for (int i4 = 0; i4 < f2; i4++) {
                uq4 uq4Var2 = (uq4) sl3Var.g(i4);
                if (objArr != false || t80.w(uq4Var2)) {
                    ((za3) this.y).B(uq4Var2.c, il2Var, uq4Var2.i, true);
                    if (!il2Var.x.i()) {
                        fl2Var.a(uq4Var2.a, il2Var, t80.w(uq4Var2));
                        il2Var.clear();
                    }
                }
            }
            boolean b = fl2Var.b(m, z);
            if (!m.y) {
                int f3 = sl3Var.f();
                for (int i5 = 0; i5 < f3; i5++) {
                    uq4 uq4Var3 = (uq4) sl3Var.g(i5);
                    if (!xc4.b(t80.h0(uq4Var3, true), 0L) && uq4Var3.c()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int f4 = sl3Var.f();
            int i6 = 0;
            while (true) {
                if (i6 < f4) {
                    if (((uq4) sl3Var.g(i6)).c()) {
                        i2 = 1;
                        break;
                    }
                    i6++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i7 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.x = false;
            return i7;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    public o45 p(boolean z) {
        try {
            o45 d = ((xw1) this.A).d(z);
            if (d != null) {
                d.m = this;
                return d;
            }
            return d;
        } catch (IOException e) {
            r(e);
            throw e;
        }
    }

    public synchronized void q() {
        try {
            if (this.x) {
                return;
            }
            this.x = true;
            Context context = (Context) this.B;
            if (context != null) {
                ((se) this.z).b(context);
                context.unregisterComponentCallbacks((te) this.A);
            }
            ((WeakReference) this.y).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r(IOException iOException) {
        boolean z;
        this.x = true;
        ((yw1) this.z).b(iOException);
        ez4 f = ((xw1) this.A).f();
        bz4 bz4Var = (bz4) this.y;
        synchronized (f) {
            try {
                if (iOException instanceof yy5) {
                    if (((yy5) iOException).x == 8) {
                        int i = f.n + 1;
                        f.n = i;
                        if (i > 1) {
                            f.j = true;
                            f.l++;
                        }
                    } else if (((yy5) iOException).x != 9 || !bz4Var.J) {
                        f.j = true;
                        f.l++;
                    }
                } else {
                    if (f.g != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof iw0)) {
                        f.j = true;
                        if (f.m == 0) {
                            ez4.d(bz4Var.x, f.b, iOException);
                            f.l++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jf0
    public void i(long j) {
    }

    public qb0(q38 q38Var, gj3 gj3Var) {
        this.x = false;
        q38.y().equals(q38Var);
        this.y = q38Var.r();
        this.z = q38Var.s();
        int i = zw2.z;
        Object[] objArr = v15.F;
        int w = q38Var.w() + 3;
        io3.t(w, "expectedSize");
        eb2 eb2Var = new eb2(w);
        for (u38 u38Var : q38Var.v()) {
            int E = u38Var.E();
            int i2 = E - 1;
            if (E == 0) {
                throw null;
            }
            if (i2 == 0) {
                eb2Var.y(u38Var.r(), Long.valueOf(u38Var.s()));
            } else if (i2 == 1) {
                eb2Var.y(u38Var.r(), Boolean.valueOf(u38Var.t()));
            } else if (i2 == 2) {
                eb2Var.y(u38Var.r(), Double.valueOf(u38Var.u()));
            } else if (i2 == 3) {
                eb2Var.y(u38Var.r(), u38Var.v());
            } else if (i2 == 4) {
                eb2Var.y(u38Var.r(), u38Var.w().m());
            }
        }
        eb2Var.y("__phenotype_server_token", q38Var.t());
        eb2Var.y("__phenotype_snapshot_token", q38Var.r());
        eb2Var.y("__phenotype_configuration_version", Long.valueOf(q38Var.u()));
        this.A = eb2Var.e(false);
        this.B = gj3Var;
    }

    public qb0(b12 b12Var, ea2 ea2Var, tf6 tf6Var, w16 w16Var, boolean z) {
        this.y = b12Var;
        this.z = ea2Var;
        this.A = tf6Var;
        this.B = w16Var;
        this.x = z;
    }
}
