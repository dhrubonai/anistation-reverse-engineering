package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.TimeZone;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s51 {
    public static final int[] a;
    public static final int[] b;

    static {
        TimeZone.getTimeZone("GMT");
        a = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        b = new int[]{0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
    }

    public static final dd2 a(Long l) {
        long currentTimeMillis;
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j = currentTimeMillis;
        long floorDiv = Math.floorDiv(j, 1000L);
        long floorMod = Math.floorMod(floorDiv, 86400L);
        int i4 = (int) (floorMod % 60);
        int i5 = (int) ((floorMod / 60) % 60);
        int i6 = (int) (floorMod / 3600);
        int floorDiv2 = (int) Math.floorDiv(floorDiv, 86400L);
        n47.x.getClass();
        n47 n47Var = (n47) n47.z.get(((floorDiv2 % 7) + 10) % 7);
        int i7 = 719468 + floorDiv2;
        if (i7 >= 0) {
            i = i7 / 146097;
            i2 = i7 % 146097;
        } else {
            i = (floorDiv2 + 573372) / 146097;
            i2 = i7 - (146097 * i);
        }
        int i8 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
        int i9 = (i * CommonGatewayClient.CODE_400) + i8;
        int i10 = i2 - (((i8 / 4) + (i8 * 365)) - (i8 / 100));
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = (i10 - (((i11 * 153) + 2) / 5)) + 1;
        if (i11 < 10) {
            i3 = i11 + 2;
        } else {
            i3 = i11 - 10;
        }
        if (i3 <= 1) {
            i9++;
        }
        int i13 = i9;
        if (i13 % 4 == 0 && (i13 % 100 != 0 || i13 % CommonGatewayClient.CODE_400 == 0)) {
            iArr = b;
        } else {
            iArr = a;
        }
        int i14 = iArr[i3] + i12;
        k04.x.getClass();
        return new dd2(i4, i5, i6, n47Var, i12, i14, (k04) k04.z.get(i3), i13, j);
    }
}
