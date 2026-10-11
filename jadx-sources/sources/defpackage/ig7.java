package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ig7 extends ua7 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig7(byte b) {
        super("com.google.android.gms.cast.internal.IBundleCallback", (byte) 1);
        this.f = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", (byte) 1);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (this.f) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Bundle bundle = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                nn7.d(parcel);
                z(bundle);
                return true;
            default:
                switch (i) {
                    case 1:
                        int readInt = parcel.readInt();
                        nn7.d(parcel);
                        L(readInt);
                        return true;
                    case 2:
                        mr mrVar = (mr) nn7.a(parcel, mr.CREATOR);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        nn7.d(parcel);
                        O(mrVar, readString, readString2, z);
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        nn7.d(parcel);
                        P(readInt2);
                        return true;
                    case 4:
                        parcel.readString();
                        parcel.readDouble();
                        int i2 = nn7.a;
                        parcel.readInt();
                        nn7.d(parcel);
                        T();
                        return true;
                    case 5:
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        nn7.d(parcel);
                        W(readString3, readString4);
                        return true;
                    case 6:
                        String readString5 = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        nn7.d(parcel);
                        X(readString5, createByteArray);
                        return true;
                    case 7:
                        int readInt3 = parcel.readInt();
                        nn7.d(parcel);
                        R(readInt3);
                        return true;
                    case 8:
                        int readInt4 = parcel.readInt();
                        nn7.d(parcel);
                        Q(readInt4);
                        return true;
                    case 9:
                        int readInt5 = parcel.readInt();
                        nn7.d(parcel);
                        S(readInt5);
                        return true;
                    case 10:
                        parcel.readString();
                        long readLong = parcel.readLong();
                        int readInt6 = parcel.readInt();
                        nn7.d(parcel);
                        Y(readInt6, readLong);
                        return true;
                    case 11:
                        parcel.readString();
                        long readLong2 = parcel.readLong();
                        nn7.d(parcel);
                        Z(readLong2);
                        return true;
                    case 12:
                        fc7 fc7Var = (fc7) nn7.a(parcel, fc7.CREATOR);
                        nn7.d(parcel);
                        V(fc7Var);
                        return true;
                    case 13:
                        le7 le7Var = (le7) nn7.a(parcel, le7.CREATOR);
                        nn7.d(parcel);
                        U(le7Var);
                        return true;
                    case 14:
                        int readInt7 = parcel.readInt();
                        nn7.d(parcel);
                        M(readInt7);
                        return true;
                    case 15:
                        int readInt8 = parcel.readInt();
                        nn7.d(parcel);
                        N(readInt8);
                        return true;
                    default:
                        return false;
                }
        }
    }

    public abstract void L(int i);

    public abstract void O(mr mrVar, String str, String str2, boolean z);

    public abstract void P(int i);

    public abstract void Q(int i);

    public abstract void R(int i);

    public abstract void S(int i);

    public void T() {
        sm7.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    public abstract void U(le7 le7Var);

    public abstract void V(fc7 fc7Var);

    public abstract void W(String str, String str2);

    public void X(String str, byte[] bArr) {
        zk3 zk3Var = sm7.G;
        sm7.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    public abstract void Y(int i, long j);

    public abstract void Z(long j);

    public abstract void z(Bundle bundle);

    public void M(int i) {
    }

    public void N(int i) {
    }
}
