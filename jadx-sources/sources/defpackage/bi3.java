package defpackage;

import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bi3 implements yy {
    public final nw2 a;
    public final int b;

    public bi3(int i, o15 o15Var) {
        this.b = i;
        this.a = o15Var;
    }

    public static bi3 b(int i, zi4 zi4Var) {
        String str;
        int i2;
        yy uy5Var;
        String str2;
        int i3 = 4;
        io3.t(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = zi4Var.c;
        int i5 = -2;
        int i6 = 0;
        while (zi4Var.a() > 8) {
            int o = zi4Var.o();
            int o2 = zi4Var.b + zi4Var.o();
            zi4Var.M(o2);
            if (o == 1414744396) {
                uy5Var = b(zi4Var.o(), zi4Var);
            } else {
                cz czVar = null;
                switch (o) {
                    case 1718776947:
                        if (i5 == 2) {
                            zi4Var.O(i3);
                            int o3 = zi4Var.o();
                            int o4 = zi4Var.o();
                            zi4Var.O(i3);
                            int o5 = zi4Var.o();
                            switch (o5) {
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
                                    str2 = MimeTypes.VIDEO_H264;
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
                                h11.r(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            } else {
                                da2 da2Var = new da2();
                                da2Var.v = o3;
                                da2Var.w = o4;
                                da2Var.o = qy3.n(str2);
                                uy5Var = new uy5(new ea2(da2Var));
                                break;
                            }
                        } else if (i5 == 1) {
                            int t = zi4Var.t();
                            if (t == 1) {
                                str = "audio/raw";
                            } else if (t != 85) {
                                if (t == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (t != 8192) {
                                    if (t != 8193) {
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
                                h11.r(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                break;
                            } else {
                                int t2 = zi4Var.t();
                                int o6 = zi4Var.o();
                                zi4Var.O(6);
                                int t3 = zi4Var.t();
                                String str3 = eq6.a;
                                int G = eq6.G(t3, ByteOrder.LITTLE_ENDIAN);
                                if (zi4Var.a() > 0) {
                                    i2 = zi4Var.t();
                                } else {
                                    i2 = 0;
                                }
                                da2 da2Var2 = new da2();
                                da2Var2.o = qy3.n(str);
                                da2Var2.I = t2;
                                da2Var2.K = o6;
                                if (str.equals("audio/raw") && G != 0) {
                                    da2Var2.L = G;
                                }
                                if (str.equals("audio/mp4a-latm") && i2 > 0) {
                                    byte[] bArr = new byte[i2];
                                    zi4Var.k(bArr, 0, i2);
                                    da2Var2.r = nw2.s(bArr);
                                }
                                uy5Var = new uy5(new ea2(da2Var2));
                                break;
                            }
                        } else {
                            kb0.O("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(eq6.J(i5)));
                            break;
                        }
                    case 1751742049:
                        int o7 = zi4Var.o();
                        zi4Var.O(8);
                        int o8 = zi4Var.o();
                        int o9 = zi4Var.o();
                        zi4Var.O(i3);
                        zi4Var.o();
                        zi4Var.O(12);
                        uy5Var = new bz(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = zi4Var.o();
                        zi4Var.O(12);
                        zi4Var.o();
                        int o11 = zi4Var.o();
                        int o12 = zi4Var.o();
                        zi4Var.O(i3);
                        int o13 = zi4Var.o();
                        int o14 = zi4Var.o();
                        zi4Var.O(i3);
                        czVar = new cz(o10, o11, o12, o13, o14, zi4Var.o());
                        break;
                    case 1852994675:
                        uy5Var = new wy5(zi4Var.y(zi4Var.a(), StandardCharsets.UTF_8));
                        break;
                }
                uy5Var = czVar;
            }
            if (uy5Var != null) {
                if (uy5Var.getType() == 1752331379) {
                    i5 = ((cz) uy5Var).a();
                }
                int i7 = i6 + 1;
                int b = fw2.b(objArr.length, i7);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i6] = uy5Var;
                i6 = i7;
            }
            zi4Var.N(o2);
            zi4Var.M(i4);
            i3 = 4;
        }
        return new bi3(i, nw2.j(objArr, i6));
    }

    public final yy a(Class cls) {
        z62 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            yy yyVar = (yy) listIterator.next();
            if (yyVar.getClass() == cls) {
                return yyVar;
            }
        }
        return null;
    }

    @Override // defpackage.yy
    public final int getType() {
        return this.b;
    }
}
