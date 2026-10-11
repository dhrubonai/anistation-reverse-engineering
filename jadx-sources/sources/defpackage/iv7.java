package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class iv7 extends ua7 implements IInterface {
    public final int f;

    public iv7(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 2);
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        a34.n(z);
        this.f = Arrays.hashCode(bArr);
    }

    public static byte[] N(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f);
            return true;
        }
        tt2 M = M();
        parcel2.writeNoException();
        fn7.b(parcel2, M);
        return true;
    }

    public abstract byte[] L();

    public final tt2 M() {
        return new ic4(L());
    }

    public final boolean equals(Object obj) {
        tt2 M;
        if (obj instanceof iv7) {
            try {
                iv7 iv7Var = (iv7) obj;
                if (iv7Var.f == this.f && (M = iv7Var.M()) != null) {
                    return Arrays.equals(L(), (byte[]) ic4.M(M));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f;
    }
}
