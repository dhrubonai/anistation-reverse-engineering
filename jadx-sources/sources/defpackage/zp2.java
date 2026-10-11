package defpackage;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.anistation.model.settings.SubtitleArgbColor;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zp2 implements jf0, xc2, y16, nr6, nw4 {
    public static final String[] B = {"id", "key", "metadata"};
    public static final kz5 C = new kz5("_root_");
    public Object A;
    public Object x;
    public Object y;
    public Object z;

    public zp2(Typeface typeface, jy3 jy3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.A = typeface;
        this.x = jy3Var;
        this.z = new my3(1024);
        int a = jy3Var.a(6);
        if (a != 0) {
            int i6 = a + jy3Var.x;
            i = ((ByteBuffer) jy3Var.A).getInt(((ByteBuffer) jy3Var.A).getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.y = new char[i * 2];
        int a2 = jy3Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + jy3Var.x;
            i2 = ((ByteBuffer) jy3Var.A).getInt(((ByteBuffer) jy3Var.A).getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            gl6 gl6Var = new gl6(this, i8);
            iy3 b = gl6Var.b();
            int a3 = b.a(4);
            if (a3 != 0) {
                i3 = ((ByteBuffer) b.A).getInt(a3 + b.x);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.y, i8 * 2);
            iy3 b2 = gl6Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i9 = a4 + b2.x;
                i4 = ((ByteBuffer) b2.A).getInt(((ByteBuffer) b2.A).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                my3 my3Var = (my3) this.z;
                iy3 b3 = gl6Var.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i10 = a5 + b3.x;
                    i5 = ((ByteBuffer) b3.A).getInt(((ByteBuffer) b3.A).getInt(i10) + i10);
                } else {
                    i5 = 0;
                }
                my3Var.a(gl6Var, 0, i5 - 1);
            } else {
                ze0.k("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A() {
        /*
            r4 = this;
            java.lang.Object r4 = r4.x
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r0 = 0
            r1 = r0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L1b
            java.lang.Object r2 = r4.get(r1)
            ji6 r2 = (defpackage.ji6) r2
            int r2 = r2.b
            r3 = -1
            if (r2 != r3) goto L18
            goto L32
        L18:
            int r1 = r1 + 1
            goto L6
        L1b:
            r1 = r0
        L1c:
            int r2 = r4.size()
            if (r1 >= r2) goto L36
            java.lang.Object r2 = r4.get(r1)
            ji6 r2 = (defpackage.ji6) r2
            int r3 = r2.b
            android.util.SparseArray r2 = r2.a
            int r2 = r2.size()
            if (r3 == r2) goto L33
        L32:
            return r0
        L33:
            int r1 = r1 + 1
            goto L1c
        L36:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp2.A():boolean");
    }

    public void B(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.z;
        str.getClass();
        as6.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.A;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.A) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void C(jq2 jq2Var, ub2 ub2Var) {
        jq2Var.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.y;
        linkedHashMap.put(jq2Var.getKey(), new cj((ub2) linkedHashMap.get(jq2Var.getKey()), ub2Var, (byte) 2));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.x;
        if (linkedHashMap2.containsKey(jq2Var.getKey())) {
            return;
        }
        linkedHashMap2.put(jq2Var.getKey(), new lz0(jq2Var, (byte) 14));
    }

    public void D() {
        if (((hc1) this.A).w) {
            ((Executor) this.x).execute(new p0(this.y, (byte) 17));
            a61.a();
        } else {
            ((ts6) this.z).f(new zb1((hc1) this.A, (byte) 3), true);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    @Override // defpackage.y16
    public void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        b31 b31Var;
        int i3;
        int i4;
        int i5;
        int A;
        int i6;
        int i7;
        int D;
        ql4 ql4Var = (ql4) this.z;
        int[] iArr = ql4Var.b;
        zi4 zi4Var = ql4Var.a;
        zi4 zi4Var2 = (zi4) this.y;
        zi4 zi4Var3 = (zi4) this.x;
        zi4Var3.L(i + i2, bArr);
        zi4Var3.N(i);
        Inflater inflater = (Inflater) this.A;
        if (inflater == null) {
            inflater = new Inflater();
            this.A = inflater;
        }
        String str = eq6.a;
        if (zi4Var3.a() > 0 && zi4Var3.j() == 120 && eq6.M(zi4Var3, zi4Var2, inflater)) {
            zi4Var3.L(zi4Var2.c, zi4Var2.a);
        }
        int i8 = 0;
        ql4Var.d = 0;
        ql4Var.e = 0;
        ql4Var.f = 0;
        ql4Var.g = 0;
        ql4Var.h = 0;
        ql4Var.i = 0;
        zi4Var.K(0);
        ql4Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (zi4Var3.a() >= 3) {
            int i9 = zi4Var3.c;
            int A2 = zi4Var3.A();
            int H = zi4Var3.H();
            int i10 = zi4Var3.b + H;
            if (i10 > i9) {
                zi4Var3.N(i9);
                i3 = i8;
                b31Var = null;
            } else {
                char c = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                zi4Var3.O(2);
                                Arrays.fill(iArr, i8);
                                int i11 = H / 5;
                                int i12 = i8;
                                while (i12 < i11) {
                                    int A3 = zi4Var3.A();
                                    char c2 = c;
                                    ql4 ql4Var2 = ql4Var;
                                    double A4 = zi4Var3.A();
                                    double A5 = zi4Var3.A() - 128;
                                    double A6 = zi4Var3.A() - 128;
                                    iArr[A3] = eq6.j((int) ((A6 * 1.772d) + A4), 0, 255) | (zi4Var3.A() << 24) | (eq6.j((int) ((1.402d * A5) + A4), 0, 255) << 16) | (eq6.j((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i12++;
                                    c = c2;
                                    ql4Var = ql4Var2;
                                }
                                ql4Var.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                zi4Var3.O(3);
                                if ((128 & zi4Var3.A()) != 0) {
                                    i7 = 1;
                                } else {
                                    i7 = i8;
                                }
                                int i13 = H - 4;
                                if (i7 != 0) {
                                    if (i13 >= 7 && (D = zi4Var3.D()) >= 4) {
                                        ql4Var.h = zi4Var3.H();
                                        ql4Var.i = zi4Var3.H();
                                        zi4Var.K(D - 4);
                                        i13 = H - 11;
                                    }
                                }
                                int i14 = zi4Var.b;
                                int i15 = zi4Var.c;
                                if (i14 < i15 && i13 > 0) {
                                    int min = Math.min(i13, i15 - i14);
                                    zi4Var3.k(zi4Var.a, i14, min);
                                    zi4Var.N(i14 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                ql4Var.d = zi4Var3.H();
                                ql4Var.e = zi4Var3.H();
                                zi4Var3.O(11);
                                ql4Var.f = zi4Var3.H();
                                ql4Var.g = zi4Var3.H();
                                break;
                            }
                            break;
                    }
                    b31Var = null;
                    i3 = 0;
                } else {
                    if (ql4Var.d != 0 && ql4Var.e != 0 && ql4Var.h != 0 && ql4Var.i != 0 && (i4 = zi4Var.c) != 0 && zi4Var.b == i4 && ql4Var.c) {
                        zi4Var.N(0);
                        int i16 = ql4Var.h * ql4Var.i;
                        int[] iArr2 = new int[i16];
                        int i17 = 0;
                        while (i17 < i16) {
                            int A7 = zi4Var.A();
                            if (A7 != 0) {
                                i5 = i17 + 1;
                                iArr2[i17] = iArr[A7];
                            } else {
                                int A8 = zi4Var.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | zi4Var.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i6 = iArr[0];
                                    } else {
                                        i6 = iArr[zi4Var.A()];
                                    }
                                    i5 = A + i17;
                                    Arrays.fill(iArr2, i17, i5, i6);
                                }
                            }
                            i17 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, ql4Var.h, ql4Var.i, Bitmap.Config.ARGB_8888);
                        float f = ql4Var.f;
                        float f2 = ql4Var.d;
                        float f3 = f / f2;
                        float f4 = ql4Var.g;
                        float f5 = ql4Var.e;
                        b31Var = new b31(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, ql4Var.h / f2, ql4Var.i / f5, false, SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        b31Var = null;
                    }
                    i3 = 0;
                    ql4Var.d = 0;
                    ql4Var.e = 0;
                    ql4Var.f = 0;
                    ql4Var.g = 0;
                    ql4Var.h = 0;
                    ql4Var.i = 0;
                    zi4Var.K(0);
                    ql4Var.c = false;
                }
                zi4Var3.N(i10);
            }
            if (b31Var != null) {
                arrayList.add(b31Var);
            }
            i8 = i3;
        }
        ay0Var.accept(new e31(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void F(int i, c95 c95Var) {
        boolean z;
        SparseArray sparseArray = (SparseArray) this.y;
        String str = eq6.a;
        if (sparseArray.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.A("Exactly one SampleExporter can be added for each track type.", !z);
        sparseArray.put(i, c95Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.a(r1) == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v3, types: [k54] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(defpackage.xz0 r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.y
            zq0 r0 = (defpackage.zq0) r0
            boolean r1 = r10 instanceof defpackage.d85
            if (r1 == 0) goto L17
            r1 = r10
            d85 r1 = (defpackage.d85) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.A = r2
            goto L1c
        L17:
            d85 r1 = new d85
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.y
            int r2 = r1.A
            r3 = 2
            r4 = 1
            pn6 r5 = defpackage.pn6.a
            r6 = 0
            w11 r7 = defpackage.w11.x
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            k54 r9 = r1.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L33
            goto L71
        L33:
            r10 = move-exception
            goto L7c
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r6
        L3b:
            k54 r2 = r1.x
            defpackage.m37.N(r10)
            r10 = r2
            goto L5b
        L42:
            defpackage.m37.N(r10)
            boolean r10 = r0.k0()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            java.lang.Object r10 = r9.x
            m54 r10 = (defpackage.m54) r10
            r1.x = r10
            r1.A = r4
            java.lang.Object r2 = r10.a(r1)
            if (r2 != r7) goto L5b
            goto L6f
        L5b:
            boolean r2 = r0.k0()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r10.l(r6)
            return r5
        L65:
            r1.x = r10     // Catch: java.lang.Throwable -> L78
            r1.A = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r9.u(r1)     // Catch: java.lang.Throwable -> L78
            if (r9 != r7) goto L70
        L6f:
            return r7
        L70:
            r9 = r10
        L71:
            r0.Q(r5)     // Catch: java.lang.Throwable -> L33
            r9.l(r6)
            return r5
        L78:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r9.l(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp2.G(xz0):java.lang.Object");
    }

    public void H(nq4 nq4Var) {
        if (((zq4) this.y) == zq4.y) {
            fa4 fa4Var = (fa4) this.x;
            if (fa4Var != null) {
                h41.g0(nq4Var, fa4Var.J(0L), new pz3(this.A, (byte) 8), true);
            } else {
                ze0.m("layoutCoordinates not set");
                return;
            }
        }
        this.y = zq4.z;
    }

    public void I(ix5 ix5Var) {
        ix5Var.getClass();
        sp5 sp5Var = new sp5(this, ix5Var, (byte) 3);
        synchronized (this.A) {
        }
        ((Handler) ((af2) this.y).y).postDelayed(sp5Var, 5400000L);
    }

    public ik7 J(vs7 vs7Var, ov7... ov7VarArr) {
        ik7 ik7Var = ik7.p;
        for (ov7 ov7Var : ov7VarArr) {
            ik7Var = nz5.f(ov7Var);
            fy5.u((vs7) this.z);
            if ((ik7Var instanceof mk7) || (ik7Var instanceof gk7)) {
                ik7Var = ((y23) this.x).f0(vs7Var, ik7Var);
            }
        }
        return ik7Var;
    }

    @Override // defpackage.jf0
    public void a(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = ((cx5) this.x).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                B(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    p(writableDatabase, (if0) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.y).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.jf0
    public void c(if0 if0Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.y;
        int i = if0Var.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.jf0
    public void d(if0 if0Var) {
        ((SparseArray) this.y).put(if0Var.a, if0Var);
    }

    @Override // defpackage.kr6
    public long e(rl rlVar, rl rlVar2, rl rlVar3) {
        int b = rlVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((sl) this.x).get(i).c(rlVar.a(i), rlVar2.a(i), rlVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.jf0
    public boolean f() {
        try {
            SQLiteDatabase readableDatabase = ((cx5) this.x).getReadableDatabase();
            String str = (String) this.z;
            str.getClass();
            if (as6.a(readableDatabase, 1, str) != -1) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.jf0
    public void g(HashMap hashMap) {
        SparseArray sparseArray = (SparseArray) this.y;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((cx5) this.x).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    if0 if0Var = (if0) sparseArray.valueAt(i);
                    if (if0Var == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.A;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        p(writableDatabase, if0Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.nw4
    public Object get() {
        return new zp2((Executor) ((nw4) this.x).get(), (l85) ((nw4) this.y).get(), (dn0) ((dn0) this.z).get(), (l85) ((nw4) this.A).get());
    }

    @Override // defpackage.jf0
    public void i(long j) {
        String hexString = Long.toHexString(j);
        this.z = hexString;
        this.A = zo5.l("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.jf0
    public void j(HashMap hashMap, SparseArray sparseArray) {
        boolean z;
        cx5 cx5Var = (cx5) this.x;
        if (((SparseArray) this.y).size() == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        try {
            SQLiteDatabase readableDatabase = cx5Var.getReadableDatabase();
            String str = (String) this.z;
            str.getClass();
            if (as6.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = cx5Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    B(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = cx5Var.getReadableDatabase();
            String str2 = (String) this.A;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, B, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new if0(i, string, tp.q(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e);
        }
    }

    @Override // defpackage.jf0
    public void k() {
        cx5 cx5Var = (cx5) this.x;
        String str = (String) this.z;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = cx5Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = as6.a;
                try {
                    if (eq6.i0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(concat));
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }

    public void l(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = (ArrayList) this.z;
                        if (!arrayList2.contains(intentFilter)) {
                            arrayList2.add(intentFilter);
                        }
                    }
                }
                return;
            }
            return;
        }
        ze0.k("filters must not be null");
    }

    public void m(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                ArrayList arrayList2 = (ArrayList) this.y;
                if (!TextUtils.isEmpty(str)) {
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                } else {
                    ze0.k("groupMemberId must not be empty");
                    return;
                }
            }
        }
    }

    public void n(ey3 ey3Var) {
        if (ey3Var instanceof y14) {
            this.x = (y14) ey3Var;
            return;
        }
        if (ey3Var instanceof w14) {
            this.y = (w14) ey3Var;
            return;
        }
        if (ey3Var instanceof z14) {
            this.A = (z14) ey3Var;
        } else if (ey3Var instanceof qo3) {
            ((HashSet) this.z).add((qo3) ey3Var);
        } else {
            ze0.k("Unsupported metadata");
        }
    }

    @Override // defpackage.kr6
    public rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        rl rlVar4 = (rl) this.z;
        if (rlVar4 == null) {
            rlVar4 = rlVar3.c();
            this.z = rlVar4;
        }
        int b = rlVar4.b();
        int i = 0;
        while (true) {
            rl rlVar5 = (rl) this.z;
            if (i < b) {
                if (rlVar5 != null) {
                    long j2 = j;
                    rlVar5.e(i, ((sl) this.x).get(i).b(j2, rlVar.a(i), rlVar2.a(i), rlVar3.a(i)));
                    i++;
                    j = j2;
                } else {
                    a34.s0("velocityVector");
                    throw null;
                }
            } else {
                if (rlVar5 != null) {
                    return rlVar5;
                }
                a34.s0("velocityVector");
                throw null;
            }
        }
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        boolean z;
        bt3 bt3Var = (bt3) obj;
        dt2 dt2Var = (dt2) this.z;
        bu3 bu3Var = (bu3) this.y;
        gw3 gw3Var = (gw3) this.A;
        CopyOnWriteArraySet copyOnWriteArraySet = gw3Var.g;
        st3 st3Var = gw3Var.f;
        dt3 dt3Var = (dt3) this.x;
        copyOnWriteArraySet.remove(dt3Var);
        try {
            if (bu3Var.i()) {
                v94.q(dt2Var);
                return;
            }
            zv3 zv3Var = (zv3) dt3Var.e;
            zv3Var.getClass();
            IBinder iBinder = ((ct2) zv3Var.x).e;
            bt3Var.getClass();
            if (st3Var.v(dt3Var)) {
                kb0.O("MediaSessionStub", "Controller " + dt3Var + " has sent connection request multiple times");
            }
            st3Var.d(iBinder, dt3Var, bt3Var.a, bt3Var.b);
            i90 t = st3Var.t(dt3Var);
            if (t == null) {
                kb0.O("MediaSessionStub", "Ignoring connection request from unknown controller info");
                v94.q(dt2Var);
                return;
            }
            bu3Var.t();
            fq4 fq4Var = bu3Var.t;
            ep4 ep4Var = bu3Var.s;
            bu3Var.t();
            go4 go4Var = bt3Var.b;
            ep4 Z = gw3Var.Z(gw3Var.a0(ep4Var));
            if (st3Var.v(dt3Var)) {
                kf6 kf6Var = Z.j;
                qh6 qh6Var = Z.F;
                st3Var.M();
                xv0 xv0Var = (xv0) ((js) st3Var.y).get(dt3Var);
                if (xv0Var != null) {
                    xv0Var.h = kf6Var;
                    xv0Var.i = qh6Var;
                }
            }
            MediaSession.Token token = ((mt3) bu3Var.h.o.y).c.y;
            bu3Var.t();
            PendingIntent pendingIntent = bu3Var.u;
            nw2 nw2Var = bt3Var.c;
            if (nw2Var == null) {
                bu3Var.t();
                nw2Var = bu3Var.z;
            }
            nw2 nw2Var2 = bt3Var.d;
            if (nw2Var2 == null) {
                bu3Var.t();
                nw2Var2 = bu3Var.A;
            }
            bu3Var.t();
            nw2 nw2Var3 = nw2Var;
            nw2 nw2Var4 = bu3Var.r;
            nw2 nw2Var5 = nw2Var2;
            mk5 mk5Var = bt3Var.a;
            go4 l = fq4Var.l();
            Bundle bundle = new Bundle(bu3Var.j.a.d);
            Bundle bundle2 = bt3Var.e;
            if (bundle2 == null) {
                bu3Var.t();
                bundle2 = bu3Var.B;
            }
            lw0 lw0Var = new lw0(gw3Var, pendingIntent, nw2Var3, nw2Var5, nw2Var4, mk5Var, go4Var, l, bundle, bundle2, Z, token);
            if (bu3Var.i()) {
                v94.q(dt2Var);
                return;
            }
            try {
                ((ct2) dt2Var).a(t.b(), lw0Var.a(dt3Var.c));
                z = true;
            } catch (RemoteException unused) {
                z = false;
            }
            if (z) {
                try {
                    if (!bu3Var.y || !bu3.j(dt3Var)) {
                        bu3Var.e.getClass();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        v94.q(dt2Var);
                    }
                    throw th;
                }
            }
            if (!z) {
                v94.q(dt2Var);
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public void p(SQLiteDatabase sQLiteDatabase, if0 if0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tp.u(if0Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(if0Var.a));
        contentValues.put("key", if0Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.A;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public cs3 q() {
        Bundle bundle = (Bundle) this.x;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.z));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.y));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.A));
        return new cs3(bundle);
    }

    public void r(ix5 ix5Var) {
        Runnable runnable;
        ix5Var.getClass();
        synchronized (this.A) {
            runnable = (Runnable) ((LinkedHashMap) this.x).remove(ix5Var);
        }
        if (runnable != null) {
            ((Handler) ((af2) this.y).y).removeCallbacks(runnable);
        }
    }

    public void s(nq4 nq4Var, boolean z) {
        ar4 ar4Var = (ar4) this.A;
        List list = nq4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((uq4) list.get(i)).c()) {
                H(nq4Var);
                return;
            }
        }
        fa4 fa4Var = (fa4) this.x;
        if (fa4Var != null) {
            h41.g0(nq4Var, fa4Var.J(0L), new r82(this, ar4Var, (byte) 20), false);
            if (((zq4) this.y) == zq4.y) {
                if (z) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((uq4) list.get(i2)).a();
                    }
                }
                u98 u98Var = nq4Var.b;
                if (u98Var != null) {
                    u98Var.y = !ar4Var.z;
                    return;
                }
                return;
            }
            return;
        }
        ze0.m("layoutCoordinates not set");
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        ((gw3) this.A).g.remove((dt3) this.x);
        v94.q((dt2) this.z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(defpackage.xz0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.A
            p51 r0 = (defpackage.p51) r0
            boolean r1 = r7 instanceof defpackage.y41
            if (r1 == 0) goto L17
            r1 = r7
            y41 r1 = (defpackage.y41) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.z = r2
            goto L1c
        L17:
            y41 r1 = new y41
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.x
            int r2 = r1.z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.m37.N(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L33:
            defpackage.m37.N(r7)
            goto L68
        L37:
            defpackage.m37.N(r7)
            java.lang.Object r7 = r6.z
            java.util.List r7 = (java.util.List) r7
            w11 r2 = defpackage.w11.x
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            bq5 r7 = r0.c()
            b51 r5 = new b51
            r5.<init>(r0, r6, r3)
            r1.z = r4
            java.lang.Object r7 = r7.b(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            f41 r7 = (defpackage.f41) r7
            goto L6a
        L5e:
            r1.z = r5
            r6 = 0
            java.lang.Object r7 = r0.h(r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            f41 r7 = (defpackage.f41) r7
        L6a:
            af2 r6 = r0.h
            r6.t(r7)
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp2.u(xz0):java.lang.Object");
    }

    public vv6 w(im0 im0Var, String str) {
        vv6 vv6Var;
        vv6 a;
        synchronized (((qc5) this.A)) {
            try {
                vv6Var = (vv6) ((cw6) this.x).a.get(str);
                if (im0Var.g(vv6Var)) {
                    yv6 yv6Var = (yv6) this.y;
                    if (yv6Var instanceof ha5) {
                        ha5 ha5Var = (ha5) yv6Var;
                        vv6Var.getClass();
                        fg3 fg3Var = ha5Var.d;
                        if (fg3Var != null) {
                            ea5 ea5Var = ha5Var.e;
                            ea5Var.getClass();
                            io3.h(vv6Var, ea5Var, fg3Var);
                        }
                    }
                    vv6Var.getClass();
                } else {
                    o34 o34Var = new o34((j21) this.z);
                    o34Var.a.put(o80.h, str);
                    yv6 yv6Var2 = (yv6) this.y;
                    yv6Var2.getClass();
                    try {
                        try {
                            a = yv6Var2.c(im0Var, o34Var);
                        } catch (AbstractMethodError unused) {
                            a = yv6Var2.a(t80.M(im0Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = yv6Var2.b(t80.M(im0Var), o34Var);
                    }
                    vv6Var = a;
                    cw6 cw6Var = (cw6) this.x;
                    cw6Var.getClass();
                    vv6Var.getClass();
                    vv6 vv6Var2 = (vv6) cw6Var.a.put(str, vv6Var);
                    if (vv6Var2 != null) {
                        vv6Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vv6Var;
    }

    @Override // defpackage.kr6
    public rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        rl rlVar4 = (rl) this.y;
        if (rlVar4 == null) {
            rlVar4 = rlVar.c();
            this.y = rlVar4;
        }
        int b = rlVar4.b();
        int i = 0;
        while (true) {
            rl rlVar5 = (rl) this.y;
            if (i < b) {
                if (rlVar5 != null) {
                    long j2 = j;
                    rlVar5.e(i, ((sl) this.x).get(i).e(j2, rlVar.a(i), rlVar2.a(i), rlVar3.a(i)));
                    i++;
                    j = j2;
                } else {
                    a34.s0("valueVector");
                    throw null;
                }
            } else {
                if (rlVar5 != null) {
                    return rlVar5;
                }
                a34.s0("valueVector");
                throw null;
            }
        }
    }

    @Override // defpackage.kr6
    public rl z(rl rlVar, rl rlVar2, rl rlVar3) {
        rl rlVar4 = (rl) this.A;
        if (rlVar4 == null) {
            rlVar4 = rlVar3.c();
            this.A = rlVar4;
        }
        int b = rlVar4.b();
        int i = 0;
        while (true) {
            rl rlVar5 = (rl) this.A;
            if (i < b) {
                if (rlVar5 != null) {
                    rlVar5.e(i, ((sl) this.x).get(i).d(rlVar.a(i), rlVar2.a(i), rlVar3.a(i)));
                    i++;
                } else {
                    a34.s0("endVelocityVector");
                    throw null;
                }
            } else {
                if (rlVar5 != null) {
                    return rlVar5;
                }
                a34.s0("endVelocityVector");
                throw null;
            }
        }
    }

    public zp2(cw6 cw6Var, yv6 yv6Var, j21 j21Var) {
        cw6Var.getClass();
        yv6Var.getClass();
        j21Var.getClass();
        this.x = cw6Var;
        this.y = yv6Var;
        this.z = j21Var;
        this.A = new qc5((byte) 3);
    }

    public zp2(byte b) {
        switch (b) {
            case 12:
                this.x = new y14(0);
                this.z = new HashSet();
                long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2082844800;
                this.A = new z14(currentTimeMillis, currentTimeMillis);
                return;
            case 16:
                this.x = new zi4();
                this.y = new zi4();
                this.z = new ql4();
                return;
            case 28:
                y23 y23Var = new y23((byte) 29);
                this.x = y23Var;
                vs7 vs7Var = new vs7((vs7) null, y23Var);
                this.z = vs7Var;
                this.y = vs7Var.e();
                fq3 fq3Var = new fq3((byte) 29);
                this.A = fq3Var;
                vs7Var.g("require", new u78(fq3Var));
                ((HashMap) fq3Var.y).put("internal.platform", dp7.b);
                vs7Var.g("runtime.counter", new xh7(Double.valueOf(0.0d)));
                return;
            default:
                this.x = new LinkedHashMap();
                this.y = new LinkedHashMap();
                this.z = new LinkedHashMap();
                this.A = new t72((byte) 14);
                int i = mn4.a;
                return;
        }
    }

    public /* synthetic */ zp2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public zp2(o15 o15Var, h64 h64Var, l33 l33Var, h64 h64Var2) {
        Object obj;
        if (o15Var != null) {
            obj = nw2.o(o15Var);
        } else {
            z62 z62Var = nw2.y;
            obj = o15.B;
        }
        this.x = obj;
        this.y = h64Var;
        this.z = l33Var;
        this.A = h64Var2;
    }

    public zp2(String str, String str2) {
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new HashSet();
        Bundle bundle = new Bundle();
        this.x = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString(MediationMetaData.KEY_NAME, str2);
                return;
            } else {
                qi2.m("name must not be null");
                throw null;
            }
        }
        qi2.m("id must not be null");
        throw null;
    }

    public zp2(sl slVar) {
        this.x = slVar;
    }

    public zp2(n42 n42Var) {
        this(new eo3((Object) n42Var, (byte) 25));
    }
}
