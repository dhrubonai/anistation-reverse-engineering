package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f1598a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1599b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1600c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1601d;

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f1598a = intentSender;
        this.f1599b = intent;
        this.f1600c = i10;
        this.f1601d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f1598a, i10);
        parcel.writeParcelable(this.f1599b, i10);
        parcel.writeInt(this.f1600c);
        parcel.writeInt(this.f1601d);
    }

    public k(Parcel parcel) {
        this.f1598a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1599b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1600c = parcel.readInt();
        this.f1601d = parcel.readInt();
    }
}
