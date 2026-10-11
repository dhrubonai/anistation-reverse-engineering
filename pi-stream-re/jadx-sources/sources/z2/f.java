package z2;

import android.text.SpannableStringBuilder;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import f1.o;
import f1.s;
import f1.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: g, reason: collision with root package name */
    public final t f12021g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final s f12022h = new s();

    /* renamed from: i, reason: collision with root package name */
    public int f12023i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f12024j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f12025k;

    /* renamed from: l, reason: collision with root package name */
    public e f12026l;

    /* renamed from: m, reason: collision with root package name */
    public List f12027m;

    /* renamed from: n, reason: collision with root package name */
    public List f12028n;
    public s o;

    /* renamed from: p, reason: collision with root package name */
    public int f12029p;

    public f(int i10, List list) {
        this.f12024j = i10 == -1 ? 1 : i10;
        if (list != null && (list.size() != 1 || ((byte[]) list.get(0)).length != 1 || ((byte[]) list.get(0))[0] != 1)) {
        }
        this.f12025k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f12025k[i11] = new e();
        }
        this.f12026l = this.f12025k[0];
    }

    @Override // z2.i
    public final j f() {
        List list = this.f12027m;
        this.f12028n = list;
        list.getClass();
        return new j(list);
    }

    @Override // z2.i, i1.e
    public final void flush() {
        super.flush();
        this.f12027m = null;
        this.f12028n = null;
        this.f12029p = 0;
        this.f12026l = this.f12025k[0];
        l();
        this.o = null;
    }

    @Override // z2.i
    public final void g(g gVar) {
        boolean z9;
        ByteBuffer byteBuffer = gVar.f5262e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f12021g;
        tVar.E(array, limit);
        while (tVar.f3860c - tVar.f3859b >= 3) {
            int v9 = tVar.v() & 7;
            int i10 = v9 & 3;
            boolean z10 = false;
            if ((v9 & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            byte v10 = (byte) tVar.v();
            byte v11 = (byte) tVar.v();
            if (i10 == 2 || i10 == 3) {
                if (z9) {
                    if (i10 == 3) {
                        j();
                        int i11 = (v10 & 192) >> 6;
                        int i12 = this.f12023i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            o.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12023i + " current=" + i11);
                        }
                        this.f12023i = i11;
                        int i13 = v10 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        s sVar = new s(i11, i13);
                        this.o = sVar;
                        byte[] bArr = sVar.f3851b;
                        int i14 = sVar.f3854e;
                        sVar.f3854e = i14 + 1;
                        bArr[i14] = v11;
                    } else {
                        if (i10 == 2) {
                            z10 = true;
                        }
                        w7.b.g(z10);
                        s sVar2 = this.o;
                        if (sVar2 == null) {
                            o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = sVar2.f3851b;
                            int i15 = sVar2.f3854e;
                            int i16 = i15 + 1;
                            bArr2[i15] = v10;
                            sVar2.f3854e = i16 + 1;
                            bArr2[i16] = v11;
                        }
                    }
                    s sVar3 = this.o;
                    if (sVar3.f3854e == (sVar3.f3853d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // z2.i
    public final boolean i() {
        if (this.f12027m != this.f12028n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0141. Please report as an issue. */
    public final void j() {
        int i10;
        String str;
        s sVar = this.o;
        if (sVar == null) {
            return;
        }
        int i11 = 2;
        String str2 = "Cea708Decoder";
        if (sVar.f3854e != (sVar.f3853d * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.o.f3853d * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.o.f3854e);
            sb.append(" (sequence number ");
            sb.append(this.o.f3852c);
            sb.append(");");
            o.b("Cea708Decoder", sb.toString());
        }
        s sVar2 = this.o;
        byte[] bArr = sVar2.f3851b;
        int i12 = sVar2.f3854e;
        s sVar3 = this.f12022h;
        sVar3.n(bArr, i12);
        boolean z9 = false;
        while (true) {
            if (sVar3.b() > 0) {
                int i13 = 3;
                int i14 = sVar3.i(3);
                int i15 = sVar3.i(5);
                if (i14 == 7) {
                    sVar3.r(i11);
                    i14 = sVar3.i(6);
                    if (i14 < 7) {
                        a3.g.A("Invalid extended service number: ", i14, str2);
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        o.f(str2, "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f12024j) {
                    sVar3.s(i15);
                } else {
                    int g10 = (i15 * 8) + sVar3.g();
                    while (sVar3.g() < g10) {
                        int i16 = sVar3.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 != i13) {
                                        if (i16 != 8) {
                                            switch (i16) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f12026l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        o.f(str2, "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        sVar3.r(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        o.f(str2, "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        sVar3.r(16);
                                                        break;
                                                    } else {
                                                        a3.g.A("Invalid C0 command: ", i16, str2);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f12026l.f12001b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f12027m = k();
                                    }
                                }
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f12026l.a((char) 9835);
                                } else {
                                    this.f12026l.a((char) (i16 & 255));
                                }
                                z9 = true;
                            } else {
                                if (i16 <= 159) {
                                    e[] eVarArr = this.f12025k;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str = str2;
                                            i10 = g10;
                                            z9 = true;
                                            int i17 = i16 - 128;
                                            if (this.f12029p != i17) {
                                                this.f12029p = i17;
                                                this.f12026l = eVarArr[i17];
                                            }
                                            str2 = str;
                                            break;
                                        case 136:
                                            str = str2;
                                            i10 = g10;
                                            z9 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (sVar3.h()) {
                                                    e eVar = eVarArr[8 - i18];
                                                    eVar.f12000a.clear();
                                                    eVar.f12001b.clear();
                                                    eVar.f12014p = -1;
                                                    eVar.f12015q = -1;
                                                    eVar.f12016r = -1;
                                                    eVar.f12018t = -1;
                                                    eVar.f12020v = 0;
                                                }
                                            }
                                            str2 = str;
                                            break;
                                        case 137:
                                            str = str2;
                                            i10 = g10;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i19].f12003d = true;
                                                }
                                            }
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 138:
                                            str = str2;
                                            i10 = g10;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i20].f12003d = false;
                                                }
                                            }
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 139:
                                            str = str2;
                                            i10 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i21].f12003d = !r3.f12003d;
                                                }
                                            }
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 140:
                                            str = str2;
                                            i10 = g10;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i22].d();
                                                }
                                            }
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 141:
                                            str = str2;
                                            i10 = g10;
                                            sVar3.r(8);
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 142:
                                            str = str2;
                                            i10 = g10;
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 143:
                                            str = str2;
                                            i10 = g10;
                                            l();
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 144:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f12026l.f12002c) {
                                                sVar3.r(16);
                                                i13 = 3;
                                                z9 = true;
                                                str2 = str;
                                                break;
                                            } else {
                                                sVar3.i(4);
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                boolean h10 = sVar3.h();
                                                boolean h11 = sVar3.h();
                                                sVar3.i(3);
                                                sVar3.i(3);
                                                this.f12026l.e(h10, h11);
                                                i13 = 3;
                                                z9 = true;
                                                str2 = str;
                                            }
                                        case 145:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f12026l.f12002c) {
                                                sVar3.r(24);
                                            } else {
                                                int c6 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                int c10 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.r(2);
                                                e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                this.f12026l.f(c6, c10);
                                            }
                                            i13 = 3;
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 146:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f12026l.f12002c) {
                                                sVar3.r(16);
                                            } else {
                                                sVar3.r(4);
                                                int i23 = sVar3.i(4);
                                                sVar3.r(2);
                                                sVar3.i(6);
                                                e eVar2 = this.f12026l;
                                                if (eVar2.f12020v != i23) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f12020v = i23;
                                            }
                                            i13 = 3;
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            i10 = g10;
                                            z9 = true;
                                            a3.g.A("Invalid C1 command: ", i16, str2);
                                            break;
                                        case 151:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f12026l.f12002c) {
                                                sVar3.r(32);
                                            } else {
                                                int c11 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.i(2);
                                                e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                sVar3.h();
                                                sVar3.h();
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                int i24 = sVar3.i(2);
                                                sVar3.r(8);
                                                e eVar3 = this.f12026l;
                                                eVar3.o = c11;
                                                eVar3.f12011l = i24;
                                            }
                                            i13 = 3;
                                            z9 = true;
                                            str2 = str;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i16 - 152;
                                            e eVar4 = eVarArr[i25];
                                            sVar3.r(i11);
                                            boolean h12 = sVar3.h();
                                            boolean h13 = sVar3.h();
                                            sVar3.h();
                                            int i26 = sVar3.i(i13);
                                            boolean h14 = sVar3.h();
                                            int i27 = sVar3.i(7);
                                            int i28 = sVar3.i(8);
                                            int i29 = sVar3.i(4);
                                            int i30 = sVar3.i(4);
                                            sVar3.r(i11);
                                            i10 = g10;
                                            sVar3.i(6);
                                            sVar3.r(i11);
                                            int i31 = sVar3.i(3);
                                            int i32 = sVar3.i(3);
                                            str = str2;
                                            eVar4.f12002c = true;
                                            eVar4.f12003d = h12;
                                            eVar4.f12010k = h13;
                                            eVar4.f12004e = i26;
                                            eVar4.f12005f = h14;
                                            eVar4.f12006g = i27;
                                            eVar4.f12007h = i28;
                                            eVar4.f12008i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar4.f12009j != i33) {
                                                eVar4.f12009j = i33;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f12000a;
                                                    if ((h13 && arrayList.size() >= eVar4.f12009j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar4.f12012m != i31) {
                                                eVar4.f12012m = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.C[i34];
                                                boolean z10 = e.B[i34];
                                                int i36 = e.f11999z[i34];
                                                int i37 = e.A[i34];
                                                int i38 = e.f11998y[i34];
                                                eVar4.o = i35;
                                                eVar4.f12011l = i38;
                                            }
                                            if (i32 != 0 && eVar4.f12013n != i32) {
                                                eVar4.f12013n = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.E[i39];
                                                int i41 = e.D[i39];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f11996w, e.F[i39]);
                                            }
                                            if (this.f12029p != i25) {
                                                this.f12029p = i25;
                                                this.f12026l = eVarArr[i25];
                                            }
                                            i13 = 3;
                                            z9 = true;
                                            str2 = str;
                                            break;
                                    }
                                } else {
                                    i10 = g10;
                                    if (i16 <= 255) {
                                        this.f12026l.a((char) (i16 & 255));
                                        z9 = true;
                                    } else {
                                        a3.g.A("Invalid base command: ", i16, str2);
                                    }
                                }
                                i11 = 2;
                            }
                            i10 = g10;
                        } else {
                            i10 = g10;
                            int i42 = sVar3.i(8);
                            if (i42 <= 31) {
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        sVar3.r(8);
                                    } else if (i42 <= 23) {
                                        sVar3.r(16);
                                    } else if (i42 <= 31) {
                                        sVar3.r(24);
                                    }
                                }
                            } else if (i42 <= 127) {
                                if (i42 != 32) {
                                    if (i42 != 33) {
                                        if (i42 != 37) {
                                            if (i42 != 42) {
                                                if (i42 != 44) {
                                                    if (i42 != 63) {
                                                        if (i42 != 57) {
                                                            if (i42 != 58) {
                                                                if (i42 != 60) {
                                                                    if (i42 != 61) {
                                                                        switch (i42) {
                                                                            case 48:
                                                                                this.f12026l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f12026l.a((char) 8216);
                                                                                break;
                                                                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                                                                this.f12026l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f12026l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f12026l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f12026l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i42) {
                                                                                    case 118:
                                                                                        this.f12026l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f12026l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f12026l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f12026l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f12026l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f12026l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f12026l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f12026l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f12026l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f12026l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        a3.g.A("Invalid G2 character: ", i42, str2);
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f12026l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f12026l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f12026l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f12026l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f12026l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f12026l.a((char) 338);
                                                }
                                            } else {
                                                this.f12026l.a((char) 352);
                                            }
                                        } else {
                                            this.f12026l.a((char) 8230);
                                        }
                                    } else {
                                        this.f12026l.a((char) 160);
                                    }
                                } else {
                                    this.f12026l.a(' ');
                                }
                                z9 = true;
                            } else if (i42 <= 159) {
                                if (i42 <= 135) {
                                    sVar3.r(32);
                                } else if (i42 <= 143) {
                                    sVar3.r(40);
                                } else if (i42 <= 159) {
                                    i11 = 2;
                                    sVar3.r(2);
                                    sVar3.r(sVar3.i(6) * 8);
                                }
                            } else {
                                if (i42 <= 255) {
                                    if (i42 == 160) {
                                        this.f12026l.a((char) 13252);
                                    } else {
                                        a3.g.A("Invalid G3 character: ", i42, str2);
                                        this.f12026l.a('_');
                                    }
                                    z9 = true;
                                } else {
                                    a3.g.A("Invalid extended command: ", i42, str2);
                                }
                                i11 = 2;
                            }
                            i11 = 2;
                        }
                        g10 = i10;
                    }
                }
            }
        }
        if (z9) {
            this.f12027m = k();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.f.k():java.util.List");
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f12025k[i10].d();
        }
    }
}
