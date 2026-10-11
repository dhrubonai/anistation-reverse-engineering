package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lx1 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final ix1 H;
    public static final ix1[][] I;
    public static final ix1[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final Set M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public hx1 l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {97, 118, 105, 102};
    public static final byte[] w = {97, 118, 105, 115};
    public static final byte[] x = {79, 76, 89, 77, 80, 0};
    public static final byte[] y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] z = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ix1[] ix1VarArr = {new ix1("NewSubfileType", 254, 4), new ix1("SubfileType", 255, 4), new ix1("ImageWidth", 256, 3, 4), new ix1("ImageLength", 257, 3, 4), new ix1("BitsPerSample", 258, 3), new ix1("Compression", 259, 3), new ix1("PhotometricInterpretation", 262, 3), new ix1("ImageDescription", 270, 2), new ix1("Make", 271, 2), new ix1("Model", 272, 2), new ix1("StripOffsets", 273, 3, 4), new ix1("Orientation", 274, 3), new ix1("SamplesPerPixel", 277, 3), new ix1("RowsPerStrip", 278, 3, 4), new ix1("StripByteCounts", 279, 3, 4), new ix1("XResolution", 282, 5), new ix1("YResolution", 283, 5), new ix1("PlanarConfiguration", 284, 3), new ix1("ResolutionUnit", 296, 3), new ix1("TransferFunction", 301, 3), new ix1("Software", 305, 2), new ix1("DateTime", 306, 2), new ix1("Artist", 315, 2), new ix1("WhitePoint", 318, 5), new ix1("PrimaryChromaticities", 319, 5), new ix1("SubIFDPointer", 330, 4), new ix1("JPEGInterchangeFormat", 513, 4), new ix1("JPEGInterchangeFormatLength", 514, 4), new ix1("YCbCrCoefficients", 529, 5), new ix1("YCbCrSubSampling", 530, 3), new ix1("YCbCrPositioning", 531, 3), new ix1("ReferenceBlackWhite", 532, 5), new ix1("Copyright", 33432, 2), new ix1("ExifIFDPointer", 34665, 4), new ix1("GPSInfoIFDPointer", 34853, 4), new ix1("SensorTopBorder", 4, 4), new ix1("SensorLeftBorder", 5, 4), new ix1("SensorBottomBorder", 6, 4), new ix1("SensorRightBorder", 7, 4), new ix1("ISO", 23, 3), new ix1("JpgFromRaw", 46, 7), new ix1("Xmp", 700, 1)};
        ix1[] ix1VarArr2 = {new ix1("ExposureTime", 33434, 5), new ix1("FNumber", 33437, 5), new ix1("ExposureProgram", 34850, 3), new ix1("SpectralSensitivity", 34852, 2), new ix1("PhotographicSensitivity", 34855, 3), new ix1("OECF", 34856, 7), new ix1("SensitivityType", 34864, 3), new ix1("StandardOutputSensitivity", 34865, 4), new ix1("RecommendedExposureIndex", 34866, 4), new ix1("ISOSpeed", 34867, 4), new ix1("ISOSpeedLatitudeyyy", 34868, 4), new ix1("ISOSpeedLatitudezzz", 34869, 4), new ix1("ExifVersion", 36864, 2), new ix1("DateTimeOriginal", 36867, 2), new ix1("DateTimeDigitized", 36868, 2), new ix1("OffsetTime", 36880, 2), new ix1("OffsetTimeOriginal", 36881, 2), new ix1("OffsetTimeDigitized", 36882, 2), new ix1("ComponentsConfiguration", 37121, 7), new ix1("CompressedBitsPerPixel", 37122, 5), new ix1("ShutterSpeedValue", 37377, 10), new ix1("ApertureValue", 37378, 5), new ix1("BrightnessValue", 37379, 10), new ix1("ExposureBiasValue", 37380, 10), new ix1("MaxApertureValue", 37381, 5), new ix1("SubjectDistance", 37382, 5), new ix1("MeteringMode", 37383, 3), new ix1("LightSource", 37384, 3), new ix1("Flash", 37385, 3), new ix1("FocalLength", 37386, 5), new ix1("SubjectArea", 37396, 3), new ix1("MakerNote", 37500, 7), new ix1("UserComment", 37510, 7), new ix1("SubSecTime", 37520, 2), new ix1("SubSecTimeOriginal", 37521, 2), new ix1("SubSecTimeDigitized", 37522, 2), new ix1("FlashpixVersion", 40960, 7), new ix1("ColorSpace", 40961, 3), new ix1("PixelXDimension", 40962, 3, 4), new ix1("PixelYDimension", 40963, 3, 4), new ix1("RelatedSoundFile", 40964, 2), new ix1("InteroperabilityIFDPointer", 40965, 4), new ix1("FlashEnergy", 41483, 5), new ix1("SpatialFrequencyResponse", 41484, 7), new ix1("FocalPlaneXResolution", 41486, 5), new ix1("FocalPlaneYResolution", 41487, 5), new ix1("FocalPlaneResolutionUnit", 41488, 3), new ix1("SubjectLocation", 41492, 3), new ix1("ExposureIndex", 41493, 5), new ix1("SensingMethod", 41495, 3), new ix1("FileSource", 41728, 7), new ix1("SceneType", 41729, 7), new ix1("CFAPattern", 41730, 7), new ix1("CustomRendered", 41985, 3), new ix1("ExposureMode", 41986, 3), new ix1("WhiteBalance", 41987, 3), new ix1("DigitalZoomRatio", 41988, 5), new ix1("FocalLengthIn35mmFilm", 41989, 3), new ix1("SceneCaptureType", 41990, 3), new ix1("GainControl", 41991, 3), new ix1("Contrast", 41992, 3), new ix1("Saturation", 41993, 3), new ix1("Sharpness", 41994, 3), new ix1("DeviceSettingDescription", 41995, 7), new ix1("SubjectDistanceRange", 41996, 3), new ix1("ImageUniqueID", 42016, 2), new ix1("CameraOwnerName", 42032, 2), new ix1("BodySerialNumber", 42033, 2), new ix1("LensSpecification", 42034, 5), new ix1("LensMake", 42035, 2), new ix1("LensModel", 42036, 2), new ix1("Gamma", 42240, 5), new ix1("DNGVersion", 50706, 1), new ix1("DefaultCropSize", 50720, 3, 4)};
        ix1[] ix1VarArr3 = {new ix1("GPSVersionID", 0, 1), new ix1("GPSLatitudeRef", 1, 2), new ix1("GPSLatitude", 2, 5, 10), new ix1("GPSLongitudeRef", 3, 2), new ix1("GPSLongitude", 4, 5, 10), new ix1("GPSAltitudeRef", 5, 1), new ix1("GPSAltitude", 6, 5), new ix1("GPSTimeStamp", 7, 5), new ix1("GPSSatellites", 8, 2), new ix1("GPSStatus", 9, 2), new ix1("GPSMeasureMode", 10, 2), new ix1("GPSDOP", 11, 5), new ix1("GPSSpeedRef", 12, 2), new ix1("GPSSpeed", 13, 5), new ix1("GPSTrackRef", 14, 2), new ix1("GPSTrack", 15, 5), new ix1("GPSImgDirectionRef", 16, 2), new ix1("GPSImgDirection", 17, 5), new ix1("GPSMapDatum", 18, 2), new ix1("GPSDestLatitudeRef", 19, 2), new ix1("GPSDestLatitude", 20, 5), new ix1("GPSDestLongitudeRef", 21, 2), new ix1("GPSDestLongitude", 22, 5), new ix1("GPSDestBearingRef", 23, 2), new ix1("GPSDestBearing", 24, 5), new ix1("GPSDestDistanceRef", 25, 2), new ix1("GPSDestDistance", 26, 5), new ix1("GPSProcessingMethod", 27, 7), new ix1("GPSAreaInformation", 28, 7), new ix1("GPSDateStamp", 29, 2), new ix1("GPSDifferential", 30, 3), new ix1("GPSHPositioningError", 31, 5)};
        ix1[] ix1VarArr4 = {new ix1("InteroperabilityIndex", 1, 2)};
        ix1[] ix1VarArr5 = {new ix1("NewSubfileType", 254, 4), new ix1("SubfileType", 255, 4), new ix1("ThumbnailImageWidth", 256, 3, 4), new ix1("ThumbnailImageLength", 257, 3, 4), new ix1("BitsPerSample", 258, 3), new ix1("Compression", 259, 3), new ix1("PhotometricInterpretation", 262, 3), new ix1("ImageDescription", 270, 2), new ix1("Make", 271, 2), new ix1("Model", 272, 2), new ix1("StripOffsets", 273, 3, 4), new ix1("ThumbnailOrientation", 274, 3), new ix1("SamplesPerPixel", 277, 3), new ix1("RowsPerStrip", 278, 3, 4), new ix1("StripByteCounts", 279, 3, 4), new ix1("XResolution", 282, 5), new ix1("YResolution", 283, 5), new ix1("PlanarConfiguration", 284, 3), new ix1("ResolutionUnit", 296, 3), new ix1("TransferFunction", 301, 3), new ix1("Software", 305, 2), new ix1("DateTime", 306, 2), new ix1("Artist", 315, 2), new ix1("WhitePoint", 318, 5), new ix1("PrimaryChromaticities", 319, 5), new ix1("SubIFDPointer", 330, 4), new ix1("JPEGInterchangeFormat", 513, 4), new ix1("JPEGInterchangeFormatLength", 514, 4), new ix1("YCbCrCoefficients", 529, 5), new ix1("YCbCrSubSampling", 530, 3), new ix1("YCbCrPositioning", 531, 3), new ix1("ReferenceBlackWhite", 532, 5), new ix1("Copyright", 33432, 2), new ix1("ExifIFDPointer", 34665, 4), new ix1("GPSInfoIFDPointer", 34853, 4), new ix1("DNGVersion", 50706, 1), new ix1("DefaultCropSize", 50720, 3, 4)};
        H = new ix1("StripOffsets", 273, 3);
        I = new ix1[][]{ix1VarArr, ix1VarArr2, ix1VarArr3, ix1VarArr4, ix1VarArr5, ix1VarArr, new ix1[]{new ix1("ThumbnailImage", 256, 7), new ix1("CameraSettingsIFDPointer", 8224, 4), new ix1("ImageProcessingIFDPointer", 8256, 4)}, new ix1[]{new ix1("PreviewImageStart", 257, 4), new ix1("PreviewImageLength", 258, 4)}, new ix1[]{new ix1("AspectFrame", 4371, 3)}, new ix1[]{new ix1("ColorSpace", 55, 3)}};
        J = new ix1[]{new ix1("SubIFDPointer", 330, 4), new ix1("ExifIFDPointer", 34665, 4), new ix1("GPSInfoIFDPointer", 34853, 4), new ix1("InteroperabilityIFDPointer", 40965, 4), new ix1("CameraSettingsIFDPointer", 8224, 1), new ix1("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ix1[][] ix1VarArr6 = I;
            if (i < ix1VarArr6.length) {
                K[i] = new HashMap();
                L[i] = new HashMap();
                for (ix1 ix1Var : ix1VarArr6[i]) {
                    K[i].put(Integer.valueOf(ix1Var.a), ix1Var);
                    L[i].put(ix1Var.b, ix1Var);
                }
                i++;
            } else {
                HashMap hashMap = N;
                ix1[] ix1VarArr7 = J;
                hashMap.put(Integer.valueOf(ix1VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(ix1VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(ix1VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(ix1VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(ix1VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(ix1VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lx1(java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(gx1 gx1Var) {
        short readShort = gx1Var.readShort();
        boolean z2 = m;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            v71.k(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(O);
            hashMap.put("DateTime", new hx1(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", hx1.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", hx1.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", hx1.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", hx1.a(0L, this.f));
        }
    }

    public final String b(String str) {
        hx1 c = c(str);
        if (c != null) {
            int i = c.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                jx1[] jx1VarArr = (jx1[]) c.g(this.f);
                if (jx1VarArr != null && jx1VarArr.length == 3) {
                    jx1 jx1Var = jx1VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) jx1Var.a) / ((float) jx1Var.b)));
                    jx1 jx1Var2 = jx1VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) jx1Var2.a) / ((float) jx1Var2.b)));
                    jx1 jx1Var3 = jx1VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) jx1Var3.a) / ((float) jx1Var3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(jx1VarArr));
                return null;
            }
            boolean contains = M.contains(str);
            ByteOrder byteOrder = this.f;
            if (contains) {
                try {
                    return Double.toString(c.d(byteOrder));
                } catch (NumberFormatException unused) {
                }
            } else {
                return c.f(byteOrder);
            }
        }
        return null;
    }

    public final hx1 c(String str) {
        hx1 hx1Var;
        int i;
        hx1 hx1Var2;
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (hx1Var2 = this.l) != null)) {
            return hx1Var2;
        }
        for (int i2 = 0; i2 < I.length; i2++) {
            hx1 hx1Var3 = (hx1) this.d[i2].get(str);
            if (hx1Var3 != null) {
                return hx1Var3;
            }
        }
        if ("Xmp".equals(str) && (hx1Var = this.l) != null) {
            return hx1Var;
        }
        return null;
    }

    public final void d(kx1 kx1Var, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        if (i == 15 && Build.VERSION.SDK_INT < 31) {
            ov3.g("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new fx1(kx1Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", hx1.c(Integer.parseInt(str), this.f));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", hx1.c(Integer.parseInt(str3), this.f));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt != 90) {
                        if (parseInt != 180) {
                            if (parseInt != 270) {
                                i2 = 1;
                            } else {
                                i2 = 8;
                            }
                        } else {
                            i2 = 3;
                        }
                    } else {
                        i2 = 6;
                    }
                    hashMapArr[0].put("Orientation", hx1.c(i2, this.f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 > 6) {
                        kx1Var.l(parseInt2);
                        byte[] bArr = new byte[6];
                        kx1Var.readFully(bArr);
                        int i3 = parseInt2 + 6;
                        int i4 = parseInt3 - 6;
                        if (Arrays.equals(bArr, P)) {
                            byte[] bArr2 = new byte[i4];
                            kx1Var.readFully(bArr2);
                            this.h = i3;
                            r(0, bArr2);
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Invalid exif length");
                    }
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    kx1Var.l(j);
                    byte[] bArr3 = new byte[parseInt5];
                    kx1Var.readFully(bArr3);
                    this.l = new hx1(j, bArr3, 1, parseInt5);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r23.z = r22.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f A[LOOP:0: B:9:0x0034->B:35:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gx1 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.e(gx1, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00f4, code lost:
    
        if (r7 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r20) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.f(java.io.BufferedInputStream):int");
    }

    public final void g(kx1 kx1Var) {
        int i;
        int i2;
        j(kx1Var);
        HashMap[] hashMapArr = this.d;
        hx1 hx1Var = (hx1) hashMapArr[1].get("MakerNote");
        if (hx1Var != null) {
            kx1 kx1Var2 = new kx1(hx1Var.d);
            kx1Var2.z = this.f;
            byte[] bArr = x;
            byte[] bArr2 = new byte[bArr.length];
            kx1Var2.readFully(bArr2);
            kx1Var2.l(0L);
            byte[] bArr3 = y;
            byte[] bArr4 = new byte[bArr3.length];
            kx1Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                kx1Var2.l(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                kx1Var2.l(12L);
            }
            s(kx1Var2, 6);
            hx1 hx1Var2 = (hx1) hashMapArr[7].get("PreviewImageStart");
            hx1 hx1Var3 = (hx1) hashMapArr[7].get("PreviewImageLength");
            if (hx1Var2 != null && hx1Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", hx1Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", hx1Var3);
            }
            hx1 hx1Var4 = (hx1) hashMapArr[8].get("AspectFrame");
            if (hx1Var4 != null) {
                int[] iArr = (int[]) hx1Var4.g(this.f);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        hx1 c = hx1.c(i5, this.f);
                        hx1 c2 = hx1.c(i6, this.f);
                        hashMapArr[0].put("ImageWidth", c);
                        hashMapArr[0].put("ImageLength", c2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(gx1 gx1Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + gx1Var);
        }
        gx1Var.z = ByteOrder.BIG_ENDIAN;
        int i = gx1Var.y;
        gx1Var.a(z.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!z2 || !z3) {
                try {
                    int readInt = gx1Var.readInt();
                    int readInt2 = gx1Var.readInt();
                    int i2 = gx1Var.y;
                    int i3 = i2 + readInt + 4;
                    int i4 = i2 - i;
                    if (i4 == 16 && readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    if (readInt2 == 1229278788) {
                        return;
                    }
                    if (readInt2 == 1700284774 && !z2) {
                        this.h = i4;
                        byte[] bArr = new byte[readInt];
                        gx1Var.readFully(bArr);
                        int readInt3 = gx1Var.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(readInt2 >>> 24);
                        crc32.update(readInt2 >>> 16);
                        crc32.update(readInt2 >>> 8);
                        crc32.update(readInt2);
                        crc32.update(bArr);
                        if (((int) crc32.getValue()) == readInt3) {
                            r(0, bArr);
                            x();
                            u(new gx1(bArr));
                            z2 = true;
                        } else {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                    } else if (readInt2 == 1767135348 && !z3) {
                        byte[] bArr2 = A;
                        if (readInt >= bArr2.length) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            gx1Var.readFully(bArr3);
                            if (Arrays.equals(bArr3, bArr2)) {
                                int i5 = gx1Var.y - i;
                                int i6 = readInt - length;
                                byte[] bArr4 = new byte[i6];
                                gx1Var.readFully(bArr4);
                                this.l = new hx1(i5, bArr4, 1, i6);
                                z3 = true;
                            }
                        }
                    }
                    gx1Var.a(i3 - gx1Var.y);
                } catch (EOFException e) {
                    throw new IOException("Encountered corrupt PNG file.", e);
                }
            } else {
                return;
            }
        }
    }

    public final void i(gx1 gx1Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + gx1Var);
        }
        gx1Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        gx1Var.readFully(bArr);
        gx1Var.readFully(bArr2);
        gx1Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        gx1Var.a(i - gx1Var.y);
        gx1Var.readFully(bArr4);
        e(new gx1(bArr4), i, 5);
        gx1Var.a(i3 - gx1Var.y);
        gx1Var.z = ByteOrder.BIG_ENDIAN;
        int readInt = gx1Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = gx1Var.readUnsignedShort();
            int readUnsignedShort2 = gx1Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = gx1Var.readShort();
                short readShort2 = gx1Var.readShort();
                hx1 c = hx1.c(readShort, this.f);
                hx1 c2 = hx1.c(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            gx1Var.a(readUnsignedShort2);
        }
    }

    public final void j(kx1 kx1Var) {
        o(kx1Var);
        s(kx1Var, 0);
        w(kx1Var, 0);
        w(kx1Var, 5);
        w(kx1Var, 4);
        x();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            hx1 hx1Var = (hx1) hashMapArr[1].get("MakerNote");
            if (hx1Var != null) {
                kx1 kx1Var2 = new kx1(hx1Var.d);
                kx1Var2.z = this.f;
                kx1Var2.a(6);
                s(kx1Var2, 9);
                hx1 hx1Var2 = (hx1) hashMapArr[9].get("ColorSpace");
                if (hx1Var2 != null) {
                    hashMapArr[1].put("ColorSpace", hx1Var2);
                }
            }
        }
    }

    public final void k(kx1 kx1Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + kx1Var);
        }
        j(kx1Var);
        HashMap[] hashMapArr = this.d;
        hx1 hx1Var = (hx1) hashMapArr[0].get("JpgFromRaw");
        if (hx1Var != null) {
            e(new gx1(hx1Var.d), (int) hx1Var.c, 5);
        }
        hx1 hx1Var2 = (hx1) hashMapArr[0].get("ISO");
        hx1 hx1Var3 = (hx1) hashMapArr[1].get("PhotographicSensitivity");
        if (hx1Var2 != null && hx1Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", hx1Var2);
        }
    }

    public final void l(gx1 gx1Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + gx1Var);
        }
        gx1Var.z = ByteOrder.LITTLE_ENDIAN;
        gx1Var.a(B.length);
        int readInt = gx1Var.readInt() + 8;
        byte[] bArr = C;
        gx1Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                gx1Var.readFully(bArr2);
                int readInt2 = gx1Var.readInt();
                int i = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    gx1Var.readFully(bArr3);
                    byte[] bArr4 = P;
                    if (a34.p0(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.h = i;
                    r(0, bArr3);
                    u(new gx1(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    gx1Var.a(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(gx1 gx1Var, HashMap hashMap) {
        hx1 hx1Var = (hx1) hashMap.get("JPEGInterchangeFormat");
        hx1 hx1Var2 = (hx1) hashMap.get("JPEGInterchangeFormatLength");
        if (hx1Var != null && hx1Var2 != null) {
            int e = hx1Var.e(this.f);
            int e2 = hx1Var2.e(this.f);
            if (this.c == 7) {
                e += this.i;
            }
            if (e > 0 && e2 > 0 && this.b == null && this.a == null) {
                gx1Var.a(e);
                gx1Var.readFully(new byte[e2]);
            }
            if (m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        hx1 hx1Var = (hx1) hashMap.get("ImageLength");
        hx1 hx1Var2 = (hx1) hashMap.get("ImageWidth");
        if (hx1Var != null && hx1Var2 != null) {
            int e = hx1Var.e(this.f);
            int e2 = hx1Var2.e(this.f);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(kx1 kx1Var) {
        ByteOrder q2 = q(kx1Var);
        this.f = q2;
        kx1Var.z = q2;
        int readUnsignedShort = kx1Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            v71.k(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = kx1Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                kx1Var.a(i2);
                return;
            }
            return;
        }
        qi2.k(qx1.h(readInt, "Invalid first Ifd offset: "));
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i < hashMapArr.length) {
                StringBuilder s2 = qx1.s(i, "The size of tag group[", "]: ");
                s2.append(hashMapArr[i].size());
                Log.d("ExifInterface", s2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    hx1 hx1Var = (hx1) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + hx1Var.toString() + ", tagValue: '" + hx1Var.f(this.f) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void r(int i, byte[] bArr) {
        kx1 kx1Var = new kx1(bArr);
        o(kx1Var);
        s(kx1Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.kx1 r30, int r31) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.s(kx1, int):void");
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, (hx1) hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void u(gx1 gx1Var) {
        hx1 hx1Var;
        int e;
        HashMap hashMap = this.d[4];
        hx1 hx1Var2 = (hx1) hashMap.get("Compression");
        if (hx1Var2 != null) {
            int e2 = hx1Var2.e(this.f);
            if (e2 != 1) {
                if (e2 != 6) {
                    if (e2 != 7) {
                        return;
                    }
                } else {
                    m(gx1Var, hashMap);
                    return;
                }
            }
            hx1 hx1Var3 = (hx1) hashMap.get("BitsPerSample");
            if (hx1Var3 != null) {
                int[] iArr = (int[]) hx1Var3.g(this.f);
                int[] iArr2 = p;
                if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (hx1Var = (hx1) hashMap.get("PhotometricInterpretation")) != null && (((e = hx1Var.e(this.f)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                    hx1 hx1Var4 = (hx1) hashMap.get("StripOffsets");
                    hx1 hx1Var5 = (hx1) hashMap.get("StripByteCounts");
                    if (hx1Var4 != null && hx1Var5 != null) {
                        long[] H2 = a34.H(hx1Var4.g(this.f));
                        long[] H3 = a34.H(hx1Var5.g(this.f));
                        if (H2 != null && H2.length != 0) {
                            if (H3 != null && H3.length != 0) {
                                if (H2.length != H3.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j2 : H3) {
                                    j += j2;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.g = true;
                                int i = 0;
                                int i2 = 0;
                                for (int i3 = 0; i3 < H2.length; i3++) {
                                    int i4 = (int) H2[i3];
                                    int i5 = (int) H3[i3];
                                    if (i3 < H2.length - 1 && i4 + i5 != H2[i3 + 1]) {
                                        this.g = false;
                                    }
                                    int i6 = i4 - i;
                                    if (i6 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        gx1Var.a(i6);
                                        int i7 = i + i6;
                                        byte[] bArr2 = new byte[i5];
                                        try {
                                            gx1Var.readFully(bArr2);
                                            i = i7 + i5;
                                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                                            i2 += i5;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.g) {
                                    long j3 = H2[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(gx1Var, hashMap);
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            hx1 hx1Var = (hx1) hashMapArr[i].get("ImageLength");
            hx1 hx1Var2 = (hx1) hashMapArr[i].get("ImageWidth");
            hx1 hx1Var3 = (hx1) hashMapArr[i2].get("ImageLength");
            hx1 hx1Var4 = (hx1) hashMapArr[i2].get("ImageWidth");
            if (hx1Var != null && hx1Var2 != null) {
                if (hx1Var3 != null && hx1Var4 != null) {
                    int e = hx1Var.e(this.f);
                    int e2 = hx1Var2.e(this.f);
                    int e3 = hx1Var3.e(this.f);
                    int e4 = hx1Var4.e(this.f);
                    if (e < e3 && e2 < e4) {
                        HashMap hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                        return;
                    }
                    return;
                }
                if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(kx1 kx1Var, int i) {
        hx1 c;
        hx1 c2;
        HashMap[] hashMapArr = this.d;
        hx1 hx1Var = (hx1) hashMapArr[i].get("DefaultCropSize");
        hx1 hx1Var2 = (hx1) hashMapArr[i].get("SensorTopBorder");
        hx1 hx1Var3 = (hx1) hashMapArr[i].get("SensorLeftBorder");
        hx1 hx1Var4 = (hx1) hashMapArr[i].get("SensorBottomBorder");
        hx1 hx1Var5 = (hx1) hashMapArr[i].get("SensorRightBorder");
        if (hx1Var != null) {
            int i2 = hx1Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                jx1[] jx1VarArr = (jx1[]) hx1Var.g(byteOrder);
                if (jx1VarArr != null && jx1VarArr.length == 2) {
                    c = hx1.b(jx1VarArr[0], this.f);
                    c2 = hx1.b(jx1VarArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(jx1VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) hx1Var.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c = hx1.c(iArr[0], this.f);
                    c2 = hx1.c(iArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (hx1Var2 != null && hx1Var3 != null && hx1Var4 != null && hx1Var5 != null) {
            int e = hx1Var2.e(this.f);
            int e2 = hx1Var4.e(this.f);
            int e3 = hx1Var5.e(this.f);
            int e4 = hx1Var3.e(this.f);
            if (e2 > e && e3 > e4) {
                hx1 c3 = hx1.c(e2 - e, this.f);
                hx1 c4 = hx1.c(e3 - e4, this.f);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
                return;
            }
            return;
        }
        hx1 hx1Var6 = (hx1) hashMapArr[i].get("ImageLength");
        hx1 hx1Var7 = (hx1) hashMapArr[i].get("ImageWidth");
        if (hx1Var6 == null || hx1Var7 == null) {
            hx1 hx1Var8 = (hx1) hashMapArr[i].get("JPEGInterchangeFormat");
            hx1 hx1Var9 = (hx1) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (hx1Var8 != null && hx1Var9 != null) {
                int e5 = hx1Var8.e(this.f);
                int e6 = hx1Var8.e(this.f);
                kx1Var.l(e5);
                byte[] bArr = new byte[e6];
                kx1Var.readFully(bArr);
                e(new gx1(bArr), e5, i);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        hx1 hx1Var = (hx1) hashMapArr[1].get("PixelXDimension");
        hx1 hx1Var2 = (hx1) hashMapArr[1].get("PixelYDimension");
        if (hx1Var != null && hx1Var2 != null) {
            hashMapArr[0].put("ImageWidth", hx1Var);
            hashMapArr[0].put("ImageLength", hx1Var2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
