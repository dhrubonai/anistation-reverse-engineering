package b5;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.t0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1531a;

    public l(byte[] bArr) {
        boolean z9;
        if (bArr.length == 25) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.j(z9);
        this.f1531a = Arrays.hashCode(bArr);
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] b();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            try {
                e0 e0Var = (e0) obj;
                if (((l) e0Var).f1531a != this.f1531a) {
                    return false;
                }
                return Arrays.equals(b(), (byte[]) new k5.a(((l) e0Var).b()).f6477a);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1531a;
    }
}
