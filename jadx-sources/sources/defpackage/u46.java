package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u46 {
    public static final u46 A;
    public static final /* synthetic */ u46[] B;
    public static final /* synthetic */ tv1 C;
    public static final y95 y;
    public static final u46[] z;
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        u46 u46Var = new u46("DecryptionFailed_RESERVED", 0, 21);
        u46 u46Var2 = new u46("CloseNotify", 1, 0);
        A = u46Var2;
        u46[] u46VarArr = {u46Var, u46Var2, new u46("UnexpectedMessage", 2, 10), new u46("BadRecordMac", 3, 20), new u46("RecordOverflow", 4, 22), new u46("DecompressionFailure", 5, 30), new u46("HandshakeFailure", 6, 40), new u46("NoCertificate_RESERVED", 7, 41), new u46("BadCertificate", 8, 42), new u46("UnsupportedCertificate", 9, 43), new u46("CertificateRevoked", 10, 44), new u46("CertificateExpired", 11, 45), new u46("CertificateUnknown", 12, 46), new u46("IllegalParameter", 13, 47), new u46("UnknownCa", 14, 48), new u46("AccessDenied", 15, 49), new u46("DecodeError", 16, 50), new u46("DecryptError", 17, 51), new u46("ExportRestriction_RESERVED", 18, 60), new u46("ProtocolVersion", 19, 70), new u46("InsufficientSecurity", 20, 71), new u46("InternalError", 21, 80), new u46("UserCanceled", 22, 90), new u46("NoRenegotiation", 23, 100), new u46("UnsupportedExtension", 24, 110)};
        B = u46VarArr;
        C = new tv1(u46VarArr);
        y = new y95((byte) 5);
        u46[] u46VarArr2 = new u46[256];
        for (int i = 0; i < 256; i++) {
            tv1 tv1Var = C;
            tv1Var.getClass();
            o1 o1Var = new o1(tv1Var, (byte) 0);
            while (true) {
                if (o1Var.hasNext()) {
                    obj = o1Var.next();
                    if (((u46) obj).x == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            u46VarArr2[i] = obj;
        }
        z = u46VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u46(String str, int i, int i2) {
        this.x = i2;
    }

    public static u46 valueOf(String str) {
        return (u46) Enum.valueOf(u46.class, str);
    }

    public static u46[] values() {
        return (u46[]) B.clone();
    }
}
