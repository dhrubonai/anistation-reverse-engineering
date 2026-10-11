package defpackage;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class q90 {
    public static final Pair a = new Pair(0, 10);

    static {
        nw2.u((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    public static ByteBuffer a(ea2 ea2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = ea2Var.s;
        if (list.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        io3.m("csd-0 and/or csd-1 not found in the format for avcC box.", z);
        byte[] bArr = (byte[]) list.get(0);
        if (bArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.m("csd-0 is empty for avcC box.", z2);
        byte[] bArr2 = (byte[]) list.get(1);
        if (bArr2.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.m("csd-1 is empty for avcC box.", z3);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer allocate = ByteBuffer.allocate(wrap2.limit() + wrap.limit() + 200);
        allocate.put((byte) 1);
        o15 z4 = bb4.z(wrap);
        io3.m("SPS data not found in csd0 for avcC box.", !z4.isEmpty());
        ByteBuffer byteBuffer = (ByteBuffer) z4.get(0);
        int remaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[remaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        m64 d0 = io3.d0(bArr3, 0, remaining);
        allocate.put((byte) d0.a);
        allocate.put((byte) d0.b);
        allocate.put((byte) d0.c);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.putShort((short) byteBuffer.remaining());
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        o15 z5 = bb4.z(wrap2);
        io3.A("PPS data not found in csd1 for avcC box.", !z5.isEmpty());
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) z5.get(0);
        allocate.putShort((short) byteBuffer2.remaining());
        allocate.put(byteBuffer2);
        byteBuffer2.rewind();
        allocate.flip();
        return n77.m0("avcC", allocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ByteBuffer b(ea2 ea2Var) {
        char c;
        ByteBuffer a2;
        int i;
        int i2;
        ByteBuffer m0;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        char c2;
        String str = ea2Var.p;
        String str2 = ea2Var.l;
        List list = ea2Var.s;
        str.getClass();
        int i6 = 6;
        byte b = 8;
        boolean z7 = true;
        char c3 = 1;
        r14 = true;
        boolean z8 = true;
        int i7 = 0;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1504698186:
                if (str.equals("audio/iamf")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Pair h = h(ea2Var);
                io3.w(h, "Can't identify Dolby vision profile");
                if (((Integer) h.first).intValue() <= 8) {
                    a2 = k(ea2Var);
                } else {
                    a2 = a(ea2Var);
                }
                int intValue = ((Integer) h.first).intValue();
                int intValue2 = ((Integer) h.second).intValue();
                byte[] bArr = ko0.a;
                byte[] bArr2 = new byte[24];
                if (intValue == 8) {
                    i = 4;
                    i2 = 0;
                } else if (intValue == 9) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                bArr2[0] = 1;
                bArr2[1] = 0;
                byte b2 = (byte) ((intValue & 127) << 1);
                bArr2[2] = b2;
                bArr2[2] = (byte) ((b2 | ((intValue2 >> 5) & 1)) & 255);
                byte b3 = (byte) ((intValue2 & 31) << 3);
                bArr2[3] = b3;
                byte b4 = (byte) (b3 | 4);
                bArr2[3] = b4;
                byte b5 = b4;
                bArr2[3] = b5;
                bArr2[3] = (byte) (b5 | 1);
                byte b6 = (byte) (i << 4);
                bArr2[4] = b6;
                bArr2[4] = (byte) (b6 | (i2 << 2));
                int intValue3 = ((Integer) h.first).intValue();
                if (intValue3 == 5) {
                    m0 = n77.m0("dvcC", ByteBuffer.wrap(bArr2));
                } else {
                    if (intValue3 != 8 && intValue3 != 9) {
                        ze0.k(qx1.h(intValue3, "Unsupported Dolby Vision profile "));
                        return null;
                    }
                    m0 = n77.m0("dvvC", ByteBuffer.wrap(bArr2));
                }
                return n77.z(a2, m0);
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(7);
                allocate.put("    ".getBytes(StandardCharsets.UTF_8));
                allocate.put((byte) 0);
                Pair pair = a;
                if (str2 != null) {
                    List e = i90.c('.').e(str2);
                    if (e.size() >= 3) {
                        try {
                            pair = new Pair(Integer.valueOf(Integer.parseInt((String) e.get(1))), Integer.valueOf(Integer.parseInt((String) e.get(2))));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                allocate.put(((Integer) pair.second).byteValue());
                allocate.put(((Integer) pair.first).byteValue());
                allocate.flip();
                return n77.m0("d263", allocate);
            case 2:
                return n77.m0("av1C", ByteBuffer.wrap((byte[]) list.get(0)));
            case 3:
                return k(ea2Var);
            case 4:
                return d((short) -31745);
            case 5:
            case 6:
                return f(ea2Var);
            case 7:
                return ByteBuffer.allocate(0);
            case '\b':
                return f(ea2Var);
            case '\t':
                io3.m("csd-0 is not found in the format for apvC box", !list.isEmpty());
                byte[] bArr3 = (byte[]) list.get(0);
                if (bArr3.length <= 0) {
                    z7 = false;
                }
                io3.m("csd-0 is empty for apvC box.", z7);
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr3.length + 4);
                allocate2.putInt(0);
                allocate2.put(bArr3);
                allocate2.flip();
                return n77.m0("apvC", allocate2);
            case '\n':
                return a(ea2Var);
            case 11:
                return d((short) -32257);
            case '\f':
                if (list.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                io3.k(list.size(), "Expected only 1 byte array of initialization data for IAMF codec, but found %s.", z);
                ByteBuffer wrap = ByteBuffer.wrap((byte[]) list.get(0));
                int remaining = wrap.remaining();
                if (remaining >= 0) {
                    int i8 = remaining;
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        i8 >>>= 7;
                        if (i8 == 0) {
                            byte[] bArr4 = new byte[i10];
                            int i11 = remaining;
                            while (true) {
                                byte b7 = (byte) (i11 & 127);
                                i11 >>>= 7;
                                if (i11 != 0) {
                                    b7 = (byte) (b7 | 128);
                                }
                                int i12 = i7 + 1;
                                bArr4[i7] = b7;
                                if (i11 == 0) {
                                    ByteBuffer allocate3 = ByteBuffer.allocate(i9 + 2 + remaining);
                                    allocate3.put((byte) 1);
                                    allocate3.put(bArr4);
                                    allocate3.put(wrap);
                                    allocate3.flip();
                                    return n77.m0("iacb", allocate3);
                                }
                                i7 = i12;
                            }
                        } else {
                            i9 = i10;
                        }
                    }
                } else {
                    ze0.k("Value must be non-negative.");
                    return null;
                }
            case '\r':
                io3.m("csd-0 not found in the format for dOps box.", !list.isEmpty());
                byte[] bArr5 = ko0.a;
                io3.m("csd-0 must be present for Opus.", !list.isEmpty());
                byte[] bArr6 = (byte[]) list.get(0);
                if (bArr6.length >= 8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.n(z2);
                zi4 zi4Var = new zi4(bArr6);
                int length = bArr6.length;
                String y = zi4Var.y(8, StandardCharsets.UTF_8);
                if (y.equals("AOPUSHDR")) {
                    if (bArr6.length >= 24) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    io3.n(z4);
                    long p = zi4Var.p();
                    if (16 + p <= bArr6.length) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    io3.n(z5);
                    length = (int) p;
                    i3 = 16;
                } else {
                    io3.n(y.equals("OpusHead"));
                    i3 = 0;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr6, i3, length + i3);
                if (copyOfRange.length >= 8) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                io3.n(z3);
                ByteBuffer allocate4 = ByteBuffer.allocate(copyOfRange.length);
                allocate4.put(copyOfRange, 8, copyOfRange.length - 8);
                if (allocate4.get(0) != 0 && allocate4.get(0) != 1) {
                    z8 = false;
                }
                io3.B(z8);
                allocate4.put(0, (byte) 0);
                allocate4.flip();
                return n77.m0("dOps", allocate4);
            case 14:
                hp0 hp0Var = ea2Var.H;
                io3.m("csd-0 is not found in the format for vpcC box", !list.isEmpty());
                byte[] bArr7 = (byte[]) list.get(0);
                if (bArr7.length > 3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                io3.m("csd-0 for vp9 is invalid.", z6);
                if (jf7.v(bArr7) == 16777216) {
                    return n77.m0("vpcC", ByteBuffer.wrap(bArr7));
                }
                ByteBuffer allocate5 = ByteBuffer.allocate(200);
                allocate5.putInt(16777216);
                if (hp0Var == null || (i4 = hp0Var.b) == -1) {
                    i4 = 0;
                }
                byte b8 = 0;
                byte b9 = 0;
                byte b10 = 10;
                for (int i13 = 0; i13 < bArr7.length; i13 += 3) {
                    byte b11 = bArr7[i13];
                    int i14 = i13 + 2;
                    if (b11 != 1) {
                        if (b11 != 2) {
                            if (b11 != 3) {
                                if (b11 == 4) {
                                    b9 = bArr7[i14];
                                }
                            } else {
                                b = bArr7[i14];
                            }
                        } else {
                            b10 = bArr7[i14];
                        }
                    } else {
                        b8 = bArr7[i14];
                    }
                }
                ByteBuffer allocate6 = ByteBuffer.allocate(3);
                allocate6.put(b8);
                allocate6.put(b10);
                allocate6.put((byte) (i4 | (b << 4) | (b9 << 1)));
                allocate6.flip();
                allocate5.put(allocate6);
                if (hp0Var != null) {
                    int i15 = hp0Var.a;
                    if (i15 != 2) {
                        if (i15 != 6) {
                            c2 = 1;
                        } else {
                            c2 = '\t';
                        }
                    } else {
                        c2 = 5;
                    }
                    i5 = hp0.d(hp0Var.c);
                    if (i15 != 2) {
                        if (i15 != 6) {
                            i6 = 1;
                        } else {
                            i6 = 9;
                        }
                    }
                    c3 = c2;
                } else {
                    i5 = 1;
                    i6 = 1;
                }
                allocate5.put((byte) c3);
                allocate5.put((byte) i5);
                allocate5.put((byte) i6);
                allocate5.putShort((short) 0);
                allocate5.flip();
                return n77.m0("vpcC", allocate5);
            default:
                ze0.k("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static String c(ea2 ea2Var) {
        String str = ea2Var.p;
        int i = ea2Var.M;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 1;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c = 2;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c = 3;
                    break;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    c = 5;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 7;
                    break;
                }
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = '\b';
                    break;
                }
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = '\t';
                    break;
                }
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c = '\n';
                    break;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = 11;
                    break;
                }
                break;
            case 1504698186:
                if (str.equals("audio/iamf")) {
                    c = '\f';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\r';
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Pair h = h(ea2Var);
                io3.w(h, "Dolby Vision profile and level is not found.");
                int intValue = ((Integer) h.first).intValue();
                if (intValue != 5) {
                    if (intValue != 8) {
                        if (intValue == 9) {
                            return "avc1";
                        }
                        throw new IllegalArgumentException("Unsupported profile " + h.first + " for format: " + str);
                    }
                    return "hvc1";
                }
                return "dvh1";
            case 1:
                return "s263";
            case 2:
                return "av01";
            case 3:
                return "hvc1";
            case 4:
                return "sawb";
            case 5:
            case 6:
                return "mp4a";
            case 7:
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                ze0.k(qx1.h(i, "Unsupported PCM encoding: "));
                return null;
            case '\b':
                return "mp4v-es";
            case '\t':
                return "apv1";
            case '\n':
                return "avc1";
            case 11:
                return "samr";
            case '\f':
                return "iamf";
            case '\r':
                return "Opus";
            case 14:
                return "vp09";
            default:
                ze0.k("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static ByteBuffer d(short s) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.put("    ".getBytes(StandardCharsets.UTF_8));
        allocate.put((byte) 0);
        allocate.putShort(s);
        allocate.put((byte) 0);
        allocate.put((byte) 1);
        allocate.flip();
        return n77.m0("damr", allocate);
    }

    public static ByteBuffer e(long j, long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(j);
        allocate.putLong(j2);
        allocate.putShort((short) 1);
        allocate.putShort((short) 0);
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ByteBuffer f(ea2 ea2Var) {
        boolean z;
        ByteBuffer wrap;
        byte b;
        boolean z2;
        Byte b2;
        int i;
        int i2;
        boolean z3;
        List list = ea2Var.s;
        io3.m("csd-0 not found in the format for esds box.", !list.isEmpty());
        int i3 = 0;
        byte[] bArr = (byte[]) list.get(0);
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("csd-0 is empty for esds box.", z);
        String str = ea2Var.p;
        str.getClass();
        if (str.equals("audio/vorbis")) {
            byte[] bArr2 = ko0.a;
            if (list.size() > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            io3.m("csd-0 and csd-1 must be present for Vorbis.", z3);
            byte[] bArr3 = (byte[]) list.get(0);
            byte[] bArr4 = (byte[]) list.get(1);
            int length = bArr3.length;
            int length2 = bArr4.length;
            int i4 = length / 255;
            byte[] bArr5 = new byte[i4 + 1];
            Arrays.fill(bArr5, (byte) -1);
            bArr5[i4] = (byte) (length % 255);
            Arrays.fill(r7, (byte) -1);
            byte[] bArr6 = {23};
            wrap = ByteBuffer.allocate(i4 + 3 + length + 23 + length2);
            wrap.put((byte) 2);
            wrap.put(bArr5);
            wrap.put(bArr6);
            wrap.put(bArr3);
            wrap.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
            wrap.put(bArr4);
            wrap.flip();
        } else {
            wrap = ByteBuffer.wrap(bArr);
        }
        int i5 = ea2Var.j;
        int i6 = ea2Var.i;
        boolean m = qy3.m(str);
        int remaining = wrap.remaining();
        ByteBuffer i7 = i(remaining);
        ByteBuffer i8 = i(i7.remaining() + remaining + 14);
        ByteBuffer i9 = i(i8.remaining() + i7.remaining() + remaining + 21);
        ByteBuffer allocate = ByteBuffer.allocate(remaining + 200);
        allocate.putInt(0);
        allocate.put((byte) 3);
        allocate.put(i9);
        allocate.putShort((short) 0);
        if (m) {
            b = 31;
        } else {
            b = 0;
        }
        allocate.put(b);
        allocate.put((byte) 4);
        allocate.put(i8);
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    z2 = false;
                    break;
                }
                z2 = -1;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    z2 = true;
                    break;
                }
                z2 = -1;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    z2 = 2;
                    break;
                }
                z2 = -1;
                break;
            default:
                z2 = -1;
                break;
        }
        switch (z2) {
            case false:
                b2 = (byte) -35;
                break;
            case true:
                b2 = (byte) 64;
                break;
            case true:
                b2 = (byte) 32;
                break;
            default:
                b2 = null;
                break;
        }
        b2.getClass();
        allocate.put(b2.byteValue());
        if (m) {
            i = 16;
        } else {
            i = 20;
        }
        allocate.put((byte) (i | 1));
        if (m) {
            i2 = 96000;
        } else {
            i2 = 768;
        }
        allocate.putShort((short) ((i2 >> 8) & 65535));
        allocate.put((byte) 0);
        if (i5 == -1) {
            i5 = 0;
        }
        allocate.putInt(i5);
        if (i6 != -1) {
            i3 = i6;
        }
        allocate.putInt(i3);
        allocate.put((byte) 5);
        allocate.put(i7);
        allocate.put(wrap);
        wrap.rewind();
        allocate.put((byte) 6);
        allocate.put((byte) 1);
        allocate.put((byte) 2);
        allocate.flip();
        return n77.m0("esds", allocate);
    }

    public static ByteBuffer g() {
        ArrayList arrayList = new ArrayList();
        String str = eq6.a;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(131072);
        allocate.flip();
        arrayList.add(allocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return n77.l0("ftyp", arrayList);
    }

    public static Pair h(ea2 ea2Var) {
        String str = ea2Var.l;
        io3.w(str, "Codec string is null for Dolby Vision format.");
        List e = i90.c('.').e(str);
        if (e.size() < 3) {
            kb0.O("Boxes", "Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) e.get(1))), Integer.valueOf(Integer.parseInt((String) e.get(2))));
    }

    public static ByteBuffer i(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer allocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            allocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer j(String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        String str3 = eq6.a;
        Charset charset = StandardCharsets.UTF_8;
        allocate.put(str.getBytes(charset));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(str2.getBytes(charset));
        allocate.put((byte) 0);
        allocate.flip();
        return n77.m0("hdlr", allocate);
    }

    public static ByteBuffer k(ea2 ea2Var) {
        boolean z;
        List list = ea2Var.s;
        io3.m("csd-0 not found in the format for hvcC box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("csd-0 is empty for hvcC box.", z);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(wrap.limit() + 200);
        o15 z2 = bb4.z(wrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < z2.A; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) z2.get(i);
            ByteBuffer allocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    allocate2.put(byteBuffer.get(i3));
                }
                if (byteBuffer.get(i3) == 0) {
                    i2++;
                } else {
                    i2 = 0;
                }
            }
            allocate2.flip();
            arrayList.add(allocate2);
        }
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) == 64) {
            allocate.put(byteBuffer2.get(6));
            allocate.putInt(byteBuffer2.getInt(7));
            allocate.putInt(byteBuffer2.getInt(11));
            allocate.putShort(byteBuffer2.getShort(15));
            allocate.put(byteBuffer2.get(17));
            allocate.putShort((short) -4096);
            allocate.put((byte) -4);
            int i4 = z2.A;
            ByteBuffer byteBuffer3 = (ByteBuffer) z2.get(1);
            int remaining = byteBuffer3.remaining();
            byte[] bArr2 = new byte[remaining];
            byteBuffer3.get(bArr2);
            byteBuffer3.rewind();
            j64 b0 = io3.b0(bArr2, 0, remaining, null);
            byte b = (byte) (b0.c | 252);
            byte b2 = (byte) (b0.d | 248);
            byte b3 = (byte) (b0.e | 248);
            allocate.put(b);
            allocate.put(b2);
            allocate.put(b3);
            allocate.putShort((short) 0);
            allocate.put((byte) 15);
            allocate.put((byte) i4);
            for (int i5 = 0; i5 < i4; i5++) {
                ByteBuffer byteBuffer4 = (ByteBuffer) z2.get(i5);
                allocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
                allocate.putShort((short) 1);
                allocate.putShort((short) byteBuffer4.limit());
                allocate.put(byteBuffer4);
            }
            allocate.flip();
            return n77.m0("hvcC", allocate);
        }
        ze0.k("First NALU in csd-0 is not the VPS.");
        return null;
    }

    public static ByteBuffer l(ArrayList arrayList, zp2 zp2Var) {
        boolean z;
        ByteBuffer m0;
        ByteBuffer l0;
        long j;
        int i;
        String str;
        String str2;
        HashSet hashSet;
        int i2;
        HashMap hashMap;
        int i3;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i4;
        ByteBuffer allocate;
        int i5;
        ByteBuffer m02;
        ByteBuffer l02;
        String str3;
        ByteBuffer byteBuffer;
        String str4;
        boolean z4;
        String str5;
        int i6;
        ByteBuffer l03;
        int i7;
        int i8;
        short s;
        byte[] j0;
        long j4;
        long j5;
        HashMap hashMap2;
        long j6;
        int i9;
        ByteBuffer allocate2;
        short s2;
        short s3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        short s4;
        short s5;
        int i11;
        int i12;
        byte b;
        ByteBuffer allocate3;
        boolean z5;
        ArrayList arrayList4 = arrayList;
        z14 z14Var = (z14) zp2Var.A;
        HashSet hashSet2 = (HashSet) zp2Var.z;
        int i13 = (int) z14Var.a;
        int i14 = (int) z14Var.b;
        long j7 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            tg6 tg6Var = (tg6) arrayList4.get(i15);
            if (!tg6Var.c.isEmpty()) {
                j7 = Math.min(((ra0) tg6Var.c.get(0)).a, j7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = -9223372036854775807L;
        }
        if (j7 == -9223372036854775807L) {
            return ByteBuffer.allocate(0);
        }
        HashMap hashMap3 = new HashMap();
        int i16 = 1;
        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
            tg6 tg6Var2 = (tg6) arrayList4.get(i17);
            if (!tg6Var2.c.isEmpty()) {
                hashMap3.put(Integer.valueOf(tg6Var2.a), Integer.valueOf(i16));
                i16++;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i18 = 1;
        long j8 = 0;
        long j9 = 0;
        int i19 = 0;
        while (true) {
            int i20 = 4;
            if (i19 < arrayList4.size()) {
                tg6 tg6Var3 = (tg6) arrayList4.get(i19);
                if (tg6Var3.c.isEmpty()) {
                    hashSet = hashSet2;
                    i7 = i13;
                    hashMap2 = hashMap3;
                    arrayList2 = arrayList5;
                    j = j7;
                    i = i19;
                    arrayList3 = arrayList6;
                    j6 = j9;
                    i8 = i14;
                } else {
                    ea2 ea2Var = tg6Var3.b;
                    ArrayList arrayList7 = tg6Var3.c;
                    j = j7;
                    if ((Objects.equals(ea2Var.p, MimeTypes.VIDEO_AV1) || Objects.equals(tg6Var3.b.p, "video/x-vnd.on2.vp9")) && ea2Var.s.isEmpty()) {
                        da2 a2 = ea2Var.a();
                        byte[] bArr = tg6Var3.j;
                        bArr.getClass();
                        a2.r = nw2.s(bArr);
                        ea2Var = new ea2(a2);
                    }
                    String str6 = ea2Var.d;
                    int i21 = ea2Var.x;
                    int i22 = ea2Var.w;
                    String str7 = str6;
                    String str8 = ea2Var.p;
                    if (str7 == null) {
                        i = i19;
                        str2 = "meta";
                        str = null;
                    } else {
                        Locale forLanguageTag = Locale.forLanguageTag(str7);
                        if (!forLanguageTag.getISO3Language().isEmpty()) {
                            str7 = forLanguageTag.getISO3Language();
                        }
                        i = i19;
                        str = str7;
                        str2 = "meta";
                    }
                    int a3 = tg6Var3.a();
                    String str9 = str;
                    int i23 = i18;
                    long j10 = tg6Var3.k;
                    hashSet = hashSet2;
                    ArrayList arrayList8 = arrayList6;
                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                    ArrayList arrayList10 = arrayList5;
                    ArrayList arrayList11 = new ArrayList(arrayList7.size());
                    int i24 = i14;
                    if (arrayList7.isEmpty()) {
                        i2 = i13;
                        hashMap = hashMap3;
                        i3 = i21;
                    } else {
                        long j11 = j9;
                        int i25 = 0;
                        boolean z6 = false;
                        while (i25 < arrayList7.size()) {
                            int i26 = i25;
                            long j12 = ((ra0) arrayList7.get(i25)).a;
                            arrayList9.add(Long.valueOf(j12));
                            if (j12 < j11) {
                                z6 = true;
                            }
                            i25 = i26 + 1;
                            j11 = j12;
                        }
                        if (z6) {
                            Collections.sort(arrayList9);
                        }
                        long longValue = ((Long) arrayList9.get(0)).longValue();
                        i2 = i13;
                        int i27 = 1;
                        while (true) {
                            hashMap = hashMap3;
                            if (i27 >= arrayList9.size()) {
                                break;
                            }
                            ArrayList arrayList12 = arrayList9;
                            long longValue2 = ((Long) arrayList9.get(i27)).longValue();
                            int i28 = i27;
                            int i29 = i21;
                            long j13 = a3;
                            long n = n(longValue2, j13) - n(longValue, j13);
                            if (n <= 2147483647L) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            io3.A("Only 32-bit sample duration is allowed", z3);
                            arrayList11.add(Integer.valueOf((int) n));
                            i27 = i28 + 1;
                            longValue = longValue2;
                            hashMap3 = hashMap;
                            arrayList9 = arrayList12;
                            i21 = i29;
                        }
                        i3 = i21;
                        if (j10 != -9223372036854775807L) {
                            long j14 = a3;
                            j2 = n(j10, j14) - n(longValue, j14);
                            if (j2 <= 2147483647L) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            io3.A("Only 32-bit sample duration is allowed", z2);
                        } else {
                            j2 = -1;
                        }
                        int i30 = (int) j2;
                        if (i30 == -1) {
                            if (arrayList11.size() < 2) {
                                i30 = 0;
                            } else {
                                i30 = ((Integer) bx7.z(arrayList11)).intValue();
                            }
                        }
                        arrayList11.add(Integer.valueOf(i30));
                    }
                    long j15 = j9;
                    for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                        j15 += ((Integer) arrayList11.get(i31)).intValue();
                    }
                    if (arrayList7.isEmpty()) {
                        j3 = j9;
                    } else {
                        j3 = ((ra0) arrayList7.get(0)).a;
                    }
                    long e0 = eq6.e0(j15, 1000000L, tg6Var3.a(), RoundingMode.HALF_UP);
                    long j16 = j15;
                    if (j3 < j9) {
                        e0 -= Math.abs(j3);
                    }
                    int h = qy3.h(str8);
                    ByteBuffer allocate4 = ByteBuffer.allocate((arrayList11.size() * 8) + 200);
                    allocate4.putInt(0);
                    int position = allocate4.position();
                    allocate4.putInt(0);
                    long j17 = j3;
                    int i32 = 0;
                    int i33 = -1;
                    int i34 = 0;
                    long j18 = -1;
                    while (i34 < arrayList11.size()) {
                        int intValue = ((Integer) arrayList11.get(i34)).intValue();
                        long j19 = e0;
                        long j20 = intValue;
                        if (j18 != j20) {
                            i33 = allocate4.position();
                            allocate4.putInt(1);
                            allocate4.putInt(intValue);
                            i32++;
                            j18 = j20;
                        } else {
                            allocate4.putInt(i33, allocate4.getInt(i33) + 1);
                        }
                        i34++;
                        e0 = j19;
                    }
                    long j21 = e0;
                    allocate4.putInt(position, i32);
                    allocate4.flip();
                    ByteBuffer m03 = n77.m0("stts", allocate4);
                    if (qy3.m(str8)) {
                        int a4 = tg6Var3.a();
                        ArrayList arrayList13 = new ArrayList(arrayList7.size());
                        if (!arrayList7.isEmpty()) {
                            long j22 = ((ra0) arrayList7.get(0)).a;
                            long j23 = j9;
                            long j24 = j23;
                            boolean z7 = false;
                            int i35 = 0;
                            while (i35 < arrayList7.size()) {
                                long j25 = j22;
                                long j26 = ((ra0) arrayList7.get(i35)).a - j25;
                                long j27 = j23;
                                long n2 = n(j26, a4) - j27;
                                if (n2 <= 2147483647L) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                int i36 = a4;
                                io3.A("Only 32-bit composition offset is allowed", z5);
                                long intValue2 = j27 + ((Integer) arrayList11.get(i35)).intValue();
                                arrayList13.add(Integer.valueOf((int) n2));
                                if (j26 < j24) {
                                    z7 = true;
                                }
                                i35++;
                                j23 = intValue2;
                                j24 = j26;
                                a4 = i36;
                                j22 = j25;
                            }
                            if (!z7) {
                                arrayList13.clear();
                            }
                        }
                        if (arrayList13.isEmpty()) {
                            allocate = ByteBuffer.allocate(0);
                        } else {
                            ByteBuffer allocate5 = ByteBuffer.allocate((arrayList13.size() * 8) + 8);
                            allocate5.putInt(16777216);
                            int position2 = allocate5.position();
                            allocate5.putInt(0);
                            int i37 = 0;
                            int i38 = -1;
                            int i39 = -1;
                            for (int i40 = 0; i40 < arrayList13.size(); i40++) {
                                int intValue3 = ((Integer) arrayList13.get(i40)).intValue();
                                if (i38 != intValue3) {
                                    int position3 = allocate5.position();
                                    allocate5.putInt(1);
                                    allocate5.putInt(intValue3);
                                    i37++;
                                    i39 = position3;
                                    i38 = intValue3;
                                } else {
                                    allocate5.putInt(i39, allocate5.getInt(i39) + 1);
                                }
                            }
                            allocate5.putInt(position2, i37);
                            allocate5.flip();
                            allocate = n77.m0("ctts", allocate5);
                        }
                        i4 = 0;
                    } else {
                        i4 = 0;
                        allocate = ByteBuffer.allocate(0);
                    }
                    ByteBuffer byteBuffer2 = allocate;
                    ByteBuffer allocate6 = ByteBuffer.allocate((arrayList7.size() * 4) + 200);
                    allocate6.putInt(i4);
                    allocate6.putInt(i4);
                    allocate6.putInt(arrayList7.size());
                    for (int i41 = 0; i41 < arrayList7.size(); i41++) {
                        allocate6.putInt(((ra0) arrayList7.get(i41)).b);
                    }
                    allocate6.flip();
                    ByteBuffer m04 = n77.m0("stsz", allocate6);
                    ArrayList arrayList14 = tg6Var3.e;
                    ByteBuffer allocate7 = ByteBuffer.allocate((arrayList14.size() * 12) + 200);
                    allocate7.putInt(0);
                    int position4 = allocate7.position();
                    allocate7.putInt(0);
                    int i42 = 1;
                    int i43 = 0;
                    int i44 = -1;
                    for (int i45 = 0; i45 < arrayList14.size(); i45++) {
                        int intValue4 = ((Integer) arrayList14.get(i45)).intValue();
                        if (intValue4 != i44) {
                            allocate7.putInt(i42);
                            allocate7.putInt(intValue4);
                            allocate7.putInt(1);
                            i43++;
                            i44 = intValue4;
                        }
                        i42++;
                    }
                    allocate7.putInt(position4, i43);
                    allocate7.flip();
                    ByteBuffer m05 = n77.m0("stsc", allocate7);
                    ArrayList arrayList15 = tg6Var3.d;
                    ByteBuffer allocate8 = ByteBuffer.allocate((arrayList15.size() * 8) + 8);
                    allocate8.putInt(0);
                    allocate8.putInt(arrayList15.size());
                    for (int i46 = 0; i46 < arrayList15.size(); i46++) {
                        allocate8.putLong(((Long) arrayList15.get(i46)).longValue());
                    }
                    allocate8.flip();
                    ByteBuffer m06 = n77.m0("co64", allocate8);
                    if (h != -1 && h != 5) {
                        if (h != 1) {
                            if (h == 2) {
                                ByteBuffer allocate9 = ByteBuffer.allocate(200);
                                allocate9.putInt(0);
                                allocate9.putShort((short) 0);
                                allocate9.putShort((short) 0);
                                allocate9.putShort((short) 0);
                                allocate9.putShort((short) 0);
                                allocate9.flip();
                                ByteBuffer m07 = n77.m0("vmhd", allocate9);
                                ByteBuffer b2 = b(ea2Var);
                                hp0 hp0Var = ea2Var.H;
                                String c = c(ea2Var);
                                ByteBuffer allocate10 = ByteBuffer.allocate(b2.limit() + 200);
                                allocate10.putInt(0);
                                allocate10.putShort((short) 0);
                                allocate10.putShort((short) 1);
                                allocate10.putShort((short) 0);
                                allocate10.putShort((short) 0);
                                allocate10.putInt(0);
                                allocate10.putInt(0);
                                allocate10.putInt(0);
                                if (i22 != -1) {
                                    s4 = (short) i22;
                                } else {
                                    s4 = 0;
                                }
                                allocate10.putShort(s4);
                                i5 = i3;
                                if (i5 != -1) {
                                    s5 = (short) i5;
                                } else {
                                    s5 = 0;
                                }
                                allocate10.putShort(s5);
                                allocate10.putInt(4718592);
                                allocate10.putInt(4718592);
                                allocate10.putInt(0);
                                allocate10.putShort((short) 1);
                                int i47 = 5;
                                long j28 = j9;
                                allocate10.putLong(j28);
                                allocate10.putLong(j28);
                                allocate10.putLong(j28);
                                allocate10.putLong(j28);
                                allocate10.putShort((short) 24);
                                allocate10.putShort((short) -1);
                                allocate10.put(b2);
                                if (hp0Var != null && c.equals("vp09")) {
                                    byte[] bArr2 = hp0Var.d;
                                    if (bArr2 != null) {
                                        ByteBuffer allocate11 = ByteBuffer.allocate(200);
                                        allocate11.putInt(0);
                                        allocate11.put(bArr2);
                                        allocate11.flip();
                                        allocate3 = n77.m0("SmDm", allocate11);
                                    } else {
                                        allocate3 = ByteBuffer.allocate(0);
                                    }
                                    allocate10.put(allocate3);
                                }
                                ByteBuffer allocate12 = ByteBuffer.allocate(8);
                                allocate12.putInt(65536);
                                allocate12.putInt(65536);
                                allocate12.rewind();
                                allocate10.put(n77.m0("pasp", allocate12));
                                if (hp0Var != null) {
                                    int i48 = hp0Var.a;
                                    ByteBuffer allocate13 = ByteBuffer.allocate(20);
                                    allocate13.put((byte) 110);
                                    allocate13.put((byte) 99);
                                    allocate13.put((byte) 108);
                                    allocate13.put((byte) 120);
                                    if (i48 != 2) {
                                        i11 = 6;
                                        if (i48 != 6) {
                                            i47 = 1;
                                        } else {
                                            i47 = 9;
                                        }
                                    } else {
                                        i11 = 6;
                                    }
                                    short s6 = (short) i47;
                                    short d = (short) hp0.d(hp0Var.c);
                                    if (i48 != 2) {
                                        if (i48 != i11) {
                                            i12 = 1;
                                        } else {
                                            i12 = 9;
                                        }
                                    } else {
                                        i12 = 6;
                                    }
                                    short s7 = (short) i12;
                                    if (hp0Var.b == 1) {
                                        b = Byte.MIN_VALUE;
                                    } else {
                                        b = 0;
                                    }
                                    allocate13.putShort(s6);
                                    allocate13.putShort(d);
                                    allocate13.putShort(s7);
                                    allocate13.put(b);
                                    allocate13.flip();
                                    allocate10.put(n77.m0("colr", allocate13));
                                }
                                allocate10.flip();
                                ByteBuffer m = m(n77.m0(c, allocate10));
                                ByteBuffer allocate14 = ByteBuffer.allocate((arrayList7.size() * 4) + 200);
                                allocate14.putInt(0);
                                int position5 = allocate14.position();
                                allocate14.putInt(arrayList7.size());
                                int i49 = 1;
                                int i50 = 0;
                                for (int i51 = 0; i51 < arrayList7.size(); i51++) {
                                    if ((((ra0) arrayList7.get(i51)).c & 1) > 0) {
                                        allocate14.putInt(i49);
                                        i50++;
                                    }
                                    i49++;
                                }
                                allocate14.putInt(position5, i50);
                                allocate14.flip();
                                l02 = n77.l0("stbl", Arrays.asList(m, m03, byteBuffer2, m04, m05, m06, n77.m0("stss", allocate14)));
                                str3 = "VideoHandle";
                                byteBuffer = m07;
                                str4 = "vide";
                            } else {
                                ze0.k("Unsupported track type");
                                return null;
                            }
                        } else {
                            i5 = i3;
                            ByteBuffer allocate15 = ByteBuffer.allocate(200);
                            int i52 = 0;
                            allocate15.putInt(0);
                            allocate15.putShort((short) 0);
                            allocate15.putShort((short) 0);
                            allocate15.flip();
                            ByteBuffer m08 = n77.m0("smhd", allocate15);
                            String c2 = c(ea2Var);
                            ByteBuffer b3 = b(ea2Var);
                            ByteBuffer allocate16 = ByteBuffer.allocate(b3.remaining() + 200);
                            allocate16.putInt(0);
                            allocate16.putShort((short) 0);
                            allocate16.putShort((short) 1);
                            allocate16.putInt(0);
                            allocate16.putInt(0);
                            boolean equals = Objects.equals(str8, "audio/iamf");
                            if (!equals) {
                                i52 = ea2Var.J;
                            }
                            allocate16.putShort((short) i52);
                            allocate16.putShort((short) 16);
                            allocate16.putShort((short) 0);
                            allocate16.putShort((short) 0);
                            if (equals) {
                                i10 = 0;
                            } else {
                                i10 = ea2Var.L;
                            }
                            allocate16.putInt(i10 << 16);
                            allocate16.put(b3);
                            allocate16.flip();
                            l02 = n77.l0("stbl", Arrays.asList(m(n77.m0(c2, allocate16)), m03, m04, m05, m06));
                            str4 = "soun";
                            str3 = "SoundHandle";
                            byteBuffer = m08;
                        }
                    } else {
                        i5 = i3;
                        ByteBuffer allocate17 = ByteBuffer.allocate(200);
                        allocate17.putInt(0);
                        allocate17.flip();
                        ByteBuffer m09 = n77.m0("nmhd", allocate17);
                        if ("application/x-itut-t35".equals(str8)) {
                            List list = ea2Var.s;
                            if (list.size() == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            io3.n(z4);
                            ByteBuffer allocate18 = ByteBuffer.allocate(200);
                            allocate18.putInt(0);
                            allocate18.putShort((short) 0);
                            allocate18.putShort((short) 1);
                            if (((byte[]) list.get(0)).length <= 255) {
                                allocate18.put((byte) ((byte[]) list.get(0)).length);
                                allocate18.put((byte[]) list.get(0));
                                allocate18.flip();
                                m02 = n77.m0("it35", allocate18);
                            } else {
                                ze0.k("t35_identifier cannot be longer than 255 bytes.");
                                return null;
                            }
                        } else {
                            ByteBuffer allocate19 = ByteBuffer.allocate(200);
                            str8.getClass();
                            String str10 = eq6.a;
                            byte[] bytes = str8.getBytes(StandardCharsets.UTF_8);
                            allocate19.putInt(0);
                            allocate19.putShort((short) 0);
                            allocate19.putShort((short) 1);
                            allocate19.put(bytes);
                            allocate19.put((byte) 0);
                            allocate19.put(bytes);
                            allocate19.put((byte) 0);
                            allocate19.flip();
                            m02 = n77.m0("mett", allocate19);
                        }
                        l02 = n77.l0("stbl", Arrays.asList(m(m02), m03, m04, m05, m06));
                        str3 = "MetaHandle";
                        byteBuffer = m09;
                        str4 = str2;
                    }
                    HashMap hashMap4 = new HashMap();
                    for (Map.Entry entry : tg6Var3.h.entrySet()) {
                        ArrayList arrayList16 = new ArrayList();
                        for (Integer num : (List) entry.getValue()) {
                            HashMap hashMap5 = hashMap;
                            if (hashMap5.containsKey(num)) {
                                arrayList16.add((Integer) hashMap5.get(num));
                            }
                            hashMap = hashMap5;
                        }
                        HashMap hashMap6 = hashMap;
                        if (!arrayList16.isEmpty()) {
                            hashMap4.put((Integer) entry.getKey(), arrayList16);
                        }
                        hashMap = hashMap6;
                    }
                    HashMap hashMap7 = hashMap;
                    if (hashMap4.isEmpty()) {
                        l03 = ByteBuffer.allocate(0);
                        str5 = str8;
                        i6 = 3;
                    } else {
                        ArrayList arrayList17 = new ArrayList();
                        Iterator it = hashMap4.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int intValue5 = ((Integer) entry2.getKey()).intValue();
                            List list2 = (List) entry2.getValue();
                            ByteBuffer allocate20 = ByteBuffer.allocate(list2.size() * 4);
                            for (int i53 = 0; i53 < list2.size(); i53++) {
                                allocate20.putInt(((Integer) list2.get(i53)).intValue());
                            }
                            allocate20.flip();
                            Iterator it2 = it;
                            byte[] bArr3 = new byte[i20];
                            bArr3[0] = (byte) (intValue5 >> 24);
                            bArr3[1] = (byte) (intValue5 >> 16);
                            bArr3[2] = (byte) (intValue5 >> 8);
                            bArr3[3] = (byte) intValue5;
                            arrayList17.add(n77.n0(bArr3, allocate20));
                            it = it2;
                            str8 = str8;
                            i20 = 4;
                        }
                        str5 = str8;
                        i6 = 3;
                        l03 = n77.l0("tref", arrayList17);
                    }
                    int i54 = ((y14) zp2Var.x).a;
                    ByteBuffer allocate21 = ByteBuffer.allocate(200);
                    allocate21.putInt(7);
                    i7 = i2;
                    allocate21.putInt(i7);
                    i8 = i24;
                    allocate21.putInt(i8);
                    allocate21.putInt(i23);
                    allocate21.putInt(0);
                    ByteBuffer byteBuffer3 = l02;
                    ByteBuffer byteBuffer4 = l03;
                    String str11 = str3;
                    allocate21.putInt((int) n(j21, 10000L));
                    allocate21.putInt(0);
                    allocate21.putInt(0);
                    allocate21.putInt(0);
                    if (qy3.i(str5)) {
                        s = 256;
                    } else {
                        s = 0;
                    }
                    allocate21.putShort(s);
                    allocate21.putShort((short) 0);
                    if (i54 != 0) {
                        if (i54 != 90) {
                            if (i54 != 180) {
                                if (i54 == 270) {
                                    j0 = eq6.j0(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
                                } else {
                                    ze0.k(qx1.h(i54, "invalid orientation "));
                                    return null;
                                }
                            } else {
                                j0 = eq6.j0(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
                            }
                        } else {
                            j0 = eq6.j0(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
                        }
                    } else {
                        j0 = eq6.j0(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                    }
                    allocate21.put(j0);
                    if (i22 == -1) {
                        i22 = 0;
                    }
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    allocate21.putInt(i22 << 16);
                    allocate21.putInt(i5 << 16);
                    allocate21.flip();
                    ByteBuffer m010 = n77.m0("tkhd", allocate21);
                    long a5 = tg6Var3.a();
                    if (j > 0) {
                        j4 = 0;
                        j5 = j17 - j;
                    } else {
                        j4 = 0;
                        j5 = j17;
                    }
                    if (j5 != j4) {
                        ByteBuffer allocate22 = ByteBuffer.allocate(50);
                        allocate22.putInt(16777216);
                        if (j5 > j4) {
                            allocate22.putInt(2);
                            allocate22.put(e(n(j5, 10000L), -1L));
                            long j29 = j4;
                            allocate22.put(e(n(j21, 10000L), j29));
                            j6 = j29;
                            hashMap2 = hashMap7;
                        } else {
                            j6 = j4;
                            allocate22.putInt(1);
                            hashMap2 = hashMap7;
                            allocate22.put(e(n(j21, 10000L), n(Math.abs(j5), a5)));
                        }
                        allocate22.flip();
                        allocate2 = n77.m0("edts", n77.m0("elst", allocate22));
                        i9 = 0;
                    } else {
                        hashMap2 = hashMap7;
                        j6 = j4;
                        i9 = 0;
                        allocate2 = ByteBuffer.allocate(0);
                    }
                    int a6 = tg6Var3.a();
                    ByteBuffer allocate23 = ByteBuffer.allocate(200);
                    allocate23.putInt(i9);
                    allocate23.putInt(i7);
                    allocate23.putInt(i8);
                    allocate23.putInt(a6);
                    allocate23.putInt((int) j16);
                    if (str9 != null) {
                        byte[] bytes2 = str9.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length == i6) {
                            s3 = 0;
                            s2 = (short) (((bytes2[2] & 31) + ((bytes2[1] & 31) << 5) + ((bytes2[0] & 31) << 10)) & 32767);
                            allocate23.putShort(s2);
                            allocate23.putShort(s3);
                            allocate23.flip();
                            ByteBuffer m011 = n77.m0("mdhd", allocate23);
                            ByteBuffer j30 = j(str4, str11);
                            ByteBuffer allocate24 = ByteBuffer.allocate(4);
                            allocate24.putInt(1);
                            allocate24.flip();
                            ByteBuffer[] byteBufferArr = {n77.m0("url ", allocate24)};
                            ByteBuffer allocate25 = ByteBuffer.allocate(8);
                            allocate25.putInt(0);
                            allocate25.putInt(1);
                            allocate25.flip();
                            ArrayList arrayList18 = new ArrayList();
                            arrayList18.add(allocate25);
                            Collections.addAll(arrayList18, byteBufferArr);
                            ByteBuffer l04 = n77.l0("trak", Arrays.asList(m010, byteBuffer4, allocate2, n77.l0("mdia", Arrays.asList(m011, j30, n77.l0("minf", Arrays.asList(byteBuffer, n77.m0("dinf", n77.l0("dref", arrayList18)), byteBuffer3))))));
                            arrayList2 = arrayList10;
                            arrayList2.add(l04);
                            j8 = Math.max(j8, j21);
                            ByteBuffer allocate26 = ByteBuffer.allocate(24);
                            allocate26.putInt(0);
                            allocate26.putInt(i23);
                            allocate26.putInt(1);
                            allocate26.putInt(0);
                            allocate26.putInt(0);
                            allocate26.putInt(0);
                            allocate26.flip();
                            arrayList3 = arrayList8;
                            arrayList3.add(n77.m0("trex", allocate26));
                            i18 = i23 + 1;
                        }
                    }
                    s2 = 0;
                    s3 = 0;
                    allocate23.putShort(s2);
                    allocate23.putShort(s3);
                    allocate23.flip();
                    ByteBuffer m0112 = n77.m0("mdhd", allocate23);
                    ByteBuffer j302 = j(str4, str11);
                    ByteBuffer allocate242 = ByteBuffer.allocate(4);
                    allocate242.putInt(1);
                    allocate242.flip();
                    ByteBuffer[] byteBufferArr2 = {n77.m0("url ", allocate242)};
                    ByteBuffer allocate252 = ByteBuffer.allocate(8);
                    allocate252.putInt(0);
                    allocate252.putInt(1);
                    allocate252.flip();
                    ArrayList arrayList182 = new ArrayList();
                    arrayList182.add(allocate252);
                    Collections.addAll(arrayList182, byteBufferArr2);
                    ByteBuffer l042 = n77.l0("trak", Arrays.asList(m010, byteBuffer4, allocate2, n77.l0("mdia", Arrays.asList(m0112, j302, n77.l0("minf", Arrays.asList(byteBuffer, n77.m0("dinf", n77.l0("dref", arrayList182)), byteBuffer3))))));
                    arrayList2 = arrayList10;
                    arrayList2.add(l042);
                    j8 = Math.max(j8, j21);
                    ByteBuffer allocate262 = ByteBuffer.allocate(24);
                    allocate262.putInt(0);
                    allocate262.putInt(i23);
                    allocate262.putInt(1);
                    allocate262.putInt(0);
                    allocate262.putInt(0);
                    allocate262.putInt(0);
                    allocate262.flip();
                    arrayList3 = arrayList8;
                    arrayList3.add(n77.m0("trex", allocate262));
                    i18 = i23 + 1;
                }
                i19 = i + 1;
                arrayList4 = arrayList;
                arrayList6 = arrayList3;
                i13 = i7;
                i14 = i8;
                j7 = j;
                hashSet2 = hashSet;
                j9 = j6;
                hashMap3 = hashMap2;
                arrayList5 = arrayList2;
            } else {
                HashSet hashSet3 = hashSet2;
                ArrayList arrayList19 = arrayList5;
                int i55 = i18;
                ByteBuffer allocate27 = ByteBuffer.allocate(200);
                allocate27.putInt(0);
                allocate27.putInt(i13);
                allocate27.putInt(i14);
                allocate27.putInt(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                allocate27.putInt((int) n(j8, 10000L));
                allocate27.putInt(65536);
                allocate27.putShort((short) 256);
                allocate27.putShort((short) 0);
                allocate27.putInt(0);
                allocate27.putInt(0);
                int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
                for (int i56 = 0; i56 < 9; i56++) {
                    allocate27.putInt(iArr[i56]);
                }
                for (int i57 = 0; i57 < 6; i57++) {
                    allocate27.putInt(0);
                }
                allocate27.putInt(i55);
                allocate27.flip();
                ByteBuffer m012 = n77.m0("mvhd", allocate27);
                w14 w14Var = (w14) zp2Var.y;
                if (w14Var == null) {
                    m0 = ByteBuffer.allocate(0);
                } else {
                    Object[] objArr = {Float.valueOf(w14Var.a), Float.valueOf(w14Var.b)};
                    String str12 = eq6.a;
                    String format = String.format(Locale.US, "%+.4f%+.4f/", objArr);
                    ByteBuffer allocate28 = ByteBuffer.allocate(format.length() + 4);
                    allocate28.putShort((short) (allocate28.capacity() - 4));
                    allocate28.putShort((short) 5575);
                    allocate28.put(format.getBytes(StandardCharsets.UTF_8));
                    if (allocate28.limit() == allocate28.capacity()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.B(z);
                    allocate28.flip();
                    m0 = n77.m0("udta", n77.n0(new byte[]{-87, 120, 121, 122}, allocate28));
                }
                if (hashSet3.isEmpty()) {
                    l0 = ByteBuffer.allocate(0);
                } else {
                    ByteBuffer j31 = j("mdta", "");
                    ArrayList arrayList20 = new ArrayList(hashSet3);
                    int i58 = 0;
                    for (int i59 = 0; i59 < arrayList20.size(); i59++) {
                        i58 += ((qo3) arrayList20.get(i59)).a.length() + 8;
                    }
                    ByteBuffer allocate29 = ByteBuffer.allocate(i58 + 8);
                    allocate29.putInt(0);
                    allocate29.putInt(arrayList20.size());
                    for (int i60 = 0; i60 < arrayList20.size(); i60++) {
                        String str13 = ((qo3) arrayList20.get(i60)).a;
                        String str14 = eq6.a;
                        allocate29.put(n77.m0("mdta", ByteBuffer.wrap(str13.getBytes(StandardCharsets.UTF_8))));
                    }
                    allocate29.flip();
                    ByteBuffer m013 = n77.m0("keys", allocate29);
                    ArrayList arrayList21 = new ArrayList(hashSet3);
                    int i61 = 0;
                    for (int i62 = 0; i62 < arrayList21.size(); i62++) {
                        i61 += ((qo3) arrayList21.get(i62)).b.length + 24;
                    }
                    ByteBuffer allocate30 = ByteBuffer.allocate(i61);
                    int i63 = 0;
                    while (i63 < arrayList21.size()) {
                        int i64 = i63 + 1;
                        qo3 qo3Var = (qo3) arrayList21.get(i63);
                        ByteBuffer allocate31 = ByteBuffer.allocate(qo3Var.b.length + 8);
                        allocate31.putInt(qo3Var.d);
                        allocate31.putInt(qo3Var.c);
                        allocate31.put(qo3Var.b);
                        allocate31.flip();
                        ByteBuffer m014 = n77.m0("data", allocate31);
                        allocate30.putInt(m014.remaining() + 8);
                        allocate30.putInt(i64);
                        allocate30.put(m014);
                        i63 = i64;
                    }
                    allocate30.flip();
                    l0 = n77.l0("meta", Arrays.asList(j31, m013, n77.m0("ilst", allocate30)));
                }
                ArrayList arrayList22 = new ArrayList();
                arrayList22.add(m012);
                arrayList22.add(m0);
                arrayList22.add(l0);
                arrayList22.addAll(arrayList19);
                return n77.l0("moov", arrayList22);
            }
        }
    }

    public static ByteBuffer m(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return n77.m0("stsd", allocate);
    }

    public static long n(long j, long j2) {
        return eq6.e0(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
