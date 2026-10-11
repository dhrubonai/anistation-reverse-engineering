package a5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes.dex */
public abstract class c extends zbb {
    public c() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                g gVar = (g) this;
                switch (gVar.f104a) {
                    case 0:
                        ((h) gVar.f105b).setResult((h) status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                g gVar2 = (g) this;
                switch (gVar2.f104a) {
                    case 1:
                        ((h) gVar2.f105b).setResult((h) status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
