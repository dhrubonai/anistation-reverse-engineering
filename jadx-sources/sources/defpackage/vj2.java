package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vj2 {
    public static final q18 A;
    public static final vj2 B;
    public static final vj2 C;
    public static final vj2 D;
    public static final vj2 E;
    public static final /* synthetic */ vj2[] F;
    public static final /* synthetic */ tv1 G;
    public final byte x;
    public final String y;
    public final String z;

    static {
        vj2 vj2Var = new vj2("NONE", 0, (byte) 0, "", "");
        vj2 vj2Var2 = new vj2("MD5", 1, (byte) 1, "MD5", "HmacMD5");
        vj2 vj2Var3 = new vj2("SHA1", 2, (byte) 2, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, "HmacSHA1");
        B = vj2Var3;
        vj2 vj2Var4 = new vj2("SHA224", 3, (byte) 3, "SHA-224", "HmacSHA224");
        vj2 vj2Var5 = new vj2("SHA256", 4, (byte) 4, "SHA-256", "HmacSHA256");
        C = vj2Var5;
        vj2 vj2Var6 = new vj2("SHA384", 5, (byte) 5, "SHA-384", "HmacSHA384");
        D = vj2Var6;
        vj2 vj2Var7 = new vj2("SHA512", 6, (byte) 6, "SHA-512", "HmacSHA512");
        E = vj2Var7;
        vj2[] vj2VarArr = {vj2Var, vj2Var2, vj2Var3, vj2Var4, vj2Var5, vj2Var6, vj2Var7, new vj2("INTRINSIC", 7, (byte) 8, "INTRINSIC", "Intrinsic")};
        F = vj2VarArr;
        G = new tv1(vj2VarArr);
        A = new q18((byte) 20);
    }

    public vj2(String str, int i, byte b, String str2, String str3) {
        this.x = b;
        this.y = str2;
        this.z = str3;
    }

    public static vj2 valueOf(String str) {
        return (vj2) Enum.valueOf(vj2.class, str);
    }

    public static vj2[] values() {
        return (vj2[]) F.clone();
    }
}
