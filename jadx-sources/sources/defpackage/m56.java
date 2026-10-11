package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m56 {
    public static final /* synthetic */ tv1 A;
    public static final z95 y;
    public static final /* synthetic */ m56[] z;
    public final byte x;

    static {
        m56[] m56VarArr = {new m56("SERVER_NAME", 0, (short) 0), new m56("MAX_FRAGMENT_LENGTH", 1, (short) 1), new m56("CLIENT_CERTIFICATE_URL", 2, (short) 2), new m56("TRUSTED_CA_KEYS", 3, (short) 3), new m56("TRUNCATED_HMAC", 4, (short) 4), new m56("STATUS_REQUEST", 5, (short) 5), new m56("ELLIPTIC_CURVES", 6, (short) 10), new m56("EC_POINT_FORMAT", 7, (short) 11), new m56("SIGNATURE_ALGORITHMS", 8, (short) 13)};
        z = m56VarArr;
        A = new tv1(m56VarArr);
        y = new z95((byte) 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m56(String str, int i, short s) {
        this.x = s;
    }

    public static m56 valueOf(String str) {
        return (m56) Enum.valueOf(m56.class, str);
    }

    public static m56[] values() {
        return (m56[]) z.clone();
    }
}
