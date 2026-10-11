package defpackage;

import android.content.Context;
import android.os.Handler;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m18 implements o82, ur, wr, z20, ud0, iw, g95, vn0, k11, bt2, ea4, uu4 {
    public final /* synthetic */ byte x;
    public static final m18 y = new m18((byte) 0);
    public static final m18 z = new m18((byte) 1);
    public static final m18 A = new m18((byte) 2);
    public static final m18 B = new m18((byte) 3);
    public static final m18 C = new m18((byte) 4);

    public m18(cg1 cg1Var) {
        this.x = (byte) 15;
    }

    public static ArrayList K(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((iw4) obj) != iw4.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((iw4) obj2).x);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pa0] */
    public static byte[] L(List list) {
        ?? obj = new Object();
        ArrayList K = K(list);
        int size = K.size();
        int i = 0;
        while (i < size) {
            Object obj2 = K.get(i);
            i++;
            String str = (String) obj2;
            obj.w0(str.length());
            obj.A0(str);
        }
        return obj.G(obj.y);
    }

    public static boolean N() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static oh3 P(List list, float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 2) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 4) != 0) {
            f4 = Float.POSITIVE_INFINITY;
        } else {
            f4 = f2;
        }
        return new oh3(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
    }

    @Override // defpackage.z20
    public long D() {
        return 0L;
    }

    @Override // defpackage.wr
    public void H(ud1 ud1Var, int i, int[] iArr, int[] iArr2) {
        x97.J(i, iArr, iArr2, false);
    }

    @Override // defpackage.g95
    public int I(pz2 pz2Var, q61 q61Var, int i) {
        q61Var.y = 4;
        return -4;
    }

    public i02 M(Context context) {
        i02 i02Var;
        context.getClass();
        i02 i02Var2 = i02.e;
        if (i02Var2 == null) {
            synchronized (this) {
                i02Var = i02.e;
                if (i02Var == null) {
                    i02Var = new i02(context);
                    i02.e = i02Var;
                }
            }
            return i02Var;
        }
        return i02Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(java.util.List r7, defpackage.a51 r8, defpackage.xz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.j41
            if (r0 == 0) goto L13
            r0 = r9
            j41 r0 = (defpackage.j41) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            j41 r0 = new j41
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.z
            int r9 = r0.B
            r1 = 0
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r9 == 0) goto L41
            if (r9 == r3) goto L39
            if (r9 != r2) goto L33
            java.util.Iterator r7 = r0.y
            java.io.Serializable r8 = r0.x
            w05 r8 = (defpackage.w05) r8
            defpackage.m37.N(r6)     // Catch: java.lang.Throwable -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L7e
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r1
        L39:
            java.io.Serializable r7 = r0.x
            java.util.List r7 = (java.util.List) r7
            defpackage.m37.N(r6)
            goto L5b
        L41:
            defpackage.m37.N(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            k41 r9 = new k41
            r5 = 0
            r9.<init>(r7, r6, r1, r5)
            r0.x = r6
            r0.B = r3
            java.lang.Object r7 = r8.a(r9, r0)
            if (r7 != r4) goto L5a
            goto L7d
        L5a:
            r7 = r6
        L5b:
            w05 r6 = new w05
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
            r8 = r6
        L65:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r7.next()
            ub2 r6 = (defpackage.ub2) r6
            r0.x = r8     // Catch: java.lang.Throwable -> L31
            r0.y = r7     // Catch: java.lang.Throwable -> L31
            r0.B = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != r4) goto L65
        L7d:
            return r4
        L7e:
            java.lang.Object r9 = r8.x
            if (r9 != 0) goto L85
            r8.x = r6
            goto L65
        L85:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.n03.i(r9, r6)
            goto L65
        L8b:
            java.lang.Object r6 = r8.x
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            pn6 r6 = defpackage.pn6.a
            return r6
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m18.O(java.util.List, a51, xz0):java.lang.Object");
    }

    @Override // defpackage.ur, defpackage.wr
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.ud0
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.ea4
    public boolean d(xz3 xz3Var) {
        return false;
    }

    @Override // defpackage.ea4
    public int h() {
        return 8;
    }

    @Override // defpackage.ea4
    public boolean i(xz3 xz3Var) {
        return nx7.M(n03.h(wc7.O(xz3Var), false));
    }

    @Override // defpackage.g95
    public boolean isReady() {
        return true;
    }

    @Override // defpackage.ur
    public void j(ud1 ud1Var, int i, int[] iArr, ia3 ia3Var, int[] iArr2) {
        if (ia3Var == ia3.x) {
            x97.J(i, iArr, iArr2, false);
        } else {
            x97.J(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.ea4
    public void l(za3 za3Var, long j, il2 il2Var, int i, boolean z2) {
        kf kfVar = za3Var.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        c94 c94Var = fa4.s0;
        ((fa4) kfVar.B).e1(fa4.y0, fa4Var.V0(j), il2Var, 1, z2);
    }

    @Override // defpackage.ea4
    public boolean q(il2 il2Var, za3 za3Var) {
        return false;
    }

    @Override // defpackage.g95
    public int t(long j) {
        return 0;
    }

    public String toString() {
        switch (this.x) {
            case 6:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ea4
    public boolean u(za3 za3Var) {
        ph5 x = za3Var.x();
        boolean z2 = false;
        if (x != null && x.A) {
            z2 = true;
        }
        return !z2;
    }

    @Override // defpackage.vn0
    public m03 v() {
        Instant now = Instant.now();
        now.getClass();
        m03 m03Var = m03.z;
        return te4.C(now.getNano(), now.getEpochSecond());
    }

    @Override // defpackage.bt2
    public yk3 x(String str) {
        return c64.x;
    }

    @Override // defpackage.z20
    public n71 y() {
        return null;
    }

    public /* synthetic */ m18(byte b) {
        this.x = b;
    }

    @Override // defpackage.uu4
    public void m() {
    }

    @Override // defpackage.g95
    public void s() {
    }

    @Override // defpackage.z20
    public void f(c71 c71Var) {
    }

    @Override // defpackage.z20
    public void F(Handler handler, c71 c71Var) {
    }

    @Override // defpackage.uu4
    public void p(int i, Object obj) {
    }
}
