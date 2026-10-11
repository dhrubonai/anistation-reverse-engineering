package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class q23 implements yt1 {
    public static st3 e;
    public static final kg a = new Object();
    public static final os0 b = new os0(-926935424, false, new ys0((byte) 0));
    public static final be c = new be((byte) 13);
    public static final st3 d = new st3(null, null, null);
    public static final i53 f = new i53((byte) 2);
    public static final Object g = new Object();
    public static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void A(ArrayList arrayList, long j, ub2 ub2Var) {
        int size = arrayList.size();
        for (int x = x(nd6.g(j), arrayList); x < size; x++) {
            di4 di4Var = (di4) arrayList.get(x);
            if (di4Var.b < nd6.f(j)) {
                if (di4Var.b != di4Var.c) {
                    ub2Var.invoke(di4Var);
                }
            } else {
                return;
            }
        }
    }

    public static final n11 B(Executor executor) {
        oh1 oh1Var;
        n11 n11Var;
        if (executor instanceof oh1) {
            oh1Var = (oh1) executor;
        } else {
            oh1Var = null;
        }
        if (oh1Var != null && (n11Var = oh1Var.x) != null) {
            return n11Var;
        }
        return new dx1(executor);
    }

    public static final l11 C(v65 v65Var, boolean z, xz0 xz0Var) {
        l11 l11Var;
        rh6 rh6Var = (rh6) xz0Var.getContext().get(rh6.y);
        if (rh6Var != null) {
            l11Var = rh6Var.x;
        } else {
            l11Var = null;
        }
        if (v65Var.inCompatibilityMode()) {
            if (l11Var != null) {
                return v65Var.getQueryContext().plus(l11Var);
            }
            if (z) {
                return v65Var.getTransactionContext$room_runtime();
            }
            return v65Var.getQueryContext();
        }
        l11 queryContext = v65Var.getQueryContext();
        if (l11Var == null) {
            l11Var = it1.x;
        }
        return queryContext.plus(l11Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q05, java.lang.Object] */
    public static q05 D(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sx4.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static final boolean E(uh5 uh5Var) {
        ph5 k = uh5Var.k();
        return k.x.c(yh5.B);
    }

    public static boolean F(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static final boolean G(KeyEvent keyEvent) {
        long C = h41.C(keyEvent);
        int i = e83.O;
        if (!e83.a(C, e83.h) && !e83.a(C, e83.r) && !e83.a(C, e83.E) && !e83.a(C, e83.q)) {
            return false;
        }
        return true;
    }

    public static final void H(sv6 sv6Var, za3 za3Var) {
        long J = ((kz2) za3Var.c0.A).J(0L);
        int round = Math.round(Float.intBitsToFloat((int) (J >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (J & 4294967295L)));
        sv6Var.layout(round, round2, sv6Var.getMeasuredWidth() + round, sv6Var.getMeasuredHeight() + round2);
    }

    public static final float I(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final Object J(v65 v65Var, boolean z, boolean z2, ub2 ub2Var) {
        v65Var.getClass();
        v65Var.assertNotMainThread();
        v65Var.assertNotSuspendingTransaction();
        l11 l11Var = v65Var.getSuspendingTransactionContext().get();
        if (l11Var == null) {
            l11Var = it1.x;
        }
        return iv.L(new w31(l11Var, v65Var, z2, z, ub2Var, (vz0) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        if (r8 == r7) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.vz0 r8, defpackage.ub2 r9, defpackage.v65 r10) {
        /*
            boolean r0 = r8 instanceof defpackage.x31
            if (r0 == 0) goto L13
            r0 = r8
            x31 r0 = (defpackage.x31) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x31 r0 = new x31
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L49
            if (r1 == r5) goto L45
            if (r1 == r4) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            defpackage.m37.N(r8)
            return r8
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r6
        L37:
            t36 r9 = r0.y
            ub2 r9 = (defpackage.ub2) r9
            v65 r10 = r0.x
            defpackage.m37.N(r8)
            goto L93
        L41:
            defpackage.m37.N(r8)
            return r8
        L45:
            defpackage.m37.N(r8)
            return r8
        L49:
            defpackage.m37.N(r8)
            boolean r8 = r10.inCompatibilityMode()
            r1 = 0
            if (r8 == 0) goto L62
            a41 r8 = new a41
            r8.<init>(r1, r6, r9, r10)
            r0.A = r5
            java.lang.Object r8 = defpackage.w65.Y(r0, r8, r10)
            if (r8 != r7) goto L61
            goto La6
        L61:
            return r8
        L62:
            boolean r8 = r10.inCompatibilityMode()
            if (r8 == 0) goto L83
            boolean r8 = r10.isOpenInternal$room_runtime()
            if (r8 == 0) goto L83
            boolean r8 = r10.inTransaction()
            if (r8 == 0) goto L83
            z31 r8 = new z31
            r8.<init>(r5, r6, r9, r10)
            r0.A = r4
            java.lang.Object r8 = r10.useConnection(r1, r8, r0)
            if (r8 != r7) goto L82
            goto La6
        L82:
            return r8
        L83:
            r0.x = r10
            r8 = r9
            t36 r8 = (defpackage.t36) r8
            r0.y = r8
            r0.A = r3
            l11 r8 = C(r10, r5, r0)
            if (r8 != r7) goto L93
            goto La6
        L93:
            l11 r8 = (defpackage.l11) r8
            c0 r1 = new c0
            r1.<init>(r6, r9, r10)
            r0.x = r6
            r0.y = r6
            r0.A = r2
            java.lang.Object r8 = defpackage.tl7.V(r8, r1, r0)
            if (r8 != r7) goto La7
        La6:
            return r7
        La7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.K(vz0, ub2, v65):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(defpackage.vz0 r16, defpackage.v65 r17, boolean r18, boolean r19, defpackage.ub2 r20) {
        /*
            r0 = r16
            boolean r1 = r0 instanceof defpackage.b41
            if (r1 == 0) goto L16
            r1 = r0
            b41 r1 = (defpackage.b41) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.C = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            b41 r1 = new b41
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.B
            int r1 = r7.C
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            w11 r9 = defpackage.w11.x
            if (r1 == 0) goto L4c
            if (r1 == r8) goto L48
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            defpackage.m37.N(r0)
            return r0
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L38:
            boolean r1 = r7.A
            boolean r4 = r7.z
            ub2 r5 = r7.y
            v65 r6 = r7.x
            defpackage.m37.N(r0)
            r14 = r1
            r13 = r4
            r15 = r5
            r12 = r6
            goto L9b
        L48:
            defpackage.m37.N(r0)
            return r0
        L4c:
            defpackage.m37.N(r0)
            boolean r0 = r17.inCompatibilityMode()
            if (r0 == 0) goto L7d
            boolean r0 = r17.isOpenInternal$room_runtime()
            if (r0 == 0) goto L7d
            boolean r0 = r17.inTransaction()
            if (r0 == 0) goto L7d
            u31 r0 = new u31
            r4 = 0
            r6 = 1
            r3 = r17
            r2 = r18
            r1 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r0 = r3
            r7.C = r8
            java.lang.Object r0 = r0.useConnection(r1, r2, r7)
            if (r0 != r9) goto L7c
            goto Laf
        L7c:
            return r0
        L7d:
            r0 = r17
            r1 = r18
            r5 = r19
            r7.x = r0
            r6 = r20
            r7.y = r6
            r7.z = r1
            r7.A = r5
            r7.C = r4
            l11 r4 = C(r0, r5, r7)
            if (r4 != r9) goto L96
            goto Laf
        L96:
            r12 = r0
            r13 = r1
            r0 = r4
            r14 = r5
            r15 = r6
        L9b:
            l11 r0 = (defpackage.l11) r0
            v31 r10 = new v31
            r11 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r7.x = r2
            r7.y = r2
            r7.C = r3
            java.lang.Object r0 = defpackage.tl7.V(r0, r10, r7)
            if (r0 != r9) goto Lb0
        Laf:
            return r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.L(vz0, v65, boolean, boolean, ub2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e3  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(android.view.ViewStructure r41, defpackage.za3 r42, android.view.autofill.AutofillId r43, java.lang.String r44, defpackage.p05 r45) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.M(android.view.ViewStructure, za3, android.view.autofill.AutofillId, java.lang.String, p05):void");
    }

    public static final long N(dy2 dy2Var, rg4 rg4Var, cy2 cy2Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = dy2Var.g;
        if (rg4Var != null) {
            int i = cy2Var.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (rg4Var == rg4.y) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long e2 = xc4.e(O(dy2Var, rg4Var, cy2Var), j2);
        if (!z && dy2Var.i) {
            return 0L;
        }
        return e2;
    }

    public static final long O(dy2 dy2Var, rg4 rg4Var, cy2 cy2Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (rg4Var == null) {
            return dy2Var.c;
        }
        int i = cy2Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (dy2Var.c >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (dy2Var.c & 4294967295L));
        } else {
            return dy2Var.c;
        }
        if (rg4Var == rg4.y) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static final l95 P(kd2 kd2Var) {
        k95 F = n03.F(kd2Var);
        boolean f2 = kd2Var.f(F);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new k74(new pz3(F, (byte) 20), new os0(-1320822745, true, new fr5((Object) F, (byte) 16)));
            kd2Var.n0(Q);
        }
        return (l95) Q;
    }

    public static final void Q(bs5 bs5Var, int i, Object obj) {
        int g2 = bs5Var.g(i);
        Object[] objArr = bs5Var.c;
        Object obj2 = objArr[g2];
        objArr[g2] = au0.a;
        if (obj == obj2) {
            return;
        }
        eu0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void R(List list, int i, int i2) {
        int w = w(i, list);
        if (w < 0) {
            w = -(w + 1);
        }
        while (w < list.size() && ((e33) list.get(w)).b < i2) {
        }
    }

    public static p45 S(p45 p45Var) {
        t45 t45Var;
        if (p45Var != null) {
            t45Var = p45Var.D;
        } else {
            t45Var = null;
        }
        if (t45Var != null) {
            o45 p = p45Var.p();
            p.g = null;
            return p.a();
        }
        return p45Var;
    }

    public static final in0 T(ko koVar) {
        List list;
        long j;
        byte b2;
        List list2 = koVar.z;
        List list3 = nt1.x;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        CharSequence charSequence = koVar.y;
        if (!list.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            i75 i75Var = new i75((byte) 20, false);
            i75Var.y = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i = 0;
            SpannableString spannableString2 = spannableString;
            while (i < size) {
                jo joVar = (jo) list2.get(i);
                pv5 pv5Var = (pv5) joVar.a;
                int i2 = joVar.b;
                int i3 = joVar.c;
                ((Parcel) i75Var.y).recycle();
                i75Var.y = Parcel.obtain();
                nc6 nc6Var = pv5Var.a;
                long j2 = pv5Var.l;
                long j3 = pv5Var.h;
                long j4 = pv5Var.b;
                List list4 = list2;
                int i4 = size;
                long a2 = nc6Var.a();
                SpannableString spannableString3 = spannableString2;
                int i5 = i;
                long j5 = ep0.i;
                if (!cm6.a(a2, j5)) {
                    i75Var.j((byte) 1);
                    j = j5;
                    ((Parcel) i75Var.y).writeLong(pv5Var.a.a());
                } else {
                    j = j5;
                }
                long j6 = ee6.c;
                byte b3 = 2;
                if (!ee6.a(j4, j6)) {
                    i75Var.j((byte) 2);
                    i75Var.l(j4);
                }
                s92 s92Var = pv5Var.c;
                if (s92Var != null) {
                    i75Var.j((byte) 3);
                    ((Parcel) i75Var.y).writeInt(s92Var.x);
                }
                o92 o92Var = pv5Var.d;
                if (o92Var != null) {
                    int i6 = o92Var.a;
                    i75Var.j((byte) 4);
                    if (i6 == 0 || i6 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    i75Var.j(b2);
                }
                p92 p92Var = pv5Var.e;
                if (p92Var != null) {
                    int i7 = p92Var.a;
                    i75Var.j((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b3 = 1;
                        } else if (i7 != 1) {
                            if (i7 == 2) {
                                b3 = 3;
                            }
                        }
                        i75Var.j(b3);
                    }
                    b3 = 0;
                    i75Var.j(b3);
                }
                String str = pv5Var.g;
                if (str != null) {
                    i75Var.j((byte) 6);
                    ((Parcel) i75Var.y).writeString(str);
                }
                if (!ee6.a(j3, j6)) {
                    i75Var.j((byte) 7);
                    i75Var.l(j3);
                }
                z30 z30Var = pv5Var.i;
                if (z30Var != null) {
                    float f2 = z30Var.a;
                    i75Var.j((byte) 8);
                    i75Var.k(f2);
                }
                oc6 oc6Var = pv5Var.j;
                if (oc6Var != null) {
                    i75Var.j((byte) 9);
                    i75Var.k(oc6Var.a);
                    i75Var.k(oc6Var.b);
                }
                if (!cm6.a(j2, j)) {
                    i75Var.j((byte) 10);
                    ((Parcel) i75Var.y).writeLong(j2);
                }
                g96 g96Var = pv5Var.m;
                if (g96Var != null) {
                    i75Var.j((byte) 11);
                    ((Parcel) i75Var.y).writeInt(g96Var.a);
                }
                km5 km5Var = pv5Var.n;
                if (km5Var != null) {
                    i75Var.j((byte) 12);
                    ((Parcel) i75Var.y).writeLong(km5Var.a);
                    long j7 = km5Var.b;
                    i75Var.k(Float.intBitsToFloat((int) (j7 >> 32)));
                    i75Var.k(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    i75Var.k(km5Var.c);
                }
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) i75Var.y).marshall(), 0)), i2, i3, 33);
                i = i5 + 1;
                spannableString2 = spannableString3;
                list2 = list4;
                size = i4;
            }
            charSequence = spannableString2;
        }
        return new in0(ClipData.newPlainText("plain text", charSequence));
    }

    public static final long U(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        if (i == rp0.u.c) {
            return w65.U(j);
        }
        if ((i == rp0.v.c || i == rp0.w.c) && Build.VERSION.SDK_INT < 34) {
            return w65.U(j);
        }
        if (i == rp0.x.c && Build.VERSION.SDK_INT < 36) {
            return w65.U(j);
        }
        return (j & (-64)) | (j2 - 1);
    }

    public static final long V(long j) {
        int i = (int) (63 & j);
        if (i != rp0.x.c && i != rp0.s.c && i != rp0.t.c) {
            return U(j);
        }
        return U(ep0.a(j, rp0.e));
    }

    public static final void W() {
        throw new UnsupportedOperationException();
    }

    public static final void X(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hz2.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            z2 = true;
        }
        if (!z2) {
            hz2.a("minLines " + i + " must be less than or equal to maxLines " + i2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, o21] */
    public static final void a(final yz3 yz3Var, final ur urVar, final wr wrVar, final int i, final h95 h95Var, final os0 os0Var, kd2 kd2Var, final int i2) {
        int i3;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3 = pk2.H;
        kd2Var.f0(-1956591841);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(urVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(wrVar)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.f(obj3)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.d(i)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.d(Integer.MAX_VALUE)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            obj = h95Var;
            if (kd2Var.f(obj)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        } else {
            obj = h95Var;
        }
        if ((i2 & 12582912) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        int i12 = i3;
        if ((i12 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i12 & 1, z)) {
            int i13 = i12 & 3670016;
            if (i13 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = kd2Var.Q();
            Object obj4 = au0.a;
            if (z2 || Q == obj4) {
                obj.getClass();
                Q = new Object();
                kd2Var.n0(Q);
            }
            q62 q62Var = (q62) Q;
            int i14 = i12 >> 3;
            if ((((i14 & 14) ^ 6) > 4 && kd2Var.f(urVar)) || (i14 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i14 & 112) ^ 48) > 32 && kd2Var.f(wrVar)) || (i14 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z12 = z3 | z4;
            if ((((i14 & 896) ^ 384) > 256 && kd2Var.f(obj3)) || (i14 & 384) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z13 = z5 | z12;
            if ((((i14 & 7168) ^ 3072) > 2048 && kd2Var.d(i)) || (i14 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z13 | z6;
            if ((((57344 & i14) ^ 24576) > 16384 && kd2Var.d(Integer.MAX_VALUE)) || (i14 & 24576) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f2 = z14 | z7 | kd2Var.f(q62Var);
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == obj4) {
                Object s62Var = new s62(urVar, wrVar, urVar.a(), new Object(), wrVar.a(), i, q62Var);
                kd2Var.n0(s62Var);
                Q2 = s62Var;
            }
            s62 s62Var2 = (s62) Q2;
            if (i13 == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i12 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z8 | z9;
            if ((i12 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object Q3 = kd2Var.Q();
            if (!z16 && Q3 != obj4) {
                z11 = true;
                obj2 = Q3;
            } else {
                ArrayList arrayList = new ArrayList();
                z11 = true;
                arrayList.add(new os0(-1192950673, true, new k(os0Var, (byte) 3)));
                h95Var.getClass();
                kd2Var.n0(arrayList);
                obj2 = arrayList;
            }
            os0 os0Var2 = new os0(1271844412, z11, new oa3((List) obj2, (byte) 0));
            boolean f3 = kd2Var.f(s62Var2);
            Object Q4 = kd2Var.Q();
            if (f3 || Q4 == obj4) {
                Q4 = new g24(s62Var2);
                kd2Var.n0(Q4);
            }
            vo3 vo3Var = (vo3) Q4;
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, vo3Var);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            os0Var2.invoke(kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: o62
                @Override // defpackage.ic2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    q23.a(yz3.this, urVar, wrVar, i, h95Var, os0Var, (kd2) obj5, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(yz3 yz3Var, final ur urVar, final wr wrVar, x50 x50Var, int i, int i2, final os0 os0Var, kd2 kd2Var, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        boolean z;
        final yz3 yz3Var2;
        final int i8;
        final int i9;
        int i10;
        kd2Var.f0(-1303174015);
        int i11 = i4 & 1;
        if (i11 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i12 = i5 | 3072;
        int i13 = i4 & 16;
        if (i13 != 0) {
            i12 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            if (kd2Var.d(i)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i12 |= i7;
        }
        int i14 = 196608 | i12;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i14 & 1, z)) {
            if (i11 != 0) {
                yz3Var = vz3.x;
            }
            yz3 yz3Var3 = yz3Var;
            x50Var = pk2.H;
            if (i13 != 0) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = i;
            }
            a(yz3Var3, urVar, wrVar, i10, h95.E, os0Var, kd2Var, (i14 & 14) | 1576368 | (i14 & 57344) | 12779520);
            i9 = Integer.MAX_VALUE;
            yz3Var2 = yz3Var3;
            i8 = i10;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            i8 = i;
            i9 = i2;
        }
        final x50 x50Var2 = x50Var;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: n62
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q23.b(yz3.this, urVar, wrVar, x50Var2, i8, i9, os0Var, (kd2) obj, kb0.N(i3 | 1), i4);
                    return pn6.a;
                }
            };
        }
    }

    public static final long c(int i) {
        long j = i << 32;
        int i2 = e83.O;
        return j;
    }

    public static final void d(yz3 yz3Var, jw4 jw4Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        os0 os0Var2 = wc7.a;
        kd2Var.f0(-714464401);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(jw4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Object ti4Var = new ti4(null, h95.H);
                kd2Var.n0(ti4Var);
                Q = ti4Var;
            }
            f40 f2 = f(os0Var2, kd2Var, (i2 >> 6) & 14);
            kb0.b(jw4Var.a(f2), nx7.R(274270255, new fj((Object) yz3Var, Q, (Object) os0Var, (Object) f2, (byte) 6), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 1, i, (Object) yz3Var, (Object) jw4Var, (Object) os0Var);
        }
    }

    public static final Executor e(n11 n11Var) {
        cx1 cx1Var;
        Executor y0;
        if (n11Var instanceof cx1) {
            cx1Var = (cx1) n11Var;
        } else {
            cx1Var = null;
        }
        if (cx1Var != null && (y0 = cx1Var.y0()) != null) {
            return y0;
        }
        return new oh1(n11Var);
    }

    public static final f40 f(os0 os0Var, kd2 kd2Var, int i) {
        boolean z;
        if ((((i & 14) ^ 6) > 4 && kd2Var.f(os0Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (z || Q == obj) {
            Q = new f40(os0Var);
            kd2Var.n0(Q);
        }
        f40 f40Var = (f40) Q;
        boolean f2 = kd2Var.f(f40Var);
        Object Q2 = kd2Var.Q();
        if (f2 || Q2 == obj) {
            Q2 = new l0(f40Var, (byte) 17);
            kd2Var.n0(Q2);
        }
        db.c(f40Var, (ub2) Q2, kd2Var);
        return f40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [bv5, java.lang.Object, pa0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [bv5, java.lang.Object, pa0] */
    public static void g(long j, pa0 pa0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (((zd0) arrayList4.get(i8)).d() < i7) {
                    ze0.k("Failed requirement.");
                    return;
                }
            }
            zd0 zd0Var = (zd0) arrayList.get(i2);
            zd0 zd0Var2 = (zd0) arrayList4.get(i3 - 1);
            if (i7 == zd0Var.d()) {
                int intValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                zd0 zd0Var3 = (zd0) arrayList4.get(i9);
                i4 = i9;
                i5 = intValue;
                zd0Var = zd0Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (zd0Var.i(i7) != zd0Var2.i(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (((zd0) arrayList4.get(i11 - 1)).i(i7) != ((zd0) arrayList4.get(i11)).i(i7)) {
                        i10++;
                    }
                }
                long j3 = (pa0Var.y / 4) + j + 2 + (i10 * 2);
                pa0Var.y0(i10);
                pa0Var.y0(i5);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte i13 = ((zd0) arrayList4.get(i12)).i(i7);
                    if (i12 == i4 || i13 != ((zd0) arrayList4.get(i12 - 1)).i(i7)) {
                        pa0Var.y0(i13 & 255);
                    }
                }
                ?? obj = new Object();
                int i14 = i4;
                while (i14 < i3) {
                    byte i15 = ((zd0) arrayList4.get(i14)).i(i7);
                    int i16 = i14 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 < i3) {
                            if (i15 != ((zd0) arrayList4.get(i17)).i(i7)) {
                                break;
                            } else {
                                i17++;
                            }
                        } else {
                            i17 = i3;
                            break;
                        }
                    }
                    if (i16 == i17 && i7 + 1 == ((zd0) arrayList4.get(i14)).d()) {
                        pa0Var.y0(((Number) arrayList5.get(i14)).intValue());
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                    } else {
                        pa0Var.y0(((int) ((obj.y / 4) + j3)) * (-1));
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                        g(j2, obj, i7 + 1, arrayList, i14, i6, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j3 = j2;
                    i14 = i6;
                    arrayList5 = arrayList3;
                }
                pa0Var.v0(obj);
                return;
            }
            int min = Math.min(zd0Var.d(), zd0Var2.d());
            int i18 = 0;
            for (int i19 = i7; i19 < min && zd0Var.i(i19) == zd0Var2.i(i19); i19++) {
                i18++;
            }
            long j4 = (pa0Var.y / 4) + j + 2 + i18 + 1;
            pa0Var.y0(-i18);
            pa0Var.y0(i5);
            int i20 = i7 + i18;
            while (i7 < i20) {
                pa0Var.y0(zd0Var.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i20 == ((zd0) arrayList4.get(i4)).d()) {
                    pa0Var.y0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    ze0.m("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            pa0Var.y0(((int) ((obj2.y / 4) + j4)) * (-1));
            g(j4, obj2, i20, arrayList4, i4, i3, arrayList5);
            pa0Var.v0(obj2);
            return;
        }
        ze0.k("Failed requirement.");
    }

    public static final boolean h(dy2 dy2Var) {
        if (!dy2Var.h && dy2Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean i(dy2 dy2Var) {
        if (dy2Var.h && !dy2Var.d) {
            return true;
        }
        return false;
    }

    public static final void j(long j, long j2, long j3) {
        if (j2 >= 0 && j3 <= j) {
            if (j2 <= j3) {
                return;
            }
            StringBuilder n = zo5.n(j2, "startIndex (", ") > endIndex (");
            n.append(j3);
            n.append(')');
            throw new IllegalArgumentException(n.toString());
        }
        StringBuilder n2 = zo5.n(j2, "startIndex (", ") and endIndex (");
        n2.append(j3);
        n2.append(") are not within the range [0..size(");
        n2.append(j);
        n2.append("))");
        throw new IndexOutOfBoundsException(n2.toString());
    }

    public static final yz3 k(yz3 yz3Var, u34 u34Var, by2 by2Var, boolean z, m65 m65Var, sb2 sb2Var) {
        yz3 s;
        if (by2Var != null) {
            s = new rm0(u34Var, by2Var, false, z, null, m65Var, sb2Var);
        } else if (by2Var == null) {
            s = new rm0(u34Var, null, false, z, null, m65Var, sb2Var);
        } else if (u34Var != null) {
            s = yx2.a(u34Var, by2Var).w(new rm0(u34Var, null, false, z, null, m65Var, sb2Var));
        } else {
            s = o80.s(vz3.x, new tm0(by2Var, z, m65Var, sb2Var));
        }
        return yz3Var.w(s);
    }

    public static /* synthetic */ yz3 l(yz3 yz3Var, u34 u34Var, by2 by2Var, boolean z, m65 m65Var, sb2 sb2Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            m65Var = null;
        }
        return k(yz3Var, u34Var, by2Var, z2, m65Var, sb2Var);
    }

    public static yz3 m(sb2 sb2Var) {
        return new zt0(new sm0(sb2Var, (byte) 0));
    }

    public static yz3 n(int i, sb2 sb2Var, yz3 yz3Var, String str, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return yz3Var.w(new rm0(null, null, true, z2, str, null, sb2Var));
    }

    public static final void o(xr5 xr5Var, ArrayList arrayList, int i) {
        boolean l = xr5Var.l(i);
        int[] iArr = xr5Var.b;
        if (l) {
            arrayList.add(xr5Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            o(xr5Var, arrayList, i3);
        }
    }

    public static yz3 p(yz3 yz3Var, u34 u34Var, boolean z, m65 m65Var, sb2 sb2Var, sb2 sb2Var2, int i) {
        boolean z2;
        m65 m65Var2;
        sb2 sb2Var3;
        boolean z3 = true;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            m65Var2 = null;
        } else {
            m65Var2 = m65Var;
        }
        if ((i & 64) != 0) {
            sb2Var3 = null;
        } else {
            sb2Var3 = sb2Var;
        }
        if ((i & 256) == 0) {
            z3 = false;
        }
        return yz3Var.w(new dq0(sb2Var2, sb2Var3, u34Var, m65Var2, z2, z3));
    }

    public static final int q(float f2, float f3, float f4, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        float f5 = (f3 * i3) + f2;
        int i4 = 1;
        int i5 = i - 1;
        if (i5 <= 1) {
            i4 = i5;
        }
        return io3.h0((f4 * i4) + f5);
    }

    public static final boolean r(hn1 hn1Var, long j) {
        if (hn1Var.x.K) {
            kz2 kz2Var = (kz2) wc7.O(hn1Var).c0.A;
            if (kz2Var.z0.K) {
                long J = kz2Var.J(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (J >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (J & 4294967295L));
                long j2 = hn1Var.O;
                float f2 = ((int) (j2 >> 32)) + intBitsToFloat;
                float f3 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f2) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean s(n05 n05Var, float f2, float f3) {
        float f4 = n05Var.a;
        if (f2 <= n05Var.c && f4 <= f2) {
            float f5 = n05Var.b;
            if (f3 <= n05Var.d && f5 <= f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final rl t(rl rlVar) {
        rl c2 = rlVar.c();
        int b2 = c2.b();
        for (int i = 0; i < b2; i++) {
            c2.e(i, rlVar.a(i));
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(java.util.ArrayList r4, defpackage.wc0 r5, defpackage.vk6 r6, java.nio.charset.Charset r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.iy0
            if (r0 == 0) goto L13
            r0 = r8
            iy0 r0 = (defpackage.iy0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            iy0 r0 = new iy0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            vk6 r6 = r0.y
            wc0 r5 = r0.x
            defpackage.m37.N(r8)
            goto L53
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L30:
            defpackage.m37.N(r8)
            mx0 r8 = new mx0
            r1 = 4
            r8.<init>(r4, r1)
            hy0 r4 = new hy0
            r4.<init>(r8, r7, r6, r5)
            yh r7 = new yh
            r8 = 2
            r7.<init>(r5, r3, r8)
            r0.x = r5
            r0.y = r6
            r0.A = r2
            java.lang.Object r8 = defpackage.sw0.s(r4, r7, r0)
            w11 r4 = defpackage.w11.x
            if (r8 != r4) goto L53
            return r4
        L53:
            if (r8 != 0) goto L77
            boolean r4 = r5.h()
            if (r4 != 0) goto L5c
            return r5
        L5c:
            boolean r4 = r6.b
            if (r4 == 0) goto L63
            pb4 r4 = defpackage.pb4.a
            return r4
        L63:
            nw r4 = new nw
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "No suitable converter found for "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5, r3, r2)
            throw r4
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q23.u(java.util.ArrayList, wc0, vk6, java.nio.charset.Charset, xz0):java.lang.Object");
    }

    public static final float v(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final int w(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int D = a34.D(((e33) list.get(i3)).b, i);
            if (D < 0) {
                i2 = i3 + 1;
            } else if (D > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int x(int i, List list) {
        int i2;
        char c2;
        int i3 = ((di4) yo0.r0(list)).c;
        if (i > ((di4) yo0.r0(list)).c) {
            fz2.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                di4 di4Var = (di4) list.get(i2);
                if (di4Var.b > i) {
                    c2 = 1;
                } else if (di4Var.c <= i) {
                    c2 = 65535;
                } else {
                    c2 = 0;
                }
                if (c2 < 0) {
                    i4 = i2 + 1;
                } else {
                    if (c2 <= 0) {
                        break;
                    }
                    size = i2 - 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String a2 = hi3.a(list, null, new p03((byte) 22), 31);
        StringBuilder u = qx1.u("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        u.append(i);
        u.append(", paragraphs=[");
        u.append(a2);
        u.append("]");
        fz2.a(u.toString());
        return i2;
    }

    public static final int y(int i, List list) {
        char c2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            di4 di4Var = (di4) list.get(i3);
            if (di4Var.d > i) {
                c2 = 1;
            } else if (di4Var.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int z(ArrayList arrayList, float f2) {
        char c2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((di4) yo0.r0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            di4 di4Var = (di4) arrayList.get(i2);
            if (di4Var.f > f2) {
                c2 = 1;
            } else if (di4Var.g <= f2) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
