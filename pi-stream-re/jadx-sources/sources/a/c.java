package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2a;

    public c(e eVar) {
        this.f2a = eVar;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Object obj;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (i10 != 1598968902) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            e eVar = this.f2a;
            eVar.getClass();
            eVar.d(readInt, (Bundle) obj);
            return true;
        }
        parcel2.writeString("android.support.v4.os.IResultReceiver");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
