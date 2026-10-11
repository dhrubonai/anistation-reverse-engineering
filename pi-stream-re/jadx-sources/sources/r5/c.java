package r5;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public abstract class c extends zab implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case zzaja.zze.zzg /* 7 */:
                break;
            case 8:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                r0 r0Var = (r0) this;
                r0Var.f2458b.post(new t0(3, r0Var, hVar));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
