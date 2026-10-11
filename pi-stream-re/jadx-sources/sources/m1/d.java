package m1;

import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.q0;
import c1.f1;
import c1.v;
import h1.e0;
import j1.n0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.i0;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;
import v1.b0;
import v1.g1;
import v1.u;
import v1.u0;
import v1.v0;
import v1.w0;
import v1.x0;

/* loaded from: classes.dex */
public final class d implements u, w0, w1.j {
    public static final Pattern O = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern P = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final g1 A;
    public final c[] B;
    public final j6.e C;
    public final t D;
    public final b0 F;
    public final o1.n G;
    public v1.t H;
    public v1.i K;
    public n1.c L;
    public int M;
    public List N;

    /* renamed from: a, reason: collision with root package name */
    public final int f7050a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7051b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f7052c;

    /* renamed from: d, reason: collision with root package name */
    public final o1.q f7053d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f7054e;

    /* renamed from: f, reason: collision with root package name */
    public final i.g f7055f;

    /* renamed from: x, reason: collision with root package name */
    public final long f7056x;

    /* renamed from: y, reason: collision with root package name */
    public final z1.p f7057y;

    /* renamed from: z, reason: collision with root package name */
    public final z1.d f7058z;
    public w1.k[] I = new w1.k[0];
    public q[] J = new q[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public d(int i10, n1.c cVar, i.g gVar, int i11, m mVar, e0 e0Var, o1.q qVar, o1.n nVar, q0 q0Var, b0 b0Var, long j4, z1.p pVar, z1.d dVar, j6.e eVar, f fVar, i0 i0Var) {
        String n9;
        int i12;
        int i13;
        boolean[] zArr;
        boolean z9;
        v[] vVarArr;
        n1.f fVar2;
        n1.f fVar3;
        Integer num;
        o1.q qVar2 = qVar;
        this.f7050a = i10;
        this.L = cVar;
        this.f7055f = gVar;
        this.M = i11;
        this.f7051b = mVar;
        this.f7052c = e0Var;
        this.f7053d = qVar2;
        this.G = nVar;
        this.f7054e = q0Var;
        this.F = b0Var;
        this.f7056x = j4;
        this.f7057y = pVar;
        this.f7058z = dVar;
        this.C = eVar;
        this.D = new t(cVar, fVar, dVar);
        int i14 = 0;
        eVar.getClass();
        m0 m0Var = o0.f9505b;
        n1 n1Var = n1.f9497e;
        this.K = new v1.i(n1Var, n1Var);
        n1.h b10 = cVar.b(i11);
        List list = b10.f7945d;
        this.N = list;
        List list2 = b10.f7944c;
        int size = list2.size();
        HashMap hashMap = new HashMap(h0.k(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((n1.a) list2.get(i15)).f7898a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i14 < size) {
            n1.a aVar = (n1.a) list2.get(i14);
            List list3 = aVar.f7902e;
            while (true) {
                if (i16 >= list3.size()) {
                    fVar2 = null;
                    break;
                }
                fVar2 = (n1.f) list3.get(i16);
                if ("http://dashif.org/guidelines/trickmode".equals(fVar2.f7935a)) {
                    break;
                } else {
                    i16++;
                }
            }
            List list4 = aVar.f7903f;
            if (fVar2 == null) {
                int i17 = 0;
                while (true) {
                    if (i17 >= list4.size()) {
                        fVar2 = null;
                        break;
                    }
                    fVar2 = (n1.f) list4.get(i17);
                    if ("http://dashif.org/guidelines/trickmode".equals(fVar2.f7935a)) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            int intValue = (fVar2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(fVar2.f7936b)))) == null) ? i14 : num.intValue();
            if (intValue == i14) {
                int i18 = 0;
                while (true) {
                    if (i18 >= list4.size()) {
                        fVar3 = null;
                        break;
                    }
                    fVar3 = (n1.f) list4.get(i18);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(fVar3.f7935a)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (fVar3 != null) {
                    int i19 = f1.b0.f3799a;
                    String[] split = fVar3.f7936b.split(",", -1);
                    for (String str : split) {
                        Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str)));
                        if (num2 != null) {
                            intValue = Math.min(intValue, num2.intValue());
                        }
                    }
                }
            }
            if (intValue != i14) {
                List list5 = (List) sparseArray.get(i14);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i14, list6);
                arrayList.remove(list5);
            }
            i14++;
            i16 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i20 = 0; i20 < size2; i20++) {
            int[] e02 = com.bumptech.glide.d.e0((Collection) arrayList.get(i20));
            iArr[i20] = e02;
            Arrays.sort(e02);
        }
        boolean[] zArr2 = new boolean[size2];
        v[][] vVarArr2 = new v[size2];
        int i21 = 0;
        for (int i22 = 0; i22 < size2; i22++) {
            int[] iArr2 = iArr[i22];
            int length = iArr2.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length) {
                    z9 = false;
                    break;
                }
                List list7 = ((n1.a) list2.get(iArr2[i23])).f7900c;
                int[] iArr3 = iArr2;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    if (!((n1.m) list7.get(i24)).f7962d.isEmpty()) {
                        z9 = true;
                        break;
                    }
                }
                i23++;
                iArr2 = iArr3;
            }
            if (z9) {
                zArr2[i22] = true;
                i21++;
            }
            int[] iArr4 = iArr[i22];
            int length2 = iArr4.length;
            int i25 = 0;
            while (true) {
                if (i25 >= length2) {
                    vVarArr = new v[0];
                    break;
                }
                int i26 = iArr4[i25];
                n1.a aVar2 = (n1.a) list2.get(i26);
                List list8 = ((n1.a) list2.get(i26)).f7901d;
                int[] iArr5 = iArr4;
                int i27 = 0;
                int i28 = length2;
                while (i27 < list8.size()) {
                    n1.f fVar4 = (n1.f) list8.get(i27);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar4.f7935a)) {
                        c1.u k10 = a3.g.k("application/cea-608");
                        k10.f1897a = aVar2.f7898a + ":cea608";
                        vVarArr = e(fVar4, O, new v(k10));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar4.f7935a)) {
                        c1.u k11 = a3.g.k("application/cea-708");
                        k11.f1897a = aVar2.f7898a + ":cea708";
                        vVarArr = e(fVar4, P, new v(k11));
                        break;
                    }
                    i27++;
                    list8 = list9;
                }
                i25++;
                iArr4 = iArr5;
                length2 = i28;
            }
            vVarArr2[i22] = vVarArr;
            if (vVarArr.length != 0) {
                i21++;
            }
        }
        int size3 = list.size() + i21 + size2;
        f1[] f1VarArr = new f1[size3];
        c[] cVarArr = new c[size3];
        int i29 = 0;
        int i30 = 0;
        while (i29 < size2) {
            int[] iArr6 = iArr[i29];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i31 = size2;
            int i32 = 0;
            while (i32 < length3) {
                arrayList3.addAll(((n1.a) list2.get(iArr6[i32])).f7900c);
                i32++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            v[] vVarArr3 = new v[size4];
            int i33 = 0;
            while (i33 < size4) {
                int i34 = size4;
                v vVar = ((n1.m) arrayList3.get(i33)).f7959a;
                vVar.getClass();
                ArrayList arrayList4 = arrayList3;
                c1.u uVar = new c1.u(vVar);
                uVar.H = qVar2.o(vVar);
                vVarArr3[i33] = new v(uVar);
                i33++;
                size4 = i34;
                arrayList3 = arrayList4;
            }
            n1.a aVar3 = (n1.a) list2.get(iArr6[0]);
            long j10 = aVar3.f7898a;
            if (j10 != -1) {
                n9 = Long.toString(j10);
            } else {
                n9 = a3.g.n("unset:", i29);
            }
            int i35 = i30 + 1;
            if (zArr2[i29]) {
                i12 = i35;
                i35++;
            } else {
                i12 = -1;
            }
            List list10 = list2;
            if (vVarArr2[i29].length != 0) {
                int i36 = i35;
                i35++;
                i13 = i36;
            } else {
                i13 = -1;
            }
            b(mVar, vVarArr3);
            f1VarArr[i30] = new f1(n9, vVarArr3);
            int i37 = aVar3.f7899b;
            m0 m0Var2 = o0.f9505b;
            n1 n1Var2 = n1.f9497e;
            cVarArr[i30] = new c(i37, 0, iArr6, i30, i12, i13, -1, n1Var2);
            int i38 = -1;
            int i39 = i12;
            if (i39 != -1) {
                String s9 = a3.g.s(n9, ":emsg");
                c1.u uVar2 = new c1.u();
                uVar2.f1897a = s9;
                uVar2.e("application/x-emsg");
                zArr = zArr2;
                f1VarArr[i39] = new f1(s9, new v(uVar2));
                cVarArr[i39] = new c(5, 1, iArr6, i30, -1, -1, -1, n1Var2);
                i38 = -1;
            } else {
                zArr = zArr2;
            }
            if (i13 != i38) {
                String s10 = a3.g.s(n9, ":cc");
                cVarArr[i13] = new c(3, 1, iArr6, i30, -1, -1, -1, o0.k(vVarArr2[i29]));
                b(mVar, vVarArr2[i29]);
                f1VarArr[i13] = new f1(s10, vVarArr2[i29]);
            }
            i29++;
            size2 = i31;
            qVar2 = qVar;
            i30 = i35;
            iArr = iArr7;
            list2 = list10;
            zArr2 = zArr;
        }
        int i40 = 0;
        while (i40 < list.size()) {
            n1.g gVar2 = (n1.g) list.get(i40);
            c1.u uVar3 = new c1.u();
            uVar3.f1897a = gVar2.a();
            uVar3.e("application/x-emsg");
            f1VarArr[i30] = new f1(gVar2.a() + ":" + i40, new v(uVar3));
            m0 m0Var3 = o0.f9505b;
            cVarArr[i30] = new c(5, 2, new int[0], -1, -1, -1, i40, n1.f9497e);
            i40++;
            i30++;
        }
        Pair create = Pair.create(new g1(f1VarArr), cVarArr);
        this.A = (g1) create.first;
        this.B = (c[]) create.second;
    }

    public static void b(m mVar, v[] vVarArr) {
        String str;
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            c1.r rVar = mVar.f7097c;
            if (rVar.f1885a && ((w1.o) ((y2.k) rVar.f1886b)).w(vVar)) {
                vVar.getClass();
                c1.u uVar = new c1.u(vVar);
                uVar.e("application/x-media3-cues");
                uVar.E = ((w1.o) ((y2.k) rVar.f1886b)).t(vVar);
                StringBuilder sb = new StringBuilder();
                sb.append(vVar.f1935m);
                String str2 = vVar.f1932j;
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                uVar.f1905i = sb.toString();
                uVar.f1911p = Long.MAX_VALUE;
                vVar = new v(uVar);
            }
            vVarArr[i10] = vVar;
        }
    }

    public static v[] e(n1.f fVar, Pattern pattern, v vVar) {
        String str = fVar.f7936b;
        if (str == null) {
            return new v[]{vVar};
        }
        int i10 = f1.b0.f3799a;
        String[] split = str.split(";", -1);
        v[] vVarArr = new v[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new v[]{vVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            c1.u uVar = new c1.u(vVar);
            uVar.f1897a = vVar.f1923a + ":" + parseInt;
            uVar.D = parseInt;
            uVar.f1900d = matcher.group(2);
            vVarArr[i11] = new v(uVar);
        }
        return vVarArr;
    }

    public final int a(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        c[] cVarArr = this.B;
        int i12 = cVarArr[i11].f7046e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && cVarArr[i14].f7044c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // v1.x0
    public final boolean c() {
        return this.K.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r3 < (((r0.i() + r10) + r8) - 1)) goto L19;
     */
    @Override // v1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r19, j1.j1 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            w1.k[] r0 = r7.I
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L75
            r6 = r0[r5]
            int r8 = r6.f10780a
            r9 = 2
            if (r8 != r9) goto L72
            m1.a r0 = r6.f10784e
            m1.p r0 = (m1.p) r0
            m1.n[] r0 = r0.f7113i
            int r3 = r0.length
        L19:
            if (r4 >= r3) goto L70
            r5 = r0[r4]
            m1.k r6 = r5.f7101d
            if (r6 == 0) goto L6d
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L2c
            goto L6d
        L2c:
            m1.k r0 = r5.f7101d
            w7.b.w(r0)
            long r3 = r5.f7102e
            long r3 = r0.c(r1, r3)
            long r10 = r5.f7103f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L62
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L5b
            w7.b.w(r0)
            long r16 = r0.i()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L62
        L5b:
            long r3 = r3 + r14
            long r3 = r5.f(r3)
            r5 = r3
            goto L63
        L62:
            r5 = r12
        L63:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            goto L71
        L6d:
            int r4 = r4 + 1
            goto L19
        L70:
            r0 = r1
        L71:
            return r0
        L72:
            int r5 = r5 + 1
            goto L9
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.d.d(long, j1.j1):long");
    }

    @Override // v1.x0
    public final long h() {
        return this.K.h();
    }

    @Override // v1.u
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // v1.u
    public final void k(v1.t tVar, long j4) {
        this.H = tVar;
        tVar.i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [r6.o0] */
    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        int i10;
        boolean z9;
        int[] iArr;
        int i11;
        int[] iArr2;
        boolean z10;
        int i12;
        f1 f1Var;
        n1 n1Var;
        int i13;
        s sVar;
        y1.s[] sVarArr2 = sVarArr;
        int[] iArr3 = new int[sVarArr2.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= sVarArr2.length) {
                break;
            }
            y1.s sVar2 = sVarArr2[i14];
            if (sVar2 != null) {
                iArr3[i14] = this.A.b(sVar2.k());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < sVarArr2.length; i15++) {
            if (sVarArr2[i15] == null || !zArr[i15]) {
                v0 v0Var = v0VarArr[i15];
                if (v0Var instanceof w1.k) {
                    ((w1.k) v0Var).B(this);
                } else if (v0Var instanceof w1.i) {
                    ((w1.i) v0Var).d();
                }
                v0VarArr[i15] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z9 = true;
            boolean z11 = true;
            if (i16 >= sVarArr2.length) {
                break;
            }
            v0 v0Var2 = v0VarArr[i16];
            if ((v0Var2 instanceof v1.k) || (v0Var2 instanceof w1.i)) {
                int a10 = a(iArr3, i16);
                if (a10 == -1) {
                    z11 = v0VarArr[i16] instanceof v1.k;
                } else {
                    v0 v0Var3 = v0VarArr[i16];
                    if (!(v0Var3 instanceof w1.i) || ((w1.i) v0Var3).f10775a != v0VarArr[a10]) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    v0 v0Var4 = v0VarArr[i16];
                    if (v0Var4 instanceof w1.i) {
                        ((w1.i) v0Var4).d();
                    }
                    v0VarArr[i16] = null;
                }
            }
            i16++;
        }
        v0[] v0VarArr2 = v0VarArr;
        int i17 = 0;
        while (i17 < sVarArr2.length) {
            y1.s sVar3 = sVarArr2[i17];
            if (sVar3 == null) {
                i11 = i17;
                iArr2 = iArr3;
            } else {
                v0 v0Var5 = v0VarArr2[i17];
                if (v0Var5 == null) {
                    zArr2[i17] = z9;
                    c cVar = this.B[iArr3[i17]];
                    int i18 = cVar.f7044c;
                    if (i18 == 0) {
                        int i19 = cVar.f7047f;
                        if (i19 != i10) {
                            z10 = z9 ? 1 : 0;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            f1Var = this.A.a(i19);
                            i12 = z9 ? 1 : 0;
                        } else {
                            i12 = 0;
                            f1Var = null;
                        }
                        int i20 = cVar.f7048g;
                        if (i20 != i10) {
                            n1Var = this.B[i20].f7049h;
                        } else {
                            n1Var = o0.m();
                        }
                        int size = n1Var.size() + i12;
                        v[] vVarArr = new v[size];
                        int[] iArr4 = new int[size];
                        if (z10) {
                            vVarArr[0] = f1Var.a();
                            iArr4[0] = 5;
                            i13 = z9 ? 1 : 0;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i21 = 0; i21 < n1Var.size(); i21++) {
                            v vVar = (v) n1Var.get(i21);
                            vVarArr[i13] = vVar;
                            iArr4[i13] = 3;
                            arrayList.add(vVar);
                            i13 += z9 ? 1 : 0;
                        }
                        if (this.L.f7911d && z10) {
                            sVar = this.D.a();
                        } else {
                            sVar = null;
                        }
                        iArr2 = iArr3;
                        i11 = i17;
                        s sVar4 = sVar;
                        w1.k kVar = new w1.k(cVar.f7043b, iArr4, vVarArr, this.f7051b.a(this.f7057y, this.L, this.f7055f, this.M, cVar.f7042a, sVar3, cVar.f7043b, this.f7056x, z10, arrayList, sVar, this.f7052c), this, this.f7058z, j4, this.f7053d, this.G, this.f7054e, this.F);
                        synchronized (this) {
                            this.E.put(kVar, sVar4);
                        }
                        v0VarArr[i11] = kVar;
                        v0VarArr2 = v0VarArr;
                    } else {
                        i11 = i17;
                        iArr2 = iArr3;
                        if (i18 == 2) {
                            v0VarArr2[i11] = new q((n1.g) this.N.get(cVar.f7045d), sVar3.k().a(), this.L.f7911d);
                        }
                    }
                } else {
                    i11 = i17;
                    iArr2 = iArr3;
                    if (v0Var5 instanceof w1.k) {
                        ((p) ((w1.k) v0Var5).f10784e).f7114j = sVar3;
                    }
                }
            }
            i17 = i11 + 1;
            sVarArr2 = sVarArr;
            iArr3 = iArr2;
            z9 = true;
            i10 = -1;
        }
        int[] iArr5 = iArr3;
        int i22 = 0;
        while (i22 < sVarArr.length) {
            if (v0VarArr2[i22] == null && sVarArr[i22] != null) {
                c cVar2 = this.B[iArr5[i22]];
                if (cVar2.f7044c == 1) {
                    iArr = iArr5;
                    int a11 = a(iArr, i22);
                    if (a11 == -1) {
                        v0VarArr2[i22] = new v1.k();
                    } else {
                        v0VarArr2[i22] = ((w1.k) v0VarArr2[a11]).C(cVar2.f7043b, j4);
                    }
                    i22++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            } else {
                iArr = iArr5;
            }
            i22++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (v0 v0Var6 : v0VarArr2) {
            if (v0Var6 instanceof w1.k) {
                arrayList2.add((w1.k) v0Var6);
            } else if (v0Var6 instanceof q) {
                arrayList3.add((q) v0Var6);
            }
        }
        w1.k[] kVarArr = new w1.k[arrayList2.size()];
        this.I = kVarArr;
        arrayList2.toArray(kVarArr);
        q[] qVarArr = new q[arrayList3.size()];
        this.J = qVarArr;
        arrayList3.toArray(qVarArr);
        j6.e eVar = this.C;
        AbstractList n02 = com.bumptech.glide.c.n0(new h3.e(1), arrayList2);
        eVar.getClass();
        this.K = j6.e.f(arrayList2, n02);
        return j4;
    }

    @Override // v1.u
    public final g1 m() {
        return this.A;
    }

    @Override // v1.x0
    public final boolean n(n0 n0Var) {
        return this.K.n(n0Var);
    }

    @Override // v1.x0
    public final long o() {
        return this.K.o();
    }

    @Override // v1.u
    public final void p() {
        this.f7057y.b();
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        this.H.s(this);
    }

    @Override // v1.u
    public final long t(long j4) {
        ArrayList arrayList;
        w1.a aVar;
        boolean z9;
        boolean D;
        for (w1.k kVar : this.I) {
            kVar.K = j4;
            if (kVar.y()) {
                kVar.J = j4;
            } else {
                int i10 = 0;
                while (true) {
                    arrayList = kVar.B;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    aVar = (w1.a) arrayList.get(i10);
                    long j10 = aVar.f10772x;
                    if (j10 == j4 && aVar.B == -9223372036854775807L) {
                        break;
                    }
                    if (j10 > j4) {
                        break;
                    }
                    i10++;
                }
                aVar = null;
                u0 u0Var = kVar.D;
                if (aVar != null) {
                    D = u0Var.C(aVar.d(0));
                } else {
                    if (j4 < kVar.h()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    D = u0Var.D(j4, z9);
                }
                u0[] u0VarArr = kVar.E;
                if (D) {
                    kVar.L = kVar.A(u0Var.f10549q + u0Var.f10551s, 0);
                    for (u0 u0Var2 : u0VarArr) {
                        u0Var2.D(j4, true);
                    }
                } else {
                    kVar.J = j4;
                    kVar.N = false;
                    arrayList.clear();
                    kVar.L = 0;
                    z1.o oVar = kVar.f10788z;
                    if (oVar.e()) {
                        u0Var.j();
                        for (u0 u0Var3 : u0VarArr) {
                            u0Var3.j();
                        }
                        oVar.a();
                    } else {
                        oVar.f11944c = null;
                        u0Var.A(false);
                        for (u0 u0Var4 : u0VarArr) {
                            u0Var4.A(false);
                        }
                    }
                }
            }
        }
        for (q qVar : this.J) {
            qVar.c(j4);
        }
        return j4;
    }

    @Override // v1.u
    public final void u(long j4) {
        long j10;
        for (w1.k kVar : this.I) {
            if (!kVar.y()) {
                u0 u0Var = kVar.D;
                int i10 = u0Var.f10549q;
                u0Var.i(j4, true);
                u0 u0Var2 = kVar.D;
                int i11 = u0Var2.f10549q;
                if (i11 > i10) {
                    synchronized (u0Var2) {
                        if (u0Var2.f10548p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = u0Var2.f10547n[u0Var2.f10550r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        u0[] u0VarArr = kVar.E;
                        if (i12 >= u0VarArr.length) {
                            break;
                        }
                        u0VarArr[i12].i(j10, kVar.f10783d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(kVar.A(i11, 0), kVar.L);
                if (min > 0) {
                    f1.b0.T(0, min, kVar.B);
                    kVar.L -= min;
                }
            }
        }
    }

    @Override // v1.x0
    public final void v(long j4) {
        this.K.v(j4);
    }
}
