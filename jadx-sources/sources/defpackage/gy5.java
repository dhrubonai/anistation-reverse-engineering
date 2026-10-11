package defpackage;

import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gy5 {
    public static final LinkedHashSet a(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new px0(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a34.C(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                a34.C(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            fz2.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            fz2.a("invalid end value");
        }
        if (i3 < 0) {
            fz2.a("invalid maxLines value");
        }
        if (i < 0) {
            fz2.a("invalid width value");
        }
        if (i4 < 0) {
            fz2.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        obtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            d4.j(obtain, i7, i8);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final boolean c(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return a34.i(uz5.w0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final String e(Collection collection) {
        if (!collection.isEmpty()) {
            return vz5.t(yo0.q0(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    public static final byte[] f(f94 f94Var) {
        int[] H0;
        int[] H02;
        NetworkRequest networkRequest = (NetworkRequest) f94Var.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    H0 = networkRequest.getTransportTypes();
                    H0.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr[i];
                        if (networkRequest.hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    H0 = yo0.H0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    H02 = networkRequest.getCapabilities();
                    H02.getClass();
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 30; i3++) {
                        int i4 = iArr2[i3];
                        if (networkRequest.hasCapability(i4)) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    H02 = yo0.H0(arrayList2);
                }
                objectOutputStream.writeInt(H0.length);
                for (int i5 : H0) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(H02.length);
                for (int i6 : H02) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a34.C(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public static final long g(bd6 bd6Var, int i, boolean z, boolean z2) {
        int max;
        o24 o24Var = bd6Var.b;
        long j = bd6Var.c;
        int d = o24Var.d(i);
        if (d >= o24Var.f) {
            return 9205357640488583168L;
        }
        boolean z3 = false;
        if ((z && !z2) || (!z && z2)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (bd6Var.a(max) == bd6Var.i(i)) {
            z3 = true;
        }
        float B = db.B(bd6Var.e(i, z3), 0.0f, (int) (j >> 32));
        float B2 = db.B(o24Var.b(d), 0.0f, (int) (j & 4294967295L));
        return (Float.floatToRawIntBits(B) << 32) | (Float.floatToRawIntBits(B2) & 4294967295L);
    }

    public static final c00 h(int i) {
        if (i != 0) {
            if (i == 1) {
                return c00.y;
            }
            ze0.k(qx1.i(i, "Could not convert ", " to BackoffPolicy"));
            return null;
        }
        return c00.x;
    }

    public static final k94 i(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return k94.C;
                            }
                            ze0.k(qx1.i(i, "Could not convert ", " to NetworkType"));
                            return null;
                        }
                        return k94.B;
                    }
                    return k94.A;
                }
                return k94.z;
            }
            return k94.y;
        }
        return k94.x;
    }

    public static final wg4 j(int i) {
        if (i != 0) {
            if (i == 1) {
                return wg4.y;
            }
            ze0.k(qx1.i(i, "Could not convert ", " to OutOfQuotaPolicy"));
            return null;
        }
        return wg4.x;
    }

    public static final j77 k(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return j77.C;
                            }
                            ze0.k(qx1.i(i, "Could not convert ", " to State"));
                            return null;
                        }
                        return j77.B;
                    }
                    return j77.A;
                }
                return j77.z;
            }
            return j77.y;
        }
        return j77.x;
    }

    public static final String l(Collection collection) {
        return vz5.t(yo0.q0(collection, ",", null, null, null, 62)).concat(vz5.t(" }"));
    }

    public static final String m(Collection collection) {
        return vz5.t(yo0.q0(collection, ",", null, null, null, 62)).concat(vz5.t("},"));
    }

    public static MappedByteBuffer n(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final int o(k94 k94Var) {
        int ordinal = k94Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && k94Var == k94.C) {
                            return 5;
                        }
                        p65.i("Could not convert ", k94Var, " to int");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final byte[] p(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    px0 px0Var = (px0) it.next();
                    objectOutputStream.writeUTF(px0Var.a.toString());
                    objectOutputStream.writeBoolean(px0Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a34.C(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                a34.C(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final int q(j77 j77Var) {
        j77Var.getClass();
        int ordinal = j77Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        ze0.l();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final f94 r(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 0) {
            return new f94(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                f94 D = n77.D(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return D;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a34.C(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
