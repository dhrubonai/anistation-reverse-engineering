package s2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new q2.b(17);

    /* renamed from: a, reason: collision with root package name */
    public final List f9883a;

    public i(ArrayList arrayList) {
        this.f9883a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f9883a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f9872a);
            parcel.writeByte(hVar.f9873b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f9874c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f9875d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f9877f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f9870a);
                parcel.writeLong(gVar.f9871b);
            }
            parcel.writeLong(hVar.f9876e);
            parcel.writeByte(hVar.f9878g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f9879h);
            parcel.writeInt(hVar.f9880i);
            parcel.writeInt(hVar.f9881j);
            parcel.writeInt(hVar.f9882k);
        }
    }

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f9883a = Collections.unmodifiableList(arrayList);
    }
}
