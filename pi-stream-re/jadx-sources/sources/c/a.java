package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f1572a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1573b;

    public a(Intent intent, int i10) {
        this.f1572a = i10;
        this.f1573b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f1572a;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f1573b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f1572a);
        Intent intent = this.f1573b;
        if (intent == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public a(Parcel parcel) {
        this.f1572a = parcel.readInt();
        this.f1573b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
