package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zi0 extends cj0 {
    public final zi4 h = new zi4();
    public final yi0 i = new yi0();
    public int j = -1;
    public final int k;
    public final xi0[] l;
    public xi0 m;
    public List n;
    public List o;
    public yi0 p;
    public int q;

    public zi0(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = ko0.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new xi0[8];
        int i2 = 0;
        while (true) {
            xi0[] xi0VarArr = this.l;
            if (i2 < 8) {
                xi0VarArr[i2] = new xi0();
                i2++;
            } else {
                this.m = xi0VarArr[0];
                return;
            }
        }
    }

    @Override // defpackage.cj0
    public final dj0 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new dj0(list);
    }

    @Override // defpackage.cj0, defpackage.m61
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.cj0
    public final void g(aj0 aj0Var) {
        boolean z;
        yi0 yi0Var;
        ByteBuffer byteBuffer = aj0Var.B;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        zi4 zi4Var = this.h;
        zi4Var.L(limit, array);
        while (zi4Var.a() >= 3) {
            int A = zi4Var.A();
            int i = A & 3;
            boolean z2 = false;
            if ((A & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte A2 = (byte) zi4Var.A();
            byte A3 = (byte) zi4Var.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (A2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            kb0.O("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = A2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        yi0Var = new yi0(i2, i4);
                        this.p = yi0Var;
                        byte[] bArr = yi0Var.b;
                        yi0Var.e = 1;
                        bArr[0] = A3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        io3.n(z2);
                        yi0Var = this.p;
                        if (yi0Var == null) {
                            kb0.s("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = yi0Var.b;
                            int i5 = yi0Var.e;
                            int i6 = i5 + 1;
                            yi0Var.e = i6;
                            bArr2[i5] = A2;
                            yi0Var.e = i5 + 2;
                            bArr2[i6] = A3;
                        }
                    }
                    if (yi0Var.e == (yi0Var.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.cj0
    public final boolean i() {
        if (this.n != this.o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0141. Please report as an issue. */
    public final void j() {
        char c;
        int i;
        boolean z;
        yi0 yi0Var = this.p;
        if (yi0Var == null) {
            return;
        }
        int i2 = 2;
        if (yi0Var.e != (yi0Var.d * 2) - 1) {
            kb0.q("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        yi0 yi0Var2 = this.p;
        byte[] bArr = yi0Var2.b;
        int i3 = yi0Var2.e;
        yi0 yi0Var3 = this.i;
        yi0Var3.k(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (yi0Var3.b() > 0) {
                int i4 = 3;
                int g = yi0Var3.g(3);
                int g2 = yi0Var3.g(5);
                if (g == 7) {
                    yi0Var3.o(i2);
                    g = yi0Var3.g(6);
                    if (g < 7) {
                        h11.r(g, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (g2 == 0) {
                    if (g != 0) {
                        kb0.O("Cea708Decoder", "serviceNumber is non-zero (" + g + ") when blockSize is 0");
                    }
                } else if (g != this.k) {
                    yi0Var3.p(g2);
                } else {
                    int e = (g2 * 8) + yi0Var3.e();
                    while (yi0Var3.e() < e) {
                        int g3 = yi0Var3.g(8);
                        if (g3 != 16) {
                            if (g3 <= 31) {
                                if (g3 != 0) {
                                    if (g3 != i4) {
                                        if (g3 != 8) {
                                            switch (g3) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (g3 >= 17 && g3 <= 23) {
                                                        kb0.O("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + g3);
                                                        yi0Var3.o(8);
                                                        break;
                                                    } else if (g3 >= 24 && g3 <= 31) {
                                                        kb0.O("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + g3);
                                                        yi0Var3.o(16);
                                                        break;
                                                    } else {
                                                        h11.r(g3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.m.b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.n = k();
                                    }
                                }
                                i = i2;
                            } else if (g3 <= 127) {
                                xi0 xi0Var = this.m;
                                if (g3 == 127) {
                                    xi0Var.a((char) 9835);
                                } else {
                                    xi0Var.a((char) (g3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (g3 <= 159) {
                                    xi0[] xi0VarArr = this.l;
                                    switch (g3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i5 = g3 - 128;
                                            if (this.q != i5) {
                                                this.q = i5;
                                                this.m = xi0VarArr[i5];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (yi0Var3.f()) {
                                                    xi0 xi0Var2 = xi0VarArr[8 - i6];
                                                    xi0Var2.a.clear();
                                                    xi0Var2.b.clear();
                                                    xi0Var2.o = -1;
                                                    xi0Var2.p = -1;
                                                    xi0Var2.q = -1;
                                                    xi0Var2.s = -1;
                                                    xi0Var2.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (yi0Var3.f()) {
                                                    xi0VarArr[8 - i7].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (yi0Var3.f()) {
                                                    xi0VarArr[8 - i8].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (yi0Var3.f()) {
                                                    xi0VarArr[8 - i9].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (yi0Var3.f()) {
                                                    xi0VarArr[8 - i10].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            yi0Var3.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (!this.m.c) {
                                                yi0Var3.o(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                yi0Var3.g(4);
                                                yi0Var3.g(i11);
                                                yi0Var3.g(i11);
                                                boolean f = yi0Var3.f();
                                                boolean f2 = yi0Var3.f();
                                                i4 = 3;
                                                yi0Var3.g(3);
                                                yi0Var3.g(3);
                                                this.m.e(f, f2);
                                                z = true;
                                            }
                                        case 145:
                                            if (!this.m.c) {
                                                yi0Var3.o(24);
                                            } else {
                                                int c2 = xi0.c(yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2));
                                                int c3 = xi0.c(yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2));
                                                yi0Var3.o(2);
                                                xi0.c(yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2), 0);
                                                this.m.f(c2, c3);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (!this.m.c) {
                                                yi0Var3.o(16);
                                            } else {
                                                yi0Var3.o(4);
                                                int g4 = yi0Var3.g(4);
                                                yi0Var3.o(2);
                                                yi0Var3.g(6);
                                                xi0 xi0Var3 = this.m;
                                                if (xi0Var3.u != g4) {
                                                    xi0Var3.a('\n');
                                                }
                                                xi0Var3.u = g4;
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            h11.r(g3, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (!this.m.c) {
                                                yi0Var3.o(32);
                                            } else {
                                                int c4 = xi0.c(yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2));
                                                yi0Var3.g(2);
                                                xi0.c(yi0Var3.g(2), yi0Var3.g(2), yi0Var3.g(2), 0);
                                                yi0Var3.f();
                                                yi0Var3.f();
                                                yi0Var3.g(2);
                                                yi0Var3.g(2);
                                                int g5 = yi0Var3.g(2);
                                                yi0Var3.o(8);
                                                xi0 xi0Var4 = this.m;
                                                xi0Var4.n = c4;
                                                xi0Var4.k = g5;
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = g3 - 152;
                                            xi0 xi0Var5 = xi0VarArr[i12];
                                            yi0Var3.o(i2);
                                            boolean f3 = yi0Var3.f();
                                            yi0Var3.o(i2);
                                            int g6 = yi0Var3.g(i4);
                                            boolean f4 = yi0Var3.f();
                                            int g7 = yi0Var3.g(7);
                                            int g8 = yi0Var3.g(8);
                                            int g9 = yi0Var3.g(4);
                                            int g10 = yi0Var3.g(4);
                                            yi0Var3.o(i2);
                                            yi0Var3.o(6);
                                            yi0Var3.o(i2);
                                            int g11 = yi0Var3.g(3);
                                            int g12 = yi0Var3.g(3);
                                            ArrayList arrayList = xi0Var5.a;
                                            xi0Var5.c = true;
                                            xi0Var5.d = f3;
                                            xi0Var5.e = g6;
                                            xi0Var5.f = f4;
                                            xi0Var5.g = g7;
                                            xi0Var5.h = g8;
                                            xi0Var5.i = g9;
                                            int i13 = g10 + 1;
                                            if (xi0Var5.j != i13) {
                                                xi0Var5.j = i13;
                                                while (true) {
                                                    if (arrayList.size() >= xi0Var5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g11 != 0 && xi0Var5.l != g11) {
                                                xi0Var5.l = g11;
                                                int i14 = g11 - 1;
                                                int i15 = xi0.B[i14];
                                                boolean z3 = xi0.A[i14];
                                                int i16 = xi0.y[i14];
                                                int i17 = xi0.z[i14];
                                                int i18 = xi0.x[i14];
                                                xi0Var5.n = i15;
                                                xi0Var5.k = i18;
                                            }
                                            if (g12 != 0 && xi0Var5.m != g12) {
                                                xi0Var5.m = g12;
                                                int i19 = g12 - 1;
                                                int i20 = xi0.D[i19];
                                                int i21 = xi0.C[i19];
                                                xi0Var5.e(false, false);
                                                xi0Var5.f(xi0.v, xi0.E[i19]);
                                            }
                                            if (this.q != i12) {
                                                this.q = i12;
                                                this.m = xi0VarArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (g3 <= 255) {
                                        this.m.a((char) (g3 & 255));
                                    } else {
                                        h11.r(g3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int g13 = yi0Var3.g(8);
                            if (g13 <= 31) {
                                c = 7;
                                if (g13 > 7) {
                                    if (g13 <= 15) {
                                        yi0Var3.o(8);
                                    } else if (g13 <= 23) {
                                        yi0Var3.o(16);
                                    } else if (g13 <= 31) {
                                        yi0Var3.o(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (g13 <= 127) {
                                    if (g13 != 32) {
                                        if (g13 != 33) {
                                            if (g13 != 37) {
                                                if (g13 != 42) {
                                                    if (g13 != 44) {
                                                        if (g13 != 63) {
                                                            if (g13 != 57) {
                                                                if (g13 != 58) {
                                                                    if (g13 != 60) {
                                                                        if (g13 != 61) {
                                                                            switch (g13) {
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                                                                    this.m.a((char) 9608);
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                                                                    this.m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.m.a((char) 8217);
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                                                                    this.m.a((char) 8220);
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                                                                    this.m.a((char) 8221);
                                                                                    break;
                                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                                                                    this.m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (g13) {
                                                                                        case 118:
                                                                                            this.m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            h11.r(g13, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.m.a((char) 338);
                                                    }
                                                } else {
                                                    this.m.a((char) 352);
                                                }
                                            } else {
                                                this.m.a((char) 8230);
                                            }
                                        } else {
                                            this.m.a((char) 160);
                                        }
                                    } else {
                                        this.m.a(' ');
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (g13 <= 159) {
                                    if (g13 <= 135) {
                                        yi0Var3.o(32);
                                    } else if (g13 <= 143) {
                                        yi0Var3.o(40);
                                    } else if (g13 <= 159) {
                                        i = 2;
                                        yi0Var3.o(2);
                                        yi0Var3.o(yi0Var3.g(6) * 8);
                                    }
                                } else {
                                    i = 2;
                                    if (g13 <= 255) {
                                        if (g13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            h11.r(g13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        h11.r(g13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi0.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
