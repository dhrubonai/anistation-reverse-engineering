package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rb1 {
    public final List a;
    public int b;

    public rb1(ai3 ai3Var) {
        ai3Var.getClass();
        this.a = ai3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.mk6 a(int r8, defpackage.ad r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb1.a(int, ad):mk6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(ad adVar) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z2;
        byte[] bArr;
        boolean c = c(32);
        List list2 = this.a;
        if (c) {
            return list2;
        }
        zi4 zi4Var = new zi4((byte[]) adVar.B);
        ArrayList arrayList = list2;
        while (zi4Var.a() > 0) {
            int A = zi4Var.A();
            int A2 = zi4Var.b + zi4Var.A();
            if (A == 134) {
                arrayList = new ArrayList();
                int A3 = zi4Var.A() & 31;
                for (int i2 = 0; i2 < A3; i2++) {
                    String y = zi4Var.y(3, StandardCharsets.UTF_8);
                    int A4 = zi4Var.A();
                    if ((A4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A5 = (byte) zi4Var.A();
                    zi4Var.O(1);
                    if (z) {
                        if ((A5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        byte[] bArr2 = ko0.a;
                        if (z2) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    da2 da2Var = new da2();
                    da2Var.o = qy3.n(str);
                    da2Var.d = y;
                    da2Var.O = i;
                    da2Var.r = list;
                    arrayList.add(new ea2(da2Var));
                }
            }
            zi4Var.N(A2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public Integer d(int i) {
        if (i >= 0) {
            int i2 = this.b + i;
            List list = this.a;
            if (i2 <= list.size() * 8) {
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int intValue = ((Number) list.get(this.b / 8)).intValue();
                    int i5 = this.b;
                    i3 = (i3 << 1) | ((intValue >> (7 - (i5 % 8))) & 1);
                    this.b = i5 + 1;
                }
                return Integer.valueOf(i3);
            }
            return null;
        }
        return null;
    }

    public Integer e() {
        int i;
        Integer f = f();
        if (f != null) {
            int intValue = f.intValue();
            if (intValue % 2 == 0) {
                i = -(intValue / 2);
            } else {
                i = (intValue + 1) / 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public Integer f() {
        int i = 0;
        int i2 = 0;
        do {
            Integer d = d(1);
            if (d != null) {
                if (d.intValue() != 1) {
                    i2++;
                } else {
                    if (i2 != 0) {
                        Integer d2 = d(i2);
                        if (d2 != null) {
                            i = d2.intValue();
                        }
                    }
                    return Integer.valueOf(((1 << i2) - 1) + i);
                }
            }
            return null;
        } while (i2 <= 30);
        return null;
    }

    public /* synthetic */ rb1(int i, List list) {
        this.b = i;
        this.a = list;
    }
}
