package s4;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes.dex */
public abstract class b extends zzb implements c {
    public b() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            boolean zzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zzc(zzf);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
