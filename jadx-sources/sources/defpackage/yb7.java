package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yb7 extends y2 {
    public static final Parcelable.Creator<yb7> CREATOR = new c55((byte) 9);
    public final GoogleSignInAccount A;
    public final int x;
    public final Account y;
    public final int z;

    public yb7(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.x = i;
        this.y = account;
        this.z = i2;
        this.A = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.l0(parcel, 2, this.y, i);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.l0(parcel, 4, this.A, i);
        z51.t0(parcel, s0);
    }
}
