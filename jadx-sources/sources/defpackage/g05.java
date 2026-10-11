package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g05 extends t36 implements jc2 {
    public q44 A;
    public q44 B;
    public q44 C;
    public Set D;
    public q44 E;
    public byte F;
    public /* synthetic */ uf G;
    public final /* synthetic */ h05 H;
    public List x;
    public List y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g05(h05 h05Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.H = h05Var;
    }

    public static final void i(h05 h05Var, List list, List list2, List list3, q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        char c;
        long j;
        long j2;
        synchronized (h05Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    vu0 vu0Var = (vu0) list3.get(i);
                    vu0Var.c();
                    h05Var.P(vu0Var);
                }
                list3.clear();
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    vu0 vu0Var2 = (vu0) objArr[(i2 << 3) + i4];
                                    vu0Var2.c();
                                    h05Var.P(vu0Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                q44Var.b();
                Object[] objArr2 = q44Var2.b;
                long[] jArr2 = q44Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((vu0) objArr2[(i5 << 3) + i7]).j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                q44Var2.b();
                q44Var3.b();
                Object[] objArr3 = q44Var4.b;
                long[] jArr3 = q44Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    vu0 vu0Var3 = (vu0) objArr3[(i8 << 3) + i10];
                                    vu0Var3.c();
                                    h05Var.P(vu0Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                q44Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void j(List list, h05 h05Var) {
        list.clear();
        synchronized (h05Var.c) {
            try {
                ArrayList arrayList = h05Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((k14) arrayList.get(i));
                }
                h05Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g05 g05Var = new g05(this.H, (vz0) obj3);
        g05Var.G = (uf) obj2;
        g05Var.invokeSuspend(pn6.a);
        return w11.x;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0224 -> B:41:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
