package f2;

import c1.u;
import c1.v;
import f1.b0;
import f1.o;
import f1.t;
import java.util.Arrays;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3907b;

    public f(int i10, n1 n1Var) {
        this.f3907b = i10;
        this.f3906a = n1Var;
    }

    public static f c(int i10, t tVar) {
        a aVar;
        String str;
        String str2;
        int i11;
        int i12 = 4;
        h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = tVar.f3860c;
        int i14 = 0;
        int i15 = -2;
        int i16 = 0;
        while (tVar.f3860c - tVar.f3859b > 8) {
            int i17 = tVar.i();
            int i18 = tVar.f3859b + tVar.i();
            tVar.F(i18);
            if (i17 == 1414744396) {
                aVar = c(tVar.i(), tVar);
            } else {
                switch (i17) {
                    case 1718776947:
                        if (i15 == 2) {
                            tVar.H(i12);
                            int i19 = tVar.i();
                            int i20 = tVar.i();
                            tVar.H(i12);
                            int i21 = tVar.i();
                            switch (i21) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                a3.g.A("Ignoring track with unsupported compression ", i21, "StreamFormatChunk");
                                break;
                            } else {
                                u uVar = new u();
                                uVar.f1912q = i19;
                                uVar.f1913r = i20;
                                uVar.e(str2);
                                aVar = new g(new v(uVar));
                                break;
                            }
                        } else if (i15 == 1) {
                            int n9 = tVar.n();
                            if (n9 == 1) {
                                str = "audio/raw";
                            } else if (n9 != 85) {
                                if (n9 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n9 != 8192) {
                                    if (n9 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                a3.g.A("Ignoring track with unsupported format tag ", n9, "StreamFormatChunk");
                                break;
                            } else {
                                int n10 = tVar.n();
                                int i22 = tVar.i();
                                tVar.H(6);
                                int y9 = b0.y(tVar.A());
                                int n11 = tVar.n();
                                byte[] bArr = new byte[n11];
                                tVar.d(bArr, i16, n11);
                                u uVar2 = new u();
                                uVar2.e(str);
                                uVar2.f1920y = n10;
                                uVar2.f1921z = i22;
                                if ("audio/raw".equals(str) && y9 != 0) {
                                    uVar2.A = y9;
                                }
                                if ("audio/mp4a-latm".equals(str) && n11 > 0) {
                                    uVar2.f1910n = o0.o(bArr);
                                }
                                aVar = new g(new v(uVar2));
                                break;
                            }
                        } else {
                            o.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + b0.F(i15));
                            break;
                        }
                    case 1751742049:
                        int i23 = tVar.i();
                        tVar.H(8);
                        int i24 = tVar.i();
                        int i25 = tVar.i();
                        tVar.H(i12);
                        tVar.i();
                        tVar.H(12);
                        aVar = new c(i23, i24, i25);
                        break;
                    case 1752331379:
                        int i26 = tVar.i();
                        tVar.H(12);
                        tVar.i();
                        int i27 = tVar.i();
                        int i28 = tVar.i();
                        tVar.H(i12);
                        int i29 = tVar.i();
                        int i30 = tVar.i();
                        tVar.H(8);
                        aVar = new d(i26, i27, i28, i29, i30);
                        break;
                    case 1852994675:
                        aVar = new h(tVar.s(tVar.f3860c - tVar.f3859b));
                        break;
                }
                aVar = null;
            }
            if (aVar != null) {
                if (aVar.a() == 1752331379) {
                    int i31 = ((d) aVar).f3889a;
                    if (i31 != 1935960438) {
                        if (i31 != 1935963489) {
                            if (i31 != 1937012852) {
                                o.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i31));
                                i11 = -1;
                            } else {
                                i11 = 3;
                            }
                            i15 = i11;
                        } else {
                            i15 = 1;
                        }
                    } else {
                        i15 = 2;
                    }
                }
                int i32 = i14 + 1;
                if (objArr.length < i32) {
                    objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i32));
                }
                objArr[i14] = aVar;
                i14 = i32;
            }
            tVar.G(i18);
            tVar.F(i13);
            i12 = 4;
            i16 = 0;
        }
        return new f(i10, o0.h(i14, objArr));
    }

    @Override // f2.a
    public final int a() {
        return this.f3907b;
    }

    public final a b(Class cls) {
        m0 listIterator = this.f3906a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
