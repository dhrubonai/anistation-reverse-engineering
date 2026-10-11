package defpackage;

import android.os.Bundle;
import com.anistation.android.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q18 implements cb8, ue2, ud0, k11, o41, pw6, at3, xm4 {
    public final /* synthetic */ byte x;
    public static final q18 y = new q18((byte) 0);
    public static final q18 z = new q18((byte) 1);
    public static final q18 A = new q18((byte) 2);
    public static final q18 B = new q18((byte) 3);
    public static final q18 C = new q18((byte) 4);

    public q18(Bundle bundle) {
        this.x = (byte) 9;
        gv5.l(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [pa0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, pa0] */
    public static String g(String str, int i, int i2, String str2, int i3) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        String str3;
        boolean z5 = false;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = str.length();
        } else {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i3 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i3 & 32) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i3 & 64) == 0) {
            z5 = true;
        }
        str.getClass();
        int i6 = i4;
        while (i6 < i5) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 128;
            int i8 = 32;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z5) && !uz5.N(str2, (char) codePointAt) && ((codePointAt != 37 || (z2 && (!z3 || k(str, i6, i5)))) && (codePointAt != 43 || !z4)))) {
                i6 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.B0(str, i4, i6);
                ?? r2 = 0;
                while (i6 < i5) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z4) {
                            if (z2) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.A0(str3);
                        } else if (codePointAt2 >= i8 && codePointAt2 != 127 && ((codePointAt2 < i7 || z5) && !uz5.N(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z2 && (!z3 || k(str, i6, i5)))))) {
                            obj.C0(codePointAt2);
                        } else {
                            if (r2 == 0) {
                                r2 = new Object();
                            }
                            r2.C0(codePointAt2);
                            while (!r2.D()) {
                                byte readByte = r2.readByte();
                                obj.w0(37);
                                char[] cArr = ws2.j;
                                obj.w0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.w0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                    r2 = r2;
                }
                return obj.T(obj.y, kl0.a);
            }
        }
        return str.substring(i4, i5);
    }

    public static gj3 h(fj3 fj3Var, fr0 fr0Var) {
        IOException iOException = (IOException) fr0Var.z;
        if (iOException instanceof oq2) {
            int i = ((oq2) iOException).z;
            if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
                if (!fj3Var.e) {
                    if (fj3Var.a(1)) {
                        return new gj3(1, 300000L);
                    }
                    if (fj3Var.a(2)) {
                        return new gj3(2, 60000L);
                    }
                    return null;
                }
                if (fj3Var.a(2)) {
                    return new gj3(2, 60000L);
                }
                if (fj3Var.a(1)) {
                    return new gj3(1, 300000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long j(fr0 fr0Var) {
        for (Throwable th = (IOException) fr0Var.z; th != null; th = th.getCause()) {
            if (!(th instanceof bj4) && !(th instanceof FileNotFoundException) && !(th instanceof lq2) && !(th instanceof oj3)) {
                if ((th instanceof s41) && ((s41) th).x == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((fr0Var.y - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
    }

    public static boolean k(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && dq6.q(str.charAt(i + 1)) != -1 && dq6.q(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pa0] */
    public static String l(String str, int i, int i2, int i3) {
        int i4;
        boolean z2 = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) == 0) {
            z2 = true;
        }
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt != '%' && (charAt != '+' || !z2)) {
                i5++;
            } else {
                ?? obj = new Object();
                obj.B0(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                        int q = dq6.q(str.charAt(i5 + 1));
                        int q2 = dq6.q(str.charAt(i4));
                        if (q != -1 && q2 != -1) {
                            obj.w0((q << 4) + q2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        obj.C0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z2) {
                            obj.w0(32);
                            i5++;
                        }
                        obj.C0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return obj.T(obj.y, kl0.a);
            }
        }
        return str.substring(i, i2);
    }

    public static ArrayList m(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int S = uz5.S(str, '&', i, 4);
            if (S == -1) {
                S = str.length();
            }
            int S2 = uz5.S(str, '=', i, 4);
            if (S2 != -1 && S2 <= S) {
                arrayList.add(str.substring(i, S2));
                arrayList.add(str.substring(S2 + 1, S));
            } else {
                arrayList.add(str.substring(i, S));
                arrayList.add(null);
            }
            i = S + 1;
        }
        return arrayList;
    }

    @Override // defpackage.o41
    public q41 H() {
        return new i30(false);
    }

    @Override // defpackage.ud0
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.cb8
    public boolean c(Class cls) {
        return ba8.class.isAssignableFrom(cls);
    }

    @Override // defpackage.cb8
    public ob8 d(Class cls) {
        if (ba8.class.isAssignableFrom(cls)) {
            try {
                return (ob8) ba8.f(cls.asSubclass(ba8.class)).i(3, null);
            } catch (Exception e) {
                ov3.k("Unable to get message info for ".concat(cls.getName()), e);
                return null;
            }
        }
        ze0.k("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    public int i(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    @Override // defpackage.pw6
    public int r() {
        return R.id.view_tree_view_model_store_owner;
    }

    public String toString() {
        switch (this.x) {
            case 10:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q18(byte b) {
        this.x = b;
    }

    public q18(ra2 ra2Var) {
        this.x = (byte) 19;
        new CopyOnWriteArrayList();
    }
}
