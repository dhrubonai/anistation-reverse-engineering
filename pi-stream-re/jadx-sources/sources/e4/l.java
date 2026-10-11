package e4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l implements v3.e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3493a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3494b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(k kVar, y3.h hVar) {
        boolean z9;
        try {
            int f10 = kVar.f();
            if ((f10 & 65496) != 65496 && f10 != 19789 && f10 != 18761) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + f10);
                }
                return -1;
            }
            int g10 = g(kVar);
            if (g10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) hVar.d(g10, byte[].class);
            try {
                return h(kVar, bArr, g10);
            } finally {
                hVar.h(bArr);
            }
        } catch (j unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(k kVar) {
        boolean z9;
        try {
            int f10 = kVar.f();
            if (f10 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int e10 = (f10 << 8) | kVar.e();
            if (e10 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int e11 = (e10 << 8) | kVar.e();
            if (e11 == -1991225785) {
                kVar.b(21L);
                try {
                    if (kVar.e() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (e11 != 1380533830) {
                if (((kVar.f() << 16) | kVar.f()) != 1718909296) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int f11 = (kVar.f() << 16) | kVar.f();
                if (f11 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                int i10 = 0;
                if (f11 == 1635150182) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                kVar.b(4L);
                int i11 = e11 - 16;
                if (i11 % 4 == 0) {
                    while (i10 < 5 && i11 > 0) {
                        int f12 = (kVar.f() << 16) | kVar.f();
                        if (f12 == 1635150195) {
                            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                        }
                        if (f12 == 1635150182) {
                            z9 = true;
                        }
                        i10++;
                        i11 -= 4;
                    }
                }
                if (z9) {
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            kVar.b(4L);
            if (((kVar.f() << 16) | kVar.f()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int f13 = (kVar.f() << 16) | kVar.f();
            if ((f13 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i12 = f13 & 255;
            if (i12 == 88) {
                kVar.b(4L);
                short e12 = kVar.e();
                if ((e12 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((e12 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i12 == 76) {
                kVar.b(4L);
                if ((kVar.e() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(k kVar) {
        short e10;
        int f10;
        long j4;
        long b10;
        do {
            short e11 = kVar.e();
            if (e11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) e11));
                }
                return -1;
            }
            e10 = kVar.e();
            if (e10 == 218) {
                return -1;
            }
            if (e10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            f10 = kVar.f() - 2;
            if (e10 != 225) {
                j4 = f10;
                b10 = kVar.b(j4);
            } else {
                return f10;
            }
        } while (b10 == j4);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) e10) + ", wanted to skip: " + f10 + ", but actually skipped: " + b10);
        }
        return -1;
    }

    public static int h(k kVar, byte[] bArr, int i10) {
        boolean z9;
        ByteOrder byteOrder;
        boolean z10;
        int i11;
        short s9;
        int i12;
        int d10 = kVar.d(bArr, i10);
        if (d10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + d10);
            }
            return -1;
        }
        byte[] bArr2 = f3493a;
        short s10 = 1;
        if (i10 > bArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                }
                if (bArr[i13] != bArr2[i13]) {
                    z9 = false;
                    break;
                }
                i13++;
            }
        }
        if (z9) {
            q0.v vVar = new q0.v(bArr, i10);
            short g10 = vVar.g(6);
            if (g10 != 18761) {
                if (g10 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) g10));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = vVar.f8963a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = byteBuffer.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short g11 = vVar.g(i14);
            int i15 = 0;
            while (i15 < g11) {
                int i16 = (i15 * 12) + i14 + 2;
                short g12 = vVar.g(i16);
                if (g12 == 274) {
                    short g13 = vVar.g(i16 + 2);
                    if (g13 >= s10 && g13 <= 12) {
                        int i17 = i16 + 4;
                        if (byteBuffer.remaining() - i17 >= 4) {
                            s9 = s10;
                        } else {
                            s9 = 0;
                        }
                        if (s9 != 0) {
                            i12 = byteBuffer.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i15 + " tagType=" + ((int) g12) + " formatCode=" + ((int) g13) + " componentCount=" + i12);
                            }
                            int i18 = i12 + f3494b[g13];
                            if (i18 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) g13));
                                }
                            } else {
                                int i19 = i16 + 8;
                                if (i19 >= 0 && i19 <= byteBuffer.remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                        return vVar.g(i19);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) g12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) g12));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) g13));
                    }
                }
                i15++;
                s10 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // v3.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        w7.b.q(byteBuffer);
        return f(new q0.v(2, byteBuffer));
    }

    @Override // v3.e
    public final int b(ByteBuffer byteBuffer, y3.h hVar) {
        w7.b.q(byteBuffer);
        q0.v vVar = new q0.v(2, byteBuffer);
        w7.b.q(hVar);
        return e(vVar, hVar);
    }

    @Override // v3.e
    public final int c(InputStream inputStream, y3.h hVar) {
        w7.b.q(inputStream);
        v3.f fVar = new v3.f(inputStream);
        w7.b.q(hVar);
        return e(fVar, hVar);
    }

    @Override // v3.e
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        w7.b.q(inputStream);
        return f(new v3.f(inputStream));
    }
}
